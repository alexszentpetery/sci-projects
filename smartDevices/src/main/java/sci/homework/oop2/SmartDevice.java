package sci.homework.oop2;

/**
 * interfata pentru a defini dispozitive de tip Smart
 */
public interface SmartDevice {

    /**
     * porneste dispozitivul
     */
    void turnOn();

    /**
     * opreste dispozitivul
     */

    void turnOff();


    /**
     * returneaza consumul de energie al dispozitivului
     */
    double getCONSUMPTION();
}
