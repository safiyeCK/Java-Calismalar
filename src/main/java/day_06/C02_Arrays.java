package day_06;

import java.util.Arrays;

public class C02_Arrays {
    /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' elemanları bulan bir kod yazınız.

        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        output: min:-90, max:10001, ikincimax: 8787

       */
    public static void main(String[] args) {
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[-90, 0, 1, 100, 845, 898, 8787, 10001]
        System.out.println("minumum: " + arr[0]); //-90
        System.out.println("maxsimum: " + arr[arr.length - 1]); //10001
        System.out.println("sondan ikinci elemnet: " + arr[arr.length - 2]); //8787
    }
}
