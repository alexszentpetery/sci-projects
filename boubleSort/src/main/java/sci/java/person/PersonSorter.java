package sci.java.person;

/**
 * clasa pentru a sorta o lista
 */


public class PersonSorter implements SortingMethods {

    //metoda bouble sort
    public void boubleSort(SorterByAge[] listaPersoane) {
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < listaPersoane.length - 1; i++) {
                SorterByAge forSwapPerson = listaPersoane[i];
                if (listaPersoane[i].getAge() > listaPersoane[i + 1].getAge()) {
                    listaPersoane[i] = listaPersoane[i + 1];
                    listaPersoane[i + 1] = forSwapPerson;
                    flag = true;
                }
            }
        }
    }

    //metoda de sortare prin insertie
    public void insertSort(SorterByAge[] listaPersoane) {
        for (int i = 0; i < listaPersoane.length; i++) {
            for (int j = i + 1; j < listaPersoane.length; j++) {
                SorterByAge forSwapPerson = listaPersoane[i];

                if (listaPersoane[i].getAge() > listaPersoane[j].getAge()) {
                    listaPersoane[i] = listaPersoane[j];
                    listaPersoane[j] = forSwapPerson;
                }
            }
        }
    }
}
