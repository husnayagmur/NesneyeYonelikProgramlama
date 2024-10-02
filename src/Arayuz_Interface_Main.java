public class Arayuz_Interface_Main {
    public static void main(String[] args) {
        /*
-Arayüz Kullanımının Temel Mantığı
Bir arayüz, sınıflara ne yapmaları gerektiğini söyler, ancak nasıl yapacaklarını tanımlamaz. Bu, farklı sınıfların aynı arayüzü kullanarak ortak davranışları farklı şekillerde gerçekleştirmesine olanak tanır.

-Arayüz Kullanımı Adımları
Arayüz Tanımlanması: Arayüz, metodların yalnızca imzalarını (signature) tanımlar.

Sınıfların Arayüzü Uygulaması: Arayüzü uygulayan sınıflar,
tanımlanan metodları override ederek kendi spesifik davranışlarını belirtir.

Çoklu Kalıtım Sağlama: Java'da sınıflar birden fazla arayüzü implement edebilir,
bu da çoklu kalıtım gibi bir davranış sağlar.
interface olqnlqr varsayılan olarak metotları public abstract dir.
*/
        Surebilir surebilir=new Arayuz_Interface_Sofor();
        surebilir.sur();
        Surebilir surebilir2=new Arayuz_Interface_Pilot();
        surebilir2.sur();
        Ucabilir ucabilir=new Arayuz_Interface_Karga();
        Yuruyebilir yuruyebilir=new Arayuz_Interface_Karga();
        ucabilir.ucmak();
        yuruyebilir.yurumek();
    }
}
