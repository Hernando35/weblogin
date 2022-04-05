package com.hernando.weblogin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
 
@Controller
public class AppController {
 
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    
    @GetMapping("/customers")
    public String listUsers(Model model) {
        List<Customer> listUsers = userRepository.findAll();
        model.addAttribute("listUsers", listUsers);        
        return "customers";
    }
      
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("customer", new Customer());       
        return "signup_form";
    }
    
    @PostMapping("/process_register")
    public String processRegister(Customer customer) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(customer.getPassword());
        customer.setPassword(encodedPassword);        
        userRepository.save(customer);         
        return "register_success";
    }
}
