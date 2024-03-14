package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
public class User {
    @Id
    private Long idUser;

    private boolean SSO;

    private OffsetDateTime lastConnexion;

    @OneToOne(mappedBy = "user")
    private Session session;

}
