import java.util.Arrays;
public class StaticMetot {
    public static void adSoyad(){
        System.out.println("husna YAGMUR");
    }

    public static int sirala(int x,int y,int z){
        int max=x;
        if(y>max) max=y;
        if(z>max) max=z;
        return max;
    }

    public static boolean kontrol(boolean b1,boolean b2,boolean b3){
        return (b1&&b2||b1&&b3||b2&&b3);
    }

    public static boolean arr(int[] x,int[] y){
        Boolean result=true;
        if(x.length==y.length){
            for (int i=0;i<x.length;i++){
                if(x[i]!=y[i]){
                    result=false;
                    break;
                }
            }
        }
        else {result=false;}
        return result;
    }

    public static int[] ciftSayilar(int[] sayilar){
        int[] sonuc=null;
        int adet=0;
        for (int i=0;i<sayilar.length;i++){
            if(sayilar[i]%2==0){
                adet++;
            }
        }
        sonuc=new int[adet];
        int index=0;
        for (int i=0;i<sayilar.length;i++){
            if(sayilar[i]%2==0){
                sonuc[index++]=sayilar[i];
            }
        }
        return sonuc;
    }

    public static void degistir(int x,int y){
        System.out.println("ilk degerler: "+x+","+y);
        int c;
        c=x;
        x=y;
        y=c;
        System.out.println("sonraki degerler: "+x+","+y);
    }
    public static void main(String[] args) {
        //Static metotlar sınıfa bağlıdır, bu nedenle çağrılırken sınıf adı kullanılır.
        /*
        Örnek Değişkenlerine veya Metotlarına Erişemez:
        Static metotlar, bir sınıf örneğine ait olmadıkları için,
        o sınıfa ait örnek değişkenlerine veya örnek metotlarına doğrudan erişemezler.
        Ancak, diğer static değişkenlere ve static metotlara erişebilirler.
         */
        //sadece diger static metotlari direk olarak cagirabilir.
        StaticMetot.adSoyad();//direk sinif ismi ile cagirdik.
        System.out.println(Math.abs(-100));//Math sinifi abs metodu da statictir.
        System.out.println(Math.pow(4,2));//Math sinifi pow metodu da statictir.
        System.out.println(StaticMetot.sirala(4,7,85));
        System.out.println(StaticMetot.sirala(460,7,85));
        System.out.println(StaticMetot.sirala(4,755,85));
        System.out.println(StaticMetot.kontrol(true,false,false));
        int[] x={1,2,3,4};
        int[] y={1,2,3,4,5};
        System.out.println(StaticMetot.arr(x,y));
        int[] sonucCiftSayilar= StaticMetot.ciftSayilar((new int[]{1,2,3,5,4,8,44}));
        System.out.println(Arrays.toString(sonucCiftSayilar));

        StaticMetot.degistir(2,5);


    }
}
