package zadanie11;

public class User {
    private static final String DELIMITER = "";
    String username;
    String password;

    public User(String username){
        this.username = username;
        this.username = password;

    }

    public String getUsername(){return username;}
    public String getPassword(){return password;}
    public String getString(){return username + DELIMITER + password;}
}
