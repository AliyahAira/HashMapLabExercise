import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BookDA {
    HashMap<String, Book> booksMap;
    AuthorDA authorDA;

    //C
    public BookDA() {
        booksMap = new HashMap<>();
        authorDA = new AuthorDA();
    }

    // Create()
    public void createBooks(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 3) {
                Author author = authorDA.getAuthorByName(data[2].trim());
                if (author != null) {
                    Book book = new Book(data[0].trim(), data[1].trim(), author);
                    booksMap.put(data[0].trim(), book);
                }
            }
        }
        reader.close();
    }

    // <----return book
    public Book getBookByISBN(String isbn) {
        return booksMap.get(isbn);
    }
}