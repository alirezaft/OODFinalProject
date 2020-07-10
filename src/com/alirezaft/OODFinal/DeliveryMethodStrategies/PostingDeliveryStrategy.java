package com.alirezaft.OODFinal.DeliveryMethodStrategies;

import com.alirezaft.OODFinal.Publication.Publication;

public class PostingDeliveryStrategy extends DeliveryMethodStrategy {
    @Override
    public void sendToSubscribers(String message) {
        System.out.println(pub.getName() + " sending using Courier...");
        pub.getPublisher().publish(message);
    }

    public PostingDeliveryStrategy(Publication p){
        pub = p;
    }
}
