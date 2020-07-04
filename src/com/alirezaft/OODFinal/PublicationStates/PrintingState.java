package com.alirezaft.OODFinal.PublicationStates;

import com.alirezaft.OODFinal.Publication;

public class PrintingState extends PublicationState {
    @Override
    public int getProgress() {
        return Progress;
    }

    @Override
    public void increaseProgress() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    Progress++;
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        });
        t.run();
        pub.changePubState(new PrintingState());
    }

    @Override
    public void setPublication(Publication p) {
        pub.changePubState(new PrintingState());
    }
}
