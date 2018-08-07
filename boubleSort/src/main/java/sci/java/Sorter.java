package sci.java;

/**
 * clasa pentru a sorta o lista
 */


public class Sorter implements SortingMethods {

    //metoda bouble sort
    public void boubleSort(SorterByAge[] lista) {
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < lista.length - 1; i++) {
                SorterByAge forSwapPerson = lista[i];
                if (lista[i].getAge() > lista[i + 1].getAge()) {
                    lista[i] = lista[i + 1];
                    lista[i + 1] = forSwapPerson;
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
    // doar pentru a vedea cum functioneaza interfata am introdus 2 metode nule

    public void insereazaPrinAduagare() {

    }

    public void fastSort() {

    }


}
