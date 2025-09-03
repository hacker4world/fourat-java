package com.google.exercice3;

public class Compte {
    private double solde;
    public Compte(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    public void deposer(float montant){
        this.solde = solde+montant;
    }
    public void retirer(float montant){
        this.solde = solde-montant;
    }
    public void ajouter_Intret(float montant,float taux){
        this.solde = solde*(montant+taux);
    }
}
