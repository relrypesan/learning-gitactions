package me.relrypesan.learninggitactions.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/info")
    public ResponseEntity<?> info() {
        log.info("log informativo");
        return ResponseEntity.ok(Map.of("status", 200));
    }

}
