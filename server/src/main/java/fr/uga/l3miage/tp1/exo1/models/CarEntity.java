package fr.uga.l3miage.tp1.exo1.models;
import fr.uga.l3miage.tp1.exo1.enums.PowerType;
import fr.uga.l3miage.tp1.exo1.enums.WeightRange;

import java.time.LocalDate;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Table(name = "car_porsche")
public class CarEntity {
    @Id
    //l'attribut immatriculation de la classe CarEntity correspond à la colonne immat en BD:
    @Column(name = "shifter_type",length =8 )
    private String immatriculation;

    @Column(name = "cylinder_capacity")
    private Double cylinderCapacity;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "torque")
    private Integer torque;

    @Column(name ="power")
    private Integer power;

    @Column(name = "power_type")
    @Enumerated(EnumType.ORDINAL)
    private PowerType powerType;

    @Column(name= "weight_unity")
    @Enumerated(EnumType.STRING)
    private WeightRange weightUnity;

    @Column(name= "date")
    private LocalDate circulationDate;

    

}
