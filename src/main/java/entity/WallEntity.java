package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WallEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private StructureEntitiy structure;

    private String squareMeter;

    private String material;

    private String wallType;

    private String height;

    private String thick;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private WindowEntity window;

}
