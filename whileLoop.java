public class whileLoop {
    public static void main(String[] args) {
        System.out.println("perulangan while");

        // while, do while, for loop

        //while (kondisi){ aksi }

        int a = 1;
        boolean kondisi = true;

        while (kondisi){
            System.out.println("while loop ke-" + a);

            if (a == 50){
                kondisi = false;
            }
            a++;
        }
        System.out.println("end");

    }
}
