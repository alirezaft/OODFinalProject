package com.alirezaft.OODFinal.Publication.PublicationBuilders;

import com.alirezaft.OODFinal.Publication.PoliticalPublication;
import com.alirezaft.OODFinal.Publication.Publication;

import java.util.Date;

public class PoliticalPublicationBuilder extends PublicationBuilder {
    @Override
    public Publication build() {
        PoliticalPublication pp = PoliticalPublication.getInstance();
        if (pp.getHashCode() == 0) {
            pp.setName("Political");
            pp.setHead("Mr.Politics");
            pp.setDateStablished(new Date((long) (Math.random() * 100000)));
            pp.setHashCode((int) (Math.random() * 3000));
            return pp;
        }
        return null;
    }
}

