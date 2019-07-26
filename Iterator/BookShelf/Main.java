public class Main {
    public static void main(String[] args) {
        BookShelf bookshelf = new BookShelf(4);
        bookshelf.appendBook(new Book("john"));
        bookshelf.appendBook(new Book("john2"));
        bookshelf.appendBook(new Book("john3"));
        bookshelf.appendBook(new Book("john_the_next"));

        Iterator it = bookshelf.iterator();
        while(it.hasNext()) {
            Book book = (Book)it.next(); //it.next()はObject型だからBookにcastingしないと
            System.out.println(book.getName());
        }
    }
}