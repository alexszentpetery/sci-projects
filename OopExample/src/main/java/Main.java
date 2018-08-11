public class Main {
    public static void main(String[] args) {
        int i =5;
        String name= "John";
        Person mihai;
        Color color;


        Person p = new Person("john","ilie", 25);

      // System.out.println(p.getClass().getSimpleName());
       printDataType(p);
       printDataType(name);
       System.out.println(p.firstName);
        modifyInt(i);
        System.out.println(i);
    }

    public static void modifyInt(int v){
        v=6;
    }

    public static void modifyPerson (Person p2){
        p2=null;
        p2.changeName("sadasd","dsadsa");

    }

    public static void printDataType(Object obj){
       System.out.println(obj.getClass().getSimpleName());

    }



}
