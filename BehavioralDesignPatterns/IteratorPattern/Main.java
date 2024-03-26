package BehavioralDesignPatterns.IteratorPattern;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.addEmployee(new Employee("Alice"));
        company.addEmployee(new Employee("Bob"));
        company.addEmployee(new Employee("Charlie"));

        // Get an iterator for the company's employees
        Iterator<Employee> iterator = company.createIterator();

        // Iterate over the employees
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println("Employee: " + employee.getName());
        }
    }
}