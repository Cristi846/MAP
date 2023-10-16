import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;


public class Teste {
    @Test
    public void numberBuilderTester(){
        Operations op = new Operations();
        int[] arr = new int[]{1, 2, 3};
        int number = op.numberBuilder(arr);
        assert number == 123;
    }

    @Test
    public void powerTester(){
        Operations op = new Operations();
        int[] arr = new int[]{1, 2, 3};
        int pow = op.power(arr);
        assert pow == 1000;
    }

    @Test
    public void sumTester(){
        Operations op = new Operations();
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3};
        int[] rez  = op.sum(arr1, arr2);
        assert Arrays.equals(rez, new int[]{2, 4, 6});

        int[] arr3 = new int[]{1, 2, 3};
        int[] arr4 = new int[]{8, 7, 7};
        int[] rez2  = op.sum(arr3, arr4);
        assert Arrays.equals(rez2, new int[]{1, 0, 0, 0});
    }

    @Test
    public void diffTester(){
        Operations op = new Operations();
        int[] arr1 = new int[]{3, 2, 3};
        int[] arr2 = new int[]{1, 2, 3};
        int[] rez  = op.diff(arr1, arr2);
        assert Arrays.equals(rez, new int[]{2, 0, 0});

        int[] arr3 = new int[]{2, 2, 0};
        int[] arr4 = new int[]{1, 7, 0};
        int[] rez2  = op.diff(arr3, arr4);
        assert Arrays.equals(rez2, new int[]{5, 0});
    }

    @Test
    public void mulTester(){
        Operations op = new Operations();
        int[] arr1 = new int[]{1, 2, 3};
        assert Arrays.equals(op.mul(arr1, 2), new int[]{2, 4, 6});

        int[] arr2 = new int[]{5, 0, 0};
        assert Arrays.equals(op.mul(arr2, 2), new int[]{1, 0, 0, 0});
    }

    @Test
    public void divTester(){
        Operations op = new Operations();
        int[] arr1 = new int[]{2, 0, 0};
        assert Arrays.equals(op.div(arr1, 2), new int[]{1, 0, 0});

        int[] arr2 = new int[]{1, 0, 0};
        assert Arrays.equals(op.div(arr2, 2), new int[]{5, 0});
    }

}
