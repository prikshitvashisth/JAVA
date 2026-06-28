package OOPS;

class BankAccount {                        // Class with different access modifiers

    public String accountHolder;           // public - anyone can access this
    private double balance;                // private - only this class can access
    protected String bankName;             // protected - same package + subclasses
    String accountType;                    // default - only same package

    public void setBalance(double amount) {  // public method to set private field
        if (amount >= 0) {                   // validation before setting
            balance = amount;                // setting the private field
        }
    }

    public double getBalance() {           // public method to read private field
        return balance;                    // returning private field value
    }

    public void displayInfo() {            // public method - accessible everywhere
        System.out.println("Holder: " + accountHolder);    // prints account holder
        System.out.println("Bank: " + bankName);           // prints bank name
        System.out.println("Type: " + accountType);        // prints account type
        System.out.println("Balance: " + balance);         // can access private here (same class)
    }
}

public class AccessModifiers {                       // Main class
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();         // creating object

        acc.accountHolder = "Prikshit";              // OK - public field
        acc.bankName = "SBI";                        // OK - protected, same package
        acc.accountType = "Savings";                 // OK - default, same package
        // acc.balance = 5000;                       // ERROR - private, cannot access directly

        acc.setBalance(5000);                        // OK - using public method to set private field
        System.out.println(acc.getBalance());        // OK - using public method to read private field

        acc.displayInfo();                           // calling public method
    }
}
