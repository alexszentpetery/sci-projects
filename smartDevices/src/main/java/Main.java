import sci.homework.oop2.*;

public class Main {

    public static void main(String[] args) {

        SmartDevice[] consumers = new SmartDevice[4];
        consumers[0] = new SmartLamp();
        consumers[1] = new SmartThermostat();
        consumers[2] = new SmartSecurityCamera();
        consumers[3] = new SmartHome() {
        };


        float totalConsumption = 0;
        for (SmartDevice consume : consumers) {
            consume.turnOn();
//            System.out.println(consume.getClass() + " " + consume.getCONSUMPTION() );
            totalConsumption += consume.getCONSUMPTION();
        }
        System.out.println("consum total :" + String.format("%.1f", totalConsumption));

    }

}
