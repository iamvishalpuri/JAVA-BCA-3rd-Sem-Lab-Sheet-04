public class Question12 {
    static class StudentMarksQ12 {
        int marks1;
        int marks2;
        int marks3;
        static String universityName = "COER University";

        StudentMarksQ12(int marks1, int marks2, int marks3) {
            this.marks1 = marks1;
            this.marks2 = marks2;
            this.marks3 = marks3;
        }

        double average() {
            return (marks1 + marks2 + marks3) / 3.0;
        }
    }

    public static void main(String[] args) {
        StudentMarksQ12 s = new StudentMarksQ12(78, 85, 90);
        System.out.println("University: " + StudentMarksQ12.universityName);
        System.out.println("Average Marks: " + s.average());
    }
}

/*
Output:
University: COER University
Average Marks: 84.33333333333333
*/
