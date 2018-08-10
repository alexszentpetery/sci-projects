package sci.homework.oop2;

/**
 * device smart care mosteneste clasa SmartHome
 */
public class SmartThermostat extends SmartHome implements SmartDevice {
    int temperature;
    double CONSUMPTION = 3;

    /**
     * metoda pentru calculul consumului , daca este in standby mosteneste consumul default (de la clasa parinte)
     * daca e on are un consum specific
     *
     * @return
     */
    @Override
    public double getCONSUMPTION() {
        return status ? super.DEFAULTCONSUMPTION + CONSUMPTION : super.DEFAULTCONSUMPTION;
    }

    /**
     * metoda pentru a returna temperatura setata
     *
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * metoda pentru a seta temperatura obiectului
     *
     * @returneaza temperature
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}