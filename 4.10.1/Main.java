public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();
        basket.add("Молоко", 40);
        basket.add("Масло", 300, 2, 0);
        basket.add("Сахар", 100, 1, 1.5);

        Basket basket2 = new Basket();
        basket2.add("Чай", 80);
        basket2.add("Пирог", 400, 1, 0);
        basket2.add("Вода", 10, 1, 0.5);

        Basket basket3 = new Basket("Смартфон", 11000, 250);

        Basket basket4 = new Basket("Ручка", 12, 0.07);

        basket.print("basket: ");
        basket2.print("basket2: ");
        basket3.print("basket3: ");
        basket4.print("basket4: ");

        System.out.println("Всего корзин:" + Basket.getCount());

    }
}
