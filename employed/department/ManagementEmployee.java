package employed.department;
import employed.*;
/**
 * This class models a management employee
 * 
 * @author: Alex McBride
 * @version: 1.0
 */
 
public class ManagementEmployee extends Employee{

/**
 * The variables values for administration employees only
 * @param base The base salary administration staff start at
 * @param yearIncrease The amount that their salary increases yearly
 * @param c The int representing their contract type, set to zero for administration
 * @param d The String representing the department
 */     
    private double base = 40000; // set the base salary
    private double yearIncrease = 6000; // set the yearly increase for salary
    private int c = 2; // contract type is INDEFINITE
    private String d = "Management"; //set department
/**
 * Construct an administration employee using the specified name and years, set 
 * the contract and department from the private variables defined in this class only
 * @param n The String to be used as the name
 * @param y The int to represent the number of years the employee has worked for the company
 * @see Employee
 */     
    public ManagementEmployee(String n, int y){
        super(n, y);
        setContract(c);
        setDepartment(d);
    }
/**
 * Returns the salary for employee after adjusting for number of years worked
 * @return The total salary the employee gets
 */ 
    public double getSalary(){
        return base +(yearIncrease*getYears());
    }
}