import java.util.Scanner;

public class Hatalar {
    public static void arithExcep(){
        Scanner scnner=new Scanner(System.in);
        int x=scnner.nextInt();
        int y=scnner.nextInt();
        System.out.println(x/y);//y sıfır oldugunda hata fırlatır.
    }
    public static void arrayExcep(){
        Scanner scnner=new Scanner(System.in);
        int[] array={1,2,3,4,5};
        int index=scnner.nextInt();
        System.out.println(array[index]);
    }

    public static void main(String[] args) {

        arithExcep();
        arrayExcep();/*bir dizinin (array) sınırlarının dışına çıkıldığında meydana gelen bir istisnadır.
         Yani, bir diziye geçerli olmayan bir indeksle erişmeye çalıştığınızda bu hata oluşur.
         */
    }
}
