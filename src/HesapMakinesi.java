import java.util.Scanner;

public class HesapMakinesi {
    public float topla(float x,float y){
        float toplam=x+y;
        return toplam;
    }
    public float cikar(float x,float y){
        float cikarma=x-y;
        return cikarma;
    }
    public float carp(float x,float y){
        float carpma=x*y;
        return carpma;
    }
    public float bol(float x,float y){
        float bolme=x/y;
        return bolme;
    }

    public static void main(String[] args) {
        HesapMakinesi secim=new HesapMakinesi();
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen yapmak istediginiz islemi giriniz: ");
        char isaret=inp.next().charAt(0);
        float sonuc;
        switch (isaret){
            case '+':sonuc=secim.topla(inp.nextInt(),inp.nextInt());
            System.out.println(sonuc);
            case '-':sonuc=secim.cikar(inp.nextInt(),inp.nextInt());
                System.out.println(sonuc);
            case '/':sonuc=secim.bol(inp.nextInt(),inp.nextInt());
                System.out.println(sonuc);
            case '*':sonuc=secim.carp(inp.nextInt(),inp.nextInt());
                System.out.println(sonuc);

        }
    }

}
