package sci.homework.oop2;

/**
 * clasa abastracta care defineste o casa Smart
 * by defaul toate obiecetele din clasa abstracta SmartHome au un consum de 0.1 pentru modul standby unde asteapta comezi
 */
public abstract class SmartHome implements SmartDevice {
    double DEFAULTCONSUMPTION = 0.1;
    boolean status;

    /**
     * porneste dispozitivul
     */
    public void turnOn() {
        this.status = true;
    }

    /**
     * opreste dispozitivul
     */
    public void turnOff() {
        this.status = false;
    }

    /**
     * returneaza consumul de energie al dispozitivului
     */
    public double getCONSUMPTION() {
        return status ? DEFAULTCONSUMPTION + 5 : DEFAULTCONSUMPTION;
    }

    /**
     * returneaza statusul dispozitivului
     */
    public boolean status() {
        return status;
    }

    
}
