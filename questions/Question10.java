public class Question10 {
    static class MovieQ10 {
        String name;
        String genre;
        double rating;
        static String industry = "Bollywood";

        MovieQ10(String name, String genre, double rating) {
            this.name = name;
            this.genre = genre;
            this.rating = rating;
        }

        void display() {
            System.out.println("Movie: " + name + ", Genre: " + genre + ", Rating: " + rating + ", Industry: " + industry);
        }
    }

    public static void main(String[] args) {
        MovieQ10 m = new MovieQ10("3 Idiots", "Comedy/Drama", 8.4);
        m.display();
    }
}

/*
Output:
Movie: 3 Idiots, Genre: Comedy/Drama, Rating: 8.4, Industry: Bollywood
*/
