import org.testng.annotations.Test;
public class Teste {
    @Test
    public void cheapKeyboardTester(){
        ElektronikShop shop = new ElektronikShop();
        int[] prices = new int[]{10, 20, 30};
        assert shop.cheapKeyboard(prices) == 10;
    }

    @Test
    public void expensivePrductTester(){
        ElektronikShop shop = new ElektronikShop();
        int[] pricesKey = new int[]{10, 20, 30};
        int[] pricesUSB = new int[]{40, 10, 80};
        assert shop.expensiveProduct(pricesKey, pricesUSB) == 80;
    }

    @Test
    public void inBudgetUSBTester(){
        ElektronikShop shop = new ElektronikShop();
        int[] pricesUSB = new int[]{40, 10, 80};
        assert shop.inBudgetUSB(pricesUSB, 50) == 40;
    }

    @Test
    public void receiptTester(){
        ElektronikShop shop = new ElektronikShop();
        int[] pricesKey = new int[]{10, 20, 30};
        int[] pricesUSB = new int[]{8, 4, 11};
        assert shop.receipt(pricesKey, pricesUSB, 40) == 38;
    }
}
