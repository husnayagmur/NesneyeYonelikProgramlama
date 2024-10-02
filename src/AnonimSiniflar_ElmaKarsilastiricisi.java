
import java.util.Comparator;
/*
*Bu satır, Java'da nesneleri karşılaştırmak için kullanılan Comparator arayüzünü içe aktarır.
*Comparator, genellikle sıralama işlemleri için kullanılır. Örneğin, iki nesnenin büyüklüğünü,
* alfabetik sıradaki yerlerini ya da ağırlık gibi bir özelliklerine göre karşılaştırmak için kullanılır.*/

public class AnonimSiniflar_ElmaKarsilastiricisi implements Comparator {
    /*
*AnonimSiniflar_ElmaKarsilastiricisi, Comparator arayüzünü uygulayan bir sınıftır.
*implements Comparator ifadesi, bu sınıfın Comparator'dan gelen metotları kullanacağını belirtir.
*Comparator arayüzünü uygulamak, compare metodunu tanımlamayı gerektirir.*/

    @Override
    public int compare(Object o1,Object o2){
        /*
* Bu, Comparator arayüzünün zorunlu bir metodu olan compare metodunun tanımıdır.
Bu metodun görevi, iki nesne alıp bu nesneleri karşılaştırmak ve sıralama için bir sonuç döndürmektir.
Metod iki parametre alır: o1 ve o2. Bunlar genelde karşılaştırılacak olan nesnelerdir.*/
        AnonimSiniflar_Elma e1=(AnonimSiniflar_Elma) o1;
        /*
* Bu satırda, o1 nesnesi AnonimSiniflar_Elma türüne dönüştürülüyor.
* Yani o1 bir AnonimSiniflar_Elma nesnesi olduğunu varsayıyoruz.
*Comparator arayüzü genellikle Object türündeki nesnelerle çalıştığından,
karşılaştırmayı gerçekleştirebilmek için o1 ve o2'yi AnonimSiniflar_Elma türüne dönüştürmek zorundayız.*/
        AnonimSiniflar_Elma e2=(AnonimSiniflar_Elma) o2;
        return e1.getAgirlik()-e2.getAgirlik();//kucukten buyuge sıralar.
        //return e2.getAgirlik()-e1.getAgirlik();
        /*
*Bu satırda, her iki elmanın getAgirlik() metoduyla ağırlıkları karşılaştırılıyor.
*e1.getAgirlik() ve e2.getAgirlik() ağırlıklarını alır, ardından bu iki değeri birbirinden çıkarır:
*Eğer e1.getAgirlik() büyükse pozitif bir değer döner, yani e1 daha ağırdır.
*Eğer e2.getAgirlik() büyükse negatif bir değer döner, yani e2 daha ağırdır.
*Eğer her iki ağırlık da eşitse 0 döner.
* */

    }
}
