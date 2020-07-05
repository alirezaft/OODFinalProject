package com.alirezaft.OODFinal.PublicationStates;

import com.alirezaft.OODFinal.Publication;

public class PublishingState extends PublicationState {
    @Override
    public int getProgress() {
        return (int)(Math.random() * 100);
    }

    @Override
    public void changeState(String state) {
        if(state.toLowerCase().equals("publish")){
            pub.changePubState(new PublishingState(pub));
        }
    }

    public PublishingState(Publication p){
        pub = p;
    }

}
