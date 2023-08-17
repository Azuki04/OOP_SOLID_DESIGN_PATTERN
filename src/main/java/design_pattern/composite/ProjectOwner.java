package design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class ProjectOwner extends Employee{


    public ProjectOwner(long empId, String name, String position, int salary) {
        super(empId, name, position, salary);
        teamMembers = new ArrayList<>();
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position + " " + salary);
    }



}
