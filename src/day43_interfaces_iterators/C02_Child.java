package day43_interfaces_iterators;

public class C02_Child implements I01_InterfaceBadyOlanMethod{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    Parent interface'de abstract olan 3 methodu implement ettigimizde
    Java itirazini durdurur.
    Sonradan ekledigimiz default veya static keyword ile tanimladigimiz methodlari
    implement etmememiz sorun olusturmadi

    default keyword kullanilirsa method'a erismek icin obje olusturulmalidir
     */
    public static void main(String[] args) {
        I01_InterfaceBadyOlanMethod.direksiyon();
        C02_Child obj=new C02_Child();
        obj.teker();
        //default keyword kullanilirsa method'a erismek icin obje olusturulmalidir
    }
}
