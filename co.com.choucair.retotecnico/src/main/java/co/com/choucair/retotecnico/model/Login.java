package co.com.choucair.retotecnico.model;

public class Login {
    private String firstname;
    private String lastname;
    private String email;
    private String city;
    private String postal;

    public String getPassword() {
        return password;
    }

    private String password;


    public String getPostal() {
        return postal;
    }

    public String getCity() {
        return city;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
