package day_05;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Array {
    public static void main(String[] args) {
        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz

        Scanner scan= new Scanner(System.in);
        int arr[]=new int[4];
        System.out.println(Arrays.toString(args)); //[0,0,0,0]
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Lutfen bir sayi giriniz");
            int sayi= scan.nextInt();
            arr[i]=sayi;

        }

        }


        // ve bu rakamları bir array'e assiyn ediniz. Olusturdugunuz array'i yazdırınız
        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız




}
