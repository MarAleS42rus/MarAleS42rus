public class Main {

    public static void main(String[] args) {

        Printer docOne = new Printer();

        docOne.append("Любой код на Java", "Java");
        docOne.append("Любой код на Java + ", " Java + ", 3 );
        docOne.append("Любой код на Java + + ", " Java + + ", 2 );

        docOne.print("Пример первый.");



    }
}
