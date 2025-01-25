package Single_Inheritance.LibraryMgmt;
//Super calss Book
class Book{
    private String Title;
    private int publicationYear;
    Book(String Title, int publicationYear){
        this.Title = Title;
        this.publicationYear = publicationYear;
    }
    public void DisplayInfo(){
        System.out.println("Book " + Title );
        System.out.println("Publication Year: " + publicationYear);
    }
}