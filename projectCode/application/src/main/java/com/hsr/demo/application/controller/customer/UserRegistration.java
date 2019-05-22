package com.hsr.demo.application.controller.customer;

import com.hsr.demo.application.model.user.Account;
import com.hsr.demo.application.model.user.Address;
import com.hsr.demo.application.model.user.Person;
import com.hsr.demo.application.service.user.IAccountService;
import com.hsr.demo.application.service.user.IAddressService;
import com.hsr.demo.application.service.user.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserRegistration {
    @Autowired
    private IPersonService personService;
    @Autowired
    private IAccountService accountService;

    @Autowired
    private IAddressService addressService;



    @GetMapping(value="/login")
    public String login(){
        return "customer/login";
    }


    @PostMapping(value = "/saveuser")
    public String saveUser(@Valid @ModelAttribute("person") Person person, @Valid @ModelAttribute("account") Account account,
                           @Valid @ModelAttribute("address") Address address,
                           BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "customer/login";
        }

        if (account != null){
            model.addAttribute("account", account);
            System.out.println("YAY");
        }
        else
        {
            model.addAttribute("account", new Account());
            System.out.println("test");
        }
        if (address != null){
            model.addAttribute("address", address);
            System.out.println("YAY");
        }
        else
        {
            model.addAttribute("address", new Address());
            System.out.println("test");
        }
      //  List<Object> data1=new ArrayList<>();
        person=personService.save(person);
        account=accountService.save(account);
        address=addressService.save(address);
//        data1.add(person);
//        data1.add(account);
//        data1.add(address);

        return "redirect:/user/login";
    }



}
