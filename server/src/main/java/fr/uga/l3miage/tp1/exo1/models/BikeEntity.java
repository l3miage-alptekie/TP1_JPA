package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;

import java.time.LocalDate;

import javax.persistence.*;
//import javax.persistence.Table;


@Entity
public class BikeEntity {
    @Id
    //l'attribut immatriculation de la classe BikeEntity
    private String immatriculation;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name= "cylinder_number")
    @Enumerated(EnumType.ORDINAL)
    private CylinderNumber cylinderNumber;

    @Column(name = "automatique")
    private Boolean automatic;

    @Column(name = "Shifter")
    private Boolean shifter;

    @Column(name = "shifter_type",length = 8)
    @Enumerated(EnumType.STRING)
    private String shifterType;

    @Column(name= "date")
    private LocalDate circulationDate;



}
