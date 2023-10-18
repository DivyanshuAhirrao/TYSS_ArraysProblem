package assignments.arrays.arrayCrud;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class BookController {

    private static Book[] books;
    static int index = 0;
//    static int sortElement = 1;
    public static Book[] getBooks(){
     return books;
    }

    public static void length(){
        System.out.println(index);
    }
    static void setBooks(Book[] books){
        BookController.books = books;
    }
    static void setBooks(){
        BookController.books = books;
    }




    public static boolean add(Book book){
        if (index < books.length){
            books[++index] = book;
            return true;
        }
        else {
            Book res[] = new Book[books.length*2];
            for (int i=0;i<books.length;i++){
                res[i] = books[i];
            }
            books = res;
            books[++index] = book;
            return true;
        }
    }

    public static boolean add(int ind, Book book){

        for (int i=index;i>=ind;i--){
            if (i == ind){
                books[i+1] = book;
                return true;
            }
            else {
                books[i+1] = books[i];
            }
        }
        return false;
    }

    public static void sortArray(){
    int temp = 0;
        for (int i=0;i<books.length;i++){
            for (int j=i+1;j<books.length;j++){
                if (books[i].getId() > books[j].getId()) {
                    temp = books[i].getId();
//                    books[i] = books[j];
//                    books[j] = temp;
//                    books[i].setId() = books[j].getId();
//                    books[j].setId() = temp;
                }
            }
        }
    }

    public static void printBooks(){
        for (Book b : BookController.getBooks()) {
            if (b != null) {
                System.out.println("Book ID     : " + b.getId());
                System.out.println("Book Title  : " + b.getTitle());
                System.out.println("Book Author : " + b.getAuthor());
                System.out.println("Book Price  : " + b.getPrice());
                System.out.println("--------------------------------");
            }
        }
    }
    public static boolean searchBook(int id){
        for (Book b : books){
            if (b != null && b.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean updateBook(int id, double price){
        if (searchBook(id)){
            for (Book b : books){
                if (b != null && b.getId() == id) {
                    b.setPrice(price);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean deleteBook(int id){
        boolean flag = false;
        if (searchBook(id)){
            for (int i=0;i<index;i++){
                if (id == books[i].getId()){

                }
            }
        }
        index--;
        return false;
    }







































//    static Book b1 = new Book();
//     int searchBook(int id){
//        if (id == b1.id){
//            System.out.println("Book ID     : "+b1.id);
//            System.out.println("Book Title  : "+b1.title);
//            System.out.println("Book Author : "+b1.author);
//            System.out.println("Book Price  : "+b1.price);
//        }
//        else {
//            System.out.println("ID not found !!");
//        }
//        return id;
//    }
//
//     void updateBookPrice(int id, double price){
//        if (id == b1.id){
//            b1.price = price;
//            System.out.println("Hello from update");
//        }
//    }
//
//     void deleteBook(int id){
//        if (id == b1.id){
//            System.out.println("Hello from Delete");
//        }
//    }
//
//     void addBook(Book b){
//        System.out.println("Hello from Add Book");
//    }
//    void addBookInBetween(int i ,Book b){
//
//        System.out.println("hello from Add Book By Index");
//    }




}
