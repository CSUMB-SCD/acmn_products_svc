package freedomphones.phoneservice.data;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


@Repository
public class PhoneDbClient {
    public String getPhoneData(){
        final String uri = "https://freedomphones-zuul-svc.herokuapp.com/phone-service/allPhones";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }
}