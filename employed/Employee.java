package employed;

/**
 * This class constructs the template for all employees, but must be called via 
 * the subclasses AdministrationEmployee, EngineeringEmployee, ManagementEmployee
 * to complete the abstract call to get the salary as required by the interface
 * Employed.
 * 
 * @author: Alex McBride
 * @version: 1.0
 */
 
public abstract class Employee implements Employed{
    
// contract types (constants)

/** Constant to describe value of contract
 * temporary-1 mainly used for administration employees
 */ 
    public static final int TEMPORARY = 0;
/** Constant to describe value of contract
 * training-1 mainly used for engineering employees
 */ 
    public static final int TRAINING = 1;
/** Constant to describe value of contract
 * indefinite-2 main used for managment employees and long term engineers
 */ 
    public static final int INDEFINITE = 2;

//attributes

/** Variable to specifiy the name of employee */
    private String name;
/** Variable to specify the contract type */    
    private int contract;
/** Variable to specify how many years the employee has worked for the company */
    private int years;
/** Variable to specify the department the employee works in */
    private String department;
/** Variable to convert contract number to a string */
    public String contractType;
    
// constructors

/**
 * Construct a new employee using the specified name, contract, years and department
 * @param on The String to be used as the name
 * @param oc The int to be used as contract identifier
 * @param oy The int to be used as number of years worked for company
 * @param od The String to be used as the department
 */ 
    public Employee (String on, int oc, int oy, String od){
        name = on;
        contract = oc;
        years = oy;
        department = od;
    }
/**
 * Construct a new employee using specified name, contract and years
 * @param on The String to be used as the name
 * @param oc The int to be used as contract identifier
 * @param oy The int to be used as number of years worked for company
 */ 
    public Employee (String on, int oc, int oy){
        this(on, oc, oy, "Unknown");
    }
/**
 * Construct a new employee using specified name and years
 * @param on The String to be used as the name
 * @param oy The int to be used as number of years worked for company 
 */ 
    public Employee (String on, int oy){
        this(on, 0, oy, "Unknown");
    }
/**
 * Construct a new employee using specified name only
 * @param on The String to be used as the name
 */ 
    public Employee (String on){
        this(on, 0, 0, "Unknown");
    }

// getters

/**
 * Returns the name of the employee
 * @return The String that represents the name of the employee
 */ 
    public String getName() {return name;}
/**
 * Returns the number of years the employee has worked for the company
 * @return The int that represents the number of years the employee has worked 
 *          for the company
 */ 
    public int getYears() {return years;}
/**
 * Returns the department the employee works in
 * @return The String that represents the department the employee works in
 */ 
    public String getDepartment() {return department;}
/**
 * Returns the type of contract the employee has
 * @return The String that represents the type of contract the employee has
 */ 
    public String getContract() {
        if (contract == TEMPORARY){contractType = "temporary";}
        else if (contract == TRAINING){contractType = "training";}
        else if (contract == INDEFINITE){contractType = "indefinite";}
        return contractType;
    }
    
// setters

/**
 * Replaces the name with the specified value n, checks that n is a valid string
 * @param n The String to be used as the new name
 */ 
    public void setName(String n) {
        if (n instanceof String ){
            name = n;
        }else {
            throw new IllegalArgumentException("Name is not a string!");
        }
    }
/**
 * Relaces the number of years with the specified value y, checks that y is greater
 * than zero
 * @param y The int to be used as the new number of years
 */ 
    public void setYears(int y) {
        if (y < 0){
            throw new IllegalArgumentException("years less than zero!");
        }else{years = y;}
    }
/**
 * Replaces the department with the specified value d, checks that d is a valid 
 * department name and throws exception if not
 * @param d The String to be used as the new department
 */ 
    public void setDepartment(String d) {
        if (d == "Management" || d == "Engineering" || d == "Administration"){
        department = d;}
        else{
            throw new IllegalArgumentException("Department is not valid");
            }
    }
/**
 * Replaces the contract number with the specified value c, checks that c is a 
 * valid number and throws exception if not
 * @param c The int to be used as the new contract type
 */ 
    public void setContract(int c) {
        if( c < TEMPORARY || c > INDEFINITE) {
            throw new IllegalArgumentException("incorrect contract number");
        }
        else if (c == TEMPORARY) {contract = c;}
        else if (c == TRAINING) {contract = c;}
        else if (c == INDEFINITE) {contract = c;}
    }

// getSalary method

/** Abstract method to pass on to subclasses */ 
    public abstract double getSalary();
   
// toString method

/**
 * Returns a textual representation of all the information stored about the employee
 * @return The text String to be printed
 * 
 * @see java.lang.Object
 */ 
    public String toString(){
        return getName()+": "+getDepartment()+" department, "+getContract()+
        " contract, "+getYears()+" years in the company, salary of "+getSalary()+" bitcoins";
    }
}