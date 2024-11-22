package com.miage.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class ParisService {

    public ResponseEntity<String> exemple() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

}
