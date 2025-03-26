package labexperiments;

class BankAccount {
    private String accountNumber, accountHolder;
    private double balance;

    public BankAccount(String accNo, String accHolder, double bal) {
        accountNumber = accNo;
        accountHolder = accHolder;
        balance = bal;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
        else System.out.println("Invalid deposit amount.");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds or invalid amount.");
    }

    public void displayAccountInfo() {
        System.out.println("Account: " + accountNumber + " | Holder: " + accountHolder + " | Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Adarsh Anil", 1000.0);
        account.displayAccountInfo();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayAccountInfo();
    }
}

