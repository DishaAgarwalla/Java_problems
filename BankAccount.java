import java.util.*;

class BankAccount {
    private double balance;
    private String pin;
    private List<String> transactionHistory;

    public BankAccount(String pin) {
        this.pin = pin;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public boolean verifyPin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public void changePin(String newPin) {
        this.pin = newPin;
        System.out.println("PIN changed successfully.");
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: ₹" + amount);
        System.out.println("₹" + amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        transactionHistory.add("Withdrew: ₹" + amount);
        System.out.println("₹" + amount + " withdrawn successfully.");
    }

    public void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }

    public void printTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction History:");
            for (String t : transactionHistory) {
                System.out.println(t);
            }
        }
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("1234"); // default PIN

        System.out.print("Enter PIN: ");
        String inputPin = scanner.nextLine();

        if (!account.verifyPin(inputPin)) {
            System.out.println("Invalid PIN. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("5. Change PIN");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = scanner.nextDouble();
                    account.deposit(deposit);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = scanner.nextDouble();
                    account.withdraw(withdraw);
                    break;
                case 4:
                    account.printTransactionHistory();
                    break;
                case 5:
                    System.out.print("Enter new PIN: ");
                    scanner.nextLine(); // consume newline
                    String newPin = scanner.nextLine();
                    account.changePin(newPin);
                    break;
                case 6:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
