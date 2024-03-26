package BehavioralDesignPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Company {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Create an iterator for the list of employees
    public Iterator<Employee> createIterator() {
        return employees.iterator();
    }
}

