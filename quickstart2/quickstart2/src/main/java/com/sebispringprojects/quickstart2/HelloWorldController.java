package com.sebispringprojects.quickstart2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {
   @GetMapping("/hello")
   List<String> helloWorld()
   {return List.of("hello","world");}

}



