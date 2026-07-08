package Applications.EmployeeManagement;

public class Salarie {
    public int matricule;
    public String nom;
    public String prenom;
    public double salaire;

    public Departement departement; // ManyToOne : un salarié appartient à un département

    public Salarie(int matricule, String nom, String prenom, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public String toString() {
        return "Salarie{matricule=" + matricule +
                ", nom=" + nom +
                ", prenom=" + prenom +
                ", salaire=" + salaire + "}";
    }
}
