package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.typeAccount;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class NetflixAccountEntity {
    @Id
    private BigInteger id;

    private int nb_devices;

    @Enumerated(EnumType.STRING)
    private typeAccount typeAccount;

    @OneToOne
    private NetflixUserEntity UserEntity;

}