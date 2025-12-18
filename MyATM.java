import java.util.*;

class MyAccount {
    private double myBalance;
    private String myPin;
    private List<String> myHistory;

    // Constructor to create account with default PIN
    public MyAccount(String startPin) {
        this.myPin = startPin;
        this.myBalance = 0.0;
        this.myHistory = new ArrayList<>();
    }

    // Verify PIN
    public boolean isPinCorrect(String enteredPin) {
        return this.myPin.equals(enteredPin);
    }

    // Change the current PIN
    public void changeMyPin(String newPin) {
        this.myPin = newPin;
        System.out.println("Your PIN was successfully changed.");
    }

    // Add money
    public void addMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount.");
            return;
        }
        myBalance += amount;
        myHistory.add("Deposited ₹" + amount);
        System.out.println("You deposited ₹" + amount);
    }

    // Remove money
    public void takeMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount.");
            return;
        }
        if (amount > myBalance) {
            System.out.println("Not enough balance.");
        } else {
            myBalance -= amount;
            myHistory.add("Withdrew ₹" + amount);
            System.out.println("You withdrew ₹" + amount);
        }
    }

    // Show balance
    public void showMyBalance() {
        System.out.println("Your current balance is ₹" + myBalance);
    }

    // Show past transactions
    public void showMyHistory() {
        if (myHistory.isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            System.out.println("--- Transaction History ---");
            for (String data : myHistory) {
                System.out.println(data);
            }
        }
    }
}

public class MyATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyAccount account = new MyAccount("1234"); // Initial PIN

        System.out.print("Please enter your PIN: ");
        String userPin = input.nextLine();

        if (!account.isPinCorrect(userPin)) {
            System.out.println("Wrong PIN entered. Try again later.");
            return;
        }

        // Menu loop
        while (true) {
            System.out.println("\n====== Welcome to ATM ======");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transaction History");
            System.out.println("5. Change PIN");
            System.out.println("6. Exit");
            System.out.print("Choose your option: ");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    account.showMyBalance();
                    break;
                case 2:
                    System.out.print("Amount to deposit: ₹");
                    double deposit = input.nextDouble();
                    account.addMoney(deposit);
                    break;
                case 3:
                    System.out.print("Amount to withdraw: ₹");
                    double withdraw = input.nextDouble();
                    account.takeMoney(withdraw);
                    break;
                case 4:
                    account.showMyHistory();
                    break;
                case 5:
                    input.nextLine(); // clear input buffer
                    System.out.print("Enter your new PIN: ");
                    String newPin = input.nextLine();
                    account.changeMyPin(newPin);
                    break;
                case 6:
                    System.out.println("Thanks for visiting. Goodbye!");
                    return;
                default:
                    System.out.println("Please select a valid option (1-6).");
            }
        }
    }
}
