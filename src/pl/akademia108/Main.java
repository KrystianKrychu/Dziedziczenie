package pl.akademia108;
import pl.akademia108.employees.Employee;
import pl.akademia108.employees.Manager;
public class Main {

    public static void main(String[] args) {
        Employee programmer = new Employee("Józef", "Dubas", "Programista", (float) 9980.90);

        Manager ceo = new Manager("Janek", "Dobrowolski", "CEO", 15000, true);

        ceo.giveRise(programmer, (float) 500.46);

        System.out.println("Wypłata programisty wynosi: " + programmer.getSalary());

    }
}
