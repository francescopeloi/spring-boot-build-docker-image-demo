package com.springexample.build_docker_image_demo;

import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

  private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);

  @GetMapping("/endpoint")
  public String endpoint() {
    var message = "endpoint called " + LocalDateTime.now();
    logger.info(message);
    return message;
  }

}
