/**
 * Clase Student que hereda de Person
 * Student class that inherits from Person
 */
public class Student extends Person {
    private String studentId;
    private String major;
    private double gpa;

    // Constructor
    public Student(String name, int age, String id, String studentId, String major, double gpa) {
        super(name, age, id); // Llamada al constructor de la clase padre
        setStudentId(studentId);  // Usar setter para validación
        setMajor(major);          // Usar setter para validación
        setGpa(gpa);              // Usar setter para validación
    }

    // Getters y Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId != null && !studentId.trim().isEmpty()) {
            this.studentId = studentId;
        } else {
            throw new IllegalArgumentException("El ID de estudiante no puede estar vacío");
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if (major != null && !major.trim().isEmpty()) {
            this.major = major;
        } else {
            throw new IllegalArgumentException("La carrera no puede estar vacía");
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            throw new IllegalArgumentException("GPA debe estar entre 0.0 y 4.0");
        }
    }

    // Sobrescritura del método displayInfo (polimorfismo)
    @Override
    public void displayInfo() {
        super.displayInfo(); // Llamada al método de la clase padre
        System.out.println("ID Estudiante: " + studentId);
        System.out.println("Carrera: " + major);
        System.out.println("GPA: " + gpa);
    }

    // Método específico de Student
    public boolean isHonorStudent() {
        return gpa >= 3.5;
    }
}
