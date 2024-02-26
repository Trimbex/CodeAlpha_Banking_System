public class Customer extends Bank
{



    private String Name;
    private String CardNumber;
    private int Balance;

    public Customer(){}

    public Customer(String name, String cardNumber, int balance) {
        Name = name;
        CardNumber = cardNumber;
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}
