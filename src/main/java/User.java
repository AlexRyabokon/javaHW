public class User {

    private int id = 0;
    private String login;
    private String password;

    private User(int id, String login, String password){
        this.id = id;
        this.login = login;
        this.password = password;
    }


   public User (){
        this(0, "guest", "none");
    }


    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTextInfo() {

        return "Идентификатор: " + id + "; Логин: " + login + "; Пароль: " + password + "  ";
    }

}
