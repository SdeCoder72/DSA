package Basic_Java_Program;

public class DataType_Conversion {
    public static void main(String[] args) {

        //typecasting - conversion of one data type to another
        //integer to character
        int i = 65;
        char a = (char)i;  // explicit typecasting (implicit typecasting into characters will throw an error)
        System.out.println(a);


        //character to number

        char ch = 'A';
        int d = ch;      // implicit typecasting
        System.out.println(d);

        char ch2 = 'a';
        int d2 = (int)ch2;
        System.out.println(d2);

        char ch3 = '3';
        int d3 = (int)ch3;
        System.out.println(ch3);

        //how to find the ASCII value of any number

        char ch4 = 'b';
        System.out.println(ch4+0);  // add 0

        System.out.println(ch4+ch4);  // o/p - 196 = ch4+ch4 = b+b = 98+98 = 196

        char ch5 = ' ';
        System.out.println((int)ch5);  //o/p - 32 = ASCII value of space




//        double x = 5/2;
//        System.out.println(x);
//        x = 5.0/2;
//        System.out.println(x);
//        x = 5/2.0;
//        System.out.println(x);
//        x = 5.0/2.0;
//        System.out.println(x);


    }
}
