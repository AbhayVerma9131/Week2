package Multilevel_Inheritance.EducationCourseHierarchy;

//Superclass
class Course{
    private String courseName;
    private int duration;
    Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }
    public void Display(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
    }
}