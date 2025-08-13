package Basic_Java_Program;

public class Data_Types {
    public static void main(String[] args) {

        //boolean data type (boolean data types are inconvertable)

        System.out.println("Boolean data type");

        boolean b1 = true;
        boolean b2 = false;
//        boolean b3 = 0     // error: numbers are not allowed

        // we can store conditions in boolean

        boolean b5 = (9<4);
        System.out.println(b5);

        boolean b6 = (8 > 3);
        System.out.println(b6);


        //characters

        System.out.println("character data type");
        char c = 'a';
        System.out.println(c);
        char plus = '+';
        System.out.println(plus);

        //integers

        System.out.println("int data type");
        int x = 8;
        int y = 3;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);


        System.out.println("float data type");
        float a = 9;
        float b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println("double data type");
        double s = 8;
        double t = 3;
        System.out.println(s + t);
        System.out.println(s - t);
        System.out.println(s * t);
        System.out.println(s / t);

    }
}
