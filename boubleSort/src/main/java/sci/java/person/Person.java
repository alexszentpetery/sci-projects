package sci.java.person;

import javax.swing.JOptionPane;

/**
 * Clasa pentru a citi persoane .
 */

public class Person {
    public String firstName;
    public String lastName;
    public int age;


    public Person() {

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age ;

    }


}