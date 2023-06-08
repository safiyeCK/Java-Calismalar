package day_06;

import java.util.Arrays;

public class C01_Arrays {
       // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
       //Yeni bir Array olusturmadan varolan Array in isaretlerini degistirin.
      // input : 1,2,-3,4,-5,-6
     // output :-1,-2,3,-4,5,6
       public static void main(String[] args) {
           //int arr[]=new int[6]; bu sekilde elemanlari default degerlerden olusan bir array olusturunuz.

           int arr[]={1,2,-3,4,-5,-6};//Ayni satirda hem declarasyon hem de deger atamsi yapariz

           for (int i=0;i<arr.length;i++){
               arr[i]=arr[i]*-1;
           }
           System.out.println(Arrays.toString(arr)); //[-1, -2, 3, -4, 5, 6]

           //Burada yeni bir arr tanimlamadan foreach le yapti ve for i deki degisik halini aldi ve eski haline dondu
           //o nedenle yeni bir arr1 tanimladim

           //foreachloop la yap
           int arr1[]={1,2,-3,4,-5,-6};
           int index=0;
           for (int each :arr1
                ) {
               arr1[index]=arr1[index]*-1;
               index++;

           }
           System.out.println(Arrays.toString(arr1)); //[-1, -2, 3, -4, 5, 6]
       }
}
