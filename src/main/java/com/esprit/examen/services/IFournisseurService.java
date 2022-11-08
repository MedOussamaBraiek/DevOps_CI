package com.esprit.examen.services;

import com.esprit.examen.entities.Fournisseur;

import java.util.List;

public interface IFournisseurService {

    List<Fournisseur> retrieveAllFournisseurs();

    Fournisseur addFournisseur(Fournisseur f);

    void deleteFournisseur(Long id);

    Fournisseur updateFournisseur(Fournisseur f);

    Fournisseur retrieveFournisseur(Long id);

    void assignSecteurActiviteToFournisseur(Long idSecteurActivite, Long idFournisseur);

}
