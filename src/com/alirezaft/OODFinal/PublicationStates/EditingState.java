package com.alirezaft.OODFinal.PublicationStates;

import com.alirezaft.OODFinal.Publication.Publication;

public class EditingState extends PublicationState {
    @Override
    public int getProgress() {
        return (int)(Math.random() * 100);
    }

    @Override
    public void changeState(String state) {
        if(state.toLowerCase().equals("print")){
            pub.changePubState(new PrintingState(pub));
            System.out.println("State has changed to Printing.");
        }else{
            System.out.println("wrong state");
        }
    }

    public EditingState(Publication p){
        pub = p;
    }
}