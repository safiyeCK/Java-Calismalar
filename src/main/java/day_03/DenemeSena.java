package day_03;

import java.util.Scanner;

public class DenemeSena {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadınızi aralarında bir bosluk olacak sekılde sisteme giriniz");
        String a= scan.nextLine();

        a=a.trim();
        int indexSpace= a.indexOf(" ");

        String isim= a.substring(0,indexSpace);
        String soyisim= a.substring(indexSpace+1);

        String isim2= isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        String soyisim2= soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
        System.out.println(isim2+"\n"+soyisim2);


    }
}
