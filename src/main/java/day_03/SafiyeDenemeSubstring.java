package day_03;

import java.util.Scanner;

public class SafiyeDenemeSubstring {
    public static void main(String[] args) {
        /*
       Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
       NOT: Yalnızca bir ad bir soyad girilmeli
       Ad ve Soyadı ilk harfleri buyuk kalanı kucuk olacak sekılde alt alta yazdırın
       Ad : Canan
       Soyad : Can
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi aralarinda bir bosluk olacak sekilde yaziniz");
        String a= scan.nextLine();

        int spaceIndex= a.trim().indexOf(" ");

        String isim= a.trim().substring(0,spaceIndex);
        String soyIsim= a.trim().substring(spaceIndex+1);

        String isim2= isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        String soyIsim2= soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase();
        System.out.println("Isim="+isim2);
        System.out.println("Soyisim="+soyIsim2);

    }
}
