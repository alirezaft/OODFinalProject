package com.alirezaft.OODFinal.DeliveryMethodStrategies;

import com.alirezaft.OODFinal.Publication;

public class PostingDeliveryStrategy extends DeliveryMethodStrategy {
    @Override
    public void sendToSubscribers(String message) {
        pub.getPublisher().publish("Courier");
        pub.getPublisher().publish(message);
    }

    public PostingDeliveryStrategy(Publication p){
        pub = p;
    }
}
