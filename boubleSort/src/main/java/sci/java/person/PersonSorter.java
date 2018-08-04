package sci.java.person;

public class PersonSorter {

    public void personSorter(Person[] sortarePersoane) {
        int tempAge;
        int tempAge2;
        boolean flag;
        flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortarePersoane.length - 1; i++) {
                Person forSwapPerson = sortarePersoane[i];
                tempAge = sortarePersoane[i].getAge();
                tempAge2 = sortarePersoane[i + 1].getAge();
                if (tempAge > tempAge2) {
                    sortarePersoane[i] = sortarePersoane[i + 1];
                    sortarePersoane[i + 1] = forSwapPerson;
                    flag = true;
                }
            }
        }
        for (int i = 0; i < sortarePersoane.length; i++) {

         /* daca nu am citit numele de familie si cel de botez atunci nu facem display
                System.out.printf("" + sortarePersoane[i].getFirstName());
                System.out.printf("" + sortarePersoane[i].getLastName());
         */
            System.out.println("" + sortarePersoane[i].getAge());
        }

    }

}
