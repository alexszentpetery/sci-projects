package sci.homework.oop2;

public class SmartLamp extends SmartHome implements SmartDevice {
    String color;
    double consumption;
    private double brightValue;

    @Override
    public double getCONSUMPTION() {


        if (status && brightValue != 0) {
            this.consumption = (super.DEFAULTCONSUMPTION + 2) + (brightValue / 100);
        } else if (status) {
            this.consumption = super.DEFAULTCONSUMPTION + 2;
        } else if (status != true) {
            this.consumption = super.DEFAULTCONSUMPTION;
        }

        return consumption;
    }

    public double getBrightValue() {
        return brightValue;
    }

    public void setBrightValue(int brightness) {
        this.brightValue = brightness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

