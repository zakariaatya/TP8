package ma.cigma.tp8.models;



import javax.persistence.*;

@Entity(name="TClients")

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Client()
    {

    }

    @Column
    private String nom;

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
