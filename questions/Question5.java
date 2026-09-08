public class Question5 {
    static class BookQ5 {
        String title;
        String author;
        double price;
        static String publisher = "COER Publications";

        BookQ5(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void display() {
            System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Publisher: " + publisher);
        }
    }

    public static void main(String[] args) {
        BookQ5 b = new BookQ5("Java Basics", "R. Sharma", 399);
        b.display();
    }
}

/*
Output:
Title: Java Basics, Author: R. Sharma, Price: 399.0, Publisher: COER Publications
*/
