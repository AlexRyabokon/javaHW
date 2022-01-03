public class UserSocial extends User {

    private String userName;
    private int userAge;


    public UserSocial(int id, String login, String password, String userName, int userAge) {
        super();
        this.userAge = userAge;
        this.userName = userName;

    }

    public UserSocial() {

    }

    public int getUserAge() {
        return userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getTextInfo() {

        return "Идентификатор: " + super.getId() + "; Логин: " + super.getLogin() + "; Пароль: " + super.getPassword() + "; Имя пользователя: " + userName + "; Возраст пользователя:  " + userAge + " лет.";

    }
}





