package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Entity
public class ProductEntity {

    @Id
    @Column(length=15)
    private String barCodeNumber;

    private String name;

    private boolean consumable;

    @ManyToOne
    private BrandMiageEntity brandMiage;

}
