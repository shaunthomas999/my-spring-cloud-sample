package com.shaunthomas999.names;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class NamesRestController {

  private static final List<String> NAMES = Arrays.asList("Lional Messi", "Christiano Ronaldo", "Frenkie de Jong");

  @GetMapping("/names")
  public ResponseEntity<String> getName() {
    return ResponseEntity.ok(NAMES.get(getRandomNumberInRange(0, 2)));
  }

  private static int getRandomNumberInRange(int min, int max) {
    Random r = new Random();
    return r.ints(min, (max + 1)).findFirst().getAsInt();
  }
}
