package freedomphones.phoneservice.business;



import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import freedomphones.phoneservice.api.Item;
import freedomphones.phoneservice.data.PhoneDbClient;

@Service
public class Manager {
    @Autowired
    PhoneDbClient phoneDbClient;
    public String getPhoneList() {
        return phoneDbClient.getPhoneData(); 
    }
    public String getPhoneById(String id){
        return phoneDbClient.getPhoneById(id);
    }
    public String getStock(){
        return phoneDbClient.getStock();
    }
    public String removeQuantities(HashMap<String, Item> items){
        for(Map.Entry<String, Item> entry: items.entrySet()) {
        Item item = entry.getValue();
        phoneDbClient.removeQuantities(item.getProduct(), item.getQuantity().toString());
        }
        return phoneDbClient.getStock();
    }
}