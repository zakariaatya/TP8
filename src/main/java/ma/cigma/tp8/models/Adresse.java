package ma.cigma.tp8.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "Adresse")
@Getter
@Setter


public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String avenue;
    private String ville;
    private String pays;

    public Adresse()
    {

    }
    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "adresse")
    private Client client;

    public Adresse(long id,String avenue,String ville,String pays)
    {
        this.id=id;
        this.avenue=avenue;
        this.ville=ville;
        this.pays=pays;
    }
}
