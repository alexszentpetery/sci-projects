package string.utility;

public class NumbersModifierNotOk {
    public String before;

    public NumbersModifierNotOk() {

    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String modifyNumbers() {
        String after;

        after = before.trim().replaceAll("(?i)one", " 1").replaceAll("(?i)two", "2").replaceAll("(?i)three", "3").replaceAll("(?i)four", "4")
                .replaceAll("(?i)five", "5").replaceAll("(?i)six", "6").replaceAll("(?i)seven", "7").replaceAll("(?i)eight", "8")
                .replaceAll("(?i)nine", "9");
        return after;

//        after = before.trim().replaceAll("(?i)one", " 1").replaceAll("(?i) two", " 2").replaceAll("(?i) three", " 3").replaceAll("(?i) four", " 4")
//                .replaceAll("(?i) five", " 5").replaceAll("(?i) six", " 6").replaceAll("(?i) seven", " 7").replaceAll("(?i) eight", " 8")
//                .replaceAll("(?i) nine", " 9");
//        return after;

    }


}
