package bdeb.programmation.TP_A18.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    public enum specialites {
        ProgrammeurAnalyst,
        AssuranceQualite,
        TechicienInformatique,
        GestionDeProjet

    }

    public Student(String nom, String prenom, specialites specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
    }

    public Student() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String prenom;
    private specialites specialite;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public specialites getSpecialite() {
        return specialite;
    }

    public void setSpecialite(specialites specialite) {
        this.specialite = specialite;
    }
}
