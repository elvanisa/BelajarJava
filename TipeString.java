public class TipeString {
    public static void main(String[] args) {
        //string
        String namaDepan = "Elvanisa";
        String namaBelakang = "Muhsina";

        System.out.println(namaDepan);
        System.out.println(namaBelakang);

        //menggabungkan string
        String namaLengkap = namaDepan + " " + namaBelakang;
        System.out.println(namaLengkap);

        //string text block
        String CeritaPanjang = """
                halo nama saya adalah
                elvanisa
                belajar di Binar] Academy
                """;
        System.out.println(CeritaPanjang);

    }
}
