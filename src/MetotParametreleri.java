import javax.swing.plaf.PanelUI;
import java.util.Arrays;

public class MetotParametreleri {
    public void passByValue(int x){
        System.out.println("PBV: "+x);
        x=10;
        System.out.println("PBV: "+x);
    }

    public void degistir(int[] dizi){
        for(int i=0;i<dizi.length;i++){
            dizi[i]=dizi[i]*2;
        }
        System.out.println(Arrays.toString(dizi));
    }

    public void dizideToplam(int[] sayilar){
        int y=sayilar[0];
        int z=sayilar[1];
        System.out.println(y+z);
    }

    public void dizideToplam2(int... sayilar2){//javada ... isareti int array oldugu anlamina gelir.
        int x=0;
        for (int i=0;i<sayilar2.length;i++){
            x+=sayilar2[i];
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        MetotParametreleri metot=new MetotParametreleri();
        int x=20;
        System.out.println(x);//20
        metot.passByValue(x);//PBV: 20 PBV: 10
        System.out.println(x);//20

        int[] dizi={1,2,3,4};
        metot.degistir(dizi);

        metot.dizideToplam(new int[] {1,2});

        metot.dizideToplam2(new int[] {1,2,3,4,5});
    }
}
