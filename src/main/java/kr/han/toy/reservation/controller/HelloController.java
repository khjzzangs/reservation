package kr.han.toy.reservation.controller;

import kr.han.toy.reservation.model.MockTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/start")
    public MockTest getStartingPoint(){
        logger.info("Start Controller : {} " , this.getClass().getName());
        return MockTest.builder().id(1l).content("Hello, World").build();
    }
}



