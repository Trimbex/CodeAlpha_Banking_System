import java.util.Random;
import java.util.Scanner;

public class Program
{

    Scanner input = new Scanner(System.in);

    public void Programm()
    {
        Customer customer = new Customer();
        Bank bank = new Bank();
        System.out.println("Enter Your Name");
        customer.setName(input.nextLine());
        System.out.println("Enter Your CardNumber");
        customer.setCardNumber(input.nextLine());
        customer.setBalance((new Random()).nextInt(2000) + 13000);


        boolean exited = false;
                while(!exited) {
                    System.out.println(
                            """
                              Welcome Customer enter your operation
                              1. Withdraw
                              2. Deposit
                              4. View Balance
                              4. Exit  
                             """
                    );
                    switch (input.nextInt())
                    {
                        case 1 -> bank.withdraw(customer);
                        case 2 -> bank.deposit(customer);
                        case 3 -> System.out.println(customer.getBalance());
                        case 4 -> System.exit(0);
                        default -> {}

                    }
                }
    }




}
