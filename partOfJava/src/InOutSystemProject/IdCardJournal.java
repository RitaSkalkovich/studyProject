package InOutSystemProject;

import java.time.Instant;
import java.util.HashMap;

public class IdCardJournal {

    public HashMap idCards = new HashMap();  // пустой словарь
    public int amountOfEmployeesInOffice = 0;

    public void enterToOffice(Employee employee) {
        if (this.isEmployeehasAccessToOffice(employee)) {
            employee.status = Status.INOFFICE;

        } else {
            employee.status = Status.WITHOUTCARD;
        }
        this.amountOfEmployeesInOffice++;
        System.out.println("Считает прибытие " + amountOfEmployeesInOffice);
    }

    public void leaveOffice(Employee employee) {
        employee.status = Status.OUTOFOFFICE;
        this.amountOfEmployeesInOffice--;
        System.out.println("Считает убытие " + amountOfEmployeesInOffice);
    }

    public void registerEmployee(Employee employee) {
        String key = employee.name + employee.surname;
        if (!this.idCards.containsKey(key)) {   // существует ли
            this.idCards.put(key, Instant.now().toString());  //!поменять на тру зарегистрировали и добавили айдишник

        }
    }

    public boolean isEmployeehasAccessToOffice(Employee employee) {
        return this.idCards.containsKey(employee.name + employee.surname);
    }


}
//        if (id.length() == 10) {
//            this.idCards = id;
//        } else {
//            System.out.println("ложно");
//        }




