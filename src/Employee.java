/**
 * Clase Employee que hereda de Person
 * Employee class that inherits from Person
 */
public class Employee extends Person {
    private String employeeId;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, int age, String id, String employeeId, String department, double salary) {
        super(name, age, id); // Llamada al constructor de la clase padre
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    // Getters y Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    // Sobrescritura del método displayInfo (polimorfismo)
    @Override
    public void displayInfo() {
        super.displayInfo(); // Llamada al método de la clase padre
        System.out.println("ID Empleado: " + employeeId);
        System.out.println("Departamento: " + department);
        System.out.println("Salario: $" + salary);
    }

    // Método específico de Employee
    public void giveRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println("Nuevo salario: $" + salary);
        }
    }
}
