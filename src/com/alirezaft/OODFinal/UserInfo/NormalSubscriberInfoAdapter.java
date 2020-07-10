package com.alirezaft.OODFinal.UserInfo;

import com.alirezaft.OODFinal.Publication.Publication;

public class NormalSubscriberInfoAdapter extends SubscriberInfoAdapter{
    private Publication AdapteePub;

    @Override
    public void convertAndRegisterPersonalInfo(PersonalInformation info){
        String[] birth = info.getDateofBirth().split("/");
        SubscriberInfo s = new SubscriberInfo(info.getName(), info.getGender(),
                Integer.parseInt(birth[0]), Integer.parseInt(birth[1]));
        AdapteePub.subscribeUser(s);
        System.out.println("Personal info:\n" + info.toString() + " converted to Subscriber info:\n" + s.toString());
    }

    public NormalSubscriberInfoAdapter(Publication adapteePub){
        AdapteePub = adapteePub;
    }
}
