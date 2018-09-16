package employee;


import java.util.ArrayList;
import java.util.List;

public class Employee {
    public static List<Employee> listAngajati = new ArrayList<>();
    private String name;
    private boolean hasParkingSpace;
    private String role;
    private int yearsInCompany;

    public Employee(String name, boolean hasParkingSpace, String role, int yearsInCompany) {
        this.name = name;
        this.hasParkingSpace = hasParkingSpace;
        this.role = role;
        this.yearsInCompany = yearsInCompany;
        listAngajati.add(this);

    }


    public static void setListAngajati(List<Employee> listAngajati) {
        Employee.listAngajati = listAngajati;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hasParkingSpace=" + hasParkingSpace +
                ", role='" + role + '\'' +
                ", yearsInCompany=" + yearsInCompany +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasParkingSpace() {
        return hasParkingSpace;
    }

    public void setHasParkingSpace(boolean hasParkingSpace) {
        this.hasParkingSpace = hasParkingSpace;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getYearsInCompany() {
        return yearsInCompany;
    }

    public void setYearsInCompany(int yearsInCompany) {
        this.yearsInCompany = yearsInCompany;
    }
    public Employee getObject() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (hasParkingSpace != employee.hasParkingSpace) return false;
        if (yearsInCompany != employee.yearsInCompany) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return role != null ? role.equals(employee.role) : employee.role == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (hasParkingSpace ? 1 : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + yearsInCompany;
        return result;
    }
}
