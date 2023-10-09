package lesson28.task4;

public class BankAccount {

    private int restMoney;

    public int getRestMoney() {
        return restMoney;
    }

    public void setRestMoney(int restMoney) {
        this.restMoney = restMoney;
    }

    public void withdrawMoney(int money) {
        restMoney -= money;
    }
}