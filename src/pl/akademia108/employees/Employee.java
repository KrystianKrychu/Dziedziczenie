package pl.akademia108.employees;

public class Employee {
    private String name = "";
    private String surname = "";
    private String position = "";
    private float salary = 0;

    public Employee(String name, String surname, String position, float salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public void setSalary(float newSalary) {
        this.salary = newSalary;
    }

    public float getSalary() {
        return this.salary;
    }

}
