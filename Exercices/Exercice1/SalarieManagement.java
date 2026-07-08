package Exercice1;

// Creation SalarieManagement
public class SalarieManagement {
    // Méthode `static afficherInfos(Salarie s)`
    public static void afficherInfos(Salarie s) {
        System.out.println("Matricule: " + s.matricule);
        System.out.println("Nom: " + s.nom);
        System.out.println("Prenom: " + s.prenom);
        System.out.println("Salaire: " + s.salaire);
    }
    // Méthode `static augmenterSalaire(Salarie s, double taux)`
    public static void augmenterSalaire(Salarie s, double taux) {
        s.salaire = s.salaire + (s.salaire * taux / 100);
    }
    // Méthode `static printNombreSalaries()`
    public static void printNombreSalaries() {
        System.out.println("Nombre total de salaries: " + Salarie.nombreSalaries);
    }
}
