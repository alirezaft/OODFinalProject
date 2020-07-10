package com.alirezaft.OODFinal.DeliveryMethodStrategies;

import com.alirezaft.OODFinal.Publication.Publication;

public abstract class DeliveryMethodStrategy {
    public Publication pub;
    public abstract void sendToSubscribers(String message);
}
