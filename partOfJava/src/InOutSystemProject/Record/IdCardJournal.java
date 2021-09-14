package InOutSystemProject.Record;

import InOutSystemProject.Employee.Employee;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashMap;

public class IdCardJournal implements Serializable {
    public int maxEmployeeInOffice = 15;
    public HashMap<String, String> idCards = new HashMap<>();
    public int amountOfEmployeesInOffice;

    public IdCardJournal(int maxEmployeeInOffice) {
        this.maxEmployeeInOffice = maxEmployeeInOffice;

    }

    public IdCardJournal() {
    }

    public int getAllAmount() {
        return amountOfEmployeesInOffice;
    }

    // регистрация нескольких сотруд-ов
    public void registerWorkers(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
      // регистрация по одному сотруднику
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

    // TODO: 9/1/2021 For what here signature for exception catching? [Pavel.Chachotkin]
    // need to discuss due to this method it causes an error when amount of employees in office is more than 15
    public void enterToOffice(Employee employee, String... idCard) throws Exception {
        try {
            NumberValidatorForEmployee.validate(amountOfEmployeesInOffice);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        if (this.isEmployeeHasAccessToOffice(employee)) {
            if (idCard.length > 0) {
                if (!(idCard[0] instanceof String)) {
                    throw new IllegalArgumentException("Not valid parameter");
                }
                employee.status = Status.IN_OFFICE;

            } else {
                employee.status = Status.WITHOUT_CARD;
            }
        } else if (!this.isEmployeeHasAccessToOffice(employee)) {
            employee.status = Status.NOT_REGISTERED;
            return;
        }
        this.amountOfEmployeesInOffice++;
        System.out.println("Считает прибытие " + amountOfEmployeesInOffice);

    }

    public void leaveOffice(Employee employee) {
        employee.status = Status.OUT_OF_OFFICE;
        this.amountOfEmployeesInOffice--;
        System.out.println("Считает убытие " + amountOfEmployeesInOffice);
    }

    public void registerEmployee(Employee employee) {
        String key = employee.name + employee.surname;
        if (!this.idCards.containsKey(key)) {
            IdCard idCard = new IdCard();
            employee.idCard = idCard.getIdCard();
            this.idCards.put(key, employee.idCard);
//            this.idCards.put(key, Instant.now().toString());
            System.out.println("Сотрудник зарегистрирован");
        } else {
            System.out.println("Сотрудник содержится в системе, зарегистрирован был до");
        }
    }

    public boolean isEmployeeHasAccessToOffice(Employee employee) {
        return this.idCards.containsKey(employee.name + employee.surname);
    }





}






