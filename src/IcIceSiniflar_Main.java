public class IcIceSiniflar_Main {
    /*
- Statik İç Sınıf (Static Nested Class):
Bir sınıfın içinde static olarak tanımlanan sınıflardır.
Ana sınıfa ait statik üyeler gibi doğrudan erişilebilir.
Ana sınıfın bir örneğine (instance) ihtiyaç duymaz.
Diğer sınıflardan bağımsız olarak kullanılabilir.

-Üye İç Sınıf (Non-static Inner Class):
Statik olmayan, doğrudan ana sınıfın bir örneğine bağlı olan iç sınıflardır.
Ana sınıfın örnek (instance) üyelerine doğrudan erişebilir.
Ancak, bu sınıfı kullanabilmek için önce ana sınıfın bir örneğini oluşturmanız gerekir.

-Yerel İç Sınıf (Local Inner Class):
Bir metodun veya blok içerisindeki iç sınıflardır.
Sadece bu metodun ya da blokun içinde tanımlı olduğu sürece kullanılır.
Sadece tanımlandığı kapsamda (scope) kullanılabilir.

-Anonim İç Sınıf (Anonymous Inner Class):
Genellikle bir interface veya bir sınıfın anlık olarak genişletildiği ya da uygulandığı sınıflardır.
Sadece bir kez kullanılır ve sınıf adı verilmez.*/
    public static void main(String[] args) {
        IcIceSiniflar_Araba araba=new IcIceSiniflar_Araba();
        araba.setMarka("X Marka");
        araba.setModel("Y Model");

        IcIceSiniflar_Araba.Motor motor1=araba.new Motor();//iv-c ice siniflarda nesne uretimi.
        motor1.setHacim(1666);
        araba.setMotor(motor1);

        System.out.println(araba.getMarka());
        System.out.println(araba.getModel());
        System.out.println(araba.getMotor().getHacim());



    }
}
