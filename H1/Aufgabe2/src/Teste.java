
import org.junit.jupiter.api.Test;
public class Teste {
    @Test
    public void maxNumTest(){
        int[] arr = new int[]{1, 2, 3, 3};
        Operations op = new Operations();
        assert op.maxNum(arr) == 3;
    }
    @Test
    public void minNumTest(){
        int[] arr = new int[]{1, 2, 3};
        Operations op = new Operations();
        assert op.minNum(arr) == 1;
    }
    @Test
    public void maxSumTest(){
        int[] arr = new int[]{1, 2, 3};
        Operations op = new Operations();
        assert op.maxSum(arr) == 5;
    }
    @Test
    public void minSumTest(){
        int[] arr = new int[]{1, 2, 3};
        Operations op = new Operations();
        assert op.minSum(arr) == 3;
    }

}
