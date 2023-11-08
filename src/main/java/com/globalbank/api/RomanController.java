package com.globalbank.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanController {

  @GetMapping("/api/romano/{num}")
  public String getRomano(@PathVariable int num) {
    System.out.println("called");
    if (num <= 4) {
      return String.valueOf(num);
    }
    int digit = num / 5;
    char simb = digit == 0 ? "V".charAt(0) : "I".charAt(0);
    return String.valueOf(digit) + simb;
  }

}
