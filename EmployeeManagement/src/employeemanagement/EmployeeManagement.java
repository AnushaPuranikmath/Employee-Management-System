/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;


import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author user
 */

class employee
{
    static ArrayList<addemp> acc = new ArrayList();
    static int count=100,emp_age;
    Scanner input = new Scanner(System.in);
    String emp_name,emp_address;
    double emp_salary;
    
    public void creat_emp()
    {
       addemp a = new addemp();
       System.out.println("Enter the employee name:");
       emp_name=input.next();
       a.name=emp_name;
        acc.add(a);
       System.out.println("Enter age of the employee:");
       emp_age=input.nextInt();
       a.age=emp_age;
        acc.add(a);
       System.out.println("Enter Salary of the employee");
       emp_salary = input.nextDouble();
       a.salary=emp_salary;
        acc.add(a);
       System.out.println("Enter address of the emplyee");
       emp_address=input.next();
       a.address=emp_address;
        acc.add(a);
       System.out.println("The employee ID is\n" + count++);
   
    }
    
    public void delete_emp()
    {
        
    }

    void display()
    {
        
    }
    
    
    
}


public class EmployeeManagement {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
       
    employee e = new employee();
    Scanner input = new Scanner(System.in);
    int choice;
    do{
    System.out.println("*****************WELCOME***************\n");
    System.out.println("1. Add employee\n 2. Delete employee\n 3. Modify\n 4. Display Details of the employee\n 5. Exit\n");
    System.out.println("Enter your choice");
    choice=input.nextInt();
    switch (choice)
    {
        case 1: e.creat_emp();
            break;
        
        case 2: e.delete_emp();
            break;
            
        case 3:
            break;
            
        case 4:e.display();
            break;
        
        case 5:System.exit(0);
            break;
            
        default : System.out.println("Enter choice from 1-4");
            break;
    }
    
    
    
    
    }while(choice!=4);
    }
    
}
    
    

