public class Oyuncu {
    int saglik=100;
    static int oyuncu=0;//static olmal ki her siniftan nesne uretildiginde oyuncu sayisi arttsin.

    public Oyuncu(){//constructor her calistiginda oyuncu sayisi artae.
        oyuncu++;
    }
    void yasam(){
        saglik=100;
    }

    void darbe(){
        saglik--;
    }
    void oyuncuSayisi(){
        System.out.println(oyuncu);
    }
}
