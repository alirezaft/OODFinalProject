package com.alirezaft.OODFinal.PublicationStates;

import com.alirezaft.OODFinal.Publication;

public class SendingState extends PublicationState {
    @Override
    public int getProgress() {
        return 0;
    }

    @Override
    public void increaseProgress() {

    }

    @Override
    public void setPublication(Publication p) {

    }
}
