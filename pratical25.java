import java.util.Scanner;

class Employee{
    String EmployeeName;
    int employeeNo;
    int salary;

    void set_data(){};
    void get_data(){};
}
 
class Teaching extends Employee{
    String nameOfSubject;

    void set_data(){
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter Details for a teaching Employee");
        System.out.print("Name for Employee: ");
        this.EmployeeName=myObj.nextLine();
        System.out.print("Enter Employee Number: ");
        this.employeeNo=myObj.nextInt();
        System.out.print("Enter Salary for  Employee: ");
        this.salary=myObj.nextInt();
        System.out.print("Enter the Subject teaching: ");
        this.nameOfSubject=myObj.nextLine();
        
    }

    void get_data(){
        System.out.println("Details for a teaching Employee");
        System.out.println("Name for Employee: "+this.EmployeeName);
        System.out.println("Employee Number: "+this.employeeNo);
        System.out.println("Salary for  Employee: "+this.salary);
        System.out.println("Subject teaching: "+this.nameOfSubject);        
    }
}

class NonTeaching extends Employee{
    String typeofWork;

    void set_data(){
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter Details for a teaching Employee");
        System.out.print("Name for Employee: ");
        this.EmployeeName=myObj.nextLine();
        System.out.print("Enter Employee Number: ");
        this.employeeNo=myObj.nextInt();
         myObj.nextLine(); // consume the leftover newline character
        System.out.print("Enter Salary for  Employee: ");
        this.salary=myObj.nextInt();
         myObj.nextLine(); // consume the leftover newline character
        System.out.print("Enter the typeofWork: ");
        this.typeofWork=myObj.nextLine();
        
    }

    void get_data(){
        System.out.println("Details for a teaching Employee");
        System.out.println("Name for Employee: "+this.EmployeeName);
        System.out.println("Employee Number: "+this.employeeNo);
        System.out.println("Salary for  Employee: "+this.salary);
        System.out.println("typeofWork: "+this.typeofWork);        
    }
}

public class Main{
    public static void main(String[] args){
        Teaching emp1 = new Teaching();
        NonTeaching emp2 = new NonTeaching();
        emp1.set_data();
        emp2.set_data();

       emp1.get_data();
        emp2.get_data();
    }
}