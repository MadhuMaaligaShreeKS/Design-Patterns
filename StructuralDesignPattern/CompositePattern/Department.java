package StructuralDesignPattern.CompositePattern;
import java.util.ArrayList;
import java.util.List;
//composite
class Department implements Company{
    private String name;
    private List<Company> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Company employee) {
        employees.add(employee);
    }

    public void removeEmployee(Company employee) {
        employees.remove(employee);
    }

    @Override
    public void displayInfo() {
        System.out.println("Department: " + name);
        for (Company employee : employees) {
            employee.displayInfo();
        }
    }
}