package freedomphones.phoneservice.business;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import freedomphones.phoneservice.data.PhoneDbClient;

@Service
public class Manager {
    @Autowired
    PhoneDbClient phoneDbClient;
    public String getPhoneList() {
        return phoneDbClient.getPhoneData(); 
    }
}