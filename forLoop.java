public class forLoop {
    public static void main(String[] args) {
        System.out.println("membuat for loop");

        //for (inisialisasi; kondisi; step nilai){ aksi }

        System.out.println("perulangan pertama");

        for (int nilai = 0; nilai <= 10; nilai++){
            System.out.println("for loop ke- "+ nilai);
        }

        System.out.println("perulangan kedua");

        for (int nilai = 0; nilai < 10; nilai++){
            System.out.println("for loop ke- "+ nilai);
        }

        System.out.println("perulangan ketiga");

        for(int nilai = 10; nilai >=5; nilai--){
            System.out.println("for loop ke- "+ nilai);
        }
        System.out.println("end of the program");
    }
}
