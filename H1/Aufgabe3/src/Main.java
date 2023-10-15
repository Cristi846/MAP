import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 5, 0, 0};
        int[] array2 = new int[]{1, 3, 0, 0};
        Operations op = new Operations();
        System.out.println(Arrays.toString(op.sum(array1, array2)));
        System.out.println(Arrays.toString(op.diff(array1, array2)));
        System.out.println(Arrays.toString(op.dup(array1,2)));
        System.out.println(Arrays.toString(op.div(array1,2)));
    }
}