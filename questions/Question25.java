public class Question25 {
    static class FactorialQ25 {
        static int totalCalls = 0;

        long factorial(int n) {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            totalCalls++;
            return result;
        }
    }

    public static void main(String[] args) {
        FactorialQ25 f = new FactorialQ25();
        System.out.println("Factorial of 5: " + f.factorial(5));
        System.out.println("Total Calls: " + FactorialQ25.totalCalls);
    }
}

/*
Output:
Factorial of 5: 120
Total Calls: 1
*/
