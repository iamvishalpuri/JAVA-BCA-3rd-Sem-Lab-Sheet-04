public class Question16 {
    static class TriangleQ16 {
        int a;
        int b;
        int c;
        static String type = "Scalene/Isosceles/Equilateral";

        TriangleQ16(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        boolean isValid() {
            return a + b > c && a + c > b && b + c > a;
        }

        String classify() {
            if (!isValid()) {
                return "Invalid Triangle";
            }
            if (a == b && b == c) {
                return "Equilateral";
            } else if (a == b || b == c || a == c) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        }
    }

    public static void main(String[] args) {
        TriangleQ16 t = new TriangleQ16(5, 5, 8);
        System.out.println("Valid: " + t.isValid());
        System.out.println("Type: " + t.classify());
    }
}

/*
Output:
Valid: true
Type: Isosceles
*/
