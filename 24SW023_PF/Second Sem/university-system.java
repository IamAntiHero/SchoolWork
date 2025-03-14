// Professor class
class Professor {
    private String name;
    private University university; // Aggregation: Professor can exist without University
    
    public Professor(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public University getUniversity() {
        return university;
    }
    
    public void setUniversity(University university) {
        this.university = university;
    }
    
    public String toString() {
        return "Professor [name=" + name + "]";
    }
}

// University class
import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Department> departments; // Composition: Departments cannot exist without University
    private List<Professor> professors; // Aggregation: Professors can exist without University
    
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.professors = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public List<Department> getDepartments() {
        return departments;
    }
    
    // Create and add department (composition)
    public Department createDepartment(String name) {
        Department department = new Department(name, this);
        departments.add(department);
        return department;
    }
    
    public List<Professor> getProfessors() {
        return professors;
    }
    
    // Add professor (aggregation)
    public void addProfessor(Professor professor) {
        professors.add(professor);
        professor.setUniversity(this);
    }
    
    public String toString() {
        return "University [name=" + name + ", departments=" + departments.size() + 
               ", professors=" + professors.size() + "]";
    }
}

// Department class
class Department {
    private String name;
    private University university; // Part of composition with University
    private List<Student> students; // Aggregation: Students can exist without Department
    
    // Constructor only accessible by University (enforcing composition)
    Department(String name, University university) {
        this.name = name;
        this.university = university;
        this.students = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public University getUniversity() {
        return university;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    // Add student (aggregation)
    public void addStudent(Student student) {
        students.add(student);
        student.setDepartment(this);
    }
    
    public String toString() {
        return "Department [name=" + name + ", students=" + students.size() + "]";
    }
}

// Student class
class Student {
    private String name;
    private String rollNumber;
    private Department department; // Aggregation: Student can exist without Department
    
    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getRollNumber() {
        return rollNumber;
    }
    
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
    
    public Department getDepartment() {
        return department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }
    
    public University getUniversity() {
        return department != null ? department.getUniversity() : null;
    }
    
    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
    }
}

// Main class to demonstrate usage
public class UniversitySystem {
    public static void main(String[] args) {
        // Create a university
        University mit = new University("MIT");
        
        // Create departments using composition
        Department computerScience = mit.createDepartment("Computer Science");
        Department physics = mit.createDepartment("Physics");
        
        // Create professors
        Professor johnDoe = new Professor("John Doe");
        Professor janeSmith = new Professor("Jane Smith");
        
        // Add professors to university (aggregation)
        mit.addProfessor(johnDoe);
        mit.addProfessor(janeSmith);
        
        // Create students
        Student alice = new Student("Alice", "CS001");
        Student bob = new Student("Bob", "CS002");
        Student charlie = new Student("Charlie", "PH001");
        
        // Add students to departments (aggregation)
        computerScience.addStudent(alice);
        computerScience.addStudent(bob);
        physics.addStudent(charlie);
        
        // Print university structure using toString methods
        System.out.println(mit);
        System.out.println("\nDepartments:");
        for (Department dept : mit.getDepartments()) {
            System.out.println("  - " + dept);
            System.out.println("    Students:");
            for (Student student : dept.getStudents()) {
                System.out.println("      * " + student);
            }
        }
        
        System.out.println("\nProfessors:");
        for (Professor prof : mit.getProfessors()) {
            System.out.println("  - " + prof);
        }
    }
}