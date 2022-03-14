public class Fungsi2 {
    public static void main(String[] args) {
        //void = kosong = hampa

        FungsiLagi("test input");
        HelloWorld("Aulia");
        HelloWorld("Cindy");
        System.out.println(test());

    }

    //fungsi1
    public static void HelloWorld(String namanya){
        System.out.println("Halo selamat pagi " + namanya);
    }

    //fungsi2
    public static void FungsiLagi(String inputan){
        System.out.println(inputan);
    }

    //fungsi3
    public static float test(){
        return 15.5f;
    }
}
