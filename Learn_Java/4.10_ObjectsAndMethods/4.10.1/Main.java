public class Main {

    public static void main(String[] args) {

        Basket basket1 = new Basket();

        basket1.add("Молоко", 40, 2, 0.9);
        basket1.add("Кофе", 140, 1, 0.15);
        
        Basket basket2 = new Basket();
        
        basket2.add("Чай", 50);
        basket2.add("Сахар", 100, 10, 1.5);
        
        Basket basket3 = new Basket();
        
        basket3.add("Хлеб", 50);
        basket3.add("Вода", 100, 105, 1.5);
        
        Basket basket4 = new Basket("Мясо", 400, 1.0);
        
        // basket3.add("Хлеб", 50);
        // basket3.add("Вода", 100, 105, 1.5);
        
    
        basket1.print("Первая корзина: ");
        basket2.print("Вторая корзина: ");
        basket3.print("Третья корзина: ");
        basket4.print("Четвертая корзина: ");
        
        System.out.println("Всего корзин: " + Basket.getCount());
        
    }
}