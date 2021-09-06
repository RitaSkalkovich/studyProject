package InOutSystemProject;
import InOutSystemProject.Cabinet.Cabinet;
import InOutSystemProject.Employee.Employee;
import InOutSystemProject.Employee.ItDepartment;
import InOutSystemProject.Employee.Managers.*;
import InOutSystemProject.Employee.HelpDesk;
import InOutSystemProject.Record.IdCard;
import InOutSystemProject.Record.IdCardJournal;

public class Main {
    public static void main(String[] args) throws Exception {
        IdCardJournal id = new IdCardJournal();

        Employee teamManager = new TeamManager("Ivan", "Ivanov");
        id.registerEmployee(teamManager);
        id.enterToOffice(teamManager);
        System.out.println("Можешь войти " + id.isEmployeeHasAccessToOffice(teamManager));

        Employee accountant = new Accountant("Marya", "Petrovna");
        id.registerEmployee(accountant);
        id.enterToOffice(accountant);
        System.out.println("Можешь войти " + id.isEmployeeHasAccessToOffice(accountant));

        Employee teamManager2 = new TeamManager("Petr", "Surname");
        id.enterToOffice(teamManager2);

        Employee teamManager3 = new TeamManager("Sergei", "Surname");
        id.registerEmployee(teamManager3);
        id.enterToOffice(teamManager3);
        System.out.println(teamManager3.status);


        Employee helpDesk = new HelpDesk("Name", "Surname");
        id.leaveOffice(helpDesk);
        System.out.println(helpDesk.status);


        VIP heplDesk1 = new HelpDesk("Ivan", "Ivanov");
        heplDesk1.isGetAccess();

        HelpDesk[] hepDeskEmployee = new HelpDesk[]{new HelpDesk("Ivan", "Ivanov")};
        Cabinet<HelpDesk> cabinet = new Cabinet<>(hepDeskEmployee);
        cabinet.storeEmployeeInCabinet();


        // получение idCard
        IdCard idCard = new IdCard();
        idCard.getArray();

        // регистрация нескольких сотрудников
        Employee[] employeeSeveral = new Employee[]{teamManager, teamManager2, teamManager3};
        IdCardJournal idCardJournalSeveralEmployee = new IdCardJournal();
        idCardJournalSeveralEmployee.registerWorkers(employeeSeveral);

        // регистация одного сотрудника
        ItDepartment employeeOne = new ItDepartment("Eva","Ivanovna");
        IdCardJournal idCardJournalNewEmployee = new IdCardJournal();
        idCardJournalNewEmployee.registerWorkers(employeeOne);
        idCardJournalNewEmployee.validateInOffice(employeeOne);

    }

}