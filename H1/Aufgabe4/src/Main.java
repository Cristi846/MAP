public class Main {
    public static void main(String[] args) {
        int[] priceKeyboard = new int[]{40, 35, 15, 45};
        int[] priceUSB = new int[]{20, 15, 40, 15, 80};
        ElektronikShop customer = new ElektronikShop();
        System.out.println(customer.cheapKeyboard(priceKeyboard));
        System.out.println(customer.expensiveProduct(priceKeyboard, priceUSB));
    }
}