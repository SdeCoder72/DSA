package Arrays;

public class ArrayOfOther_DataTypes {
    public static void main(String[] args) {
        //array of double data type
        double[] arr =  new double[5];
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //array of character data type
        System.out.println();
        char[] arr2 =  new char[5];
        for(int i = 0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        String[] arr3 = {"Shanaya", "Ananya", "Naina", "Kavya"};
        for(int i = 0; i<arr3.length; i++) {
            System.out.print(arr3[i]);
        }
    }
}
