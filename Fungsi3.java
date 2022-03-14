import java.util.Scanner;

public class Fungsi3 {

    //fungsi menampilkan nilai
    public static void nilai (int panjang, int lebar){
        System.out.println("menghitung luas dan keliling");
        System.out.println("Luas = " + luas(panjang,lebar));
        System.out.println("Keliling = " + keliling(panjang,lebar));
    }

    //fungsi luas
    public static int luas (int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }

    //fungsi keliling
    public static int keliling (int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }

    //fungsi
    public static void gambar (int panjang, int lebar){
        for (int i=0; i<lebar; i++){
            for (int x=0; x<panjang; x++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        //fungsi hitung

        Scanner userInput = new Scanner(System.in);
        System.out.print("panjang: ");
        int inputPanjang = userInput.nextInt();
        System.out.print("lebar: ");
        int inputLebar = userInput.nextInt();

        gambar(inputPanjang,inputLebar);

        System.out.println("Luas = "+ luas(inputPanjang,inputLebar));
        System.out.println("Keliling = "+ keliling(inputPanjang,inputLebar));

        nilai(inputPanjang,inputLebar);

    }





}
