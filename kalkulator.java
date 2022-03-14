import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        System.out.println("kalkulator");

        float a,b,hasil;
        String operator;

        Scanner inputan = new Scanner(System.in);

        System.out.print("angka pertama: ");
        a = inputan.nextFloat();
        System.out.print("operator: ");
        operator = inputan.next();
        System.out.print("angka kedua: ");
        b = inputan.nextFloat();

        switch (operator){
            case "+": //penjumlahan
                hasil = a + b;
                System.out.println("hasil = " + hasil);
                break;
            case "-": //pengurangan
                hasil = a - b;
                System.out.println("hasil = " + hasil);
                break;
            case "x": //perkalian
                hasil = a * b;
                System.out.println("hasil = " + hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("hasil = " + hasil);
                break;
            default:
                System.out.println("operator " + operator + " tidak ditemukan");
        }
        System.out.println("end of the program");
    }
}
