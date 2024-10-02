public class Super_Main {
    /*
    super anahtar kelimesi, alt sınıfın yapıcısı (constructor) içinde,
    üst sınıfın yapıcısını çağırmak için kullanılır.
Üst sınıfın parametresiz yapıcısı otomatik olarak çağrılır,
 ancak parametreli yapıcıyı çağırmak için super() ile belirtilmelidir.
     */
    public static void main(String[] args) {
        Super_Kisi kisi=new Super_Kisi("adnan");
        System.out.println(kisi.getIsim());

        Super_Ogrenci ogrenci=new Super_Ogrenci("efnan",100);
        System.out.println(ogrenci.getIsim());
        System.out.println(ogrenci.getNumara());
        ogrenci.ozet();
    }

}
