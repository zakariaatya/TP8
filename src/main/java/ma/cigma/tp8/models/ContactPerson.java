package ma.cigma.tp8.models;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class ContactPerson {

    private String contactFirstName;
    private String contactLastName;
    private String contactPhone;
}
