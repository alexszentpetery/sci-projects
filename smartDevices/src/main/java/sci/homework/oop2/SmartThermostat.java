package sci.homework.oop2;

public class SmartThermostat extends SmartHome implements SmartDevice {
    int temperature;
    double CONSUMPTION = 3;

    @Override
    public double getCONSUMPTION() {
        return status ? super.CONSUMPTION + CONSUMPTION : super.CONSUMPTION;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}