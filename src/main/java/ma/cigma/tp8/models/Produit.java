package ma.cigma.tp8.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private double price;

    public Produit()
    {

    }

    @ManyToMany
    @JoinColumn(name = "facture_id")
    private Facture facture;

    public Produit(long id,String nom,double price)
    {
        this.id=id;
        this.nom=nom;
        this.price=price;
    }

    public Produit(String nom)
    {
        this.nom=nom;
    }

    public String getNom(){ return nom; }
    public double getPrice(double price){ return this.price; }

    public void getNom(Object nom) {
    }
}
