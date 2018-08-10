import sci.homework.oop2.*;

public class Main {

    public static void main(String[] args) {

        // merge la fel de bine cu SmartHome[] consumers = new SmartHome[][4];
        SmartDevice[] consumers = new SmartDevice[4];
        consumers[0] = new SmartSecurityCamera();
        consumers[1] = new SmartThermostat();
        consumers[2] = new SmartLamp();
        consumers[3] = new SmartHome() {
        };


        // vreau sa modific brightness la consumers[0] astfel incat sa influenteze consumul
        for (SmartDevice consume : consumers) {
            if (consume instanceof SmartLamp) {
                SmartLamp lampaMea = (SmartLamp) consume;
                lampaMea.setBrightValue(100);
            }
        }


        float totalConsumption = 0;
        for (SmartDevice consume : consumers) {
            consume.turnOn();
            System.out.println(consume.getClass() + " " + consume.getCONSUMPTION());
            totalConsumption += consume.getCONSUMPTION();
        }
        System.out.println("consum total :" + String.format("%.1f", totalConsumption));

    }

}
