public class Question29 {
    static class EmployeeQ29 {
        String name;
        double salary;
        static String organization = "TechSoft";

        EmployeeQ29(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    static void compareSalary(EmployeeQ29 e1, EmployeeQ29 e2) {
        if (e1.salary > e2.salary) {
            System.out.println(e1.name + " has higher salary.");
        } else if (e2.salary > e1.salary) {
            System.out.println(e2.name + " has higher salary.");
        } else {
            System.out.println("Both have equal salary.");
        }
    }

    public static void main(String[] args) {
        EmployeeQ29 e1 = new EmployeeQ29("Ankit", 50000);
        EmployeeQ29 e2 = new EmployeeQ29("Riya", 55000);

        System.out.println("Organization: " + EmployeeQ29.organization);
        compareSalary(e1, e2);
    }
}

/*
Output:
Organization: TechSoft
Riya has higher salary.
*/
