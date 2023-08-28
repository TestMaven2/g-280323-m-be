package lesson17.task8;

public class Request {

    private String message;
    private int senderId;

    public Request(String message, int senderId) {
        this.message = message;
        this.senderId = senderId;
    }

    public String getMessage() {
        return message;
    }

    public int getSenderId() {
        return senderId;
    }
}