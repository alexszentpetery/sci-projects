public class Person {
    String firstName = "john";
    String lastName = "Doe";
    int age = 20 ;
     String cnp;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void changeName(String firstName,String lastName){
    this.firstName="Alex";
    this.lastName="Eu";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        return cnp != null ? cnp.equals(person.cnp) : person.cnp == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (cnp != null ? cnp.hashCode() : 0);
        return result;
    }
}
