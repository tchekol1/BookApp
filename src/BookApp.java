public class BookApp {
    public static void main(String[] args) {
        //creating a book object from a Book class
        Book book= new Book("Fantastic Beasts", "Jacky",
                "Rowling","adventuries novel",12.5,true);

   //calling an instance method using the book object created above
        System.out.println(book.getDisplayText());
    }
}
