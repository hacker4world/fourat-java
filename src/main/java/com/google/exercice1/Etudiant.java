package com.google.exercice1;

public class Etudiant {
    private String nom;
    private float note1;
    private float note2;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getNote1() {
        return note1;
    }

    public void setNote1(float note1) {
        this.note1 = note1;
    }

    public float getNote2() {
        return note2;
    }

    public void setNote2(float note2) {
        this.note2 = note2;
    }

    public Etudiant(String nom, float note1, float note2) {
        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;

    }

    public float CalculMoy() {
        return (this.note1+this.note2) / 2;
    }
}
