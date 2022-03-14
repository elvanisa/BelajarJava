import java.util.*;

public class switchCase {
    public static void main(String[] args) {
        System.out.println("belajar switch case");

        String inputNama;
        Scanner inputan = new Scanner(System.in);

        System.out.print("Panggil Nama: ");
        inputNama = inputan.next();

        //int/long/short/byte/string
        switch (inputNama){
            case "Sarah":
                System.out.println("Sarah hadir kak");
                break;
            case "Dei":
                System.out.println("Dei hadir");
                break;
            case "Aulia":
                System.out.println("Aulia hadiiir");
            default:
                System.out.println("Cindy tidak hadir");
        }
        System.out.println("end of program");
    }
}
