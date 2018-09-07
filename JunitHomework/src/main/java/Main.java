import string.utility.NumbersModifierNotOk;
import string.utility.SpaceRemover;
import string.utility.StringToInt;

public class Main {

    public static void main(String[] args) {
        StringToInt test = new StringToInt();

        test.setBefore("Five six SEVEN eiGHt!! twenty-nine");
        test.setBefore("I want twenty-nine dollars");
        test.modifyStringToInt();



    }
}
