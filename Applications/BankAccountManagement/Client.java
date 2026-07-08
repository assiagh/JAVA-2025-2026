package Applications.BankAccountManagement;

public class Client {
    public String cin;
    public String nom;
    public String prenom;
    public String telephone;

    public Client(String cin, String nom, String prenom, String telephone) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public String toString() {
        return "Client{cin=" + cin +
                ", nom=" + nom +
                ", prenom=" + prenom +
                ", tel=" + telephone + "}";
    }
}
