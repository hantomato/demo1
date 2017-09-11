package com.example.demo.controller;

import com.example.demo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by neowiztomato on 2017-09-06.
 */

@Slf4j
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1() {
        log.info("test1");
        testService.test1();

        return "test1";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test2() throws Exception {
        log.info("test2");

//        AbstractApplicationContext ctx =
//                new ClassPathXmlApplicationContext("context.xml");
//        RabbitTemplate template = ctx.getBean(RabbitTemplate.class);
//        template.convertAndSend("Hello, world!");
//        Thread.sleep(1000);
//        ctx.destroy();

        return "test2";
    }
}


//@Controller
//@ComponentScan
//public class TestController {
//
////    @RequestMapping("/test1")
//    @RequestMapping(value="/test1", method = RequestMethod.GET)
//    public String test1() {
//        return "test1 success";
//    }
//}
