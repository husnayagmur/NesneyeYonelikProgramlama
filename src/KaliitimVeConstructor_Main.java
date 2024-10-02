public class KaliitimVeConstructor_Main {
    public static void main(String[] args) {
        KalitimVeConstructorA a=new KalitimVeConstructorA();
        System.out.println("--------------");
        KalitimVeConstructorB b=new KalitimVeConstructorB();
        /*KalitimVeConstructorA sinifinda kalitim aldigindan dolayi ciktisi
        -A Constructor
        -B Conctructor
        olur.
         */
        System.out.println("--------------");
        KalitimVeConstructorC c=new KalitimVeConstructorC();
        /*KalitimVeConstructorB sinifinda kalitim aldigindan dolayi ciktisi
        -A Constructor
        -B Conctructor
        -C Conctructor
        olur.

        onemli!! eger constructor parametreli olsaydı
        hemen ilk satira super(parametre1,parametre2) yazmaliydik.
         */


    }
}
