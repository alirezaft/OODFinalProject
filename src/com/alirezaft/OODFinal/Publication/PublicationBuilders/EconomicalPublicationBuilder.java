package com.alirezaft.OODFinal.Publication.PublicationBuilders;

import com.alirezaft.OODFinal.Publication.EconomicalPublication;
import com.alirezaft.OODFinal.Publication.Publication;

import java.util.Date;

public class EconomicalPublicationBuilder extends PublicationBuilder {
    @Override
    public Publication build() {
        EconomicalPublication ep = EconomicalPublication.getInstance();
        if(ep.getHashCode() == 0){
            ep.setName("Economical");
            ep.setHead("Mr.Money");
            ep.setDateStablished(new Date((long)(Math.random() * 100000)));
            ep.setHashCode((int)(Math.random() * 2000));
            return ep;
        }
        return null;
    }
}
