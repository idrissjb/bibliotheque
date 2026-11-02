package org.example;

import org.example.model.Bibliotheque;
import org.example.model.Livre;

public class App {

    public static void main(String[] args) {

        Bibliotheque bibliotheque = new Bibliotheque();

        Livre livre1 = new Livre("Apprendre Java", "Sara", 2024);
        Livre livre2 = new Livre("Comprendre SQL", "Amine", 2023);

        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);

        System.out.println(
                "Nombre de livres : " + bibliotheque.getNombreLivres()
        );

        for (Livre livre : bibliotheque.getLivres()) {
            System.out.println(livre.getTitre());
        }
    }
}