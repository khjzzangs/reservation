package kr.han.toy.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

    @RequestMapping(value= "/signin", method = RequestMethod.GET)
    public String viewSignin() {

        return "main";
    }
}
