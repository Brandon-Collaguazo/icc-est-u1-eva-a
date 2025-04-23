package Controllers;

import Models.Book;

public class BookController {
    // Método para ordenar libros por nombre en orden descendente
/**
 * @param libros
 */
public void sortByName(Book[] libros) {
    int n = libros.length;
    for (int i = 0; i < n; i++) {
        Book aux = libros[i];
        int j = i + 1;
        while() {
            
        }
    }
}

// Método para buscar un libro por nombre, ignorando mayúsculas y minúsculas
public Book searchByName(Book[] libros, String nombre) {
    int bajo = 0;
    int alto = libros.length;
    for(int i = 0; i < libros.length; i++) {
        int medio = bajo + (alto - bajo) / 2;
        if() {
            return medio;
        }
        if() {
            medio = bajo + 1;
        } else {
            medio = alto - 1;
        }
    }
    return null;
}
    
}
