public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(10, 2.5, 1.5);
        Cargo cargo = new Cargo(dimensions,10,"Novokuznetsk, DOZ, 1",
                        true, false, "a0001");
        dimensions.dimView();
        cargo.view();

        dimensions = dimensions.setCargoHeight(12.4);
        dimensions = dimensions.setCargoLength(20.2);
        dimensions = dimensions.setCargoWidth(2.4);
        cargo = cargo.setDeliveryAddress("Ksl, Kaz str., 17");
        cargo = cargo.setWeight(20);

        dimensions.dimView();
        cargo.view();

    }
}