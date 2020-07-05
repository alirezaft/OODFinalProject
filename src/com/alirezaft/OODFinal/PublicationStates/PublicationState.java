package com.alirezaft.OODFinal.PublicationStates;

import com.alirezaft.OODFinal.Publication;

public abstract class PublicationState {
    Publication pub;
    protected int Progress = 0;
    public abstract int getProgress();
    public abstract void changeState(String state);
}
