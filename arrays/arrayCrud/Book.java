package assignments.arrays.arrayCrud;

public class Book {
    private int id;
    private double price;
    private String title;
    private String author;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int id, double price, String title, String author) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.author = author;
    }

    public Book(){

    }


}
