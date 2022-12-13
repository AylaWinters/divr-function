package com.fkgcp.functions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
@CrossOrigin
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
