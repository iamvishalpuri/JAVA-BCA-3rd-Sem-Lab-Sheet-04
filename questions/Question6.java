public class Question6 {
    static class CarQ6 {
        String brand;
        double mileage;
        static int wheels = 4;

        CarQ6(String brand, double mileage) {
            this.brand = brand;
            this.mileage = mileage;
        }

        void display() {
            System.out.println("Brand: " + brand + ", Mileage: " + mileage + " km/l, Wheels: " + wheels);
        }
    }

    public static void main(String[] args) {
        CarQ6 c = new CarQ6("Toyota", 18.5);
        c.display();
    }
}

/*
Output:
Brand: Toyota, Mileage: 18.5 km/l, Wheels: 4
*/
