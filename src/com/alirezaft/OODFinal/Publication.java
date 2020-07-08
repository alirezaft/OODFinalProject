package com.alirezaft.OODFinal;

import com.alirezaft.OODFinal.DeliveryMethodStrategies.DeliveryMethodStrategy;
import com.alirezaft.OODFinal.PublicationStates.PublicationState;
import com.alirezaft.OODFinal.PublicationStates.EditingState;

import java.util.Date;

//State, Mediator Design Patterns
public class Publication {
    private String Name;
    private Date DateStablished;
    private int HashCode;
    private String Head;
    private PublicationState pubstate;
    private DeliveryMethodStrategy DeliveryMethod;
    private Publisher publisher = new Publisher();

    public Publication(String name){
        Name = name;
        DateStablished = new Date((int)(Math.random() * 20000));
        pubstate = new EditingState(this);
        HashCode = (int)(Math.random() * 10000);

    }

    public String getName() {
        return Name;
    }

    public Date getDateStablished() {
        return DateStablished;
    }

    public int getHashCode() {
        return HashCode;
    }

    public String getHead() {
        return Head;
    }

    public void changePubState(PublicationState state){
        pubstate = state;
    }

    public PublicationState getState(){
        return pubstate;
    }

    public void subscribeUser(SubscriberInfo info){
        publisher.addSubscriber(new Subscriber(info, publisher.getNumberOfSbscribers() - 1));
    }

    public void setDeliveryMethod(DeliveryMethodStrategy d){
        DeliveryMethod = d;
    }

    public Publisher getPublisher(){
        return publisher;
    }

    public void publish(){
        DeliveryMethod.sendToSubscribers();
    }
}
