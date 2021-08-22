package InOutSystemProject;

public class TeamManager extends Managers implements AccessRoom{
    public TeamManager(String name, String surname, int idCard, String cardAvailable) {
        super(name, surname, idCard, cardAvailable);
    }

    @Override
    public void Access123Room() {

    }
}
