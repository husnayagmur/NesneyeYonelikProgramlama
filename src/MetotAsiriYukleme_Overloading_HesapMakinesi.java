public class MetotAsiriYukleme_Overloading_HesapMakinesi {

    public int topla(int x,int y){
        return x+y;
    }
    /*public float topla(int x,int y){
        return x+y;
    }program bize hata verir cunku metotların ger donus tipi ooverloadingde onemsizdir.*/
    public float topla(float x,float y){
        return x+y;
    }
    public float topla(int x,float y){
        return x+y;
    }
    public float topla(float x,int y){
        return x+y;
    }


}
