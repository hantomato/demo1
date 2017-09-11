package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by neowiztomato on 2017-09-06.
 */

@Slf4j
@RestController
public class HumanController {

    @RequestMapping(value="/test10", method = RequestMethod.GET)
    public String test10(@RequestParam("param1") String param1) {
        log.info("test10");
        return "test10 success";
    }

    @RequestMapping(value="/test11", method = RequestMethod.GET)
    public String test11(@RequestParam(value="param1", required = false) String param1) {
        log.info("test11");
        return "test11 success";
    }
}
