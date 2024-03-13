package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.typeAccount;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigInteger;

public class NetflixAccountEntity {
    @Id
    private BigInteger id;

    private int nb_devices;

    @Enumerated(EnumType.STRING)
    private typeAccount typeAccount;

    @OneToOne(mappedBy = "netflix_account")
    private NetflixUserEntity uuid_user;

}
