package com.miage.controlleur;

import com.miage.entite.Compte;
import com.miage.requete.CreerCompteRequete;
import com.miage.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compte")
public class CompteControlleur {

    @Autowired
    private CompteService compteService;

    @PostMapping("/creer")
    public ResponseEntity<Compte> creerCompte(
            @RequestBody CreerCompteRequete requete
    ) {
        return compteService.creerCompte(requete);
    }

}
