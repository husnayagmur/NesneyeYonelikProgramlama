public abstract class Soyut_Siniflar_Oyuncu {
    private String isim;
    private int numarasi;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getNumarasi() {
        return numarasi;
    }

    public void setNumarasi(int numarasi) {
        this.numarasi = numarasi;
    }

    public abstract void sutCek();
    public abstract void pasVer();
    /*
Nesne oluşturulamaz: Soyut sınıflardan doğrudan nesne oluşturulamaz.
Yalnızca kendilerini genişleten alt sınıflar tarafından kullanılabilir.

Abstract ve concrete (somut) metodlar içerebilir: Soyut sınıflar,
hem gövdesi olmayan soyut metodlar hem de tam olarak tanımlanmış somut metodlar içerebilir.

Abstract metodların uygulanması zorunludur: Alt sınıflar,
soyut sınıftaki tüm soyut metodları override ederek (geçersiz kılarak) uygulamak zorundadır.

Constructor içerebilir: Soyut sınıflar, constructor (yapıcı metod) içerebilirler
 ancak bu constructorlar doğrudan kullanılmaz, alt sınıflar tarafından çağrılır.

Diğer sınıflar gibi özelliklere sahiptir: Soyut sınıflar,
değişkenler (fields), sabitler (constants), getter ve setter metodları gibi normal sınıfların sahip olduğu özelliklere sahip olabilir.

Miras alınır (inheritance): Soyut sınıflar,
başka sınıflar tarafından genişletilerek (extend edilerek) miras alınabilir. Alt sınıflar soyut sınıfın metodlarını kullanabilir veya üzerine yazabilir (override).

Soyut sınıf zorunlu değil: Bir sınıf soyut metod içermese bile soyut sınıf olarak tanımlanabilir.
 Bu, sınıfın doğrudan kullanılamayacağını ve miras alınması gerektiğini ifade eder.*/
}
