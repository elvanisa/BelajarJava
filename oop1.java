//class = template
class StudentBinar{ //class with constructor
    String nama;
    String stream;
    int usia;
    double nilai;

    StudentBinar(String inputNama, String inputStream){
        nama = inputNama;
        stream = inputStream;

        System.out.println(nama);
        System.out.println(stream);
    }
}

class contoh{ //class tanpa constructor
    String dataString;
    int dataInt;
}

public class oop1 {
    //class & method

    public static void main(String[] args) {
        //instansiasi object
        StudentBinar Student1 = new StudentBinar();
        Student1.nama = "Akram";
        Student1.stream = "QA";
        Student1.usia = 20;
        Student1.nilai = 100;

        System.out.println(Student1.nama); //"Akram"
        System.out.println(Student1.stream);
        System.out.println(Student1.usia);
        System.out.println(Student1.nilai);

        StudentBinar Student2 = new StudentBinar();
        Student2.nama = "Devlin";
        Student2.stream = "BE";
        Student2.usia = 22;
        Student2.nilai = 100;

        System.out.println(Student2.nama); //"Akram"
        System.out.println(Student2.stream);
        System.out.println(Student2.usia);
        System.out.println(Student2.nilai);

    }
}

