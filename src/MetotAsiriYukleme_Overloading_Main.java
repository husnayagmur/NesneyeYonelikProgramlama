public class MetotAsiriYukleme_Overloading_Main {
    public static void main(String[] args) {
/*
Aynı metot adı: Aşırı yükleme yapılacak tüm metotlar aynı ada sahip olmalıdır.
Farklı parametreler: Metotların parametre listeleri ya sayıca,
ya da tür bakımından farklı olmalıdır. Aynı isimde ve aynı parametre türüne ve sayısına sahip metotlar tanımlanamaz.
Geri dönüş tipi: Geri dönüş tipi metot aşırı yüklemede dikkate alınmaz,
yani sadece geri dönüş tipi farklı olan iki metot aşırı yüklenemez.*/
        MetotAsiriYukleme_Overloading_HesapMakinesi topla=new MetotAsiriYukleme_Overloading_HesapMakinesi();
        topla.topla(2,2);
        topla.topla(2.1f,2);
        topla.topla(2.2f,3.3f);
//Public metotlarda asırı yuklenebilir.

    }
}
