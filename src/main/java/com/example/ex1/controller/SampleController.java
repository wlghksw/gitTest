package com.example.ex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController : 응답을 JSON(JavaScript Object Notation) 형태로 할 수 있게 지원하는 컨트롤러
//일반 텍스트 형태로 응답할 수 있다.

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String[] hello(){
        return new String[]{"Hello","World"};
    }
}
