package com.uniyaz;

public class Kure extends Sekil implements HacimHesaplanabilir{

    final float pi= (float) 3.14;
    int yaricap;
    float hacim;

    public Kure(int yaricap){
        this.yaricap=yaricap;
}

    public void HacimHesapla() {

        hacim= ((4/3)*(pi)*(yaricap*yaricap*yaricap));
        System.out.println("Hacimimiz:"+hacim);
    }

    public void alanAl() {

        float alan= 4*(pi*(yaricap*yaricap));
        System.out.println("Alanımız:"+alan);

    }

    public void cevreAl() {

        float cevre=  (2*pi*(yaricap));
        System.out.println("Çevremiz:"+cevre);

    }

    public float getPi() {
        return pi;
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }

    public float getHacim() {
        return hacim;
    }

    public void setHacim(float hacim) {
        this.hacim = hacim;
    }



}
