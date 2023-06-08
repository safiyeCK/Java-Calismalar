package day_02;

public class C01_OdevDeneme {
    // iki sayinin kareleri toplamini bulan ve yazdiran bir method olusturun.(sadece yazdiriyor birsey donmuyor void)
    // main methodu ivcinde tanimladigin sayinin kareleri toplamini bulan ve yazdiran bir method olusturun.

    public static void main(String[] args) {

        int a= 12;
        int b = 10;

        kareleriToplami(a,b);




    }

    private static void kareleriToplami(int a, int b) {
        int toplam= (a*a)+(b*b);

        System.out.println(toplam);
    }


}
