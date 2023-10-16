import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    public void testNumberBuilder() {
        Operations operations = new Operations();
        int[] arr = {1, 2, 3};
        assertEquals(123, operations.numberBuilder(arr));
    }

    @Test
    public void testPower() {
        Operations operations = new Operations();
        int[] arr = {1, 2, 3};
        assertEquals(1000, operations.power(arr));
    }

    @Test
    public void testSum() {
        Operations operations = new Operations();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] expectedResult = {5, 7, 9};
        assertArrayEquals(expectedResult, operations.sum(arr1, arr2));
    }

    @Test
    public void testSum2(){
        Operations operations = new Operations();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {8, 7, 7};
        int[] expectedResult = {1, 0, 0, 0};
        assertArrayEquals(expectedResult, operations.sum(arr1, arr2));
    }

    @Test
    public void testDiff() {
        Operations operations = new Operations();
        int[] arr1 = {4, 5, 6};
        int[] arr2 = {1, 2, 3};
        int[] expectedResult = {3, 3, 3};
        assertArrayEquals(expectedResult, operations.diff(arr1, arr2));
    }

    @Test
    public void testDiff2(){
        Operations operations = new Operations();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] expectedResult = {-1};
        assertArrayEquals(expectedResult, operations.diff(arr1, arr2));
    }

    @Test
    public void testMul(){
        Operations operations = new Operations();
        int[] arr = {2, 3, 4};
        int num = 2;
        int[] expectedResult = {4, 6, 8};
        assertArrayEquals(expectedResult, operations.mul(arr, num));
    }
    @Test
    public void testMul2() {
        Operations operations = new Operations();
        int[] arr = {2, 3, 4};
        int num = 5;
        int[] expectedResult = {1, 1, 7, 0};
        assertArrayEquals(expectedResult, operations.mul(arr, num));
    }

    @Test
    public void testDiv(){
        Operations operations = new Operations();
        int[] arr = {2, 2, 2};
        int num = 2;
        int[] expectedResult = {1, 1, 1};
        assertArrayEquals(expectedResult, operations.div(arr, num));
    }
    @Test
    public void testDiv2() {
        Operations operations = new Operations();
        int[] arr = {1, 2, 2};
        int num = 2;
        int[] expectedResult = {6, 1};
        assertArrayEquals(expectedResult, operations.div(arr, num));
    }
}
