public class Final_Main {
    /*
    Final Değişkenler:
Değişken tanımlandıktan sonra değeri bir daha değiştirilemez. Bu, o değişkenin sabit (constant) olduğunu ifade eder.
Tanımlandığı an ya da yapıcı (constructor) ile bir kez değer atanmalıdır.

Final Metotlar:
 Bir metot final olarak tanımlandığında, o metot alt sınıflar (subclass) tarafından override edilemez.
Bu, yöntemin (methodun) davranışının kalıcı olmasını sağlar.

Final Siniflar:
Bir sınıf final olarak tanımlandığında, o sınıftan türetme (inheritance) yapılamaz. Yani başka bir sınıf, bu sınıfı miras alamaz.
Bu, o sınıfın değiştirilemez olduğunu belirtir.

NOT:Override etmek (geçersiz kılmak), nesne yönelimli programlamada (OOP) bir sınıfın,
üst sınıfından (superclass) miras aldığı bir yöntemi (metodu) kendi ihtiyaçlarına göre yeniden tanımlamasıdır.
Yani, alt sınıfta (subclass) bir metodun davranışını değiştirip, onu özelleştirmek için kullanılır. Override işlemi, polymorphism (çok biçimlilik) ilkesinin temel bir parçasıdır.

     */

    public static void main(String[] args) {
        Final_Ogrenci ogrenci=new Final_Ogrenci(1);
        System.out.println(ogrenci.getNumara());
        Final_UniOgrencisi uniOgrenci=new Final_UniOgrencisi(10);
        System.out.println(uniOgrenci.getNumara());
    }

}
