/**
 * Clase Main que demuestra los conceptos de POO
 * Main class that demonstrates OOP concepts
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Lab 1 - Programación Orientada a Objetos ===\n");

        // Crear una persona
        System.out.println("--- Persona ---");
        Person person = new Person("Juan Pérez", 30, "DUI-12345678");
        person.displayInfo();
        System.out.println();

        // Crear un estudiante (herencia)
        System.out.println("--- Estudiante ---");
        Student student = new Student(
            "María García",
            20,
            "DUI-87654321",
            "U20250466",
            "Ingeniería en Sistemas",
            3.8
        );
        student.displayInfo();
        System.out.println("¿Es estudiante de honor? " + 
            (student.isHonorStudent() ? "Sí" : "No"));
        System.out.println();

        // Crear un empleado (herencia)
        System.out.println("--- Empleado ---");
        Employee employee = new Employee(
            "Carlos López",
            35,
            "DUI-11223344",
            "EMP-001",
            "Tecnología",
            1500.00
        );
        employee.displayInfo();
        System.out.println();

        // Demostrar polimorfismo
        System.out.println("--- Polimorfismo ---");
        System.out.println("Salario actual: $" + employee.getSalary());
        employee.giveRaise(10);
        System.out.println("Aumento de salario del 10%");
        System.out.println("Nuevo salario: $" + employee.getSalary());
        System.out.println();

        // Demostrar encapsulación
        System.out.println("--- Encapsulación ---");
        System.out.println("Modificando edad del estudiante:");
        student.setAge(21);
        System.out.println("Nueva edad: " + student.getAge());
        System.out.println();

        // Demostrar uso de arreglo polimórfico
        System.out.println("--- Arreglo Polimórfico ---");
        Person[] people = new Person[3];
        people[0] = person;
        people[1] = student;
        people[2] = employee;

        for (int i = 0; i < people.length; i++) {
            System.out.println("\nPersona " + (i + 1) + ":");
            people[i].displayInfo();
        }
    }
}
