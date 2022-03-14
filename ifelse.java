public class ifelse {
    public static void main(String[] args) {
        //if kondisi .. aksi
        // if else

        int x = 5;
        int y = 10;

        System.out.println("ini nilai awal" + x);
        //kondisi
        if (x == 5) {
            if (y == 10) { //nested if
                System.out.println("nilai x=5 dan y=10");
            } else {
                System.out.println("nilai y bukan 10");
            }
        }
        else {
                System.out.println("nilai x bukan 5");
            }

        System.out.println("end of program");
    }
}
