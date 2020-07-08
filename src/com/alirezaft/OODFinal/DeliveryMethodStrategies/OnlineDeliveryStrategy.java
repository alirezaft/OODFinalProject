package com.alirezaft.OODFinal.DeliveryMethodStrategies;

import com.alirezaft.OODFinal.Publication;

public class OnlineDeliveryStrategy extends DeliveryMethodStrategy {
    @Override
    public void sendToSubscribers() {
        System.out.println("Online");
        pub.getPublisher().publish("Online");
    }

    public OnlineDeliveryStrategy(Publication p){
        pub = p;
    }
}
