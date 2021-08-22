package InOutSystemProject;

public class Director extends Managers implements AccessRoom{
    public Director(String name, String surname, int idCard, String cardAvailable) {
        super(name, surname, idCard, cardAvailable);
    }

    @Override
    public void Access123Room() {

    }
}
