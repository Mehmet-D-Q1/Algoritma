package TA_Java101;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RastgeleSayilarinOrtalamasi {
    public static void main(String[] args) {

        Random random = new Random(); // rastgele sayı üretmek için nesne oluşturma
        Scanner scanner = new Scanner(System.in); // kullanıcıdan giriş alma
        System.out.println("Kaç adet sayı üretilecek:");
        int sayi = scanner.nextInt(); //alınan değeri okuyup atama

        int[] sayilar = new int[sayi];//girilen değer boyutunda dizi oluşturma

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = random.nextInt(100);//random nesnesiyle 0 ila 100 arasında oluşturulacak elemanları diziye atama
        }
        System.out.println(Arrays.toString(sayilar)); //dizi elemanlarını görelim
        float toplam = 0.0f;
        for (int i = 0; i < sayilar.length; i++) { //dizi elemanlarını toplama
            toplam = toplam + sayilar[i];
        }
        System.out.println("Ortalama: ");
        float ortalama = toplam/sayi; // elemanların ortalaması
        System.out.println(ortalama);
    }
}
