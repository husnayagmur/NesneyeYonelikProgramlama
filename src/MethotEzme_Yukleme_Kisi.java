public class MethotEzme_Yukleme_Kisi {
    private String tcNo;
    private String isim;

    public MethotEzme_Yukleme_Kisi(String tcNo) {
        this.tcNo = tcNo;

    }
    public MethotEzme_Yukleme_Kisi(String tcNo,String isim) {
        this.tcNo = tcNo;
        this.isim=isim;
    }

    public String getTcNo() {
        return tcNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }
    @Override
    public String toString(){
        return "İsim: "+getIsim()+"  Tc: "+getTcNo();
    }
    @Override
    public boolean equals(Object other){
        MethotEzme_Yukleme_Kisi kisi=(MethotEzme_Yukleme_Kisi) other;
        return kisi.tcNo.equals(this.tcNo);

    }
}
