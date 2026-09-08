public class Question15 {
    static class SimpleInterestQ15 {
        double principal;
        double rate;
        double time;
        static String bank = "HDFC";

        SimpleInterestQ15(double principal, double rate, double time) {
            this.principal = principal;
            this.rate = rate;
            this.time = time;
        }

        double calculateInterest() {
            return (principal * rate * time) / 100;
        }
    }

    public static void main(String[] args) {
        SimpleInterestQ15 s = new SimpleInterestQ15(10000, 5, 2);
        System.out.println("Bank: " + SimpleInterestQ15.bank);
        System.out.println("Simple Interest: " + s.calculateInterest());
    }
}

/*
Output:
Bank: HDFC
Simple Interest: 1000.0
*/
