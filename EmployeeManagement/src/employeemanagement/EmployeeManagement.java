/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;


import java.util.Scanner;
import java.util.ArrayList;


/**
 * The project, Employee Management System contains various operations like adding,delete,edit and display
 * the employees working in a particular organization.
 * @author Anusha
 * @author Vishwanath
 */

class employee
{
    static ArrayList<addemp> acc = new ArrayList();
    static int emp_id=0;
    Scanner input = new Scanner(System.in);
    /**
     * The function create_emp is used to add different employees by generating an employee id
     * for each individual employee.
     * @param name takes the name of the employee
     * @param age takes the age of the employee
     * @param salary takes the salary offered to the employee
     * @param address takes the address of the employee
     */
    public void creat_emp(String name, int age, double salary, String address)
    {  
        
       addemp a = new addemp(); 
       a.name=name;
       a.age=age;
       a.salary=salary;
       a.address=address; 
       acc.add(a);
       System.out.println("The employee ID is\n" + emp_id);
       emp_id++; 
      
    }
    
}

public class EmployeeManagement {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) 
    {
    employee e = new employee();
    Scanner input = new Scanner(System.in);
    int emp_age,emp_id;
    String emp_name,emp_address;
    double emp_salary;
    int choice;
    do{
    System.out.println("*****************WELCOME***************\n");
    System.out.println("1. Add employee\n 2. Delete employee\n 3. Modify\n 4. Display Details of the employee\n 5. Exit\n");
    System.out.println("Enter your choice");
    choice=input.nextInt();
    switch (choice)
    {
        case 1: System.out.println("Enter the employee name:");
                emp_name=input.next();
                
                System.out.println("Enter age of the employee:");
                emp_age=input.nextInt();
               
                System.out.println("Enter Salary of the employee");
                emp_salary = input.nextDouble();
              
                System.out.println("Enter address of the emplyee");
                emp_address=input.next();
            /**
             * Takes input of the following details and and send them to the creat_emp function
             */
                e.creat_emp(emp_name,emp_age,emp_salary,emp_address);
            break;
        
        case 2: delete d = new delete();
                d.delete();
            break;
            
        case 3: System.out.println("Enter employee ID: ");
                emp_id=input.nextInt();
                update up = new update();
                up.update(emp_id);
            break;
            
        case 4: System.out.println("Enter employee ID: ");
                emp_id=input.nextInt();
                display dis = new display();
                dis.display(emp_id);
            break;
        
        case 5: System.exit(0);
            break;
            
        default: System.out.println("Enter choice from 1-4");
            break;
    }
        
   }while(choice!=5);
      
  }
    
}
    
    

