public class Final_Ogrenci {
    private final int numara;

    public Final_Ogrenci(int numara) {
        this.numara = numara;
    }

    public int getNumara() {//setter metodu yoktur cunku degeri degistirilemez.
        return numara;
    }

    public final void yazdir(){
        System.out.println(numara);
    }
}
