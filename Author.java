public class Author {
    private String name;
    private String bio;

    //c
    public Author(String name) {
        this.name = name;
    }

    
    public void setBio(String bio) {
        this.bio = bio;
    }

    
    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }
}