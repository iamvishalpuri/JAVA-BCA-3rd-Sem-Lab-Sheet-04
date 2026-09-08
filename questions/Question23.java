public class Question23 {
    static class PrimeCheckerQ23 {
        static int totalPrimeChecks = 0;

        boolean isPrime(int number) {
            totalPrimeChecks++;
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        PrimeCheckerQ23 p = new PrimeCheckerQ23();
        System.out.println("17 is prime: " + p.isPrime(17));
        System.out.println("18 is prime: " + p.isPrime(18));
        System.out.println("Total Prime Checks: " + PrimeCheckerQ23.totalPrimeChecks);
    }
}

/*
Output:
17 is prime: true
18 is prime: false
Total Prime Checks: 2
*/
