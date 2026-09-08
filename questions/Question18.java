public class Question18 {
    static class ElectricBillQ18 {
        double units;
        static double fixedCharge = 100;

        ElectricBillQ18(double units) {
            this.units = units;
        }

        double calculateBill() {
            double energyCharge = units * 6.5;
            return energyCharge + fixedCharge;
        }
    }

    public static void main(String[] args) {
        ElectricBillQ18 bill = new ElectricBillQ18(120);
        System.out.println("Total Bill: " + bill.calculateBill());
    }
}

/*
Output:
Total Bill: 880.0
*/
