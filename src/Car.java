import java.sql.SQLOutput;

public class Car implements Vehicle{
    int speed=100;
    @Override
    public int speedUp(int increment) {
        speed=speed+increment;
        return speed;
    }

    @Override
    public int slowDown(int decrement) {
      speed=speed-decrement;
        return speed;
    }

    @Override
    public void brake() {
     System.out.println("car stopedddd...");
    }

    @Override
    public void playMusic() {
        System.out.println("music on!!!");
    }

    @Override
    public void stopMusic() {
        System.out.println("music turned off...");
    }
}
