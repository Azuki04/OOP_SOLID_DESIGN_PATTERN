package design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements IEmployee{
    private List<IEmployee> employeeList = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
        for(IEmployee emp:employeeList) {
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(IEmployee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(IEmployee emp) {
        employeeList.remove(emp);
    }
}
