package Applications.EmployeeManagement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Departement {
    public int id;
    public String nom;

    public ArrayList<Salarie> salaries;

    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.salaries = new ArrayList<>();
    }

    public void ajouterSalarie(Salarie s) {
        salaries.add(s);
        s.departement = this; // affectation du salarié à ce département
    }

    public double totalSalaires() {
        double total = 0;
        for (Salarie s : salaries) {
            total = total + s.salaire;
        }
        return total;
    }

    public void trierParSalaireCroissant() {
        Collections.sort(salaries, new Comparator<Salarie>() {
            @Override
            public int compare(Salarie s1, Salarie s2) {
                if (s1.salaire < s2.salaire) return -1;
                if (s1.salaire > s2.salaire) return 1;
                return 0;
            }
        });
    }

    public void afficherDetail() {
        System.out.println("===== Departement =====");
        System.out.println("Nom: " + nom);

        trierParSalaireCroissant();

        System.out.println("--- Salaries (triés par salaire) ---");
        for (Salarie s : salaries) {
            System.out.println(s);
        }

        System.out.println("Total salaires = " + totalSalaires());
        System.out.println("=======================");
    }
}
