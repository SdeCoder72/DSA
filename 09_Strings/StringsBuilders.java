package Strings;

import java.util.ArrayList;

public class StringsBuilders {
    public static void main(String[] args) {
        //by default capacity = 16;
        StringBuilder t = new StringBuilder(4);  // setting capacity manually
        System.out.println(t);
        t.append("neha");
        System.out.println(t.capacity()); // capacity remains unchanged


        StringBuilder s = new StringBuilder("Sajal");  // 16+5=21 capacity increases when we set value at the time of creation
        System.out.println(s.length() + " " + s.capacity());
        System.out.println(s);
        s.append(" naaz");
        System.out.println(s);

        s.setCharAt(2, 'm');
        System.out.println(s);


//        ArrayList<Character> str = new ArrayList<>();
//        str.add('a');
//        str.set(0,'p');
    }
}
