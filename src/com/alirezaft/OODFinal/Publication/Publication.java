package com.alirezaft.OODFinal.Publication;

import com.alirezaft.OODFinal.DeliveryMethodStrategies.DeliveryMethodStrategy;
import com.alirezaft.OODFinal.DeliveryMethodStrategies.PostingDeliveryStrategy;
import com.alirezaft.OODFinal.Newspaper;
import com.alirezaft.OODFinal.PublicationStates.PublicationState;
import com.alirezaft.OODFinal.PublicationStates.EditingState;
import com.alirezaft.OODFinal.PublicationStates.PublishingState;
import com.alirezaft.OODFinal.UserInfo.Subscriber;
import com.alirezaft.OODFinal.UserInfo.SubscriberInfo;

import java.util.Date;

//State, Observer, Singleton and Strategy Design Patterns
public abstract class Publication {
    private String Name;
    private Date DateStablished;
    private int HashCode;
    private String Head;
    private PublicationState pubstate = new EditingState(this);
    private DeliveryMethodStrategy DeliveryMethod = new PostingDeliveryStrategy(this);
    private Publisher publisher = new Publisher();
    private Newspaper Newpapers;

//    public Publication(String name){
//        Name = name;
//        DateStablished = new Date((int)(Math.random() * 20000));
//        pubstate = new EditingState(this);
//        HashCode = (int)(Math.random() * 10000);
//
//    }

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
        publisher.addSubscriber(new Subscriber(info, publisher.getNumberOfSbscribers() + 1));
    }

    public void setDeliveryMethod(DeliveryMethodStrategy d){
        DeliveryMethod = d;
    }

    public Publisher getPublisher(){
        return publisher;
    }

    public void publish(String message){
        if(pubstate instanceof PublishingState){
            DeliveryMethod.sendToSubscribers(message);
        }else{
            System.out.println("wrong state");
        }
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDateStablished(Date dateStablished) {
        DateStablished = dateStablished;
    }

    public void setHashCode(int hashCode) {
        HashCode = hashCode;
    }

    public void setHead(String head) {
        Head = head;
    }
}
