package TA_Java103;

import java.util.*;

public class Main {
    //Sayısal Loto Uygulaması: Birbirinden farklı 6 sayı barındıran 8 satırdan oluşmaktadır. Bu değerler rastgele oluşturulmalı.
    public static void doldur(SortedSet<Integer> integers, int sutunSayisi){
        integers.clear();
        Random random = new Random(); //Random class'ından nesn referansı oluşturduk.
        while (integers.size() < sutunSayisi){ // her bir satırdaki elemanları(sütunu oluşturacak) oluşturan döngü.
            int sayi = random.nextInt(50);//0 ila 50 arasında tam sayıları üretip atama yapar.
            integers.add(sayi); //integers sortedset kümesine ekler.
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır Sayısı: ");
        int satirSayisi = scanner.nextInt();
        System.out.print("Sütun Sayısı: ");
        int sutunSayisi = scanner.nextInt();
        SortedSet<Integer> integers = new TreeSet<>(); //bir birinden farklı sayılar ve belirli bir sıraya göre dizilmeleri için SortedSet kümesi oluşturuldu.
        for (int i = 0; i < satirSayisi; i++) { //8 adet satır oluşturma döngüsü.
        doldur(integers, sutunSayisi); // doldur metodu, integers parametresiyle çağrılır.
        Iterator<Integer> iterator = integers.iterator();//doldur() metodundan gelen integers elemanları tek tek sıralanır.
        while (iterator.hasNext()) { //iterator' dan gelen veriler varsa true, yoksa false döner. Son öğeye kadar kontrol eder.
            System.out.print(iterator.next() + "\t"); //iterator.hasNext(): true dönenler basılır.
        }
        System.out.println();
        }
    }
}

