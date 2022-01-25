package ma.cigma.tp8.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data

@EqualsAndHashCode(callSuper = false)
public class ClientNormal extends Client{
    private int importanceLevel;

    public ClientNormal(String nom,int importanceLevel)
    {
        super(nom);
        this.importanceLevel=importanceLevel;
    }

    public ClientNormal()
    {

    }
}
