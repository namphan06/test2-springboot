package test.vn.test9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class home {
    @RequestMapping(value = "/heart",method = RequestMethod.GET)
    public String hm(Model model){
        return"heart.html";
    }
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String hmm(Model model){
        return"home.html";
    }
    @RequestMapping(value = "/flower1",method = RequestMethod.GET)
    public String hm1(Model model){
        return"flower1.html";
    }
    @RequestMapping(value = "/flower2",method = RequestMethod.GET)
    public String hm2(Model model){
        return"flower2.html";
    }
}
