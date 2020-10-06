import java.util.Scanner;

class Employee{
    int empNo=0;
     static int person=0;
    static int totalSalary=0;
    private int salary;
    Employee(int i){
       this.salary=i;
       person+=1;
       empNo=person;
       totalSalary+=i;
    }
    public void showData(){
        System.out.println("The salary is: "+salary+" the total Salary of the company is: "+this.totalSalary+" the empNo of the employee is "+this.empNo+".");
    }
}
public class Q38{
    public static void main(String[] args) {
        Employee a=new Employee(1000000);
        Employee b=new Employee(100000);
        a.showData();
        b.showData();
    }
}