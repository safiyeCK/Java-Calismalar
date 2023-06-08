package day_01;

public class C01_Variables {

    public static void main(String[] args) {


        //Bir variable olustur.Kodumuzun dinamik olmasi icin variableleri kullaniyoruz.

        int yas = 32;

        int yas1= 42;
        int sayi = 50;


        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);
        System.out.println("yas="+ yas);
        System.out.println("sayi = " + sayi);
        System.out.printf("sayi", sayi);
        System.out.println("sayi = " + sayi);
        System.out.println("sayi = " + sayi);
        System.out.println("C01_Variables.main");



        System.out.println("sayi = " + sayi);
        System.out.println(sayi);
        System.out.println("sayi = " + sayi);

        // sayi = 50 seklinde yazdir.

        System.out.println("sayi =" + sayi);
        // bir string ifadeden sonra + isareti varsa arka arkaya yazdir demek.


        // codlarim daginiksa {cntl alt L} kodlarimizi duzenler
        // cntrlD kullanarak cogaltabilirim yazdigimi.

        // Bir variable etiketiyle birlikte kisaca yazdirmanin yolu var mi?soutv

        System.out.println("sayi = " + sayi);


        String isim = "Ali";

        String isim1= "Safiye";

        System.out.println("isim="+ isim);

        String isim2 = "Betul";
        String onunISmi= isim2;
        System.out.println("onunISmi = " + onunISmi);


        //Olusturdugun variable'ı farkli bir variable'a kopyala

        // Yeni bir variable olustur. ismi= benimYasim
        //Bu variable degeri az once olusturdugum yas variable degeriyle esit olsun.

        int benimYasim= yas;

        String onunIsmi = isim;

        System.out.println(benimYasim);
        System.out.println(onunIsmi);

        int benimYasim1 = yas1;

        String onunIsmi1 = isim1;

        System.out.println(benimYasim1);
        System.out.println(onunIsmi1);
        System.out.println("onunismi="+ onunIsmi1);
        System.out.println("benim yasim="+ benimYasim1);



        //camelCase
        // PascelCase
        //snake_case
        //kebab_case




        //Aynı satırda coklu variable deklare et

        int yil= 2023, ay= 5, gun= 15;

        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);


        //Bir variable degerini guncelle

        //Az once olusturdugumuz isim variable degerine Veli olarak guncelle.

        isim= "Veli";
        isim1= "Zeynep";


        System.out.println("isim="+ isim);

        System.out.println("onunIsmi = " + onunIsmi);

        System.out.println("isim="+ isim1);


        //Degişkenleri(variable) yazdır

        //Bir variable deklere et : x // tanimlamak demek.Data turu ve data ismi
        double x;

        //Bir variable baslat : y //baslat demek deger atamasi yap demek
        double y = 12.5;

        //Başka bir variable başlat : z
        double z= 33; // java buaraya yazdigimiz 33 degerini 33.0 algiladi ama hata vermedi.


        //x degişkenini y degişkeni ile başlat
        x = y; // Bir variable 1 kere deklare edebiliriz


        //Variable y'i guncelle

        y= 13.9;


        //Degişkenleri yazdır

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }
}
