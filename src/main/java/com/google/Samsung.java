package com.google;

public class Samsung extends Telephonne {

    private float androidVersion;

    public Samsung(String name, int stockage, int ram, int pixsel, float androidVersion) {
        super(name, stockage, ram, pixsel);
        this.androidVersion = androidVersion;
    }

    public String toString() {
        return "Samsung {" +
                "name='" + this.getName() + '\'' +
                ", stockage=" + this.getStockage() +
                ", ram=" + this.getRam() +
                ", pixsel=" + this.getPixsel() +
                ", androidVersion=" + androidVersion +
                '}';
    }
}
