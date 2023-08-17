package design_pattern.composite;


public class MainComposite {

    public static void startComposite(){
        System.out.print("\n\n Composite pattern:\n");
        Developer dev1 = new Developer(100, "Fabian", "Pro Developer", 100000);
        Developer dev2 = new Developer(101, "Rolf", "Junior Developer", 50000);
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager(200, "Max", "SEO Manager", 1000000);
        Manager man2 = new Manager(201, "Felix", "Finance Manager", 10000000);

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();


        System.out.println("second example:");
        CEO ceo = new CEO(300, "Lars", "CEO", 100000000);
        ProjectOwner projectOwnerSfs = new ProjectOwner(300, "Project Owner SFS", "Project Owner", 100000000);
        projectOwnerSfs.addTeamMember(dev2);
        ProjectOwner projectOwnerCoop = new ProjectOwner(300, "Project Owner Coop", "Project Owner", 100000000);
        //Add team members to project owners
        projectOwnerCoop.addTeamMember(dev1);
        projectOwnerCoop.addTeamMember(man2);
        projectOwnerSfs.addTeamMember(man1);
        projectOwnerSfs.addTeamMember(dev2);
        //Add project owners to CEO
        ceo.addTeamMember(projectOwnerSfs);
        ceo.addTeamMember(projectOwnerCoop);

        /*
              CEO
           /       \
          /         \
 ProjectOwnerSfs ProjectOwnerCoop
        / \           / \
     dev2 man1     dev1 man2

         */
        System.out.println("CEO:");
        for (Employee projectOwner :ceo.getTeamMembers()) {

            System.out.println(projectOwner.getName()+":");

            for (Employee employee : projectOwner.getTeamMembers()) {
                System.out.println(employee.getName());
            }
        }


    }
}
