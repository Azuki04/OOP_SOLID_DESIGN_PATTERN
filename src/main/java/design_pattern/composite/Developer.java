package design_pattern.composite;

public class Developer extends Employee{

    public Developer(long empId, String name, String position, int salary) {
        super(empId, name, position, salary);
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position + " " + salary);
    }
}
