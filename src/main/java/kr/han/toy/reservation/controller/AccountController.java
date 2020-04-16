package kr.han.toy.reservation.controller;

import kr.han.toy.reservation.model.Space;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class AccountController {

    @RequestMapping(value = "/account/siginin", method = RequestMethod.POST)
    public String signInUserAccount(
            @RequestBody List<Space> space) {
        System.out.println("test");

        return "greeting";
    }


    @RequestMapping(value = "/account/signup", method = RequestMethod.POST)
    public String signUpUserAccount( @RequestBody List<Space> space ) {
        System.out.println("test");

        return "greeting";
    }
}
