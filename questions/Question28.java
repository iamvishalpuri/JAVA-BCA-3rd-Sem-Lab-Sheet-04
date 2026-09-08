public class Question28 {
    static class WordCounterQ28 {
        static String language = "English";

        int countWords(String sentence) {
            sentence = sentence.trim();
            if (sentence.isEmpty()) {
                return 0;
            }
            String[] words = sentence.split("\\s+");
            return words.length;
        }
    }

    public static void main(String[] args) {
        WordCounterQ28 w = new WordCounterQ28();
        String sentence = "Java is easy to learn";
        System.out.println("Language: " + WordCounterQ28.language);
        System.out.println("Word Count: " + w.countWords(sentence));
    }
}

/*
Output:
Language: English
Word Count: 5
*/
