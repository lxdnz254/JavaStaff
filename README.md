# Staff.java

A working java program to implement a new staff member of Class type.
This was program was created as an assignment in Intro to Java Programming Pt 1. (Edx course)
Staff.java runs a script to create staff members, with their name, number of years they've worked
for the company, type of contract and department

The new employee is called from the class Employed which is an interface to abstract class Employee, the sub classes
are stored in the department folder which are concrete classes (finishing of the abstract call getSalary())

getSalary() takes a base input assigned in the sub-class and adjust for the number of years worked, based on an 
adjustment also set in the sub-class.

The rest of the Staff.java file prints out the results and sums the total wages for the different departments.

## Things to work on

1. More classes of staff (departments)
2. Different rates of adjustment for wages depending on department and contract type
3. Different input format, maybe create database from user input depending on the type of department
4. Different output of wages, maybe selectable as well giving different options
