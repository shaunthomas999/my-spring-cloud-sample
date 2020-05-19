package com.shaunthomas999.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class WebXpRestController {

  @GetMapping
  public ResponseEntity<String> get() {
    return ResponseEntity.ok("Hello");
  }
}
