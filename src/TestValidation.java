public class TestValidation {
    public static void main(String[] args) {
        System.out.println("=== Pruebas de Validación ===\n");

        // Test 1: GPA inválido
        try {
            Student s = new Student("Test", 20, "ID1", "ST1", "CS", 5.0);
            System.out.println("ERROR: GPA inválido no lanzó excepción");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ GPA inválido rechazado: " + e.getMessage());
        }

        // Test 2: Edad inválida
        try {
            Person p = new Person("Test", -5, "ID2");
            System.out.println("ERROR: Edad inválida no lanzó excepción");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Edad inválida rechazada: " + e.getMessage());
        }

        // Test 3: Salario inválido
        try {
            Employee emp = new Employee("Test", 30, "ID3", "EMP1", "IT", -100);
            System.out.println("ERROR: Salario inválido no lanzó excepción");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Salario inválido rechazado: " + e.getMessage());
        }

        // Test 4: Porcentaje de aumento inválido
        try {
            Employee emp = new Employee("Test", 30, "ID4", "EMP2", "IT", 1000);
            emp.giveRaise(-10);
            System.out.println("ERROR: Porcentaje inválido no lanzó excepción");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Porcentaje inválido rechazado: " + e.getMessage());
        }

        System.out.println("\n¡Todas las validaciones funcionan correctamente!");
    }
}
