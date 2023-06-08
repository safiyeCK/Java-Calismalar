package day_02;

public class C05_MethosCreation {

    public static void main(String[] args) {

        /*
        1- Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
         kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */

        int sayi1= 10;
        int sayi2= 20;
        int temp= 0;
        System.out.println("sawapten once sayi:"+ sayi1);
        System.out.println("Swaptan once sayi :"+ sayi2);

       swaplaYazdir(sayi1, sayi2);

        //main method ıcınden method olustururken
        //1. methoda verecegın ismi yaz(ozelısım)
        //2. method parantezini koy
        //3.parantezin içine varsa argumentlerini yaz
        //swaplaYazdir(sayi1, sayi2);//main methodun icinde argument



    }

    // Bu method yazdima yapacak sadece o yuzden return type void
    private static void swaplaYazdir(int sayi1, int sayi2) {
        int sayi3;
        sayi3= sayi1;
        sayi1=sayi2;
        sayi2= sayi3;
        System.out.println("sawapten sonra sayi:"+ sayi1);
        System.out.println("Swaptan sonra sayi :"+ sayi2);



    }

}
