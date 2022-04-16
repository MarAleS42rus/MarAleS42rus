public class Main {
    public static void main(String[] args) {

        Country country = new Country("Великобритания");
        country.setCapital("London");
        country.setArea(229946);
        country.setPopulation(67081000);
        country.setSeaside(true);
        System.out.println("\n________________Country__________________________\n");
        System.out.println("Страна " + country.getName() + ". Столица - " + country.getCapital() +
                "\nПлощадь территории: " + country.getArea() + " кв.км" + "\n" +
                "с населением: " + country.getPopulation() + " чел.");

        System.out.println("\n___________________House___________________\n");
        House house = new House("Odesskaya", 46);
        house.setAddressStreet("Kazanskaya");
        house.setHouseNumber(17);
        house.setFloor(3);
        house.setEntryway(3);
        house.setApartment(36);

        System.out.println("Дом по адресу: ул." + house.getAddressStreet() + " д." + house.getHouseNumber() +
                "\n" + "имеет " + house.getFloor() + " этажей(а), " + house.getEntryway() +
                " подъезда(ов), " + house.getApartment() + " квартир(ы).");
    }
}