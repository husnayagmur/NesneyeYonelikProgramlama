public class Arac_Main {
    public static void main(String[] args) {
        KalitimNakliyeAraci nakliyeAraci=new KalitimNakliyeAraci();
        nakliyeAraci.setUretici("X");
        nakliyeAraci.setYükKapasitesi(100);
        System.out.println("Uretici Marka Adi: "+nakliyeAraci.getUretici());
        System.out.println("Arac Yuk Kapasitesi: "+nakliyeAraci.getYükKapasitesi());

        KalitimBisiklet bisiklet=new KalitimBisiklet();
        bisiklet.setUretici("Y");
        bisiklet.setYolcuSayisi(1);
        bisiklet.setGidonYuklekligi(10);
        System.out.println("Yolcu sayisi: "+bisiklet.getYolcuSayisi());
        System.out.println("Gidon yuksekligi: "+bisiklet.getGidonYuklekligi());
        System.out.println("Uretici Marka Adi: "+bisiklet.getUretici());


    }
}
