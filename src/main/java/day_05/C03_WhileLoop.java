package day_05;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        // Kullanıcıdan sisteme bir sayi girmesini isteyiniz
        // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz
        //or: 5!=1*2*3*4*5

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen faktorielini almak istediginiz sayiyi giriniz");
        int sayi= scan.nextInt();

        int carpim= 1; // bos kavanoz
        int baslangic=1; //counter
        while (baslangic<=sayi){
           carpim=carpim*baslangic;
            baslangic++;


        }
        System.out.print(sayi+ "! ="+ carpim);


        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız

        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49



    }
}
