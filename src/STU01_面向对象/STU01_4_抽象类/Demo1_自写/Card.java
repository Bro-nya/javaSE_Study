package STU01_面向对象.STU01_4_抽象类.Demo1_自写;

public abstract class Card {
    private String username;
    private Double balance;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public abstract double pay(double money);

    public Card(String username, Double balance) {
        this.username = username;
        this.balance = balance;
    }
}

