package src.Entity.App;

public class User {
    private UserLogin person;
    private  int idNum;

    public User() {
    }

    public User(UserLogin person, int idNum) {
        this.person = person;
        this.idNum = idNum;
    }

    public UserLogin getPerson() {
        return person;
    }

    public void setPerson(UserLogin person) {
        this.person = person;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
}