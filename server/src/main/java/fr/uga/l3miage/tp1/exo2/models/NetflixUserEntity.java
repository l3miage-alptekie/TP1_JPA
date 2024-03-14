package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.math.BigInteger;
import fr.uga.l3miage.tp1.exo2.enums.Sex;

@Entity
public class NetflixUserEntity {

    @Id
    private BigInteger id;

    private String uuid;

    private String firstname;

    private String lastname;

    @Column(length=2)
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @OneToOne(mappedBy = "UserEntity")
    private NetflixAccountEntity netflix_account;

}