package freedomphones.phoneservice.api;


import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import freedomphones.phoneservice.business.Manager;

@RestController
public class PhoneController{
    @Autowired
    Manager manager;

    @GetMapping(value="/allPhones", produces = "application/json")
    @ResponseBody
    public String getPhones(){
        return manager.getPhoneList();
    }
    
    @GetMapping("/findById/{id}")
    public String getById(@PathVariable String id){
        return manager.getPhoneById(id);
    }
    @GetMapping(value="/getStock", produces="application/json")
    @ResponseBody
    public String getStock(){
        return manager.getStock();
    }
    @PostMapping(value="/removeQuantities", produces="application/json")
    @ResponseBody
    public String removeQuantities(@RequestBody HashMap<String, Item> body){
        return manager.removeQuantities(body);
    }   
}