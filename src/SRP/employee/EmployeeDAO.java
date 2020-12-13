package SRP.employee;

public class EmployeeDAO {

    public void saveEmployee(Employee employee) {
        System.out.println(employee + " saved");
    }

    public void deleteEmployee(Employee employee) {
        System.out.println(employee + " deleted");
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
