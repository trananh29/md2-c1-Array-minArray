import java.util.Scanner;

public class minOfArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[] myArray= {1,2,3,4,5,6,7,8,9,10};
        int index=minArray(myArray);
        System.out.println("min of Array is:  " + myArray[index]);

    }
    public static int minArray(int[] array) {
        int index=0;
        for (int i=0;i<array.length;i++) {
            if (array[i] <array[index]) {
                index=i;
            }
        } return index;
    }
}
