public class Basket {

    private static int count = 0;
    private static double totalPriceAllProducts = 0;
    private static int totalCountAllProducts = 0;
    public String items;
    private int totalPrice = 0;
    private double totalWeight = 0;
    public int limit;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:\n";
        this.limit = 10000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, double totalWeight) {
        this();
        this.items = this.items + items;
        this.totalPrice =  totalPrice;
        this.totalWeight = totalWeight;
        totalCountAllProducts += 1;
        totalPriceAllProducts += totalPrice;

    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1, 0.0);
    }

    public void add(String name, int price, int count, double weight) {

        boolean error = contains(name);

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occurred :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. (" + weight + " кг) - " + price + "₽";

        totalPrice = totalPrice + count * price;

        totalWeight = totalWeight + weight * count;

        totalCountAllProducts = totalCountAllProducts + count;
        totalPriceAllProducts = totalPriceAllProducts + price * count;

    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public static double getTotalPriceAllProducts() {
        return totalPriceAllProducts;
    }

    public static int getTotalCountAllProducts() {
        return totalCountAllProducts;
    }

    public static double getAverageAllPrice() {
        return totalPriceAllProducts / totalCountAllProducts;
    }

    public static double getAverageBasketPrice() {
        return totalPriceAllProducts / Basket.count;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }

        System.out.println("totalPrice = " + getTotalPrice() + "₽");
        System.out.println("totalWeight = " + getTotalWeight() + "kg/l");
        System.out.println("_______________");

    }

}
