public class CokBicimlilik_Daire extends CokBicimlilik_Sekil {
    private int yarıCap;

    public CokBicimlilik_Daire(int yarıCap) {
        this.yarıCap = yarıCap;
    }

    public int getYarıCap() {
        return yarıCap;
    }

    public void setYarıCap(int yarıCap) {
        this.yarıCap = yarıCap;
    }
    public void alanHesapla(){
        System.out.println("Daire Alani: "+Math.PI*Math.pow(yarıCap,2));
    }
}
