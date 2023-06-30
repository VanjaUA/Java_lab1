package ua.lviv.iot.algo.part1.shipApp;

import lombok.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class ShipWriter {
    private String filePath;

    public void writeToFile(List<Ship> ships) {
        try (FileWriter writer = new FileWriter(filePath)) {

            for (Ship ship : ships) {
                String headers = ship.getHeaders();
                writer.write(headers + "\n");

                String shipData = ship.toCSV();
                writer.write(shipData + "\n");
            }

        } catch (IOException e) {
            System.out.println("ERROR! " + e.getMessage());
        }
    }
}
