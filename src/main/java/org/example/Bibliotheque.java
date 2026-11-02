package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    private List<Livre> livres;

    public Bibliotheque() {
        this.livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        if (livre == null) {
            throw new IllegalArgumentException(
                    "Le livre ne peut pas être null."
            );
        }

        livres.add(livre);
    }

    public int getNombreLivres() {
        return livres.size();
    }

    public List<Livre> getLivres() {
        return List.copyOf(livres);
    }
}