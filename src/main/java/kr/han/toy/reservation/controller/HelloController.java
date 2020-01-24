package kr.han.toy.reservation.controller;

import kr.han.toy.reservation.model.DbUser;
import kr.han.toy.reservation.model.MockTest;
import kr.han.toy.reservation.repositories.TestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {
    final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private TestRepository testRepository;

    @GetMapping("/start")
    public MockTest getStartingPoint(){
        logger.info("Start Controller : {} " , this.getClass().getName());
        return MockTest.builder().id(1l).content("Hello, World").build();
    }

    @GetMapping("/users")
    public ResponseEntity<List<DbUser>> getTestUser(){
        return new ResponseEntity<List<DbUser>>(testRepository.findAll(), HttpStatus.OK);
    }


}



