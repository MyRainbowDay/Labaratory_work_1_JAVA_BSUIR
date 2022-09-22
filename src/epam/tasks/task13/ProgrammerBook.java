package epam.tasks.task13;

import epam.tasks.task12and14.ovverriden.methods.Book;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.level = level;
        this.language = language;
    }

    @Override

    public String toString() {
        return  super.toString() + "language: " + language + "\n"
                + "level: " + level + "\n";
    }

    @Override

    public int hashCode() {
        return (language.hashCode() + level + super.hashCode());
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof ProgrammerBook pBook))
            return false;

        return (super.equals(pBook) && (pBook.level == level) && (pBook.language == language));
    }
}
