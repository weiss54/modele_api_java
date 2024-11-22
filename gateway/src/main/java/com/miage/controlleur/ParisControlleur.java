package com.miage.controlleur;

import com.miage.service.ParisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paris")
public class ParisControlleur {

    @Autowired
    private ParisService parisService;

    @GetMapping("/hello")
    public ResponseEntity<String> exemple() {
        System.out.println("ParisControlleurLUKS");
        return parisService.exemple();
    }

}
