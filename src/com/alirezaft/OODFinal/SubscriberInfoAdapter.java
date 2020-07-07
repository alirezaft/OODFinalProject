package com.alirezaft.OODFinal;

public class SubscriberInfoAdapter {
    private Publication AdapteePub;

    public void convertPersonalInfo(PersonalInformation info){
        String[] birth = info.getDateofBirth().split("/");

        AdapteePub.subscribeUser(new SubscriberInfo(info.getName(), info.getGender(),
                Integer.parseInt(birth[0]), Integer.parseInt(birth[1])));
    }

    public SubscriberInfoAdapter(Publication adapteePub){
        AdapteePub = adapteePub;
    }
}
