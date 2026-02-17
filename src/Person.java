/**
 * Clase base Person que demuestra encapsulación
 * Base class Person that demonstrates encapsulation
 */
public class Person {
    // Atributos privados (encapsulación)
    private String name;
    private int age;
    private String id;

    // Constructor
    public Person(String name, int age, String id) {
        setName(name);  // Usar setter para validación
        setAge(age);    // Usar setter para validación
        setId(id);      // Usar setter para validación
    }

    // Getters y Setters (encapsulación)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("La edad debe ser mayor a 0");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null && !id.trim().isEmpty()) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("El ID no puede estar vacío");
        }
    }

    // Método que puede ser sobrescrito
    public void displayInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("ID: " + id);
    }
}
