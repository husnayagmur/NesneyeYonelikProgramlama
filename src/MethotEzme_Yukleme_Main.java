public class MethotEzme_Yukleme_Main {
    public static void main(String[] args) {
        MethotEzme_Yukleme_Kisi kisi1= new MethotEzme_Yukleme_Kisi("1450","Ayse");
        System.out.println(kisi1.toString());
        MethotEzme_Yukleme_Kisi kisi2= new MethotEzme_Yukleme_Kisi("1450","A");
        System.out.println(kisi1.toString());

        System.out.println(kisi1==kisi2);
        System.out.println(kisi1.equals(kisi2));//tc leri aynı ise aynı kisilerdir.
    }
}
