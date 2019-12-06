package com.uniyaz;

public class Kare extends Sekil {
    int kenar;
    int alan;
    int cevre;

    public Kare(int kenar){
        this.kenar=kenar;
    }

    public void alanAl() {

        alan=kenar*kenar;
        System.out.println("Alanımız:"+alan);


    }

    public void cevreAl() {

         cevre=4*kenar;
        System.out.println("Çevremiz:"+cevre);

    }

    public int getKenar() {
        return this.kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

    public int getAlan() {
        return alan;
    }

    public void setAlan(int alan) {
        this.alan = alan;
    }

    public int getCevre() {
        return cevre;
    }

    public void setCevre(int cevre) {
        this.cevre = cevre;
    }
}
