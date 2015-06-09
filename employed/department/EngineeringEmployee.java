package employed.department;
import employed.*;
/**
 * This class models an engineering employee
 * 
 * @author: Alex McBride
 * @version: 1.0
 */
 
public class EngineeringEmployee extends Employee{

/**
 * The variables values for engineering employees only
 * @param base The base salary administration staff start at
 * @param yearIncrease The amount that their salary increases yearly
 * @param d The String representing the department
 */     
    private double base = 25000; // set base salary
    private double yearIncrease = 2500; // set yearly increase value
    private String d = "Engineering"; // set department
/**
 * Construct an engineering employee using the specified name, contract and
 * years. Set the department from the private variable defined in this class only
 * @param n The String to be used as the name
 * @param c The int to represent the contract type for the employee
 * @param y The int to represent the number of years the employee has worked for the company
 * @see Employee
 */     
    public EngineeringEmployee(String n, int c, int y){
        super(n, c, y);
        setDepartment(d);
    }
/**
 * Returns the salary for employee after adjusting for number of years worked
 * @return The total salary the employee gets
 */ 
    public double getSalary(){
        return base + (yearIncrease*getYears());
    }
}