package kr.han.toy.reservation.controller;

import kr.han.toy.reservation.model.Space;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/**")
public class GreetingController {

    @GetMapping
    public String greeting(
            @RequestParam(name="name", required =false, defaultValue="world") String name
            , Model model ) {
        model.addAttribute("name", name);

        return "greeting";
    }


}
