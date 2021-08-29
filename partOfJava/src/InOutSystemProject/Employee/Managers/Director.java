package InOutSystemProject.Employee.Managers;

import InOutSystemProject.VIP;

public class Director extends Manager implements VIP {
    String role = "director";

    public Director(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void isGetAccess() {
        String fullName;
        fullName = this.name + " " + this.surname;
        System.out.println(fullName + " можешь войти в комнату 123");
    }
}
