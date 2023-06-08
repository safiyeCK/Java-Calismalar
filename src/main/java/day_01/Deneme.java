package day_01;

public class Deneme {


    // iki tam sayi aliniz, once bunlari carpiniz sonra da toplayiniz.
    //method olusturunuz


    // Dikdortgenin cevresini bulan bir method olusturunuz
    public static void main(String[] args) {


        int sayilarinCarpimiVeToplami = sonuc(5,6);

        System.out.println(sayilarinCarpimiVeToplami);

        double dikdortgeninCevresi = sonuc(34, 43);

        System.out.println(dikdortgeninCevresi);
    }

    public static int sonuc(int a, int b) {
        return (a * 2) + (a + b);


    }


    public static double alan(double a, double b) {
     return (a*2)+(b*2);


    }

}
