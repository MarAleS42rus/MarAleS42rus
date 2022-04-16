public class Main {
    public static void main(String[] args) {

        Country country = new Country("Великобритания");
        country.setCapital("London");
        country.setArea(229946);
        country.setPopulation(67081000);
        country.setSeaside(true);

        System.out.println("Страна " + country.getName() + ". Столица - " + country.getCapital() +
                           "\nПлощадь территории: " + country.getArea() + " кв.км" + "\n" +
                            "с населением: " + country.getPopulation() + " чел.");
    }
}