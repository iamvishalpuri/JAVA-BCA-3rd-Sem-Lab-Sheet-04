public class Question9 {
    static class LaptopQ9 {
        String brand;
        int RAM;
        static String os = "Windows";

        LaptopQ9(String brand, int RAM) {
            this.brand = brand;
            this.RAM = RAM;
        }

        void display() {
            System.out.println("Brand: " + brand + ", RAM: " + RAM + "GB, OS: " + os);
        }
    }

    public static void main(String[] args) {
        LaptopQ9 l = new LaptopQ9("Dell", 8);
        l.display();
    }
}

/*
Output:
Brand: Dell, RAM: 8GB, OS: Windows
*/
