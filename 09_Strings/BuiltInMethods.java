package Strings;

public class BuiltInMethods {
    public static void main(String[] args) {
        String s = "nikita";

        s.toUpperCase(); // immutability
        System.out.println(s);

        // changing the string
//        s = s.toUpperCase();
//        System.out.println(s);

//        System.out.println(s.toUpperCase());
//        System.out.println(s.indexOf('a'));
//        System.out.println(s.lastIndexOf('a'));
//        System.out.println(s.indexOf('z'));
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//
//        // basically used in condition
//        System.out.println(s.contains("nikit"));
//        System.out.println(s.contains("nita"));
//        System.out.println(s.startsWith("ikita"));
//        System.out.println(s.startsWith("niki"));
//        System.out.println(s.endsWith("ki"));
//        System.out.println(s.endsWith("ita"));


        //compareTo()
        String s1 = "bhavna";
        String s2 = "arshita";
        System.out.println(s1.compareTo(s2));   // b-a = 1

        String s3 = "harshita";
        String s4 = "harsh";
        System.out.println(s3.compareTo(s4));

        System.out.println(s3.concat(s4));

        String t = s3.concat(s4);  //similar to : t = s3 + s4;
        System.out.println(t);

        String str = "546789";
        int n = Integer.parseInt(str);
        System.out.println(n);

    }
}
