import java.util.Date;

public class Calisan_Main {
    public static void main(String[] args) {
        Calisan calisan=new Calisan();
        calisan.setIsim("alican");
        calisan.setMaas(21000);
        calisan.setIseGirisTarihi(new Date());
       System.out.println( "Isim: "+calisan.getIsim());
        System.out.println("Maas: "+calisan.getMaas());
        System.out.println("Tarih: "+calisan.getIseGirisTarihi());

    }
}
