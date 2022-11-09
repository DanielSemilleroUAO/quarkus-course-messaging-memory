package org.daniel;

import io.reactivex.Emitter;
import io.reactivex.Flowable;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@ApplicationScoped
public class ProducerData {
    Random random = new Random();

    /*
    @Outgoing("my-in-memory")
    public Flowable<Integer> generate() {
        return Flowable.interval(500, TimeUnit.MILLISECONDS)
                .map(tick -> random.nextInt(100));
    }
*/
}
