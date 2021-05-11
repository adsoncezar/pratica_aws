package br.com.pratica.aws.pratica_aws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AppController {

    private static final Logger logger = LoggerFactory.getLogger(AppController.class);

    @GetMapping("/test/{name}")
    public ResponseEntity<?> appTest(@PathVariable String name) {
        logger.info("Teste do controlador - name: {}", name);
        return ResponseEntity.ok("name: " + name);
    }
}
