//Objek Class
public class Employee {
    private String name;
    private double salary;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Constructor to employee detail
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to print employee information
    public void print() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}


