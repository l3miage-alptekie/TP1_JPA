package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.BrandType;
import javax.persistence.*;
import java.util.Set;

@Entity
public class BrandMiageEntity {

    @Id
    private String companyName;

    @Column(length=11)
    private String siretNumber;

    @Enumerated(EnumType.STRING)
    private BrandType type;

    @OneToMany
    private Set<ProductEntity> products;

}
