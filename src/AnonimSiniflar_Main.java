import java.util.Arrays;
import java.util.Comparator;
public class AnonimSiniflar_Main {
    public static void main(String[] args) {

        AnonimSiniflar_Elma[] elmalar={
                new AnonimSiniflar_Elma(10),
                new AnonimSiniflar_Elma(50),
                new AnonimSiniflar_Elma(40),
                new AnonimSiniflar_Elma(60),
        };
        System.out.println(Arrays.toString(elmalar));
        Arrays.sort(elmalar,new AnonimSiniflar_ElmaKarsilastiricisi());

        System.out.println(Arrays.toString(elmalar));
    }
}
