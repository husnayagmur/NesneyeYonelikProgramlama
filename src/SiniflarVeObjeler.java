public class SiniflarVeObjeler {
    public static void main(String[] args) {
        SiniflarVeObjelerDaire daire=new SiniflarVeObjelerDaire();
        daire.x=5.0;
        daire.y=4.0;
        daire.r=2.0;
        System.out.println(daire.x);
        System.out.println(daire.y);
        System.out.println(daire.r);

        double alanHesapla=daire.alan();
        double cevreHesapla=daire.cevre();
        System.out.println("Daire alani:"+alanHesapla);
        System.out.println("Daire cevresi: "+cevreHesapla);

        SiniflarVeObjelerDaire daire2=new SiniflarVeObjelerDaire();
        daire2.r=3.0;
        System.out.println("Daire alani:"+daire2.alan());
        System.out.println("Daire cevresi: "+daire2.cevre());


    }

}
