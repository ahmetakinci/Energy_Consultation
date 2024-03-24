package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WindowEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @JoinColumn
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private WallEntity wall;

    private String height;

    private String thick;

    private String material;

    private String glass;
}
