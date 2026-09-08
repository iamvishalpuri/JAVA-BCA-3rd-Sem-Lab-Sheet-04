public class Question21 {
    static class PalindromeQ21 {
        static int countChecks = 0;

        boolean isPalindrome(int number) {
            int original = number;
            int reverse = 0;
            int temp = number;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }

            countChecks++;
            return original == reverse;
        }
    }

    public static void main(String[] args) {
        PalindromeQ21 p = new PalindromeQ21();
        System.out.println("121 is palindrome: " + p.isPalindrome(121));
        System.out.println("123 is palindrome: " + p.isPalindrome(123));
        System.out.println("Total Checks: " + PalindromeQ21.countChecks);
    }
}

/*
Output:
121 is palindrome: true
123 is palindrome: false
Total Checks: 2
*/
