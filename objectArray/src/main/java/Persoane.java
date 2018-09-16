public class Persoane {
    String name;
    String type;
    public static final String porecla = "Aaaa";

    public Persoane() {
        System.out.println("AAAA");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Persoane(String name , String type) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persoane persoane = (Persoane) o;

        return name.equals(persoane.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}
