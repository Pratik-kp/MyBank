package com.pratik.MyBank.Controllers;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.bind.annotation.RestController;




@Controller
//@RequestMapping("/")
public class HomeController {
	
	
	@GetMapping(value="/")
    public String Index() {
        return "index";
    }


}
