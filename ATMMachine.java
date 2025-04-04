import java.util.Scanner;

class ATM {
    private float balance = 10000;
    private final int PIN = 5674;
    private Scanner sc;

    public ATM() {
        sc = new Scanner(System.in); // Single Scanner instance
    }

    public void checkPin() {
        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();
        if (pin == PIN) {
            menu();
        } else {
            System.out.println("Invalid PIN. Try again.");
            checkPin();
        }
    }

    public void menu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        int opt = sc.nextInt();

        switch (opt) {
            case 1 -> checkBalance();
            case 2 -> withdraw();
            case 3 -> depositMoney();
            case 4 -> {
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.exit(0);
            }
            default -> {
                System.out.println("Invalid option. Please try again.");
                menu();
            }
        }
    }

    public void checkBalance() {
        System.out.println("Balance: ₹" + balance);
        menu();
    }

    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
        }
        menu();
    }

    public void depositMoney() {
        System.out.print("Enter amount to deposit: ");
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Deposit successful. New balance: ₹" + balance);
        menu();
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkPin();
    }
}
