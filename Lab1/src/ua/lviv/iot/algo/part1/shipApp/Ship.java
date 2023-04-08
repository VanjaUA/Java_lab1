package ua.lviv.iot.algo.part1.shipApp;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ship {
    private static double globalID = 10.4;
    private double id;
    private static Ship instance = new Ship();
    private String name;
    private String captain;
    private String currentPort;
    private  double maxSpeed;
    private  double currentSpeed;
    private  double maxCapacity;
    private double currentLoad;

    public static Ship getInstance()
    {
        return instance;
    }

    public void dock(String port)
    {
        this.currentPort = port;
    }

    public void setSpeed(double speed)
    {
        if (speed <= maxSpeed)
        {
            this.currentSpeed = speed;
        }
    }

    public void load(double weight)
    {
        if (currentLoad + weight <= maxCapacity) {
            this.currentLoad = weight;
        }else{
            this.currentLoad = maxCapacity;
        }
    }

    public void unload(double weight)
    {
        if (weight != 0) {
            this.currentLoad = 0;
        }
    }

    public static void main(String[] args) {
        Ship[] ships = { new Ship(),
                new Ship(10.4d,"Hood","Jack","Dunkerk",20d,10d,300d,10d),
                Ship.getInstance(),
                Ship.getInstance()};

        for (Ship ship : ships) {
            System.out.println(ship);
        }
    }
}