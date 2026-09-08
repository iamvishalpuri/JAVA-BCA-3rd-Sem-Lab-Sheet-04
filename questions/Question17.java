public class Question17 {
    static class StudentGradeQ17 {
        String name;
        int marks;
        static int passingMarks = 40;

        StudentGradeQ17(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        String assignGrade() {
            if (marks >= 90) {
                return "A+";
            } else if (marks >= 75) {
                return "A";
            } else if (marks >= 60) {
                return "B";
            } else if (marks >= passingMarks) {
                return "C";
            } else {
                return "F";
            }
        }
    }

    public static void main(String[] args) {
        StudentGradeQ17 s = new StudentGradeQ17("Pooja", 82);
        System.out.println("Name: " + s.name);
        System.out.println("Grade: " + s.assignGrade());
    }
}

/*
Output:
Name: Pooja
Grade: A
*/
