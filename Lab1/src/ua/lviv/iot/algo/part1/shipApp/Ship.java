package ua.lviv.iot.algo.part1.shipApp;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ship {
    private static double globalID = 10.4;
    private double id;
    private static Ship instance = new Ship();
    private String name;
    private String captain;
    private String currentPort;
    private  double maxSpeed;
    private  double maxCapacity;
    private double currentLoad;

    /*public Ship()
    {
        globalID++;
        this.id = globalID;
    }*/

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
        this.maxSpeed = speed;
    }

    public void load(double weight)
    {
        if (currentLoad + weight <= maxCapacity) {
            this.currentLoad = weight;
        }
    }

    public void unload(double weight)
    {
        if (weight != 0) {
            this.currentLoad = 0;
        }
    }

    public static void main(String[] args) {
        Ship[] ships = new Ship[4];
        ships[0] = new Ship();
        ships[1] = new Ship(10.4d,"Hood","Jack","Dunkerk",20d,300d,10d);
        ships[2] = Ship.getInstance();
        ships[3] = Ship.getInstance();

        for (int i = 0; i < ships.length; i++) {
            System.out.println(ships[i].hashCode());
        }
    }
}