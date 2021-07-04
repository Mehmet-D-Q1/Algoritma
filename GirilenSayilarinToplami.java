package TA_Java101;

import java.util.Scanner;

public class GirilenSayilarinToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int input = 0;
        do {
            System.out.println("Bir sayı giriniz: ");
            input = scanner.nextInt();
            toplam = toplam +input;
        }
        while (input != 0);
        System.out.println("Girilen sayıların toplamı: " + toplam);
    }
}
