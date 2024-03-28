package StructuralDesignPattern.CompositePattern;

public class Main{
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", "Manager");
        Employee emp2 = new Employee("Jane Smith", "Engineer");

        Department hrDepartment = new Department("HR");
        hrDepartment.addEmployee(emp1);

        Department engineeringDepartment = new Department("Engineering");
        engineeringDepartment.addEmployee(emp2);

        Department company = new Department("Company");
        company.addEmployee(hrDepartment);
        company.addEmployee(engineeringDepartment);

        // Display company organization structure
        company.displayInfo();
    }
}
