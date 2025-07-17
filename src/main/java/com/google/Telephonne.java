package com.google;

public class Telephonne {
    public String name;
    public int stockage;
    private int ram;
    public int pixsel;

    public Telephonne(String name, int stockage, int ram, int pixsel) {
        this.name = name;
        this.stockage = stockage;
        this.ram = ram;
        this.pixsel = pixsel;
    }

    public String toString() {
        return "name : " + this.name + " stockage : " + this.stockage + " this.ram : " + this.ram + " pixels : " + this.pixsel;
    }

    public boolean isRamValid() {
        if (this.ram == 4 || this.ram == 16 || this.ram == 32 || this.ram == 64) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        if (ram == 4 || ram == 16 || ram == 32 || ram == 64) {
            this.ram = ram;
        }
        else {
            throw new Error("Invalid RAM value");
        }
    }

}
