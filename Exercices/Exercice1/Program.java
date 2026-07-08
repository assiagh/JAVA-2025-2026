package Exercice1;

// Creation Program
public class Program {
    // Creation afficherDetail(Salarie s)
    public static void afficherDetail(Salarie s) {
        System.out.println("=== DETAIL (Program) ===");
        System.out.println("Matricule: " + s.matricule);
        System.out.println("Nom: " + s.nom);
        System.out.println("Prenom: " + s.prenom);
        System.out.println("Salaire: " + s.salaire);
        System.out.println("========================");
    }

    // Creation Main
    public static void main(String[] args) {
        
        Salarie s1 = new Salarie(1, "Amrani", "Khalid", 8000);
        Salarie s2 = new Salarie(2, "El Fassi", "Sara", 9500);

        System.out.println("---- Test instance (Salarie) ----");
        s1.afficherInfos();

        System.out.println("---- Augmenter salaire s1 +10% ----");
        s1.augmenterSalaire(10);
        s1.afficherInfos();

        System.out.println("---- Static dans Salarie ----");
        Salarie.printNombreSalaries();

        System.out.println("---- Test static (SalarieManagement) ----");
        SalarieManagement.afficherInfos(s2);

        System.out.println("---- Augmenter salaire s2 +5% (Management) ----");
        SalarieManagement.augmenterSalaire(s2, 5);
        SalarieManagement.afficherInfos(s2);

        System.out.println("---- Static dans SalarieManagement ----");
        SalarieManagement.printNombreSalaries();

        System.out.println("---- afficherDetail dans Salarie ----");
        Salarie.afficherDetail(s1);

        System.out.println("---- afficherDetail dans Program ----");
        afficherDetail(s2);
    }
}
