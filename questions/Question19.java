public class Question19 {
    static class ProductQ19 {
        int id;
        String name;
        double price;
        static double discountRate = 10; // percent

        ProductQ19(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        double finalPrice() {
            double discount = price * discountRate / 100;
            return price - discount;
        }
    }

    public static void main(String[] args) {
        ProductQ19 p = new ProductQ19(1, "Keyboard", 1000);
        System.out.println("Product: " + p.name);
        System.out.println("Final Price: " + p.finalPrice());
    }
}

/*
Output:
Product: Keyboard
Final Price: 900.0
*/
