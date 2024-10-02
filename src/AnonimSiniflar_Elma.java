import java.security.PublicKey;

public class AnonimSiniflar_Elma {
    private int agirlik;


    public AnonimSiniflar_Elma(int agirlik) {
        this.agirlik = agirlik;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }
    @Override
    public String toString(){
        return "Agirlik: "+agirlik;
    }
}
