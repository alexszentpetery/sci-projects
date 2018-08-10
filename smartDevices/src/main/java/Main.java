import sci.homework.oop2.*;

public class Main {

    public static void main(String[] args) {

        SmartDevice[] consumers = new SmartHome[4];
        consumers[0] = new SmartLamp();
        consumers[1] = new SmartThermostat();
        consumers[2] = new SmartSecurityCamera();
        consumers[3] = new SmartHome() {
        };

        //TO BE DONE

//        if (consumers[0] instanceof SmartLamp){
//
//        }

        float totalConsumption = 0;
        for (SmartDevice consume : consumers) {
            consume.turnOff();
           System.out.println(consume.getClass() + " " + consume.getCONSUMPTION() );
            totalConsumption += consume.getCONSUMPTION();
        }
        System.out.println("consum total :" + String.format("%.1f", totalConsumption));

    }

}
