package employed.department;
import employed.*;
/**
 * This class models an Administration Employee
 * 
 * @author: Alex McBride
 * @version: 1.0
 */
 
public class AdministrationEmployee extends Employee{
 
/**
 * The variables values for administration employees only
 * @param base The base salary administration staff start at
 * @param yearIncrease The amount that their salary increases yearly
 * @param c The int representing their contract type, set to zero for administration
 * @param y The int representing the number of years worked, set to zero for administration
 * @param d The String representing the department
 */ 
    private double base = 18000; // set the base salary
    private double yearIncrease = 0; // set the yearly increase rate
    private int c = 0; // contract type is TEMPORARY
    private int y = 0; // number of years is zero
    private String d = "Administration"; // set department

/**
 * Construct an administration employee using the specified name, set the contract,
 * years and department from the private variables defined in this class only
 * @param n The String to be used as the name
 * @see Employee
 */ 
    public AdministrationEmployee(String n){
        super(n);
        setContract(c);
        setYears(y);
        setDepartment(d);
    }
/**
 * Returns the salary for employee after adjusting for number of years worked
 * @return The total salary the employee gets
 */ 
    public double getSalary(){
        return base+(yearIncrease*getYears());
    }
}