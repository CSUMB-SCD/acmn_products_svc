package freedomphones.phoneservice.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


@Repository
public class PhoneDbClient {
    public String getPhoneData(){
        final String uri = "https://freedomphones-zuul-svc.herokuapp.com/phone-db-service/allPhones";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }
    public String getPhoneById(String id){
        final String uri = "https://freedomphones-zuul-svc.herokuapp.com/phone-db-service/findById/{id}";
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> params = new HashMap<String, String>();
        params.put("id", id);
        return restTemplate.getForObject(uri, String.class, params);
    }
    public String getStock(){
        final String uri = "https://freedomphones-zuul-svc.herokuapp.com/phone-db-service/getStock";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }
    public String removeQuantities(String id, String qty){
        final String uri = "https://freedomphones-zuul-svc.herokuapp.com/phone-db-service/removeQuantity/{prod_id}/{qty}";
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> params = new HashMap<String, String>();
        params.put("prod_id", id);
        params.put("qty", qty);
        return restTemplate.getForObject(uri, String.class);
    }
}