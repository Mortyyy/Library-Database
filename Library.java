import java.util.ArrayList;

public class Library{
  //Untested; ArrayList of Strings or Book objects???.
  private ArrayList<Book> database = new ArrayList<Book>();     //Holds all books.
  
  //Constructor.
  public Library(){
    //Need to import books from .txt file.
  }
  
  //Modifier method to add a books to database.
  public void addNewBook(Book book){
    database.add(book);
  }
  
  //Modifier method to remove books from database.
  public void removeOldBook(Book book){
    database.remove(book);
  }
  
  //NOTE: DO WE NEED????
  //Method to mark a book as borrowed if it is available.
  public void borrowBook(Book book){
    book.makeBorrowed();
  }
  
  public void returnBook(Book book){
    book.makeReturned();
  }
  
  //Method to display all books in the library.
  public void browse(){
     System.out.println(database);
  }
  
  @Override
  public String bookInfo(){ // do we even need this?? lol
    String total = "\n"
    
    //I actually have no idea how to use iterator but the textbook makes it look easy so plz fix this i love you gloria
    Iterator<Book> i = database.iterator();
    while(i.hasNext()){
      Book b = (Book)i.next();
      total = total + b.bookInfo();
    }
    return total;
  }
}
