
import java.io.IOException;


public class BookReport {
    public static void main(String[] args) {
        BookDA bookDA = new BookDA();
        try {
            bookDA.authorDA.createAuthors("Author.csv");
            bookDA.createBooks("Book.csv");

            // Displaying report
            for (Book book : bookDA.booksMap.values()) {
                Author author = book.getAuthor();
                System.out.println(book.getIsbn() + " " + book.getTitle());
                System.out.println("\t" + author.getName() + " - " + author.getBio() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
 
    }
}    