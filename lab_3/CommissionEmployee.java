package lab_3;
public class CommissionEmployee extends Employee {
 
    private double grossSales;
    private double commissionRate;
 
    // TODO 5: Create constructor using super()
    public CommissionEmployee(String first, String last, String ssn, double sales, double rate){
        // call superclass constructor from Employee.java
        super(first, last, ssn); 
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    
    // TODO 6: Create getters and setters with validation
    // setters with validation
    public void setGrossSales(double sales){
        if(sales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        grossSales = sales;
    }
    public void setCommissionRate(double rate){
        if(rate <= 0.0 || rate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        commissionRate = rate;
    }
    // getters
    public double getGrossSales(){return grossSales;}
    public double getCommissionRate(){return commissionRate;}
 
    // TODO 7: Override earnings()
 
    // TODO 8: Override toString()
}