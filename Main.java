
public class Main {
    public static void main(String[] args) {
        // create Class
        Basket firstBasket = new Basket(200);
        firstBasket.add("Молоко", 30);
        firstBasket.add("Сахар", 110);

        Basket secondBasket = new Basket(500);
        secondBasket.add("Сигареты", 150);
        secondBasket.add("Пиво", 150);

        Basket thirdBasket = new Basket();
        thirdBasket.add("Смартфон",15000);

        firstBasket.print("Список товаров в firstBasket: ");
        secondBasket.print("Список товаров в secondBasket: ");
        thirdBasket.print("Список товаров в thirdBasket: ");

    }
}