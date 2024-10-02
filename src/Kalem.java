public class Kalem {
    String marka;
    String tip;
    boolean doldurulabilir;
    boolean silinebilir;


    public Kalem(String marka,String tip,boolean doldurulabilir,boolean silinebilir){
        this.marka=marka;
        this.tip=tip;
        this.doldurulabilir=doldurulabilir;
        this.silinebilir=silinebilir;
    }
    void yaz(String metin){
        System.out.println(metin);
    }

    void tekrarDoldur(){
        if(doldurulabilir){
            System.out.println("Kalem dolduruldu.");
        }else{
            System.out.println("Kalem doldurulamadi.");
        }
    }

    void sil(){
        if(silinebilir){
            System.out.println("yazi silindi.");
        }else{
            System.out.println("yazi silindi.");
        }
    }
}
