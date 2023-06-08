package day_02;

import java.util.Scanner;

public class C03_Scanner {

    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false dondursun.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayi giriniz");
        int sayi1= scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2= scan.nextInt();

        boolean sonuc= karelerEsitMi(sayi1,sayi2); // Bu kismi asagida method olusturduktan sonra yapiyoruz

        System.out.println(sonuc);


    }

    public static boolean karelerEsitMi(int sayi1, int sayi2){

     //Parantez icine parametreleri yazdim
        boolean sonuc = (sayi1*sayi1) == (sayi2*sayi2);
        return sonuc;


    }
}
