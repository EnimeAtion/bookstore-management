package za.co.enimeation.bookstore.management.authentication;

public class LoginRequest {
    private String username;
    private String password;

    // standard getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

