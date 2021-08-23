package InOutSystemProject;

public class Director extends Manager implements VIP {
    String role = "director";

    public Director(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void isGetAccess() {
        String x;
        x = this.name + " " + this.surname;
        System.out.println(x + " можешь войти в комнату 123");
    }
}
