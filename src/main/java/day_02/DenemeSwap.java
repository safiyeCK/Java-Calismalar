package day_02;

import java.util.Scanner;



public class DenemeSwap {
    public static void main(String[] args) {

        //Kullanicidan iki sayi aliniz ve konsola swap yaparak yazdiriniz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi1= scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int girilenSayi2 = scan.nextInt();

        sawpDegisenSayi(girilenSayi1,girilenSayi2);// bu kisim asagidaki method olusturulduktan sonra yazildi


    }
    public static void sawpDegisenSayi(int girilenSayi1, int girilenSayi2){
        int c;
        c= girilenSayi1;
        girilenSayi1= girilenSayi2;
        girilenSayi2=c;
        System.out.println("Girilen Ilk Sayi:"+ girilenSayi1);
        System.out.println("Girilen Ikinci Sayi:"+girilenSayi2);



    }
}
