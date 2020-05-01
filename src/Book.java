public class Book {

    //Create a Book class that allows for Book title, author, description, price and isInStock variables
    //
    //The Book class shall contain private member variables, a default constructor,
    // an overloaded constructor and a method called getDisplayText() which prints the author, title and description.
    //
    //
    //
    //The application shall also contain getters and setters for each private member variable.
    //
    //Create another class called BookApp which contains the main method.
    // In the main method you shall create an instance of a Book and print the Author, Title and Description.
    private String title;
    private String author_first_name;
    private String author_last_name;
    private String description;
    private double price;
    private boolean isInStock;
    //parameterized constructor
    public Book(String title, String author_first_name, String author_last_name, String description, double price, boolean isInStock) {
        this.title = title;
        this.author_first_name = author_first_name;
        this.author_last_name = author_last_name;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor_first_name(String author_first_name) {
        this.author_first_name = author_first_name;
    }

    public void setAuthor_last_name(String author_last_name) {
        this.author_last_name = author_last_name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor_first_name() {
        return author_first_name;
    }

    public String getAuthor_last_name() {
        return author_last_name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public String getDisplayText(){
        return
                "title='" + title + '\'' +
                ", author_first_name='" + author_first_name + '\'' +
                ", author_last_name='" + author_last_name + '\'' +
                ", description='" + description + '\'';

    }
}



