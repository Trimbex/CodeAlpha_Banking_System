import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bank {
    private int MoneyInBank = new Random().nextInt(20001) + 50000;
    private ArrayList<Customer> customers = new ArrayList<>();

    public void withdraw(Customer customer) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount to withdraw. Max is 4000");
        int amount = input.nextInt();

        if (amount > 0 && amount <= 4000 && amount <= customer.getBalance() && amount <= MoneyInBank) {
            customer.setBalance(customer.getBalance() - amount);
            MoneyInBank -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("Your Balance: " + customer.getBalance());
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public void deposit(Customer customer) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount to deposit");
        int amount = input.nextInt();

        if (amount > 0) {
            customer.setBalance(customer.getBalance() + amount);
            MoneyInBank += amount;
            System.out.println("Deposit successful");
            System.out.println("Your Balance: " + customer.getBalance());
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
}