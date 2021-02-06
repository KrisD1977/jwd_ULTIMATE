package pl.derela.wszib.spotkanie3;

public class MarsRobot {
    String status;
    int speed;
    int power;

    private MarsRobot(String status, int speed, int power) {
        this.status = status;
        this.speed = speed;
        this.power = power;
    }

    public static void main(String[] args) {
        MarsRobot mr = new MarsRobot("baza",10,5);
        System.out.println("status: " +mr.status);
    }
}
