package ma.cigma.tp8.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data

@EqualsAndHashCode(callSuper = false)
public class ClientVip extends Client{
    private String preferences;

    public ClientVip(String nom,String preferences)
    {
        super(nom);
        this.preferences=preferences;
    }

    public ClientVip()
    {

    }
}
