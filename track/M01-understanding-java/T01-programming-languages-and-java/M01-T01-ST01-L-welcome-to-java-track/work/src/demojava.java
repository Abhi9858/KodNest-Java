
public class demojava {
    public static void main(String[] args) {

        String customerName = "Rahul";
        int units = 150;
        double bill = 0;
        double surcharge = 0;
        double totalBill = 0;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = units * 3;
        } else if (units <= 300) {
            bill = units * 5;
        } else {
            bill = units * 7;
        }

        if (bill > 1000) {
            surcharge = bill * 5 / 100;
        }

        totalBill = bill + surcharge;

        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Electricity Bill: " + bill);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Total Bill: " + totalBill);
    }
}
