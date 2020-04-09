package kr.han.toy.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

    @RequestMapping(value= "/signin", method = RequestMethod.GET)
    public String viewSignin(Model model) {

        model.addAttribute("test", "test2");
        return "main/test";
    }


    @RequestMapping(value= "/signin2", method = RequestMethod.GET)
    public String viewSignin2(Model model) {

        model.addAttribute("test", "test2");
        return "main";
    }
}
