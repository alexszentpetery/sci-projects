package employee;

import java.util.*;

public class YearsInCompanyComparator implements Comparator<Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getYearsInCompany()- o1.getYearsInCompany();
    }
}
