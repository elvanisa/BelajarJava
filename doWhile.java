public class doWhile {
    public static void main(String[] args) {
        System.out.println("membuat do while loop");

        //do { aksi } while (kondisi);

        int a = 1;
        boolean kondisi = true; //deklarasi kondisi

        do { //aksi
            a++;
            System.out.println("do while ke- " + a);
            if (a == 30){
                kondisi = false;
            }

        }while (kondisi);

        System.out.println("end of the program");
    }
}
