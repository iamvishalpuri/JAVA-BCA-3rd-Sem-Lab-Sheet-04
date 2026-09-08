public class Question30 {
    static class LibraryQ30 {
        int booksAvailable;
        static String libraryName = "Central Library";

        LibraryQ30(int booksAvailable) {
            this.booksAvailable = booksAvailable;
        }

        void issueBook(int count) {
            if (count <= booksAvailable) {
                booksAvailable -= count;
                System.out.println(count + " book(s) issued.");
            } else {
                System.out.println("Not enough books available.");
            }
            System.out.println("Books Available: " + booksAvailable);
        }

        void returnBook(int count) {
            booksAvailable += count;
            System.out.println(count + " book(s) returned.");
            System.out.println("Books Available: " + booksAvailable);
        }
    }

    public static void main(String[] args) {
        LibraryQ30 library = new LibraryQ30(10);
        System.out.println("Library: " + LibraryQ30.libraryName);
        library.issueBook(3);
        library.returnBook(2);
    }
}

/*
Output:
Library: Central Library
3 book(s) issued.
Books Available: 7
2 book(s) returned.
Books Available: 9
*/
