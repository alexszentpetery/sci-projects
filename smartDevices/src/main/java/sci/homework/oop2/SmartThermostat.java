package sci.homework.oop2;

/**
 * device smart care mosteneste clasa SmartHome plus functiile specifice unui smart termostat
 */
public class SmartThermostat extends SmartHome implements SmartDevice {
    private int temperature;
    private double CONSUMPTION = 3;

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
        if (status) {
            this.temperature = temperature;
        } else System.out.println("dispozitivul este oprit");
    }
}