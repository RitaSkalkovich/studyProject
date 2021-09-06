package InOutSystemProject.Record;

import InOutSystemProject.Employee.Employee;

import java.time.Instant;
import java.util.HashMap;

public class IdCardJournal {
    public final int maxEmployeeInOffice = 15;
    // TODO: 9/1/2021 HashMap must have type [Pavel.Chachotkin]
    public HashMap<String, String> idCards = new HashMap<>();  // пустой словарь
    public int amountOfEmployeesInOffice; // TODO: 9/1/2021 Can I register users more than 15? [Pavel.Chachotkin]
    // DONE  error appears if employees are > 15




    public void registerWorkers(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public void registerWorkers(Employee employee) {
        System.out.println(employee);
    }

    public void validateInOffice(Employee employee) throws Exception {

        if (amountOfEmployeesInOffice <= maxEmployeeInOffice) {
            System.out.println("Места есть");
        } else {
            throw new Exception("Мест уже нет");
        }

    }
    // TODO: 9/1/2021 Must be caught exception from validate method [Pavel.Chachotkin]
    // Done validateInOffice method
    public void enterToOffice(Employee employee) throws Exception {
        try {
            NumberValidatorForEmployee.validate(amountOfEmployeesInOffice);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        if (this.isEmployeeHasAccessToOffice(employee)) {
            employee.status = Status.INOFFICE;

        } else if (!this.isEmployeeHasAccessToOffice(employee)) {
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
        if (!this.idCards.containsKey(key)) {
            this.idCards.put(key, Instant.now().toString());
            System.out.println("Сотрудник зарегистрирован");
        } else {
            System.out.println("Сотрудник содержится в системе, зарегистрирован был до");// TODO: 9/1/2021 And what should be if contains user? [Pavel.Chachotkin]
        }
    }

    public boolean isEmployeeHasAccessToOffice(Employee employee) {
        return this.idCards.containsKey(employee.name + employee.surname);
    }


}


