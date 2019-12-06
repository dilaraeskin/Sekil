package com.uniyaz;

public class Ucgen extends Sekil {

    int taban;
    int yukseklik;
    int kenar1;
    int kenar2;

    public Ucgen(int kenar1, int kenar2, int yukseklik, int taban) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.yukseklik = yukseklik;
        this.taban = taban;
    }

    public void alanAl() {

        int alan = (taban * yukseklik) / 2;
        System.out.println("Alanımız:" + alan);

    }

    public void cevreAl() {
        int cevre = taban + kenar1 + kenar2;
        System.out.println("Çevremiz:" + cevre);


    }

    public int getKenar1() {
        return kenar1;
    }

    public void setKenar1(int kenar1) {
        this.kenar1 = kenar1;
    }

    public int getKenar2() {
        return kenar2;
    }

    public void setKenar2(int kenar2) {
        this.kenar2 = kenar2;
    }

    public int getTaban() {
        return taban;
    }

    public void setTaban(int taban) {
        this.taban = taban;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }


}
