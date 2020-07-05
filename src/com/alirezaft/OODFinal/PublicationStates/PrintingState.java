package com.alirezaft.OODFinal.PublicationStates;

public class PrintingState extends PublicationState {
    @Override
    public int getProgress() {
        return (int)(Math.random() * 100);
    }

    @Override
    public void changeState(String state) {
        if(state.toLowerCase().equals("send")){
            pub.changePubState(new PublishingState(pub));
            System.out.println("State has changed to Publishing.");
        }else{
            System.out.println("wrong state");
        }
    }
}
