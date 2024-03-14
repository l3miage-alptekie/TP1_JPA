package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

@Entity
public class AssociationEntity {

    @Id
    private String name;

    @Column(nullable = false)
    private String presidentName;

    @Column(nullable = false)
    private String treasurerName;

    private String secretaryName;

    @Enumerated(EnumType.STRING)
    private AssociationType associationType;

    @ManyToOne
    private FederationEntity federation;
}
