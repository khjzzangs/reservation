package kr.han.toy.reservation.controller;

import kr.han.toy.reservation.exception.CustomException;
import kr.han.toy.reservation.model.Customer;
import kr.han.toy.reservation.model.Space;
import kr.han.toy.reservation.repositories.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class AccountController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AccountRepository accounts;

    @RequestMapping(value = "/account/siginin", method = RequestMethod.POST)
    public String signInUserAccount(
            @RequestBody List<Space> space) {
        System.out.println("test");

        return "greeting";
    }


    @RequestMapping(value = "/account/signup", method = RequestMethod.POST)
    public ResponseEntity<?> signUpUserAccount(@RequestBody Customer customer ) {
        logger.info("Customer Info : {} ", customer);
            accounts.save(customer);

        return new ResponseEntity(HttpStatus.OK);
    }
}
