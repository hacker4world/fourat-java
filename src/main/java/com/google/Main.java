package com.google;

import com.google.exercice1.Etudiant;
import com.google.exercice3.Compte;

public class Main {

    public static void main(String[] args) {
        Etudiant Etudiant1 = new Etudiant("Salah", 15, 17);
        System.out.println(Etudiant1.CalculMoy());

        Compte compte1 = new Compte(3000);
        compte1.deposer(2000);
        System.out.println(compte1.getSolde());
    }

}