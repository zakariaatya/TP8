package ma.cigma.tp8.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter


public class CarteFidelio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code;

    public CarteFidelio() {
    }

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public CarteFidelio(String code)
    {
        this.code=code;
    }
}
