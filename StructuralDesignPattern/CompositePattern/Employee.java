package StructuralDesignPattern.CompositePattern;
//leaf
class Employee implements Company {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee: " + name + ", Position: " + position);
    }
}
