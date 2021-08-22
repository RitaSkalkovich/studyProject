package InOutSystemProject;

public abstract class Employee {
    protected String name;
    protected String surname;
    protected int idCard;
    protected String cardAvailable;

    public Employee(String name, String surname, int idCard, String cardAvailable) {
        this.name = name;
        this.surname = surname;
        this.idCard = idCard;
        this.cardAvailable = cardAvailable;
    }
}
