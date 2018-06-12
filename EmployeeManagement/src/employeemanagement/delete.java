/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;


import static employeemanagement.employee.acc;
import java.util.Scanner;

/**
 * The class delete is used to remove the employees.  
 * @author Anusha
 * @author Vishwanath
 */
public class delete {
    int emp_id=0;
    Scanner input = new Scanner(System.in);
    
    void delete()
    {
     
        System.out.println("Enter the employee ID to be deleted:");
        emp_id=input.nextInt();
        acc.remove(emp_id);
        System.out.println("Details of the employee deleted!!");
       
    }
}
