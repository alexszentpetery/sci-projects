package sci.java.person;

/**
 * clasa pentru a sorta o lista
 */


public class PersonSorter {


    //metoda bouble sort

    public void boubleSort(Person[] listaPersoane) {
        int tempAge;
        int tempAge2;
        boolean flag;
        flag = true;
        System.out.println("Bouble Sort");


        while (flag) {
            flag = false;

            for (int i = 0; i < listaPersoane.length - 1; i++) {
                Person forSwapPerson = listaPersoane[i];
                tempAge = listaPersoane[i].getAge();
                tempAge2 = listaPersoane[i + 1].getAge();
                if (tempAge > tempAge2) {
                    listaPersoane[i] = listaPersoane[i + 1];
                    listaPersoane[i + 1] = forSwapPerson;
                    flag = true;
                }
            }
        }
        for (int i = 0; i < listaPersoane.length; i++) {


            System.out.printf("" + listaPersoane[i].getFirstName());
            System.out.printf("" + listaPersoane[i].getLastName());
            System.out.println("" + listaPersoane[i].getAge());
        }

    }

    //metoda de sortare prin insertie

    public void insertSort(Person[] listaPersoane) {
        int tempAge;
        int tempAge2;

        System.out.println("Insert Sort");
        for (int i = 0; i < listaPersoane.length; i++) {

            for (int j = i + 1; j < listaPersoane.length; j++) {
                tempAge = listaPersoane[i].getAge();
                tempAge2 = listaPersoane[j].getAge();
                Person forSwapPerson = listaPersoane[i];
                if (tempAge > tempAge2) {
                    listaPersoane[i] = listaPersoane[j];
                    listaPersoane[j] = forSwapPerson;
                }
            }


        }

        for (int i = 0; i < listaPersoane.length; i++) {


            System.out.printf("" + listaPersoane[i].getFirstName());
            System.out.printf("" + listaPersoane[i].getLastName());
            System.out.println("" + listaPersoane[i].getAge());
        }
    }


}
