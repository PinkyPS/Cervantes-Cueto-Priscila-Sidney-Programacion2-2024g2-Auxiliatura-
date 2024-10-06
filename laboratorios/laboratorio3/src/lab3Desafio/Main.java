package lab3Desafio;


public class Main {
    public static void main(String[] args) {
        Author author = new Author("Gabriel García Márquez");

        Book book1 = new Book("Cien años de soledad", author, 18);
        author.addBook(book1);

        author.addBook("El amor en los tiempos del cólera", 22);


        for (Book book : author.getBooks()) {
            System.out.println(book.getInfo());
        }
    }
}
