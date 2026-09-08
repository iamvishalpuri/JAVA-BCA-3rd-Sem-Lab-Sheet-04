public class Question7 {
    static class BankAccountQ7 {
        String accountNumber;
        double balance;
        static String bankName = "State Bank";

        BankAccountQ7(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void display() {
            System.out.println("Account: " + accountNumber + ", Balance: " + balance + ", Bank: " + bankName);
        }
    }

    public static void main(String[] args) {
        BankAccountQ7 acc = new BankAccountQ7("SB12345", 25000);
        acc.display();
    }
}

/*
Output:
Account: SB12345, Balance: 25000.0, Bank: State Bank
*/
