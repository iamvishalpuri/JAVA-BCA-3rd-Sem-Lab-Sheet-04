public class Question22 {
    static class ArmstrongQ22 {
        static int totalChecks = 0;

        boolean isArmstrong(int number) {
            int original = number;
            int temp = number;
            int digits = 0;
            int sum = 0;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = number;
            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            totalChecks++;
            return sum == original;
        }
    }

    public static void main(String[] args) {
        ArmstrongQ22 a = new ArmstrongQ22();
        System.out.println("153 is Armstrong: " + a.isArmstrong(153));
        System.out.println("123 is Armstrong: " + a.isArmstrong(123));
        System.out.println("Total Checks: " + ArmstrongQ22.totalChecks);
    }
}

/*
Output:
153 is Armstrong: true
123 is Armstrong: false
Total Checks: 2
*/
