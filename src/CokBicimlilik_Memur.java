public class CokBicimlilik_Memur extends CokBicimlilik_Calisan{
    private String birim;
    public CokBicimlilik_Memur(String i, String g, int m) {
        super(i, g, m);
    }

    public String getBirim(){
        return birim;
    }
    public void setBirim(String birim){
        this.birim=birim;
    }
    public void ozet(){
        System.out.println("Memur İsim: "+getIsim());
        System.out.println("Memur Gorev: "+getGorev());
        System.out.println("Memur Maas: "+getMaas());
        System.out.println("Memur Birim: "+birim);

    }

}
