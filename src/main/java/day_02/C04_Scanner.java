package day_02;

import java.util.Scanner;

public class C04_Scanner {


    //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");


        char ch= scan.next().charAt(0); // scanner objesinin nextChar diye bir methodu yok.
          //bu yuzden kullanixcinin girdigi datayi once string olarak aliyorum
        //daha sonra bu stringen 0. indexindeki karakteri charAt(0) methodu ile aliyorum
        //String variabellarda index yapisi vardir ve index 0 dan baslar.
        //charAt(0) sifirinci index yani ilk karakter demektir.

        System.out.println("ch =" + ch);
        System.out.println("=====================CEVAP=================");

        /*
          A
         A A
        A A A

         */

        // konsolda bosluk (space) yapmak icin sout un icinde space mutlaka cift tirnak icinde yazmaliyiz.

        System.out.println("  "+ch+"  "); // 1. satir
        System.out.println(" "+ch+" "+ch+" "); // 2.satir
        System.out.println(ch+" "+ch+" "+ch); //3.satir

        System.out.println("=================CEVAP=================");
        // tek bir saut un icinde yapalim.
        // \n isareti bir alt satira gecmeyi yarar.
        //cift tirnak icinde yapilir.

        System.out.println("  "+ch+"  \n "+ch+" "+ch+" \n"+ch+" "+ch+" "+ch );



    }
}
