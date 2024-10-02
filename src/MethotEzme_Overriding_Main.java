public class MethotEzme_Overriding_Main {
    /*
    Metot ezme (method overriding), bir alt sınıfın (subclass) üst sınıfta (superclass) tanımlanmış bir metodu
    yeniden tanımlayarak kendi versiyonunu sağlamasıdır. Java'da polimorfizmi destekleyen bir mekanizmadır.
    Metot ezme, nesne yönelimli programlamada kalıtım yoluyla miras alınan metotların alt sınıflarda özelleştirilmesine olanak tanır.

    Metot ezmenin özellikleri:
    Aynı metot adı: Alt sınıfta ezilen metodun adı, üst sınıftaki ile aynı olmalıdır.
    Aynı parametreler: Parametre listesi, üst sınıftaki metot ile birebir aynı olmalıdır.
    Eğer farklı parametreler varsa, bu aşırı yükleme (overloading) olur.
    Geri dönüş tipi: Geri dönüş tipi, üst sınıftaki metodunki ile aynı olmalı veya
    onun alt türü (covariant return type) olmalıdır.
    Erişim belirleyici: Alt sınıfta ezilen metodun erişim belirleyicisi (public, protected, vs.),
    üst sınıftakinden daha kısıtlayıcı olamaz. Örneğin, üst sınıftaki metot public ise alt sınıftaki de public olmalıdır.
    */
    public static void main(String[] args) {
        MethotEzme_Overriding_Araba araba=new MethotEzme_Overriding_Araba("X","BMW",2022);
        System.out.println(araba.toString());
        araba.setMarka("Y");
        System.out.println(araba.toString());
        /*
         Java'daki her sınıf, Object sınıfından türediği için otomatik olarak toString() metodunu miras alır.
         Ancak, bu metot varsayılan olarak nesnenin bellek adresini döner ve
         çoğu durumda yeterli veya anlamlı değildir. Bu yüzden, genellikle kendi sınıfımızda toString() metodunu ezerek daha kullanışlı ve anlaşılır bir çıktı sağlarız.*/
    }


}
