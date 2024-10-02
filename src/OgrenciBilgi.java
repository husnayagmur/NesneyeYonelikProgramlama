public class OgrenciBilgi {

    public void ogrenciBilgileri(Ogrenci ogrenci){
        ogrenci.ad="samed";
        System.out.println(ogrenci.ad);
        System.out.println(ogrenci.yas);
    }
    public static void main(String[] args) {
        Ogrenci ogrenci1=new Ogrenci();
        ogrenci1.ad="husna";
        ogrenci1.yas=20;
        OgrenciBilgi ogrB=new OgrenciBilgi();
        ogrB.ogrenciBilgileri(ogrenci1);
        System.out.println(ogrenci1.ad);
        System.out.println(ogrenci1.yas);


    }
}
