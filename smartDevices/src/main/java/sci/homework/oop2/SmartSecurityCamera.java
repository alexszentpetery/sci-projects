package sci.homework.oop2;

/**
 * device care mosteneste clasa smartHome si in plus methodele specifice unei security camera
 */
public class SmartSecurityCamera extends SmartHome implements SmartDevice {
    boolean filmingStatus;
    double CONSUMPTION = 5;

    /**
     * calculeaza consumul camerei in functie daca este on sau off (status)
     * @return
     */
    @Override
    public double getCONSUMPTION() {

        return status ? super.DEFAULTCONSUMPTION + CONSUMPTION : super.DEFAULTCONSUMPTION;
    }

    /**
     * returneaza o variabila de tip boolean daca camera filmeaza/record sau nu
     * @return
     */
    public boolean isFilmingStatus() {
        return filmingStatus;
    }

    /**
     * porneste camera modul record daca camera este on
     * @param filmingStatus
     */
    public void setFilmingStatus(boolean filmingStatus) {
        if (status) {
            this.filmingStatus = filmingStatus;
        } else System.out.println("dispozitivul este oprit");
    }

}