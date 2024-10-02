public class CokBicimlilik_Calisan {
    private String isim;
    private String gorev;
    private int maas;

    public CokBicimlilik_Calisan(String i,String g,int m) {
        this.isim = i;
        this.gorev = g;
        this.maas = m;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
    public void ozet(){
        System.out.println("İsim: "+isim);
        System.out.println("Gorev: "+gorev);
        System.out.println("Maass: "+maas);

    }
}
