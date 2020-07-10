package com.alirezaft.OODFinal.UserInfo;

import com.alirezaft.OODFinal.Publication;

public class NormalSubscriberInfoAdapter extends SubscriberInfoAdapter{
    private Publication AdapteePub;

    @Override
    public void convertAndRegisterPersonalInfo(PersonalInformation info){
        String[] birth = info.getDateofBirth().split("/");

        AdapteePub.subscribeUser(new SubscriberInfo(info.getName(), info.getGender(),
                Integer.parseInt(birth[0]), Integer.parseInt(birth[1])));
    }

    public NormalSubscriberInfoAdapter(Publication adapteePub){
        AdapteePub = adapteePub;
    }
}
