import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Customer Name:");
        String name = br.readLine();
        System.out.println("Enter Customer ID:");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Enter Email:");
        String email = br.readLine();
        System.out.println("Choose Account Type (1. Savings  2. Current):");
        int choice = Integer.parseInt(br.readLine());
        System.out.println("Enter Account Number:");
        String accNo = br.readLine();
        System.out.println("Enter amount to deposit:");
        int balance = Integer.parseInt(br.readLine());
        Account account;
        if(choice == 1){
            account = new SavingsAccount(accNo,balance,0.5f);
        } else {
            account = new CurrentAccount(accNo,balance,0.75f);
        }
        Customer customer = new Customer(name,id,email,account);
        if(choice == 1){
            System.out.println("Deposited "+customer.getAccount().getBalance()+" into Savings Account.");
        } else {
            System.out.println("Deposited "+customer.getAccount().getBalance()+" into Current Account.");
        }
        System.out.println("Enter amount to withdraw:");
        int amt = Integer.parseInt(br.readLine());
        customer.getAccount().setBalance(customer.getAccount().getBalance()-amt);
        if(choice == 1){
            System.out.println("Withdrawn ₹"+amt+" from Savings Account.");
        } else {
            System.out.println("Withdrawn ₹"+amt+" from Current Account.");
        }
        customer.getAccount().printAccountDetails();

    }
}
