package Applications.EmployeeManagement;

public class Program {

    public static void main(String[] args) {

        Departement d1 = new Departement(1, "Informatique");
        Departement d2 = new Departement(2, "Comptabilite");

        Salarie s1 = new Salarie(10, "Amrani", "Khalid", 8000);
        Salarie s2 = new Salarie(11, "El Fassi", "Sara", 9500);
        Salarie s3 = new Salarie(12, "Bennani", "Youssef", 7000);
        Salarie s4 = new Salarie(13, "Alaoui", "Imane", 6000);

        // affectation des salariés
        d1.ajouterSalarie(s1);
        d1.ajouterSalarie(s3);

        d2.ajouterSalarie(s2);
        d2.ajouterSalarie(s4);

        // afficher détail d'un département
        d1.afficherDetail();
        d2.afficherDetail();
    }
}
