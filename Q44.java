import java.util.*;

class Faculty{
    int FacultyId,salary;
    public void inputItems(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter FaultyId and salary:");
        FacultyId=sc.nextInt();
        salary=sc.nextInt();

    }
    public void printSalary(){
        System.out.println("The salaray is: "+salary);
    }
}
class FulltimeFaculty extends Faculty{
    int basicSalary,allowances;
    
}