import java.util.*;

public class Main {
    public static List<Product> cart = new ArrayList<>();

    public static void main(String[] args) {

        CartMethods.checkAvailableProductsAndPrices(Constants.PRODUCT_ARRAY_LIST);
        SwitchOptions.checkingOptions(Constants.PRODUCT_ARRAY_LIST, (ArrayList<Product>) cart);
    }
}

