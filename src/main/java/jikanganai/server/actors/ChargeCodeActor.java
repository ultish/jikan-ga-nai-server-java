package jikanganai.server.actors;

import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import jikanganai.server.entities.ChargeCode;

import java.util.List;

public class ChargeCodeActor
    extends AbstractBehavior<ChargeCodeActor.ChargeCodesRequest> {

    /**
     * The incoming message this Actor will process
     */
    public static final class ChargeCodesRequest {
        public final ActorRef<ChargeCodesResponse> replyTo;

        public ChargeCodesRequest(ActorRef<ChargeCodesResponse> replyTo) {
            this.replyTo = replyTo;
        }
    }

    /**
     * The outgoing message this Actor will respond with
     */
    public static final class ChargeCodesResponse {
        public final ActorRef<ChargeCodesRequest> replyTo;
        public final List<ChargeCode> chargeCodes;

        public ChargeCodesResponse(
            List<ChargeCode> chargeCodes,
            ActorRef replyTo
        ) {
            this.replyTo = replyTo;
            this.chargeCodes = chargeCodes;
        }
    }

    public static Behavior<ChargeCodesRequest> create() {
        return Behaviors.setup(ChargeCodeActor::new);
    }

    private ChargeCodeActor(ActorContext<ChargeCodesRequest> context) {
        super(context);
    }

    @Override
    public Receive<ChargeCodesRequest> createReceive() {
        return newReceiveBuilder().onMessage(
            ChargeCodesRequest.class,
            this::onRequest
        ).build();
    }

    private Behavior<ChargeCodesRequest> onRequest(
        ChargeCodesRequest
            request
    ) {
        getContext().getLog().info("First Message from Actor");

        ChargeCodesResponse response = new ChargeCodesResponse(
            null,
            getContext().getSelf()
        );

        request.replyTo.tell(response);

        return this;
    }

}
