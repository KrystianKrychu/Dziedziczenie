package pl.akademia108.employees;

public class Manager extends Employee {
    private boolean isCEO = false;

    public Manager(String name, String surname, String position, float salary, boolean isCEO) {
        super(name, surname, position, salary);
        this.isCEO = isCEO;
    }

    public void giveRise(Employee employee, float rise) {
        if (this.isCEO) {
            employee.setSalary(employee.getSalary() + rise);
        } else {
            System.out.println("Nie mogę dać podwyżki");
        }
    }
}
