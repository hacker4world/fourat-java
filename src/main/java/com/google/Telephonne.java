package com.google;

public abstract class Telephonne {
    private String name;
    private int stockage;
    private int ram;
    private int pixsel;

    public Telephonne(String name, int stockage, int ram, int pixsel) {
        this.name = name;
        this.stockage = stockage;
        this.ram = ram;
        this.pixsel = pixsel;
    }

    @Override
    public String toString() {
        return "Telephonne{" +
                "name='" + name + '\'' +
                ", stockage=" + stockage +
                ", ram=" + ram +
                ", pixsel=" + pixsel +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockage() {
        return stockage;
    }

    public void setStockage(int stockage) {
        this.stockage = stockage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPixsel() {
        return pixsel;
    }

    public void setPixsel(int pixsel) {
        this.pixsel = pixsel;
    }

    //    public void installApp(String appName) {
//        if (brand.equals("samsung")) {
//            installAppAndroid(appName);
//        }
//        else installAppIos(appName);
//    }

    private void installAppAndroid(String appName) {
        System.out.println("Installing " + appName + " With play store " + " in " + name);
    }

    private void installAppIos(String appName) {
        System.out.println("Installing " + appName + " With app store " + " In " + name);
    }

}
