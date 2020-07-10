package com.alirezaft.OODFinal.Publication.PublicationBuilders;

import com.alirezaft.OODFinal.Publication.Publication;
import com.alirezaft.OODFinal.Publication.SportsPublication;

import java.util.Date;

public class SportsPublicationBuilder extends PublicationBuilder {
    @Override
    public Publication build() {
        SportsPublication sp = SportsPublication.getInstance();
        if (sp.getHashCode() == 0) {
            sp.setName("Sport");
            sp.setHead("Mr.Goal");
            sp.setDateStablished(new Date((long) (Math.random() * 100000)));
            sp.setHashCode((int) (Math.random() * 2000));
            return sp;
        }
        return null;
    }
}

