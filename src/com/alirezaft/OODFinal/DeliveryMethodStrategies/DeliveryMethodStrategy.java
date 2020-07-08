package com.alirezaft.OODFinal.DeliveryMethodStrategies;

import com.alirezaft.OODFinal.Publication;

public abstract class DeliveryMethodStrategy {
    public Publication pub;
    public abstract void sendToSubscribers();
}
