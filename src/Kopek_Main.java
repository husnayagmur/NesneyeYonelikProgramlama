public class Kopek_Main {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek();
        kopek1.cins="Kangal";
        kopek1.boyut=KopekBoyut.BUYUK;
        kopek1.renk=KopekRenk.KAHVERENGI;
        kopek1.yas=5;
        kopek1.yemekYe();;
        kopek1.kos();
        kopek1.otur();
        kopek1.uyu();
    }
}
