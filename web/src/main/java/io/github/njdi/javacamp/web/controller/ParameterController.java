package io.github.njdi.javacamp.web.controller;

import io.github.njdi.javacamp.domain.request.ParameterRequest;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Arrays;

@RestController
public class ParameterController {
  @GetMapping("/parameter/get/v1")
  public String getV1(@RequestParam Long id, @RequestParam String name,
      @RequestParam BigDecimal price, @RequestParam Boolean enabled, @RequestParam String[] tags) {
    System.out.println("id: " + id);
    System.out.println("name: " + name);
    System.out.println("price: " + price);
    System.out.println("enabled: " + enabled);
    System.out.println("tags: " + Arrays.toString(tags));

    return "getV1";
  }

  @GetMapping("/parameter/get/v2")
  public String getV2(@ModelAttribute ParameterRequest request) {
    System.out.println("id: " + request.getId());
    System.out.println("name: " + request.getName());
    System.out.println("price: " + request.getPrice());
    System.out.println("enabled: " + request.getEnabled());
    System.out.println("tags: " + Arrays.toString(request.getTags()));

    return "getV2";
  }

  @PostMapping("/parameter/post")
  public String post(@RequestBody ParameterRequest request) {
    System.out.println("id: " + request.getId());
    System.out.println("name: " + request.getName());
    System.out.println("price: " + request.getPrice());
    System.out.println("enabled: " + request.getEnabled());
    System.out.println("tags: " + Arrays.toString(request.getTags()));

    return "post";
  }
}
