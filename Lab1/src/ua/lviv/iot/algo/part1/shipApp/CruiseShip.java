package ua.lviv.iot.algo.part1.shipApp;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class CruiseShip extends Ship {


    private int passangersCount;
    private int crewCount;

    public int getTotalPeopleCount() {
        return passangersCount + crewCount;
    }

    public double calculateLoadTime() {
        return 5*passangersCount;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",passangersCount" + ",crewCount";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + passangersCount + "," + crewCount;
    }
}
