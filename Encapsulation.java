class Student {
    // Private fields
    private String name;
    private int age;
    private double grade;

    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter methods to access private fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    // Setter methods to modify private fields
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        // Validation can be added here if needed
        this.age = age;
    }

    public void setGrade(double grade) {
        // Validation can be added here if needed
        this.grade = grade;
    }

    // Additional methods
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student student1 = new Student("John", 20, 85.5);

        // Accessing and displaying information using getter methods
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Age: " + student1.getAge());
        System.out.println("Student Grade: " + student1.getGrade());

        // Modifying information using setter methods
        student1.setAge(21);
        student1.setGrade(90.0);

        // Displaying updated information
        student1.displayStudentInfo();
    }
}

