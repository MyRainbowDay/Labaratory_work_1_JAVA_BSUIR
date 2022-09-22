package epam.tasks.task15.comparator;

import java.util.Comparator;
import epam.tasks.task12and14.ovverriden.methods.Book;

public class BooksComparator {
    public static Comparator<Book> byAuthor = (book1, book2) -> {
        return book1.author.compareToIgnoreCase(book2.author);
    };
    public static Comparator<Book> byTitle = (book1, book2) -> {
        return book1.title.compareToIgnoreCase(book2.title);
    };
    public static Comparator<Book> byPrice = Comparator.comparingInt((book) -> {
        return book.price;
    });
    public static Comparator<Book> byTitleThanAuthor;
    public static Comparator<Book> byAuthorThanTitle;
    public static Comparator<Book> byAuthorThanTitleThanPrice;

    static {
        byTitleThanAuthor = byTitle.thenComparing(byAuthor);
        byAuthorThanTitle = byAuthor.thenComparing(byTitle);
        byAuthorThanTitleThanPrice = byAuthor.thenComparing(byTitle).thenComparing(byPrice);
    }

    public BooksComparator() {
    }
}
