package sci.java.person;

/**
 * clasa pentru a sorta o lista
 */


public class PersonSorter {


    //metoda bouble sort

    public void boubleSort(Person[] listaPersoane) {
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < listaPersoane.length - 1; i++) {
                Person forSwapPerson = listaPersoane[i];

                if (listaPersoane[i].getAge() > listaPersoane[i + 1].getAge()) {
                    listaPersoane[i] = listaPersoane[i + 1];
                    listaPersoane[i + 1] = forSwapPerson;
                    flag = true;
                }
            }
        }
    }

    public void boubleSortDisplay(Person[] listaPersoane) {
        System.out.println("Bouble Sort");
        for (int i = 0; i < listaPersoane.length; i++) {


            System.out.printf("" + listaPersoane[i].getFirstName());
            System.out.printf("" + listaPersoane[i].getLastName());
            System.out.println("" + listaPersoane[i].getAge());

        }
    }


    //metoda de sortare prin insertie

    public void insertSort(Person[] listaPersoane) {


        System.out.println("Insert Sort");
        for (int i = 0; i < listaPersoane.length; i++) {

            for (int j = i + 1; j < listaPersoane.length; j++) {

                Person forSwapPerson = listaPersoane[i];
                if (listaPersoane[i].getAge() > listaPersoane[j].getAge()) {
                    listaPersoane[i] = listaPersoane[j];
                    listaPersoane[j] = forSwapPerson;
                }
            }


        }
    }

    public void insertSortDisplay(Person[] listaPersoane) {


        for (int i = 0; i < listaPersoane.length; i++) {


            System.out.printf("" + listaPersoane[i].getFirstName());
            System.out.printf("" + listaPersoane[i].getLastName());
            System.out.println("" + listaPersoane[i].getAge());
        }
    }
}