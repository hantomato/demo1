package com.example.demo.controller;

import com.example.demo.model.Student;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by neowiztomato on 2017-09-07.
 */
@Slf4j
@RestController
@Api(description = "사용자 API")
public class SwaggerTestController {

    @ApiOperation(value = "사용자 리스트", notes = "사용자 리스트를 가져옵니다.")
    @RequestMapping(value="/swag1", method = RequestMethod.GET)
    public Student swag1(@ApiParam(value="param1.\n\n(example:'abcd')", required = true)
                         @RequestParam("param1") String param1) {
        log.info("swag1");

        Student student = new Student();
        student.setAge(23);
        student.setName("hello");
        return student;
    }

    @ApiOperation(value = "사용자 리스트", notes = "사용자 리스트를 가져옵니다.")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "설명1 설명1")})
    @RequestMapping(value="/swag2", method = RequestMethod.GET)
    public Student swag2(@RequestParam("param1") String param1) {
        log.info("swag2");

        Student student = new Student();
        student.setAge(23);
        student.setName("hello");
        return student;
    }

}
