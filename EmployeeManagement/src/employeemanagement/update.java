/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

import static employeemanagement.employee.acc;
import static employeemanagement.employee.emp_id;
import java.util.Scanner;

/**
 * The class update is used to edit the information of the employees.
 * @author Anusha
 * @author Vishwanath
 */
public class update {

    Scanner input = new Scanner(System.in);
    
    void update(int id)
    {
        addemp a = new addemp(); 
        if(id<=emp_id ) 
         {
                System.out.println("Name:"+acc.get(id).name);
                System.out.println("Age:"+acc.get(id).age);
                System.out.println("Address:"+acc.get(id).address);
                System.out.println("Salary:"+acc.get(id).salary + "\n");
         }
        acc.remove(id);
        System.out.println("Enter new details\n");
        System.out.println("Enter the employee name:");
        String name=input.next();
        a.name=name;
        System.out.println("Enter age of the employee:");
        int age=input.nextInt();
        a.age=age;
        System.out.println("Enter Salary of the employee");
        double salary = input.nextDouble();
        a.salary=salary;
        System.out.println("Enter address of the emplyee");
        String address=input.next();
        a.address=address;
        acc.add(a);
        System.out.println("The employee ID is\n" + id );      
    }
}
