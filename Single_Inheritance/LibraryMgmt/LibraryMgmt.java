package Single_Inheritance.LibraryMgmt;

//Main Class
public class LibraryMgmt{
    public static void main(String[] args) {
        Author author = new Author("Harry Potter", 2000, "J.K. Rowling","This book is about harry potter and half blood prince");
        author.DisplayInfo();
    }
}