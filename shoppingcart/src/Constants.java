import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {

    final static String OPTIONS = """
            \nOptions:
            1. Add a product to your cart
            2. Remove a product from your cart
            3. Check again products and prices
            4. Check out
            What option do you choose?
                    """;

    final static String NOT_IN_CART = "No such product in the cart";
    final static String INVALID_INPUT = "Invalid input";
    final static String THANK_YOU_PURCHASE = "Thank you for your purchase!";

    final static String SELECT_TO_ADD = "Select product to add to your cart (1-";

    final static String ADDED_TO_CART = " added to the cart";
    final static String SELECT_TO_REMOVE = "Select product to remove from your cart (1-";
    final static String REMOVED_FROM_CART = " removed from the cart";
    final static String TOTAL_MESSAGE = "Total: $";

    final static List<Product> PRODUCTS_LIST = Arrays.asList(new Product(1, "Apple", 0.99),
            (new Product(2, "Banana", 0.59)),
            (new Product(3, "Cherry", 3.99)),
            (new Product(4, "Date", 1.99)),
            (new Product(5, "Elderberry", 4.99)),
            (new Product(6, "Fig", 0.75)),
            (new Product(7, "Grape", 2.99)),
            (new Product(8, "Honeydew", 3.49)),
            (new Product(9, "Ice cream", 4.99)),
            (new Product(10, "Jam", 3.49)),
            (new Product(11, "Kiwi", 1.19)),
            (new Product(12, "Lemon", 0.49)));

    final static ArrayList<Product> PRODUCT_ARRAY_LIST = new ArrayList<>(Arrays.asList
            (new Product(1, "Apple", 0.99),
            (new Product(2, "Banana", 0.59)),
            (new Product(3, "Cherry", 3.99)),
            (new Product(4, "Date", 1.99)),
            (new Product(5, "Elderberry", 4.99)),
            (new Product(6, "Fig", 0.75)),
            (new Product(7, "Grape", 2.99)),
            (new Product(8, "Honeydew", 3.49)),
            (new Product(9, "Ice cream", 4.99)),
            (new Product(10, "Jam", 3.49)),
            (new Product(11, "Kiwi", 1.19)),
            (new Product(12, "Lemon", 0.49))));



}
