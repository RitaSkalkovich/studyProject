package InOutSystemProject.Employee.Managers;

import InOutSystemProject.VIP;

public class DeputyDirector extends Manager implements VIP {

    public DeputyDirector(String name, String surname) {
        super(name, surname);
    }


    @Override
    public void isGetAccess() {
        String x;
        x = this.name + " " + this.surname;
        System.out.println(x + " можешь войти в комнату 123");
    }


}
