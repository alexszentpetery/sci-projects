public class Somer extends Persoane {
    String name;
    String type = "Somer";

    public Somer() {
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Somer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
