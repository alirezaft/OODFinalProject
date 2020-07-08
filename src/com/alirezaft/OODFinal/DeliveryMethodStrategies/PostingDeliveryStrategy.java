package com.alirezaft.OODFinal.DeliveryMethodStrategies;

import com.alirezaft.OODFinal.Publication;

public class PostingDeliveryStrategy extends DeliveryMethodStrategy {
    @Override
    public void sendToSubscribers() {
        pub.getPublisher().publish("Courier");
        pub.getPublisher().publish("Courier");
    }

    public PostingDeliveryStrategy(Publication p){
        pub = p;
    }
}
