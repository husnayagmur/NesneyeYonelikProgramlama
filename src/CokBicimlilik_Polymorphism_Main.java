public class CokBicimlilik_Polymorphism_Main {
    /*Bu kavram, bir nesnenin farklı durumlarda farklı şekillerde davranabilmesini sağlar.,
     Başka bir deyişle, aynı işlevin, farklı sınıflarda farklı biçimlerde gerçekleştirilmesine olanak tanır.
     */
    public static void main(String[] args) {
        CokBicimlilik_Hayvan hayvan=new CokBicimlilik_Kedi();
        hayvan.sesCikar();
        System.out.println("--------------------------------");
        CokBicimlilik_kare kare=new CokBicimlilik_kare(10);
        kare.alanHesapla();
        System.out.println("--------------------------------");
        CokBicimlilik_Sekil kare1=new CokBicimlilik_kare(4);
        kare1.alanHesapla();
        System.out.println("--------------------------------");
        CokBicimlilik_Sekil daire1=new CokBicimlilik_Daire(4);
        daire1.alanHesapla();
        System.out.println("--------------------------------");
        CokBicimlilik_Calisan calisan1=new CokBicimlilik_Calisan("CAN","IT Müdürü",20000);
        calisan1.ozet();
        System.out.println("--------------------------------");
        CokBicimlilik_Memur memur=new CokBicimlilik_Memur("SAMİ","Yazılımcı",25000);
        memur.setBirim("E-Ticaret");
        memur.ozet();

    }

}
