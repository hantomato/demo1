package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by neowiztomato on 2017-09-06.
 */
@Data
public class Student {
    @ApiModelProperty(value = "학생 이름", required=true, example = "김봉구")
    private String name;

    @ApiModelProperty(value = "학생 나이", required=false, example="23")
    private long age;
}
