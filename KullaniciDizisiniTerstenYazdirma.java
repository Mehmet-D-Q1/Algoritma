package TA_Java101;

import java.util.Arrays;
import java.util.Scanner;

public class KullaniciDizisiniTerstenYazdirma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz: ");
        String text = scanner.nextLine();

        String[] textTers = new String[text.length()];
        int i ;
        for (i = text.length()-1; i>=0; i--) {
            System.out.print(text.charAt(i));
            //textTers = textTers + text.charAt(i);
            //textTers[textTers.length-1-i] = String.valueOf(text.charAt(i));
        }

        //System.out.println(text.length());
        //System.out.println(Arrays.toString(text.toCharArray()));
        //System.out.println(Arrays.toString(textTers.toCharArray()));
        //System.out.println(Arrays.toString(textTers));



    }
}
