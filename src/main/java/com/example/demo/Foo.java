package com.example.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by neowiztomato on 2017-09-06.
 */
@Slf4j
public class Foo {

    public void listen(String foo) {
        log.error("listen : " + foo);
    }
}