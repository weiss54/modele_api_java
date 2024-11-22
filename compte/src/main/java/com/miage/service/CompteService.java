package com.miage.service;

import com.miage.entite.Compte;
import com.miage.repertoire.CompteRepertoire;
import com.miage.requete.CreerCompteRequete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CompteService {
    @Autowired
    private CompteRepertoire compteRepository;

    public ResponseEntity<Compte> creerCompte(CreerCompteRequete requete) {
        Compte compte = new Compte();
        compte.setNom(requete.getNom());
        compte.setPrenom(requete.getPrenom());
        compte.setEmail(requete.getEmail());
        compte.setMdp(requete.getMdp());
        compteRepository.save(compte);
        return new ResponseEntity<>(compte, HttpStatus.OK);
    }


}
