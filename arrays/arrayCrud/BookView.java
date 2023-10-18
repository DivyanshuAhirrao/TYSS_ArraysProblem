package assignments.arrays.arrayCrud;

import java.util.Scanner;

public class BookView {
    static BookController controller = new BookController();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        BookController.setBooks(new Book[10]);

        do {
            System.out.println("=========|| Welcome to the BookStore ||=========");
            System.out.println("------------------------------------------------");
            System.out.println();
            System.out.println("Select your Choice : ");
            System.out.println("1. Add Book Object");
            System.out.println("2. Insert Book Object");
            System.out.println("3. Search Book Object");
            System.out.println("4. Delete Book Object");
            System.out.println("5. Update Book Object");
            System.out.println("6. Display Books");
            System.out.println("7. Sort Books");
            System.out.println("8. Exit");

            int c = sc.nextInt();

            switch (c){
                case 1 : {
                    Book book = getBook();
                    if (BookController.add(book)){
                        System.out.println(book.getTitle()+" Added successfully !!");
                    }
                    else {
                        System.out.println("Book not Found !!");
                    }
                }
                break;
                case 2 : {
                    System.out.println("Enter the Index number : ");
                    int ind = sc.nextInt();
                    Book book = getBook();
                    if (BookController.add(ind, book)){
                        System.out.println(book.getTitle()+" added successfully at "+ind+" index !!");
                    }
                    else {
                        System.out.println("Book not inserted");
                    }
                }
                break;
                case 3 : {
                    System.out.println("Enter the book Id to Search ");
                    int id = sc.nextInt();
                    if (BookController.searchBook(id)){
                        System.out.println("Book Found");
                    }
                    else {
                        System.out.println("Book not found !!");
                    }
                }
                break;
                case 4 :{
                    System.out.println("Enter the ID : ");
                    int ind = sc.nextInt();

                    if (BookController.deleteBook(ind)){
                        System.out.println("Book is Deleted !!");
                    }
                    else {
                        System.out.println("Index not found, Book not Deleted !!");
                    }
                }
                break;
                case 5 : {
                    System.out.println("Enter the index number");
                    int index = sc.nextInt();
                    System.out.println("Enter the Price ");
                    double price = sc.nextDouble();

                    if (BookController.updateBook(index,price)){
                        System.out.println("Book is updated");
                    }
                    else {
                        System.out.println("Book Not Found");
                    }
                }
                break;
                case 6: {
                    Book[] books = BookController.getBooks();
                    for (int i=0;i<=BookController.index;i++){
                        System.out.print(books[i].getId()+" ");
                    }
                }
                break;
                case 7:{
                    BookController.sortArray();
                    System.out.println("Successfully sorted !!");
                }
                break;
                case 8: {
                    System.out.println(" Thank-you ");
                    flag = false;
                }
                break;
                default: {
                    System.out.println(c+" is an invalid Input, Try Again ");
                }
            }
        }
        while (flag);

    }
    private static Book getBook(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book ID : ");
        int id = sc.nextInt();
        System.out.println("Enter the price of a Book");
        double price = sc.nextDouble();
        System.out.println("Enter the Title of a Book");
        String title = sc.next();
        System.out.println("Enter the Auther of a book");
        String author = sc.next();
        return new Book(id, price, title, author);

    }

}











































//        BookController.add(new Book(1, 1999.95, "HarryPotter", "JK Rollings"));
//        BookController.add(new Book(2, 2999.95, "Mamals", "zingrolley"));
//        BookController.add(new Book(3, 1499.95, "Suits", "James"));
//        BookController.add(new Book(4, 1899.95, "Dalal Street", "DF Smith"));
//        BookController.add(new Book(5, 999.95, "Ring now", "KL Rakesh"));
//        BookController.add(new Book(6, 1399.95, "Horror Tales", "DM Pets"));
//        BookController.add(new Book(7, 1699.95, "SciFi", "SS Johnson"));
//        BookController.add(new Book(8, 3999.95, "Discovery", "CK Dickens"));
//        BookController.add(new Book(9, 2499.95, "Friends", "Neken Lols"));
//        BookController.add(new Book(10, 499.95, "Book10", "Ash Ketes"));
