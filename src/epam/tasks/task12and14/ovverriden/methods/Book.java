package epam.tasks.task12and14.ovverriden.methods;

public class Book implements Comparable<Book> {
    public String title;
    public String author;
    public int price;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int price) {
        this.author = author;
        this.price = price;
        this.title = title;
    }

    @Override

    public String toString() {
        return  "title: " + title +"\n"
                + "author: " + author + "\n"
                + "price: " + price + "\n"
                + "edition: " + edition + "\n";
    }

    @Override

    public int hashCode() {
        return (title.hashCode() + author.hashCode() + price + edition);
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Book))
            return false;

        return (this.title == ((Book) obj).title && this.price == ((Book) obj).price && this.author == ((Book) obj).author);
    }

    public Book clone() {
        return new Book(title, author, price);
    }

    public int compareTo(Book obj) {
        if (obj == null) {
            throw new NullPointerException();
        } else if (this.isbn - obj.isbn > 0) {
            return 1;
        } else {
            return this.isbn - obj.isbn < 0 ? -1 : 0;
        }
    }
}
