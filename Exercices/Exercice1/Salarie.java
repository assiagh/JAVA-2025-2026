package Exercice1;

// Creation de classe Salarie
public class Salarie {
    // Creation les attributs
    public int matricule;
    public String nom;
    public String prenom;
    public double salaire;

    public static int nombreSalaries = 0;

    public Salarie(int matricule, String nom, String prenom, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;

        nombreSalaries = nombreSalaries + 1;
    }
    // 1. Créer une méthode membre afficherInfos() qui affiche les informations du salarié.
    public void afficherInfos() {
        System.out.println("Matricule: " + matricule);
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Salaire: " + salaire);
    }

    // 2. Créer une méthode membre `augmenterSalaire(double taux)` qui augmente le salaire selon un pourcentage.
    public void augmenterSalaire(double taux) {
        // ici l'exemple de taux = 10 => salaire +10%
        salaire = salaire + (salaire * taux / 100);
    }

    public static void printNombreSalaries() {
        System.out.println("Nombre total de salaries: " + nombreSalaries);
    }
    // 5. Ajouter une méthode static afficherDetail(Salarie s) qui affiche le détail d’un salarié passé en paramètre.
    public static void afficherDetail(Salarie s) {
        System.out.println("------ DETAIL SALARIE ------");
        System.out.println("Matricule: " + s.matricule);
        System.out.println("Nom: " + s.nom);
        System.out.println("Prenom: " + s.prenom);
        System.out.println("Salaire: " + s.salaire);
        System.out.println("----------------------------");
    }
}
