package freedomphones.phoneservice.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import freedomphones.phoneservice.business.Manager;

@RestController
public class PhoneController{
    @Autowired
    Manager manager;
    @GetMapping("/allPhones")
    @ResponseBody
    public String getPhones(){
        return manager.getPhoneList();
    }
    @GetMapping("/findById/{id}")
    public String getById(@PathVariable String id){
        return manager.getPhoneById(id);
    }
}