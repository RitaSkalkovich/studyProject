package InOutSystemProject.Employee;

import InOutSystemProject.VIP;

public class HelpDesk extends Employee implements VIP {

    public HelpDesk(String name, String surname) {
        super(name, surname);
    }


    @Override
    public void isGetAccess() {
        String x;
        x = this.name + " " + this.surname;
        System.out.println(x + " можешь войти в комнату 123");
    }
}
