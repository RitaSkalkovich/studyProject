package InOutSystemProject;

public class DeputyDirector extends Managers implements AccessRoom{
    public DeputyDirector(String name, String surname, int idCard, String cardAvailable) {
        super(name, surname, idCard, cardAvailable);
    }

    @Override
    public void Access123Room() {

    }
}
