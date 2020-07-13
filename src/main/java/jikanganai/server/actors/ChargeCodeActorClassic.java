package jikanganai.server.actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.actor.Status;

import java.util.Arrays;

public class ChargeCodeActorClassic extends AbstractActor {

    // shortcut to create a ChargeCodeActorClassic instance
    public static Props props() {
        return Props.create(ChargeCodeActorClassic.class);
    }

    public static final class FetchChargeCodes {}

    @Override
    public Receive createReceive() {
        return receiveBuilder()
            .match(FetchChargeCodes.class, o -> {
                try {
                    System.out.println("Fetching Chargecodes...");
                    getSender().tell(Arrays.asList("1", "2", "3"), getSelf());
                } catch (Exception e) {
                    getSender().tell(new Status.Failure(e), getSelf());
                }
            }).build();
    }

    @Override
    public void preStart() throws Exception {
        super.preStart();
        System.out.println("Starting Actor...");
    }

    @Override
    public void postStop() throws Exception {
        super.postStop();

        System.out.println("Stopped Actor");
    }
}
