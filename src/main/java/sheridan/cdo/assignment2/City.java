package sheridan.cdo.assignment2;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    private String cityId;
    private String name;
    private long population;
    private boolean isCapital;
    private double area;
    private String country;
}