package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StructureEntitiy {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String cost;

    private String Tolerance_Period;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private RoofEntity roof;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private WallEntity wall;


}
