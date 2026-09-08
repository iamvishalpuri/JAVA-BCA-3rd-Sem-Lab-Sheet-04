public class Question8 {
    static class PenQ8 {
        String color;
        String type;
        static String manufacturer = "Cello";

        PenQ8(String color, String type) {
            this.color = color;
            this.type = type;
        }

        void display() {
            System.out.println("Color: " + color + ", Type: " + type + ", Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {
        PenQ8 p = new PenQ8("Blue", "Gel");
        p.display();
    }
}

/*
Output:
Color: Blue, Type: Gel, Manufacturer: Cello
*/
