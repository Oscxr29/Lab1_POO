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
        this.name = name;
        setAge(age);  // Usar setter para validación
        this.id = id;
    }

    // Getters y Setters (encapsulación)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        this.id = id;
    }

    // Método que puede ser sobrescrito
    public void displayInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("ID: " + id);
    }
}
