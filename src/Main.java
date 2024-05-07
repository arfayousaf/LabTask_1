//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Car c=new Car();
    System.out.println("Speed upto: " + c.speedUp(30.));
    System.out.println("slowed downto: " +c.slowDown(50));
    c.brake();
    c.playMusic();
    c.stopMusic();

    }
}