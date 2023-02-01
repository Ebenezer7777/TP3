package INFO4.TP3.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


import java.util.Date;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private Date creation;
    private String nomAuteur;
    private String content;

    public Address(Long id, Date creation, String content) {
        this.id = id;
        this.creation = creation;
        this.content = content;
    }

    public Address(Long id, Date creation, String content, String nomAuteur) {
        this.id = id;
        this.creation = creation;
        this.content = content;
        this.nomAuteur = nomAuteur;
    }

    public Address(Date creation, String content) {
        this.creation = creation;
        this.content = content;
    }


    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getCreation() {
        return creation;
    }
    public void setCreation(Date creation) {
        this.creation = creation;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}


