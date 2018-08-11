package sci.homework.oop2;

/**
 * mosteneste clasa SmartHome plus metodele specifici unei lampi smart
 *
 */
public class SmartLamp extends SmartHome implements SmartDevice {
    String color;
    double consumption;
    private double brightValue;

    /**
     * calculeaza consumul de energie in functie de status (on sau off) si birghtness
     * @return
     */
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

    /**
     * retunreaza valoarea lui brightness
     * @return
     */
    public double getBrightValue() {
        return brightValue;
    }

    /**
     * seteaza brightnessul , minim value 0 , maximum 100
     * @param brightness
     */
    public void setBrightValue(int brightness) {
        if (status) {
            if (brightness < 0) {
                this.brightValue = 0;
            } else if (brightness > 100) {
                this.brightValue = 100;
            } else {
                this.brightValue = brightness;
            }
        } else System.out.println("dispozitivul este oprit");

    }

    /**
     * returneaza culoarea lampi
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * seteaza culoarea lampii
     * @param color
     */
    public void setColor(String color) {
        if (status) {
            this.color = color;
        } else System.out.println("dispozitivul este oprit");

    }

}

