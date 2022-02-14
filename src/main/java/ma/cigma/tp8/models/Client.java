package ma.cigma.tp8.models;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name="TClients")
@Getter
@Setter
@Data

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Client
{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    public Client(String nom)
    {
        this.nom=nom;
    }

    public Client(long id,String nom) {
        this.id = id;
        this.nom=nom;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
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
