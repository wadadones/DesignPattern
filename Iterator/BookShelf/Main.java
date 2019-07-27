public class Main {
    public static void main(String[] args) {
        BookShelf bookshelf = new BookShelf();
        bookshelf.appendBook(new Book("john"));
        bookshelf.appendBook(new Book("john2"));
        bookshelf.appendBook(new Book("john3"));
        bookshelf.appendBook(new Book("john_the_next"));
        bookshelf.appendBook(new Book("john_the_next2"));

        Iterator it = bookshelf.iterator();
        while(it.hasNext()) { //BookShelfの構造に依存しない数え上げが可能
            Book book = (Book)it.next(); //it.next()はObject型だからBookにcastingしないと
            System.out.println(book.getName());
        }
    }
}