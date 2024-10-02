public class CokBicimlilik_kare  extends CokBicimlilik_Sekil{
     private int uzunluk;

    public CokBicimlilik_kare(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
    public void alanHesapla(){
        System.out.println("Kare Alan: "+(Math.pow(uzunluk,2)));
    }
}
