public class Main {
    private static Employee getChainOfEmployees() {
        Employee programmer = new Programmer(Employee.PROGRAMER);
        Employee leadProgrammer = new LeadProgrammer(Employee.LEAD_PROGRAMER);
        Employee manager = new Manager(Employee.MANAGER);

        programmer.setNextEmployee(leadProgrammer);
        leadProgrammer.setNextEmployee(manager);

        return programmer;
    }

    public static void main(String[] args) {
        Employee employeeChain = getChainOfEmployees();

        employeeChain.doWork(Employee.PROGRAMER, "This is basic programming work.");
        employeeChain.doWork(Employee.LEAD_PROGRAMER, "This is design and architecture");
                employeeChain.doWork(Employee.MANAGER, "This is the work for a manager.");
    }
}