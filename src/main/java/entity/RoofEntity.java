package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RoofEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String squareMeter;

    private String material;

    private String roofYype;

    private boolean isFlat;

    @OneToOne
    private StructureEntitiy structure;

}