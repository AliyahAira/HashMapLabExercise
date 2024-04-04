import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class AuthorDA {
    private HashMap<String, Author> authorsMap;

    // c
    public AuthorDA() {
        authorsMap = new HashMap<>();
    }

    // Create Author objects
    public void createAuthors(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 2) {
                Author author = new Author(data[0].trim());
                author.setBio(data[1].trim());
                authorsMap.put(data[0].trim(), author);
            }
        }
        reader.close();
    }

    // <----return/get author
    public Author getAuthorByName(String name) {
        return authorsMap.get(name);
    }
}