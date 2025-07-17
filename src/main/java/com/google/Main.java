package com.google;

public class Main {

    // attribute
    private String name;

    public static void main(String[] args) {
       Joueur cristiano = new Joueur("Cristiano", "Ronaldo", 7, "Left Wing", "Manchester United");
       Joueur benzema = new Joueur("Karim", "Benzema", 9, "Crowd", "Real Madrid");

       Telephonne phone1 = new Telephonne("samsung note 10+",128, 12, 64);
       Telephonne phone2 = new Telephonne("samsung s25 ultra", 256,32,84 );
       Telephonne phone3 = new Telephonne("Samsung S24 ultra", 256, 64, 84);

        phone3.setRam(16);

        System.out.println(phone3.getRam() + " GB");
    }

}

