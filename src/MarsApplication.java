public class MarsApplication {

    public static void main (String[] args) {

            MarsRobot spirit = new MarsRobot();
            spirit.status = "eksploracja";
            spirit.speed = 2;
            spirit.temperature = -60;
            spirit.showAttributes();

        System.out.println("Zwiekszanie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("Zmiana temperatury do -90");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();

        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "kolejna eksploracja";
        opportunity.speed = 1;
        opportunity.temperature = -40;
        opportunity.showAttributes();

        spirit.checkStatus();
        opportunity.checkStatus();


    }
}
