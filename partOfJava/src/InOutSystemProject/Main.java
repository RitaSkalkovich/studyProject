package InOutSystemProject;



import InOutSystemProject.Cabinet.CabinetForHelpDesk;
import InOutSystemProject.Cabinet.CabinetForItDepartment;
import InOutSystemProject.Cabinet.CabinetKitchen;
import InOutSystemProject.Employee.Employee;
import InOutSystemProject.Employee.ItDepartment;
import InOutSystemProject.Employee.Managers.*;

import InOutSystemProject.Employee.HelpDesk;
import InOutSystemProject.Record.IdCardJournal;
import InOutSystemProject.Record.NumberValidatorForEmployee;

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

        Employee teamManager2 = new TeamManager("Name", "Surname");
        id.enterToOffice(teamManager2);

        Employee teamManager3 = new TeamManager("Name", "Surname");
        id.registerEmployee(teamManager3);
        id.enterToOffice(teamManager3);
        System.out.println(teamManager3.status);


        Employee helpDesk = new HelpDesk("Name", "Surname");
        id.leaveOffice(helpDesk);
        System.out.println(helpDesk.status);


        VIP heplDesk1 = new HelpDesk("Ivan", "Ivanov");
        heplDesk1.isGetAccess();


        HelpDesk[] hepDeskEmployee = new HelpDesk[]{new HelpDesk("Ivan", "Ivanov")};
        CabinetForHelpDesk<HelpDesk> helpDeskEmployee1 = new CabinetForHelpDesk<>(hepDeskEmployee);
        helpDeskEmployee1.move();

        ItDepartment[] itDepartments = new ItDepartment[]{new ItDepartment("Petr", "Petrov")};
        CabinetForItDepartment<ItDepartment> itDepartment = new CabinetForItDepartment<>(itDepartments);
        itDepartment.move();


        try {
            NumberValidatorForEmployee.validate(14);

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}