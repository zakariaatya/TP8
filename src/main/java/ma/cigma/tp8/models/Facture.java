package ma.cigma.tp8.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name="TFactures")
@Getter
@Setter
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    Date date;
    double amount;

    public Facture()
    {

    }

    public Facture(long id,Date date,double amount)
    {
        this.id=id;
        this.date=date;
        this.amount=amount;
    }

    public Facture(Date date) {
        this.date = date;
    }

    public Facture(double amount) {
        this.amount = amount;
    }



    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
