package Multilevel_Inheritance.EducationCourseHierarchy;

//Main class to test the Course hierarchy
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse("Python Programming", 3, "Udemy", "Yes");
        course.Display();
        paidOnlineCourse paidCourse = new paidOnlineCourse("Java Programming", 6, "Coursera", "No", 500, 10);
        paidCourse.Display();
    }
}
