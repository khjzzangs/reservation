package kr.han.toy.reservation.controller;

import kr.han.toy.reservation.model.DbUser;
import kr.han.toy.reservation.model.MockTest;
import kr.han.toy.reservation.repositories.TestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RequestMapping("/")
@Controller
public class MainController {
    final static Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private TestRepository testRepository;

    @GetMapping("index")
    public String indexController() {
        return "layout/main";
    }

}



