import employee.ManagementApplication;
import employee.YearsInCompanyComparator;
import employee.Employee;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Employee alex = new Employee("alex", true, "manager", 4);
        Employee ionut = new Employee("ionut", false, "developer", 5);
        Employee ilie = new Employee("ilie", true, "qa", 4);
        Employee maria = new Employee("maria", false, "qa", 2);
        Employee ionel = new Employee("ionel", true, "developer", 12);
        Employee lenuta = new Employee("lenuta", false, "functional analist", 15);
        Employee irina = new Employee("irina", true, "qa", 3);
        Employee mihaita = new Employee("mihaita", true, "manager", 5);

        ManagementApplication test = new ManagementApplication();


        Set set = test.createRolesList().entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("key is: " + entry.getKey() + " & value is: " + entry.getValue());
        }

    }
}