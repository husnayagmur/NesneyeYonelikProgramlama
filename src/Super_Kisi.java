public class Super_Kisi {
    private String isim;

    public Super_Kisi(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public void bilgileriYazdir(){
        System.out.println("kisi: "+isim);
    }
}
