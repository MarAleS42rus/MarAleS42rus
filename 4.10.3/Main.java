public class Main {

    public static void main(String[] args) {
        Printer docOne = new Printer();
        
        docOne.append("Любой код на Java");
        docOne.append("Любой код на Java +", "Java+");
        docOne.print("");

        docOne.append("Любой код на Java++", "Java+", 4);
        docOne.append("100", "Java100", 4);
        docOne.print("");
    }    
}
