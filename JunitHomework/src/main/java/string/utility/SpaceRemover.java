package string.utility;

public class SpaceRemover {
    public String before;

    public SpaceRemover() {

    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String removeSpaces() {
        String after;
        after = before.trim().replaceAll("\\s+", "");
        return after;
    }


}

