public class Main {
    public static void main(String[] args) {
        Operations op = new Operations();
        int[] numbers = new int[]{4, 8, 3, 10, 17};
        System.out.println(op.maxNum(numbers));
        System.out.println(op.minNum(numbers));
        System.out.println(op.maxSum(numbers));
        System.out.println(op.minSum(numbers));
    }
}