
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1=new Employee("Aniket", "Gawade", 30000);
        Employee emp2=new Employee("Ritesh", "Patil", 50000);

        emp1.display();
        emp2.display();

        emp1.yearlysalary();
        emp2.yearlysalary();
        
        emp1.raise();
        emp2.raise();
        emp1.yearlysalary();
        emp2.yearlysalary();
    }
}
