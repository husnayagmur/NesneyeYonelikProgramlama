import java.util.Arrays;
import java.util.Comparator;
import java.util.Comparator;
//Main de oldugu gibi tekrar bir sinif acip implement etmek yerine main deki gibi dire yazabiliriz.
public class AnonimSiniflar_Main2 {
    public static void main(String[] args) {
        AnonimSiniflar_Elma[] elmalar={
                new AnonimSiniflar_Elma(10),
                new AnonimSiniflar_Elma(50),
                new AnonimSiniflar_Elma(40),
                new AnonimSiniflar_Elma(60),
        };
        Arrays.sort(elmalar, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                AnonimSiniflar_Elma e1=(AnonimSiniflar_Elma) o1;
                AnonimSiniflar_Elma e2=(AnonimSiniflar_Elma) o2;
                return e1.getAgirlik()-e2.getAgirlik();
            }});
        System.out.println(Arrays.toString(elmalar));
    }
}
