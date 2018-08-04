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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }


}