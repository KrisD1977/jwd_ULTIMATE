package pl.derela.wszib.spotkanie1;

import java.util.Objects;

public class MarsRobot implements Robot {

    String status;
    int speed;
    float temperature;
    String name;

    @Override
    public void checkStatus() {
        if (status == "eksploracja") {
            this.speed = 10;
        }
    }

    public void checkTemperature() {
        if (temperature < -80) {
            this.status = "powrót do bazy";
            this.speed = 5;
        }

    }

    void showAttributes() {
        System.out.println("Nazwa: " + this.name);
        System.out.println("Status: " + this.status);
        System.out.println("Prędkość: " + this.speed);
        System.out.println("Temperatura: " + this.temperature);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarsRobot marsRobot = (MarsRobot) o;
        return speed == marsRobot.speed &&
                Float.compare(marsRobot.temperature, temperature) == 0 &&
                Objects.equals(status, marsRobot.status) && Objects.equals(name, marsRobot.name);
    }


}
