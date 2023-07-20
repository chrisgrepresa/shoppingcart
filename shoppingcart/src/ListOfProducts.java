import java.util.ArrayList;

public class ListOfProducts {

    ArrayList<String> products = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();
    ArrayList<Integer> cart = new ArrayList<>();


    public ListOfProducts(ArrayList<String> products, ArrayList<Double> prices, ArrayList<Integer> cart) {
        addProductsToList(products);
        addPricesToList(prices);
        useCart(products,cart);
    }

    protected static void addProductsToList (ArrayList<String> products){
        products.add("Apple");
        products.add("Banana");
        products.add("Cherry");
        products.add("Date");
        products.add("Elderberry");
        products.add("Fig");
        products.add("Grape");
        products.add("Honeydew");
        products.add("Ice cream");
        products.add("Jam");
        products.add("Kiwi");
        products.add("Lemon");
    }

    protected static void addPricesToList (ArrayList<Double> prices){
        prices.add(0.99);
        prices.add(0.59);
        prices.add(3.99);
        prices.add(1.99);
        prices.add(4.99);
        prices.add(0.75);
        prices.add(2.99);
        prices.add(3.49);
        prices.add(4.99);
        prices.add(3.49);
        prices.add(1.19);
        prices.add(0.49);
    }

    protected static void useCart (ArrayList<String> products, ArrayList<Integer> cart){
        for (int i = 0; i < products.size(); i++) {
            cart.add(0);
        }
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }

    public ArrayList<Double> getPrices() {
        return prices;
    }

    public void setPrices(ArrayList<Double> prices) {
        this.prices = prices;
    }

    public ArrayList<Integer> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Integer> cart) {
        this.cart = cart;
    }
}
