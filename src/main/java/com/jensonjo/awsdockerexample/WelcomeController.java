package com.jensonjo.awsdockerexample;

import java.util.Calendar;
import java.util.Date;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

/**
 * Created by jensonkakkattil on Apr, 2019.
 */

@RestController
@Log
public class WelcomeController {

    @PostMapping(value = "/welcome")
    public HttpEntity<Object> testPost() {
        Date date = Calendar.getInstance().getTime();
        String msg = "Hello from POST /welcome @ " + date.toString();
        log.info(msg);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @GetMapping(value = "/get")
    public HttpEntity<Object> testGet() {
        Date date = Calendar.getInstance().getTime();
        String msg = "Hello from GET /get @ " + date.toString();
        log.info(msg);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
