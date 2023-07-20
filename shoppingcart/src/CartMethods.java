import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class CartMethods {

    protected static void addProduct(ArrayList<Product> products, ArrayList<Product> cart) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constants.SELECT_TO_ADD + products.size() + "):");

        try{
            int selectedItemToAdd = scanner.nextInt();
            if (selectedItemToAdd > 0 && selectedItemToAdd <= products.size()) {
                cart.add(products.get(selectedItemToAdd -1));
                System.out.println(products.get(selectedItemToAdd -1).getProduct() + Constants.ADDED_TO_CART);
            } else {
                System.out.println(Constants.INVALID_INPUT);
            }
        } catch (Exception e) {
            System.out.println(Constants.INVALID_INPUT);
        }
    }

    protected static void removeProduct(ArrayList<Product> products, ArrayList<Product> cart) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constants.SELECT_TO_REMOVE + products.size() + "):");
        int selectedItemToRemove = scanner.nextInt();

        /*if (cart.contains(products.get(selectedItemToRemove -1))) {
            cart.remove(products.get(selectedItemToRemove -1));
            System.out.println(products.get(selectedItemToRemove -1).getProduct() + Constants.REMOVED_FROM_CART);
        } else {
            System.out.println(Constants.INVALID_INPUT);
        }*/

        for(Product p: cart){
            if(p.getId()==selectedItemToRemove){
                System.out.println(p.getProduct() + Constants.REMOVED_FROM_CART);
                cart.remove(p);
            }
            else{
                System.out.println(Constants.INVALID_INPUT);
            }
        }

    }

    protected static void checkAvailableProductsAndPrices(ArrayList<Product> products) {
        int counter = 1;
        for (Product product : products) {
            System.out.println(counter + "." + product.getProduct() + " - $" + product.getPrice());
            counter++;
        }
    }

    protected static boolean checkOut(ArrayList<Product> products, ArrayList<Product> cart) {
        double ticketFinalPrice = 0;

        for (int i = 0; i < products.size(); i++) {
            int quantity = cart.get(i).getId();
            if (quantity > 0) {
                double pricesPerQuantityOfItem = cart.get(i).getPrice() * quantity;
                ticketFinalPrice += pricesPerQuantityOfItem;
                System.out.println(quantity + "x " + products.get(i) + " - $" + pricesPerQuantityOfItem);
            }
        }
        System.out.println(Constants.TOTAL_MESSAGE + ticketFinalPrice);
        System.out.println(Constants.THANK_YOU_PURCHASE);
        return true;
    }
}
