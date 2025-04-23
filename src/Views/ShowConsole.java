package Views;

import Models.Book;

public class ShowConsole {
    public void printArrayBooks(Book [] libros) {
        System.out.println("Lista Personas");
        for(Book book : libros) {
            System.out.println(libros + " | ");
        }
    }
    public void printMessage(String message) {
        System.out.println(message);
    }
}
