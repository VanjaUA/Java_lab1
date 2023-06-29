package ua.lviv.iot.algo.part1.shipApp;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Ship {
    protected String name;
    protected String captain;
    protected String currentPort;
    protected double maxSpeed;
    protected double currentSpeed;
    protected double maxCapacity;
    protected double currentLoad;

    public abstract int getTotalPeopleCount();

    public abstract double calculateLoadTime();

    public void dock(String port) {
        this.currentPort = port;
    }
    public void load(double weight){
        currentLoad += weight;
        if (currentLoad > maxCapacity){
            currentLoad = maxCapacity;
        }
    }
    public void unload(){
        currentLoad = 0;
    }
    public void setSpeed(double speed){
        if (speed > maxSpeed){
            return;
        }
        currentSpeed = speed;
    }
}

