package lab_3;
public class PayrollTest {
 
    public static void main(String[] args) {

        // TODO 9: Create a CommissionEmployee object
        CommissionEmployee cEmployee = new CommissionEmployee("Mat", "Huston", "705-420-1337", 6000, .05);
        
        // TODO 10: Display employee details
        System.out.println(cEmployee); // invokes toString()
 
        // TODO 11: Display earnings
        System.out.printf("Earnings: $%.2f%n", cEmployee.earnings());
    }

    
}