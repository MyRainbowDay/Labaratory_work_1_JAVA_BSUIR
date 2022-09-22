package epam.tasks.task13;

import epam.tasks.task12and14.ovverriden.methods.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("physics", "Alex", 468);
        Book programmerBook = new ProgrammerBook("Math","Alex", 450, "English", 4);

        System.out.println(book.toString());
        System.out.println("-------------");
        System.out.println(programmerBook.toString());
    }
}
