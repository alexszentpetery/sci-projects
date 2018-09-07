package string.utility;

public class StringToInt {
    private String before;

    public StringToInt() {
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public void modifyStringToInt() {

        String[] splitAfter = before.split("\\s+");
        for (String test : splitAfter) {
            System.out.println(test);
            test = test.replaceAll("(?i)one", "1").replaceAll("(?i)two", "2").replaceAll("(?i)three", "3").replaceAll("(?i)four", "4")
                    .replaceAll("(?i)five", "5").replaceAll("(?i)six", "6").replaceAll("(?i)seven", "7").replaceAll("(?i)eight", "8")
                    .replaceAll("(?i)nine", "9");
            System.out.println(test);
        }

    }
}