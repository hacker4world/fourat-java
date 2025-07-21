package com.google;

public class Iphone extends Telephonne {

    private float iosVersion;

    public Iphone(String name, int stockage, int ram, int pixsel, float iosVersion) {
        super(name, stockage, ram, pixsel);
        this.iosVersion = iosVersion;
    }

    public String toString() {
        return "Iphone {" +
                "name='" + this.getName() + '\'' +
                ", stockage=" + this.getStockage() +
                ", ram=" + this.getRam() +
                ", pixsel=" + this.getPixsel() +
                ", iosVersion=" + iosVersion +
                '}';
    }

}
