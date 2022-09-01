public class Main {
    public static void main(String[] args) {
        var author = new Author("name", "family");
        var author1 = new Author("name1", "family1");

        var book = new Book("book", author, 122);
        var book1 = new Book("book1", author1, 123);

        System.out.println(book);
        System.out.println(book1);

        book.setPublicationYear(124);
        System.out.println("новый год издания " + book.getPublicationYear());
    }
}