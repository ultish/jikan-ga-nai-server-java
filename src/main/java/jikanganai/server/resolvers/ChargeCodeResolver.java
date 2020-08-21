package jikanganai.server.resolvers;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.PoisonPill;
import akka.pattern.PatternsCS;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import jikanganai.server.actors.ChargeCodeActorClassic;
import jikanganai.server.entities.ChargeCode;
import jikanganai.server.repositories.ChargeCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Component
public class ChargeCodeResolver implements GraphQLQueryResolver {
    @Autowired
    private ChargeCodeRepository repository;

    /**
     * graphql-java-tools will automatically pick up the schema.graphqls on
     * the classpath and match the Query function names to function names in
     * these GraphQLQueryResolvers. Hence schema names are important.
     *
     * @param id
     * @return
     */
    public ChargeCode chargeCode(Integer id) {
        return repository.find(id);
    }

    public List<ChargeCode> chargeCodes() {
        return repository.all();
    }

    public List<ChargeCode> chargeCodesActor() {

        //        final ActorSystem<ChargeCodeActor.ChargeCodesRequest> actor =
        //            ActorSystem.create(ChargeCodeActor.create(), "test");

        ActorSystem system = ActorSystem.create("test-system");
        ActorRef readingActorRef
            = system.actorOf(
            ChargeCodeActorClassic.props()
        );

        CompletableFuture<Object> objectCompletableFuture = PatternsCS.ask(
            readingActorRef,
            new ChargeCodeActorClassic.FetchChargeCodes(), 1000
        ).toCompletableFuture();
 
        Object join = objectCompletableFuture.join();
        if (join instanceof Collection) {
            ((Collection) join).stream().forEach(System.out::println);
        }

        readingActorRef.tell(PoisonPill.getInstance(), ActorRef.noSender());

        return null;
    }
}