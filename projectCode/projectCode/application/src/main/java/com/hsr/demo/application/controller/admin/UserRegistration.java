//package com.hsr.demo.application.controller.admin;
//
//import com.hsr.demo.application.model.user.Account;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//public class UserRegistration {
//
//    @Autowired
//    IAccountService accountService;
//
//    @GetMapping(value= "/admin/manageusers")
//    public ModelAndView viewAccounts() {
//        ModelAndView modelAndView = new ModelAndView();
//        List<Account> accounts = accountService.findAll();
//        modelAndView.addObject("accounts", accounts);
//        modelAndView.setViewName("admin/manageusers");
//        return modelAndView;
//    }
//
//    @GetMapping(value= "/admin/newuser")
//    public ModelAndView newAccount() {
//        ModelAndView modelAndView = new ModelAndView();
//        List<Account> accounts = accountService.findAll();
//        modelAndView.addObject("accounts", accounts);
//        modelAndView.setViewName("admin/newuser");
//        return modelAndView;
//    }
//}
