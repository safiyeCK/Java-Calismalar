package day_02;

import java.util.Scanner;

public class C02_MethodCreation {

    public static void main(String[] args) {
        //kullanıcıdan fahrenheit cinsi bir deger girmesini isteyin
        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8
        //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

        Scanner scan = new Scanner(System.in); // Kullanicidan birsey istiyorsan Scanner kullanirsin
        System.out.println("Lutfen  fahrenheit cinsinden bir deger giriniz "); //Ne istiyorsak yazdiririz
        double fahrenheit = scan.nextDouble();
        System.out.println("fahrenheit = " + fahrenheit);

       // Burasi main method u kisa yolla yaptigimiz yer
        //Methodumuza isim veriyoruz.
        //fahToCel method adi ve () olmali.
        //parentezin icine neyi degistireceksek onu girecegiz.
        double celsius = fahrToCel(fahrenheit);
        System.out.println("celsius = " + celsius);
    }

    public static double fahrToCel(double fahrenheit) {

        // formül: c = (f-32)/1.8

        double celsius=(fahrenheit-32)/1.8;
        return celsius; //return (fahrenheit-32)/1.8) bu da olurdu

               //Method olusturmadanda boyle yapilabilir.
               //Scanner scan = new Scanner(System.in);
                //System.out.println("Fahrenheit cinsi bir değer girin");
                //double fehrenheit = scan.nextDouble();
                //System.out.println("fehrenheit = " + fehrenheit);
                 //double celsius = (fehrenheit-32)/1.8;
                 //System.out.println("celsius = " + celsius);
    }


}
