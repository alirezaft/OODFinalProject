package com.alirezaft.OODFinal;

public class SubscriberInfoAdapter {
    private Publication AdapteePub;

    public void convertPersonalInfo(PersonalInformation info){
        String[] name = info.getName().split(" ");
        String[] birth = info.getDateofBirth().split("/");

        AdapteePub.subscribeUser(new SubscriberInfo(name[0], name[1], info.getGender(),
                Integer.parseInt(birth[0]), Integer.parseInt(birth[1])));
    }

    public SubscriberInfoAdapter(Publication adapteePub){
        AdapteePub = adapteePub;
    }
}
