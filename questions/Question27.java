public class Question27 {
    static class StringReverseQ27 {
        static int totalReversals = 0;

        String reverse(String text) {
            String reversed = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                reversed += text.charAt(i);
            }
            totalReversals++;
            return reversed;
        }
    }

    public static void main(String[] args) {
        StringReverseQ27 s = new StringReverseQ27();
        System.out.println("Reverse of Java: " + s.reverse("Java"));
        System.out.println("Total Reversals: " + StringReverseQ27.totalReversals);
    }
}

/*
Output:
Reverse of Java: avaJ
Total Reversals: 1
*/
