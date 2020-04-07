package kr.han.toy.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

    @CrossOrigin( origins = "http://localhost:9090", maxAge = 3600)
    @RequestMapping(value= "/signin", method = RequestMethod.GET)
    public String viewSignin() {

        return "main";
    }
}
