package com.alirezaft.OODFinal.Publication.PublicationBuilders;

import com.alirezaft.OODFinal.Publication.Publication;
import com.alirezaft.OODFinal.Publication.SportsPublication;

import java.util.Date;

public class SportsPublicationBuilder extends PublicationBuilder {
    @Override
    public Publication build() {
        SportsPublication ep = SportsPublication.getInstance();
        if (ep.getHashCode() == 0) {
            ep.setName("Sport");
            ep.setHead("Mr.Goal");
            ep.setDateStablished(new Date((long) (Math.random() * 100000)));
            ep.setHashCode((int) (Math.random() * 2000));
        }
        return ep;
    }
}

