import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 5, 0, 0};
        int[] array2 = new int[]{1, 3, 0, 0};
        Operations op = new Operations();
        System.out.println("The sum of these two arrays is: " + Arrays.toString(op.sum(array1, array2)));
        System.out.println("The difference of these two arrays is: " + Arrays.toString(op.diff(array1, array2)));
        System.out.println("The multiplication of this array with this number is: " + Arrays.toString(op.dup(array1,2)));
        System.out.println("The division of this array with this number is: " + Arrays.toString(op.div(array1,2)));
    }
}