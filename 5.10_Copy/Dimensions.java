public class Dimensions {
    private final double cargoHeight;
    private final double cargoLength;
    private final double cargoWidth;


    public Dimensions(double cargoLength, double cargoHeight, double cargoWidth) {
        this.cargoHeight = cargoHeight;
        this.cargoLength = cargoLength;
        this.cargoWidth = cargoWidth;

    }

    public double getCargoHeight() {
        return cargoHeight;
    }

    public Dimensions setCargoHeight(double cargoHeight) {
        return new Dimensions(cargoHeight, cargoLength, cargoWidth);
    }

    public double getCargoLength() {
        return cargoLength;
    }

    public Dimensions setCargoLength(double cargoLength) {
        return new Dimensions(cargoHeight, cargoLength, cargoWidth);
    }

    public double getCargoWidth() {
        return cargoWidth;
    }

    public Dimensions setCargoWidth(double cargoWidth) {
        return new Dimensions(cargoHeight, cargoLength, cargoWidth);
    }

    public double getCargoAmount() {
         return ((getCargoHeight() * getCargoLength() * getCargoWidth()/100));
    }

    public void dimView() {
        System.out.println("\n _________Cargo________");
        System.out.println(
                           "Объем груза = " + getCargoAmount() + " м²" + "\n" +
                           "длина: " + getCargoLength() + " м. " + "\n" +
                           "высота: " + getCargoHeight() + " м." + "\n" +
                           "ширина: " + getCargoWidth() + " м. ");
    }
}
