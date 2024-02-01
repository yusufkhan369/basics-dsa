package java1.kind.inheritance;

//Sub class or derived class or Child class
public class Employee extends Person{
    
    public String employeeId;

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.employeeId = "111";
        employee.name = "Amy";
        System.out.printf(employee.getName());
    }
}
