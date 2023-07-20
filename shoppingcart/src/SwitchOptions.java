import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchOptions {
    protected static void checkingOptions(ArrayList<Product> products, ArrayList<Product> cart) {
        Scanner scanner = new Scanner(System.in);
        boolean shopping = true;
        while (shopping) {
            System.out.println(Constants.OPTIONS);
            int selectedOption = scanner.nextInt();
            shopping = resultsShopping(products, cart, shopping, selectedOption);

            //todo volver a poner el  trycatch
        }
    }

    private static boolean resultsShopping(ArrayList<Product> products, ArrayList<Product> cart, boolean shopping, int selectedOption) {
        switch (selectedOption) {
            case 1 -> CartMethods.addProduct(products, cart);
            case 2 -> CartMethods.removeProduct(products, cart);
            case 3 -> CartMethods.checkAvailableProductsAndPrices((ArrayList<Product>) Constants.PRODUCTS_LIST);
            case 4 -> {
                CartMethods.checkOut(products, cart);
                shopping = false;
            }
            default -> System.out.println(Constants.INVALID_INPUT);
        }
        return shopping;
    }
}