package ma.cigma.tp8.models;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity(name="TClients")
@Getter
@Setter
@ToString

public class Client
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Client(String nom)
    {
        this.nom=nom;
    }

    public Client(long id,String nom) {
        this.id = id;
        this.nom=nom;
    }

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private List<Facture> factures;

    public Client()
    {

    }
    @OneToOne
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;

    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private CarteFidelio carteFidelio;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name = "my_join_table_client_promotion",joinColumns = @JoinColumn(
            name = "client_fk",
            referencedColumnName = "id"
        ),
            inverseJoinColumns = @JoinColumn(
                    name = "promotion_fk",
                    referencedColumnName = "id"
            )
    )
    private List<Promotion>promotions;
    @Column
    private String nom;



}
