package InOutSystemProject;

public class TeamManager extends Manager implements VIP{
    public TeamManager(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void isGetAccess() {
        String x;
        x = this.name + " " + this.surname;
        System.out.println(x + " можешь войти в комнату 123");
    }
}
