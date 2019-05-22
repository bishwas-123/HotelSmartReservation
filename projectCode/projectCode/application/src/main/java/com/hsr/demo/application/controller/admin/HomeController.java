//package com.hsr.demo.application.controller.admin;
//
//import com.hsr.demo.application.model.user.Account;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//@Controller
//public class HomeController {
//
//    @Autowired
//    IAccountService accountService;
//
//
//    @RequestMapping(value={"/admin","admin"},
//            method= RequestMethod.GET)
//    public String homepage() {
//        return "admin/index";
//    }
//
//
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
//
//    }
//
//    @GetMapping(value= "/admin/managecustomers")
//    public ModelAndView viewCustomers() {
//        ModelAndView modelAndView = new ModelAndView();
//        List<Account> accounts = accountService.findAll();
//        modelAndView.addObject("accounts", accounts);
//        modelAndView.setViewName("admin/managecustomers");
//        return modelAndView;
//    }
//}
//
