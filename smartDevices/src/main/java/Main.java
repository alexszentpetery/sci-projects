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
                lampaMea.turnOn();
                lampaMea.setBrightValue(100);
                lampaMea.setColor("red");
            }
        }

        // set pot face operatiuni pe thermostat
        for (SmartDevice consume : consumers) {
            if (consume instanceof SmartThermostat) {
                SmartThermostat termostatulMeu = (SmartThermostat) consume;
                termostatulMeu.turnOn();
                termostatulMeu.setTemperature(30);
            }
        }

        // set pot face operatiuni pe camera de securitate

        for (SmartDevice consume : consumers) {
            if (consume instanceof SmartSecurityCamera) {
                SmartSecurityCamera securityCamera = (SmartSecurityCamera) consume;
                securityCamera.turnOn();
                securityCamera.setFilmingStatus(true);
            }
        }

        // se calculeaza consumul in functie stare si alti parametri (brightness)
        float totalConsumption = 0;
        for (SmartDevice consume : consumers) {
            consume.turnOn();
            if (consume instanceof SmartLamp) {
                SmartLamp lampaMea = (SmartLamp) consume;
                lampaMea.setBrightValue(50);
            }
            System.out.println(consume.getClass() + " " + consume.getCONSUMPTION());
            totalConsumption += consume.getCONSUMPTION();
        }
        System.out.println("consum total :" + String.format("%.1f", totalConsumption));

    }

}
