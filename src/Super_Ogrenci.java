public class Super_Ogrenci extends Super_Kisi {
    private int numara;
    public Super_Ogrenci(String isim,int numara) {
        super(isim);
        this.numara=numara;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }
    public void ozet(){
        System.out.println("ogrenci no: "+numara);
        super.bilgileriYazdir();
    }

}
