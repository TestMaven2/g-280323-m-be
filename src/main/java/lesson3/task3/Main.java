package lesson3.task3;

public class Main {

    public static void main(String[] args) {

        Document document = Document.SENT;

//        if (document.equals(Document.SENT)) {
//            System.out.println("Документ отправлен");
//        } else if (document.equals(Document.DELIVERED)) {
//            System.out.println("Документ доставлен");
//        } else if (document.equals(Document.READ)) {
//            System.out.println("Документ прочитан");
//        }

        switch (document) {
            case SENT:
                System.out.println("Документ отправлен");
                break;
            case DELIVERED:
                System.out.println("Документ доставлен");
                break;
            case READ:
                System.out.println("Документ прочитан");
                break;
            case DELETED:
                System.out.println("Документ удалён");
                break;
        }

        System.out.println("Работа метода toString()");
        System.out.println(document);
    }
}
