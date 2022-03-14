public class koversi {
    public static void main(String[] args) {
        //otomatis
        byte testByte = 100;
        short testShort = testByte;
        int testInt = testShort;
        long testLong = testInt;

        System.out.println(testLong);

        //manual
        int testInteger = 1000;
        byte tesByte = (byte) testInteger; //-128 max byte 127
        short tesShort = (short) testInteger;

        System.out.println(tesByte);
        System.out.println(tesShort);

        //boolean
        boolean BenarBoolean = true;
        boolean SalahBoolean = false;
        System.out.println(BenarBoolean);
        System.out.println(SalahBoolean);

        //char
        char a = 'A';
        char b = 'B';
        char c = 'C';

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
    }
}
