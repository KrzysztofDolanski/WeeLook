package model;

public class User {
    private long id;
    private String username;
    private String email;
    private String password;
    private boolean active;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime*result+(active?1231:1237);
        result = prime*result+((email==null)?0:email.hashCode());
        result = prime*result+(int)(id^(id>>>32));
        result = prime*result+((password==null)?0:password.hashCode());
        result = prime*result+((username==null)?0:username.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public User(long id, String username, String email, String password, boolean active) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.active = active;
    }

    public User() {
    }
}
