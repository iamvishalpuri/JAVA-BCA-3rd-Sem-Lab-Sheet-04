public class Question1 {
    static class StudentQ1 {
        String name;
        int age;
        static int count = 0;

        StudentQ1(String name, int age) {
            this.name = name;
            this.age = age;
            count++;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        StudentQ1 s1 = new StudentQ1("Aman", 20);
        StudentQ1 s2 = new StudentQ1("Neha", 19);

        s1.display();
        s2.display();
        System.out.println("Total Students: " + StudentQ1.count);
    }
}

/*
Output:
Name: Aman, Age: 20
Name: Neha, Age: 19
Total Students: 2
*/
