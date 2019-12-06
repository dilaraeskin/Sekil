package com.uniyaz;

public class Dikdortgen extends Sekil {

    int kisaKenar;
    int uzunKenar;

    public Dikdortgen(int kisaKenar, int uzunKenar) {
    this.kisaKenar=kisaKenar;
    this.uzunKenar=uzunKenar;
    }

    public void alanAl() {

        int alan = kisaKenar * uzunKenar;
        System.out.println("Alanımız:" + alan);

    }

    public void cevreAl() {

        int cevre = (2 * kisaKenar) + (2 * uzunKenar);
        System.out.println("Çevremiz:" + cevre);


    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }


}
