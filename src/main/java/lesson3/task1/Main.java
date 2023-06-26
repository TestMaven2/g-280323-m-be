package lesson3.task1;

public class Main {

    public static void main(String[] args) {

        // Мы хотим, чтобы в нашем приложении документ мог
        // иметь только три статуса - отправлен, доставлен, прочитан.

        Document document = new Document("Deleted");

        if (document.getStatus().equals("Sent")) {
            System.out.println("Документ отправлен");
        } else if (document.getStatus().equals("Delivered")) {
            System.out.println("Документ доставлен");
        } else if (document.getStatus().equals("Read")) {
            System.out.println("Документ прочитан");
        }
    }
}
