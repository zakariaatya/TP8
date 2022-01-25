package ma.cigma.tp8.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name="TFactures")
@Getter
@Setter
@ToString
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double amount;
    private String description;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


    public Facture() {
    }
    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name = "table_facture_produit",joinColumns = @JoinColumn(
            name = "facture_fk",
            referencedColumnName = "id"
    ),
            inverseJoinColumns = @JoinColumn(
                    name="produit_fk",
                    referencedColumnName = "id"
            )
    )
    private List<Produit> produit;

    public Facture(double v, String facture1)
    {

    }

    public double getAmount()
    {
        return amount;
    }

    public Facture(long id,double amount,String description)
    {
        this.id=id;
        this.amount=amount;
        this.description=description;
    }


}
