import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Persoane persoane = new Persoane();
        List<Persoane> persoaneList= new ArrayList<Persoane>();



        Persoane somer = new Somer();
        persoaneList.add(somer);
        somer.setName("S- Ionel");
       // persoane[0] = somer;

        Persoane angajat = new Angajat();
        persoaneList.add(angajat);
        angajat.setName("A- Alex");
     //   persoane[1] = angajat;

        Persoane student = new Student();
        persoaneList.add(student);
        student.setName("St- Ionel");


     //   persoane[2] = student;
    Persoane.po
   //     for (int i = 0; i < persoane.length; i++) {
      //      System.out.println(persoane[i]);
    //    }





    for (Persoane obiect : persoaneList){
        System.out.println(obiect.getName());
    }
}
}
