import employed.*;
import employed.department.*;

/**
 * Creates staff object array, calculates wages total for each department, and overall.
 * Prints out staff list and wage breakdown.
 * 
 * @author: Alex McBride
 * @version: 1.0
 * 
 * @param total the total wages for the company
 * @param managementTotal the total wages in the management department
 * @param engineeringTotal the total wages in the engineering department
 * @param administrationTotal the total wages in the administration department
 */
 
public class Staff {
public static void main(String[] args) {
    
// initialize all totals to zero

    double total = 0.0; 
    double managementTotal = 0.0;
    double engineeringTotal = 0.0;
    double administrationTotal = 0.0;
   
// object array creation

    Employed Bill = new ManagementEmployee("Bill", 9);
    Employed Anna = new EngineeringEmployee("Anna", 2, 9);
    Employed John = new EngineeringEmployee("John", 2, 5);
    Employed Elizabeth = new EngineeringEmployee("Elizabeth", 1, 3);
    Employed Michael = new EngineeringEmployee("Michael", 1, 2);
    Employed Albert = new AdministrationEmployee("Albert");
  
    // create array by polymorphism
    
    Employed [] employees = {Bill, Anna, John, Elizabeth, Michael, Albert};

// print info and salary calculation

    for (int i=0; i<employees.length; i++){
       System.out.println(((Employee)employees[i]).toString()); // print employee to console
       total += ((Employee)employees[i]).getSalary(); // add salary to total
       
       // determine which department employee comes from and add salary to that total
       
       if (((Employee)employees[i]).getDepartment() == "Management"){
           managementTotal += ((Employee)employees[i]).getSalary();
       }else if (((Employee)employees[i]).getDepartment() == "Engineering"){
           engineeringTotal += ((Employee)employees[i]).getSalary();
       }else if (((Employee)employees[i]).getDepartment() == "Administration"){
           administrationTotal += ((Employee)employees[i]).getSalary();
       } 
    }

//printing

    System.out.println();
    System.out.println("MANAGEMENT TOTAL SALARY: "+managementTotal+" bitcoins");
    System.out.println("ENGINEERING TOTAL SALARY: "+engineeringTotal+" bitcoins");
    System.out.println("ADMINISTRATION TOTAL SALARY: "+administrationTotal+" bitcoins");
    System.out.println("ACME TOTAL SALARY: "+total+" bitcoins");

}
}