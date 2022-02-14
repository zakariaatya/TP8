package ma.cigma.tp8.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data


public class Company {
    @EmbeddedId
    private CompanyId id;

    private String nom;
    private String adresse;
    private String phone;

    @Embedded
    @AttributeOverride(name = "phone",column = @Column(name = "PHONE_PERSON"))
    private ContactPerson contactPerson;
}
