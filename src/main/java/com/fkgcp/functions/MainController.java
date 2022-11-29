package com.fkgcp.functions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class MainController {


  @PostMapping("/post")
  public ResponseEntity<String> postText(@RequestBody String message) {
	System.out.println(message);
	System.out.println("here");
    return new ResponseEntity<>(message, HttpStatus.OK);
  }

  @GetMapping("/")
  public String hello() {
    return "hello world!";
  }
  
}
