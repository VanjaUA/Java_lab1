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

    public abstract int getTotalPeopleCount();

    public abstract double calculateLoadTime();
}

