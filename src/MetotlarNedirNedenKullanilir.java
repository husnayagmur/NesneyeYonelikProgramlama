import java.util.Scanner;
public class MetotlarNedirNedenKullanilir {
    public static void main(String[] args) {
        /*Metotlar, sınıfın davranışlarını temsil eder ve
        o sınıfa ait nesneler üzerinde işlem yapmamıza olanak tanır.
         */

        System.out.println("Hello World");//ekrana yazdirma metodudur.
        System.out.println(Math.pow(2,3));//us alma metodudur.
        System.out.println(Math.sqrt(16));//Karekok alma metodudur.

        Scanner inp=new Scanner(System.in);
        String input=inp.nextLine();//kullanicidan veri alma metodudur.
        System.out.println(input.toUpperCase());//kullanicinin girdigi veriyi büyük harfle yazdirma metodudur.
    }
}
