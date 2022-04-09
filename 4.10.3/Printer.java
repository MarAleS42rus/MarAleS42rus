public class Printer {

    public String queue = " ";
    public int pendingPagesCount = 0;
    public int allPendingPagesCount = 0;

    public Printer() {
        queue = "Список документов на печать.";
    }

    public Printer(String queue, int pendingPagesCount, int allPendingPagesCount) {
        this();
        this.queue = queue;
        this.pendingPagesCount = pendingPagesCount;
        this.allPendingPagesCount = allPendingPagesCount;
    }

    public void append(String docText) {
        append("", "", 0);
    }

    public void append(String docText, String docName) {
        append("", "", 1);

    }

    public void append(String docText, String docName, int docPages) {
        pendingPagesCount = pendingPagesCount + docPages;
        allPendingPagesCount = allPendingPagesCount + docPages;

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

    public void print(String allPages) {
        System.out.println(allPages);
        System.out.println(queue);
        System.out.println("Док-ов в очереди:" + getPendingPagesCount());
        clear();
        System.out.println("Очередь печати очищена.");
        System.out.println("Док-ов в очереди:" + pendingPagesCount);
        System.out.println("Общеее кол-во док-ов в истории:" + getAllpendingPagesCount());
    }
}



