public class MetotAsiriYukleme_Overloading_Ogrenci {
    private String kimlik;
    private String ad;
    private String soyad;
    private String sinif;

    public String getKimlik() {
        return kimlik;
    }

    public void setKimlik(String kimlik) {
        this.kimlik = kimlik;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public MetotAsiriYukleme_Overloading_Ogrenci(String kimlik,String ad,String soyad,String sinif) {
        this.kimlik = kimlik;
        this.ad=ad;
        this.soyad=soyad;
        this.sinif=sinif;
    }

    public MetotAsiriYukleme_Overloading_Ogrenci(String ad,String soyad) {
        this.ad = ad;
        this.soyad=soyad;
    }

    public MetotAsiriYukleme_Overloading_Ogrenci(){}
}
