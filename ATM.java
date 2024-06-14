import java.util.*;
public class ATM {
    private static BankAccount acc;
    public ATM(BankAccount acc) {
        this.acc = acc;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(); // Instantiate BankAccount
    ATM atm = new ATM(account); // Instantiate ATM with the BankAccount
        System.out.println("Enter 1 to check balance\nPress 2 for WITHDRAW\nPress 3 for DEPOSIT ");
        int n = sc.nextInt();
        double balance = 50000;
        switch (n) {
            case 1:
                acc.balance1(balance);
                break;
            case 2:
                acc.withdraw(balance);
                break;
            case 3:
                acc.deposit(balance);
                break;
            default:
                System.out.println("INVALID OPERATION");
        }
    }
}
class BankAccount {
    public void balance1(double balance) {
        System.out.println("Your Account Balance is " + balance);
    }

    public void withdraw(double balance) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdrawal amount ");
        int withdrawalAmount = sc.nextInt();
        if (withdrawalAmount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Remaining Balance is " + balance);
        }
    }

    public void deposit(double balance) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be deposited");
        int depositAmount = sc.nextInt();
        balance += depositAmount;
        System.out.println("Remaining Balance is " + balance);
    }
}