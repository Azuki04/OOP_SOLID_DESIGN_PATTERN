package design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee implements IEmployee{
    protected String name;
    protected long empId;
    protected String position;
    protected int salary;
    protected List<Employee> teamMembers;

    public Employee(long empId, String name, String position, int salary) {
        this.empId = empId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void addTeamMember(Employee emp) {
        teamMembers.add(emp);
    }

    public void removeTeamMember(Employee emp) {
        teamMembers.remove(emp);
    }

    public List<Employee> getTeamMembers(){
        return teamMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
