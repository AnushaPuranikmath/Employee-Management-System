/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

import static employeemanagement.employee.acc;
import static employeemanagement.employee.emp_id;

/**
 * The class display is used to display the details of the employees by specifying their employee ID
 * @author Anusha
 * @author Vishwanath
 */

public class display {
    
     public void display(int id)
    {
       
      if(id<emp_id)
        {
            System.out.println("Name:"+acc.get(id).name);
            System.out.println("Age:"+acc.get(id).age);
            System.out.println("Address:"+acc.get(id).address);
            System.out.println("Salary:"+acc.get(id).salary);
        } 
      else 
            System.out.println("Not found\n");
    
    }
}
