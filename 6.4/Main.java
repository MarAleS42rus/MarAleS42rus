public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();
        basket.add("Молоко", 2);
        basket.add("Масло", 2, 3, 0);
        basket.add("Сахар", 2, 3, 1.5);
        Basket basket2 = new Basket();
        basket2.add("Чай", 2);
        basket2.add("Вода", 2, 1, 0.5);
        Basket basket3 = new Basket("Смартфон", 2, 250);
        Basket basket4 = new Basket("Ручка", 2, 0.07);
        Basket basket0 = new Basket("X", 10,10.5);
        basket0.print("basket0 = ");
        basket.print("basket: ");
        basket2.print("basket2: ");
        basket3.print("basket3: ");
        basket4.print("basket4: ");
//        basket.clear();
//        basket.print("basket: ");

        System.out.println("Всего корзин:" + Basket.getCount() + "\n");
        System.out.println("Стоимость всех товаров во всех корзинах: " +
                           Basket.getTotalPriceAllProducts() + " ₽");
        System.out.println("Количество всех товаров во всех корзинах: " +
                           Basket.getTotalCountAllProducts() + " шт");
        System.out.print("Среднее значение стоимости товара во всех корзинах: ");
        System.out.printf("%.2f",Basket.getAverageAllPrice());
        System.out.print(" ₽" + "\n");
        System.out.println("Среднее значение стоимости корзины: " +
                           Basket.getAverageBasketPrice() + " ₽");

    }

}
