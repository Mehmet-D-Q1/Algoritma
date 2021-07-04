package TA_Java101;

import java.util.Scanner;

public class SifreSorma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //kullanıcı input girişi
        String parola = "";//başlangıç boş stringi
        do { //önce input atanacak
            System.out.println("Parola: ");
            parola = scanner.nextLine(); //okuma atama
        }
        while (!parola.equals("1234")); //sonra kontrol edilecek.Şart sağlanıyorsa do-while'den çıkılacak
        System.out.println("Giriş yaptınız...");
    }
}
