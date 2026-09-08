public class Question20 {
    static class BankAccountQ20 {
        double balance;
        static String bankCode = "BK1001";

        BankAccountQ20(double balance) {
            this.balance = balance;
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal Successful: " + amount);
            } else {
                System.out.println("Insufficient Balance");
            }
            System.out.println("Current Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccountQ20 account = new BankAccountQ20(5000);
        System.out.println("Bank Code: " + BankAccountQ20.bankCode);
        account.withdraw(2000);
        account.withdraw(4000);
    }
}

/*
Output:
Bank Code: BK1001
Withdrawal Successful: 2000.0
Current Balance: 3000.0
Insufficient Balance
Current Balance: 3000.0
*/
