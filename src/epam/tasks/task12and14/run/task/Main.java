package epam.tasks.task12and14.run.task;

import epam.tasks.task12and14.ovverriden.methods.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Lords","noName",1710);
        Book book2 = new Book("Lords","n2oName",1710);

        System.out.printf(book1.toString());
        if (book1.equals(book2))
            System.out.println("true");
        else System.out.println("false");

        Book book_clone = book2.clone();
    }
}
