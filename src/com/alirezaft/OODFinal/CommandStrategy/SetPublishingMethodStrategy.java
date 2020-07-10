package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.Database;
import com.alirezaft.OODFinal.DeliveryMethodStrategies.OnlineDeliveryStrategy;
import com.alirezaft.OODFinal.DeliveryMethodStrategies.PostingDeliveryStrategy;
import com.alirezaft.OODFinal.Publication.Publication;

public class SetPublishingMethodStrategy extends CommandExecutionStrategy {
    @Override
    public void executeCommand(String[] args) {
        Publication p = Database.getInstance().getPublication(args[0].split("\"")[1]);
        if(args[1].split("\"")[1].equals("Courier")){
            p.setDeliveryMethod(new PostingDeliveryStrategy(p));
        }else if(args[1].split("\"")[1].equals("Online")){
            p.setDeliveryMethod(new OnlineDeliveryStrategy(p));
        }
    }
}
