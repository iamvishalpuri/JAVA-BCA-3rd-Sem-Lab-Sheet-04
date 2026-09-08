public class Question24 {
    static class FibonacciQ24 {
        static int seriesCount = 0;

        void displaySeries(int n) {
            int first = 0;
            int second = 1;

            seriesCount++;
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FibonacciQ24 f = new FibonacciQ24();
        f.displaySeries(7);
        System.out.println("Series Generated: " + FibonacciQ24.seriesCount);
    }
}

/*
Output:
0 1 1 2 3 5 8
Series Generated: 1
*/
