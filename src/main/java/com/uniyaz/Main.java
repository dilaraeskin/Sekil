package com.uniyaz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int alan;
        int cevre;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Kare");
        System.out.println("2-Dikdörtgen");
        System.out.println("3-Küre");
        System.out.println("4-Üçgen");


        while (true) {

            System.out.println("Hangi çokgeni seçmek istersiniz?");

            int secim = scanner.nextInt();

            if (secim == 1) {

                System.out.println("Seçiminiz kare oldu.");
                Kare kare = kareScannerOku(scanner);
                donguYap(kare);

            } else if (secim == 2) {

                System.out.println("Seçiminiz dikdörtgen oldu.");
                Dikdortgen dikdortgen = dikdortgenScannerOku(scanner);
                donguYap(dikdortgen);

            } else if (secim == 3) {

                System.out.println("Seçiminiz küre oldu.");
                Kure kure = kureScannerOku(scanner);
                kure.HacimHesapla();

                donguYap(kure);


            } else if (secim == 4) {
                System.out.println("Seçiminiz üçgen oldu.");
                Ucgen ucgen = ucgenScannerOku(scanner);

                donguYap(ucgen);

            } else if (secim == 5) {
                System.out.println("ÇIKIŞ");
                break;
            }
        }
    }

    public static Ucgen ucgenScannerOku(Scanner scanner) {

        System.out.println("üçgenin kenarını giriniz.");

        int kenar1 = scanner.nextInt();
        System.out.println("üçgenin diğer kenarını giriniz.");

        int kenar2 = scanner.nextInt();
        System.out.println("üçgen tabanını giriniz.");

        int taban = scanner.nextInt();

        System.out.println("üçgen yüksekliğini giriniz.");

        int yukseklik = scanner.nextInt();

        Ucgen ucgen = new Ucgen(kenar1, kenar2, yukseklik, taban);
        return ucgen;
    }

    public static Kare kareScannerOku(Scanner scanner) {

        int kenar = scanner.nextInt();

        Kare kare = new Kare(kenar);
        return kare;
    }

    public static Dikdortgen dikdortgenScannerOku(Scanner scanner) {
        System.out.println("Dikdörtgen kısa kenarını giriniz.");


        int kisaKenar = scanner.nextInt();


        System.out.println("Dikdörtgen uzun kenarını giriniz.");

        int uzunKenar = scanner.nextInt();

        Dikdortgen dikdortgen = new Dikdortgen(kisaKenar, uzunKenar);
        return dikdortgen;
    }

    public static Kure kureScannerOku(Scanner scanner) {

        System.out.println("Küre yarıçapı giriniz.");

        int yaricap = scanner.nextInt();

        Kure kure = new Kure(yaricap);
        return kure;
    }

    public static void alanYazdir(Sekil sekil) {

        sekil.alanAl();

    }

    public static void cevreYazdir(Sekil sekil) {

        sekil.cevreAl();

    }

    public static void donguYap(Sekil sekil) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1-Alan");
        System.out.println("2-Çevre");
        System.out.println("3-Çıkış");


        while (true) {

            System.out.println("Hangi işlemi yapmak istersiniz?");


            int secim2 = scanner.nextInt();
            if (secim2 == 1) {

                alanYazdir(sekil);

            } else if (secim2 == 2) {
                sekil.cevreAl();


                System.out.println();
            } else if (secim2 == 3) {
                break;
            }
        }
    }

}