package com.alirezaft.OODFinal.DeliveryMethodStrategies;

import com.alirezaft.OODFinal.Publication;

public class OnlineDeliveryStrategy extends DeliveryMethodStrategy {
    @Override
    public void sendToSubscribers(String message) {
        System.out.println("Online publishing from: " + pub.getName());
        pub.getPublisher().publish(message);
    }

    public OnlineDeliveryStrategy(Publication p){
        pub = p;
    }
}
