package InOutSystemProject.Cabinet;

import InOutSystemProject.Employee.HelpDesk;


public class CabinetForHelpDesk<T extends HelpDesk> {
    public T[] employee;

    public CabinetForHelpDesk(T[] employee) {
        this.employee = employee;

    }

    public void move() {
        System.out.println("Есть доступ в кабинет HelpDesk");
    }


}