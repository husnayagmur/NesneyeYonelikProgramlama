public class Kalem_Main {
    public static void main(String[] args) {
        Kalem kalem1=new Kalem("FaberCastel","Kursun Kalem",false,true);
        Kalem kalem2=new Kalem("ABC","Dolma Kalem",false,false);
        System.out.println("Kalem1 Bilgileri");
        kalem1.sil();
        kalem1.tekrarDoldur();
        System.out.println("\nKalem2 Bilgileri");
        kalem2.sil();
        kalem2.tekrarDoldur();

    }
}
