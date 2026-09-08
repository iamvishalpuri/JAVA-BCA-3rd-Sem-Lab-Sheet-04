public class Question2 {
    static class RectangleQ2 {
        double length;
        double breadth;
        static String shapeName = "Rectangle";

        RectangleQ2(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        double area() {
            return length * breadth;
        }
    }

    public static void main(String[] args) {
        RectangleQ2 r = new RectangleQ2(10, 5);
        System.out.println("Shape: " + RectangleQ2.shapeName);
        System.out.println("Area: " + r.area());
    }
}

/*
Output:
Shape: Rectangle
Area: 50.0
*/
