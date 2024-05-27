package vk.edu.page.valueUsers;

public class User {
    private final String login;
    private final String passwd;

    public User(String login, String passwd) {
        this.login = login;
        this.passwd = passwd;
    }
    public String getUserLogin(){
        return this.login;
    }
    public String getUserPassword(){
        return this.passwd;
    }
}
