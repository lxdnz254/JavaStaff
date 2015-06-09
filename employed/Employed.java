package employed;
import employed.department.*;
/**
 * This is the employed interface. It enables user to construct an employee with
 * a call to Employed. Also a subclass of Employee will not be complete without
 * defining getSalary in the subclass itself.
 * 
 * @author: Alex McBride
 * @version: 1.0
 */
 
public interface Employed {
   public double getSalary();
}