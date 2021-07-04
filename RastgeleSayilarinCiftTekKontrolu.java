package TA_Java101;

import java.util.Arrays;
import java.util.Scanner;

public class RastgeleSayilarinCiftTekKontrolu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Kullanıcıdan input alma
        System.out.println("Kaç adet sayı girilecek? :");
        int sayiAdedi = scanner.nextInt(); //inputun atanması
        int[] sayilar = new int[sayiAdedi]; //input boyutunda dizi tanımlama

        for (int i = 0; i < sayilar.length; i++) { // dizi elemanlarını dönderme
            System.out.println("Sayı: ");
            sayilar[i] = scanner.nextInt(); // diziye elemanları tek tek ekleme
        }

        System.out.println(Arrays.toString(sayilar)); //diziyi görelim

        for (int i = 0; i < sayilar.length; i++) { //dizi elemanlarını dönderme
            if (sayilar[i] % 2 == 0) // çift olma kontrolü
            {
                System.out.println(sayilar[i] + " Çift Sayı");
            }
            else //değilse tek olması
            {
                System.out.println(sayilar[i] + " Tek Sayı");
            }
        }
    }
}
