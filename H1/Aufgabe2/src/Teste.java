

public class Teste {
    public void maxNumTest(){
        int[] arr = new int[]{1, 2, 3};
        Operations op = new Operations();
        assert op.maxNum(arr) == 3;
    }
    public void minNumTest(){
        int[] arr = new int[]{1, 2, 3};
        Operations op = new Operations();
        assert op.minNum(arr) == 1;
    }
    public void maxSumTest(){
        int[] arr = new int[]{1, 2, 3};
        Operations op = new Operations();
        assert op.maxSum(arr) == 5;
    }

}
