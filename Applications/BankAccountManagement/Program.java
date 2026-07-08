package Applications.BankAccountManagement;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;

public class Program {

    public static void main(String[] args) {

        // 1) créer un client
        Client c1 = new Client("AA123456", "Amrani", "Khalid", "0612345678");

        // 2) créer un compte
        Compte compte = new Compte("CPT-001", LocalDate.now(), c1);

        // 3) ajouter des opérations
        compte.ajouterOperation(new Operation(LocalDate.of(2026, 2, 1), 2000, "VERS"));
        compte.ajouterOperation(new Operation(LocalDate.of(2026, 2, 3), 500, "RETR"));
        compte.ajouterOperation(new Operation(LocalDate.of(2026, 2, 2), 1000, "VERS"));
        compte.ajouterOperation(new Operation(LocalDate.of(2026, 2, 5), 300, "RETR"));

        // 4) trier les opérations par date croissante
        Collections.sort(compte.operations, new Comparator<Operation>() {
            @Override
            public int compare(Operation o1, Operation o2) {
                return o1.date.compareTo(o2.date);
            }
        });

        // 5) afficher le détail complet
        System.out.println("===== DETAIL COMPTE =====");
        System.out.println("Numero        : " + compte.numero);
        System.out.println("Date creation : " + compte.dateCreation);

        System.out.println("--- Client ---");
        System.out.println(compte.client);

        System.out.println("--- Operations (triées) ---");
        for (Operation op : compte.operations) {
            System.out.println(op);
        }

        System.out.println("--- Solde final ---");
        System.out.println("Solde = " + compte.getSolde());
        System.out.println("==========================");
    }
}
