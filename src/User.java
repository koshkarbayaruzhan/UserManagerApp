public class User {
    private String name;
    private String email;
    private String role;

    public User(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }
    public String getEmail() { return email; }
    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "', role='" + role + "'}";
    }
}
