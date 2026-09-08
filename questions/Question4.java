public class Question4 {
    static class EmployeeQ4 {
        int empId;
        double salary;
        static String companyName = "ABC Pvt Ltd";

        EmployeeQ4(int empId, double salary) {
            this.empId = empId;
            this.salary = salary;
        }

        void display() {
            System.out.println("Emp ID: " + empId + ", Salary: " + salary + ", Company: " + companyName);
        }
    }

    public static void main(String[] args) {
        EmployeeQ4 e = new EmployeeQ4(101, 45000);
        e.display();
    }
}

/*
Output:
Emp ID: 101, Salary: 45000.0, Company: ABC Pvt Ltd
*/
