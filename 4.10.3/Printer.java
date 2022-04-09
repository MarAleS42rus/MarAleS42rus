public class Printer {

    public static String queue = " "; // список документов на печать
    public int pendingPagesCount = 0; // кол-во страниц в очереди
    public static int allPendingPagesCount = 0; // количество распечатанных страниц за всё время
    
    public Printer() {
        queue = "Печать документов." + "\n";
    }

    public Printer(String queue, int pendingPagesCount, int allPendingPagesCount) {
    }

    public void append(String docText) {
        append(docText, "noname", 1);
    }

    public void append(String docText, String docName) {
        append(docText, docName, 1);

    }

    public void append(String docText, String docName, int docPages) {
        pendingPagesCount = pendingPagesCount + docPages;
        queue = queue + "\n" + "Имя документа: " + docName + "\n"
                      + "Текст документа: " + docText + "\n"
                      + "Страниц в документе: " + docPages;
    }
    
    public int getPendingPagesCount() {
        return pendingPagesCount;
    }

    public int getAllpendingPagesCount() {
        return allPendingPagesCount;
    }

    public void clear() {
        queue = "";
        pendingPagesCount = 0;
    }

    public void print(String docum) {
        System.out.println(docum);
        System.out.println(queue);
        System.out.println("Страниц в очереди:" + getPendingPagesCount());
        allPendingPagesCount = allPendingPagesCount + pendingPagesCount;
        clear();
        System.out.println("Очередь печати очищена.");
        System.out.println("Общеее кол-во страниц в истории:" + getAllpendingPagesCount());
    }
}
