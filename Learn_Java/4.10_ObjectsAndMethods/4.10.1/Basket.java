public class Basket {
    
    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private double totalWeight = 0;
    private int limit;

    public Basket() { // Это конструктор класса Basket без параметорв.
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 10000;
    }

    public Basket(int limit) { // Это конструктор класса Basket с одним параметорм.
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, double totalWeight) { // Это конструктор класса Basket со всеми параметорами.
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
    }

    public static int getCount() { // возвращает количество экземпляров класса Basket
        return count;
    }

    public void increaseCount(int count) { // считает количество экземпляров класса Basket
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) { 
        add(name, price, 1, 0.0);
        
    }

    public void add(String name, int price, int count, double weight) {
        
        totalPrice = totalPrice + price * count;
        totalWeight = totalWeight + weight * count;
        boolean error = false;
        if (contains(name)) {
            System.out.println("Такого товара нет. ");
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            System.out.println("Лимит " + limit + "руб. привышен. "
            + name + " " + price * count + "руб.");
            return;
        }
        
        items = items + "\n" + name + " - " +
            count + " шт. (" + weight + " g/l) - " + 
            price + " руб.";
            
        }
        
    public int getTotalPrice() {
        return totalPrice;
    }
    
    public double getTotalWeight() {
        return totalWeight;
    }
    
    public void clear() {
        items = "";
        totalPrice = 0;
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
            
            System.out.println("Итого стоимость: " + totalPrice + "руб.");
            
            System.out.println("Итого вес: " + totalWeight + "кг(л)");
        }
    }
    
    

    
    
}