package STU01_面向对象.STU01_4_抽象类.Demo1_教学;

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

    ///构造器，无参有参都写上
    public Card() {
    }

    public Card(String username, Double balance) {
        this.username = username;
        this.balance = balance;
    }

    /// 这个类不知道要打几折，所有定义一个抽象方法比较好
    public abstract void pay(Double money);
}
