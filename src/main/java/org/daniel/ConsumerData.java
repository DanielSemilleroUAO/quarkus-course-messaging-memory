package org.daniel;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConsumerData {


    @Incoming("my-in-memory")
    public void printRandom(int dato){
        System.out.println(dato);
    }

}
