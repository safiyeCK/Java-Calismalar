package day_02;

public class C01_Odev {
    public static void main(String[] args) {
        // iki sayinin kareleri toplamini bulan ve yazdiran bir method olusturun.(sadece yazdiriyor birsey donmuyor void)
        // main methodu ivcinde tanimladigin sayinin kareleri toplamini bulan ve yazdiran bir method olusturun.


        int a = 2;
        int b = 3;

        kareTolamYazdir(a, b); //Buaradaki parantez icindeki varable argument denir


    }


        public static void kareTolamYazdir( int sayi1 ,int sayi2){


          int toplam=   (sayi1*sayi1)+(sayi2*sayi2);

            System.out.println("toplam = " + toplam);

        } // method pazrantezinin icine variabellar tanimliyoruz.
          // Icine method bady de kullanacagimiz variabel lari tanimliyoruz.
         //Bunlara parametre denir



}
