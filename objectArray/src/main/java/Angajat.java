public class Angajat extends Persoane{
    String name;
    String type = "Angajat";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
