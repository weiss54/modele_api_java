package com.miage.controlleur;

import com.miage.service.ParisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paris")
public class ParisControlleur {

    @Autowired
    private ParisService parisService;

    @GetMapping("/exemple")
    public ResponseEntity<String> exemple() {
        return parisService.exemple();
    }


}
