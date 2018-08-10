package sci.homework.oop2;

public class SmartSecurityCamera extends SmartHome implements SmartDevice {
   boolean filmingStatus;
    double CONSUMPTION =5 ;

    @Override
    public double getCONSUMPTION() {

        return status ? super.DEFAULTCONSUMPTION + CONSUMPTION : super.DEFAULTCONSUMPTION;
    }

    public boolean isFilmingStatus() {
        return filmingStatus;
    }

    public void setFilmingStatus(boolean filmingStatus) {
        this.filmingStatus = filmingStatus;
    }
}