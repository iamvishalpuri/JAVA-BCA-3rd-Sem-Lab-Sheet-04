public class Question3 {
    static class CircleQ3 {
        double radius;
        static double PI = 3.14;

        CircleQ3(double radius) {
            this.radius = radius;
        }

        double area() {
            return PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        CircleQ3 c = new CircleQ3(7);
        System.out.println("Area of Circle: " + c.area());
    }
}

/*
Output:
Area of Circle: 153.86
*/
