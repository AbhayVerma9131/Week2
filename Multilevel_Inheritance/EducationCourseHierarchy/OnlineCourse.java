package Multilevel_Inheritance.EducationCourseHierarchy;


//Subclass 1
class OnlineCourse extends Course{
    private String platform;
    private String isRecorde;
    OnlineCourse(String courseName,int duration,String platform,String isRecorde){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorde = isRecorde;
    }
    public void Display(){
        super.Display();
        System.out.println("Platform: "+platform);
        System.out.println("IS Recorded: "+isRecorde);
    }
}