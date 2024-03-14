package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FederationEntity {
    @Id
    private String name;

    private boolean isFageMembership;

    @OneToMany(mappedBy = "federation")
    private Set<AssociationEntity> associations;
}
