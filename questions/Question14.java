public class Question14 {
    static class PersonQ14 {
        String name;
        int age;
        static String country = "India";

        PersonQ14(String name, int age) {
            this.name = name;
            this.age = age;
        }

        boolean isEligibleToVote() {
            return age >= 18;
        }
    }

    public static void main(String[] args) {
        PersonQ14 p = new PersonQ14("Ravi", 19);
        System.out.println("Name: " + p.name);
        System.out.println("Country: " + PersonQ14.country);
        System.out.println("Eligible for Vote: " + p.isEligibleToVote());
    }
}

/*
Output:
Name: Ravi
Country: India
Eligible for Vote: true
*/
