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
        setEmployeeId(employeeId);    // Usar setter para validación
        setDepartment(department);    // Usar setter para validación
        setSalary(salary);            // Usar setter para validación
    }

    // Getters y Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId != null && !employeeId.trim().isEmpty()) {
            this.employeeId = employeeId;
        } else {
            throw new IllegalArgumentException("El ID de empleado no puede estar vacío");
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null && !department.trim().isEmpty()) {
            this.department = department;
        } else {
            throw new IllegalArgumentException("El departamento no puede estar vacío");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("El salario debe ser mayor a 0");
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
    private double calculateRaiseAmount(double percentage) {
        return salary * (percentage / 100);
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            salary += calculateRaiseAmount(percentage);
        } else {
            throw new IllegalArgumentException("El porcentaje debe ser mayor a 0");
        }
    }

    public double calculateRaise(double percentage) {
        if (percentage > 0) {
            return salary + calculateRaiseAmount(percentage);
        }
        throw new IllegalArgumentException("El porcentaje debe ser mayor a 0");
    }
}
