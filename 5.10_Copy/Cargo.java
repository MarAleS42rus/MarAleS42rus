public class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean turnOver;
    private final boolean brittle;
    private final String regMark;

    public Cargo(Dimensions dimensions,
                 double weight,
                 String deliveryAddress,
                 boolean turnOver,
                 boolean brittle,
                 String regMark) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.turnOver = turnOver;
        this.brittle = brittle;
        this.regMark = regMark;
    }

    public double getWeight() {
        return weight;
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, deliveryAddress, turnOver, brittle, regMark);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(dimensions, weight, deliveryAddress, turnOver, brittle, regMark);
    }

    public boolean isTurnOver() {
        return turnOver;
    }

    public boolean isBrittle() {
        return brittle;
    }

    public String getRegMark() {
        return regMark;
    }

    public void view() {
        System.out.println(
                "Вес: " + getWeight() + " кг. \n" +
                "Адрес доставки: " + getDeliveryAddress() +"\n" +
                "Регистрационный номер: " + getRegMark());
        if (isTurnOver()) {
            System.out.println("НЕ КАНТОВАТЬ ");
        }
        if (isBrittle()) {
            System.out.println(" ХРУПКОЕ ");
        }
    }
}
