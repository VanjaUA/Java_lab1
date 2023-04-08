package ua.lviv.iot.algo.part1.shipApp;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CargoShip extends Ship {

    private double massOfLoadInTons;
    private String currentLoad;

    public int getTotalPeopleCount() {
        return 0;
    }

    public double calculateLoadTime() {
        return massOfLoadInTons/20;
    }
}
