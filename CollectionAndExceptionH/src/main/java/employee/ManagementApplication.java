package employee;


import java.util.*;
import java.util.stream.Collectors;

public class ManagementApplication {

    public ManagementApplication() {

    }

    public List<Employee> CreereListaAngajatiCuParcare() {
        List<Employee> angajatiCuParcare = new ArrayList<Employee>();
        Collections.sort(Employee.listAngajati, new YearsInCompanyComparator());
        for (Employee angajat : Employee.listAngajati) {
            if (angajat.isHasParkingSpace()) {
                angajatiCuParcare.add(angajat);
            }
        }
        return angajatiCuParcare;
    }

    public Map<String, List<Employee>> createRolesList() {

        Set<String> employeeRoles = new HashSet<String>();
        for (Employee angajat : Employee.listAngajati) {
            employeeRoles.add(angajat.getRole());
        }

        Map<String, List<Employee>> treeMap = new HashMap<>();

        for (Employee angajat : Employee.listAngajati) {
            if (treeMap.containsKey(angajat.getRole())) {
                treeMap.get(angajat.getRole()).add(angajat);
            } else {
                List<Employee> angajati = new ArrayList<Employee>();
                angajati.add(angajat);
                treeMap.put(angajat.getRole(), angajati);
            }
        }
    return  treeMap;
    }

}