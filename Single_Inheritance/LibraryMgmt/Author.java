package Single_Inheritance.LibraryMgmt;


//Subclass Extend to Book
class Author extends Book{
    private String Name;
    private String Bio;
    Author(String Title,int publicationYear,String Name, String Bio){
        super(Title, publicationYear);
        this.Name = Name;
        this.Bio = Bio;
    }
    public void DisplayAuthorInfo(){
        super.DisplayInfo();
        System.out.println("Author: " + Name);
        System.out.println("Bio: " + Bio);
    }
}
