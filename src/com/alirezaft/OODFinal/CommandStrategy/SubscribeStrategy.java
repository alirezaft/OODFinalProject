package com.alirezaft.OODFinal.CommandStrategy;

import com.alirezaft.OODFinal.*;

public class SubscribeStrategy extends CommandExecutionStrategy {
    @Override
    public void executeCommand(String[] args) {
        String pub = args[0].split("\"")[1];
        String uid = args[1];

        Publication p = Database.getInstance().getPublication(pub);
        User u  = Database.getInstance().getUser(Integer.parseInt(uid));
        SubscriberInfoAdapter adapter = new SubscriberInfoAdapter(p);
        adapter.convertPersonalInfo(u.getInfo());


    }
}
