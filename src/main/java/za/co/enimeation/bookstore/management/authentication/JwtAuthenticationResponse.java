package za.co.enimeation.bookstore.management.authentication;

public class JwtAuthenticationResponse {
    private String jwt;

    public JwtAuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
