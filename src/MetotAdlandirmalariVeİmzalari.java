import java.util.Scanner;

public class MetotAdlandirmalariVeİmzalari {

    private void helloWorld(){
        System.out.println("Hello World");
    }//geriye deger dondurmez.

    private int toplam(int x,int y){
        int toplam=x+y;
        return toplam;
    }//return islemin bittigini ve geriye deger dondurdugunu belirtir.

    private float toplam(float x,int y){
        float toplam=x+y;
        return toplam;
    }//ayni metot ismiyle farkli tipte degisken verirsek kullanabiliriz.

    public static void main(String[] args) {
        /*METOT ADLANDIRMASI GENEL FORMU
        -Visibility le öetota kimlerin erisebilecegi,
        -Type ile metodun donus tipi,
        -Name ile metodun ismi,
        -Argument List ile metodun alabilecegi parametreler,
        -Parantez ici bos ise parametresiz metotdur.
         */

        MetotAdlandirmalariVeİmzalari metot=new MetotAdlandirmalariVeİmzalari();
        metot.helloWorld();
        /*
        new MetotAdlandirmalariVeİmzalari().HelloWorld();
        yukaridaki kod ile ayni isleve sahiptir.
         */
        int sonuc=metot.toplam(5,7);
        System.out.println(sonuc);
        float sonuc2=metot.toplam(2.2f,1);
        System.out.println(sonuc2);

        Scanner inp=new Scanner(System.in);
        int sonuc3=metot.toplam(inp.nextInt(),inp.nextInt());//kullanicidan iki tane sayi alinir.
        System.out.println(sonuc3);

        System.out.print("Lütfen 1. sayiyi giriniz:");
        int a=inp.nextInt();
        System.out.print("Lütfen 2. sayiyi giriniz:");
        int b=inp.nextInt();
        int sonuc4=metot.toplam(a,b);
        System.out.println(sonuc4);




    }
}
