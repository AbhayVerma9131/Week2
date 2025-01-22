import java.util.*;
class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        this.courses.add(course);
        course.addStudent(this);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}

public class SchoolandStudent {
    public static void main(String[] args) {
        School school = new School("ABC School");

        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Doe");

        school.addStudent(student1);
        school.addStudent(student2);

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        System.out.println("Courses enrolled by " + student1.getName() + ":");
        for (Course course : student1.getCourses()) {
            System.out.println(course.getName());
        }

        System.out.println("Students enrolled in " + course1.getName() + ":");
        for (Student student : course1.getStudents()) {
            System.out.println(student.getName());
        }
    }
}   