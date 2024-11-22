package com.miage.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class ParisService {

    private final WebClient.Builder webClientBuilder;

    public ParisService(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    public ResponseEntity<String> exemple() {
        WebClient webClient = webClientBuilder.baseUrl("http://paris:8080").build();

        return webClient.get()
                .uri("/paris/exemple")
                .retrieve()
                .toEntity(String.class)
                .block();
    }

}
