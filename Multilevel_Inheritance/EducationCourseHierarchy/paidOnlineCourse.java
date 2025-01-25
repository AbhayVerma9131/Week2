package Multilevel_Inheritance.EducationCourseHierarchy;

//Subclass 2
class paidOnlineCourse extends OnlineCourse{
    private double fees;
    private double discount;
    paidOnlineCourse(String courseName,int duration, String platform, String isRecorde, double fees, double discount){
        super(courseName, duration, platform, isRecorde);
        this.fees = fees;
        this.discount = discount;
    }
    public void Display(){
        super.Display();
        System.out.println("Fees: "+fees);
        System.out.println("Discount: "+discount);
    }
}
