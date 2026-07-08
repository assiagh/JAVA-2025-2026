package Applications.BankAccountManagement;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compte {
    public String numero;
    public LocalDate dateCreation;
    public Client client;
    public ArrayList<Operation> operations;

    public Compte(String numero, LocalDate dateCreation, Client client) {
        this.numero = numero;
        this.dateCreation = dateCreation;
        this.client = client;
        this.operations = new ArrayList<>();
    }

    public void ajouterOperation(Operation op) {
        operations.add(op);
    }

    // recalculer le solde à partir des opérations
    public double getSolde() {
        double solde = 0;

        for (Operation op : operations) {
            if (op.type.equals("VERS")) {
                solde = solde + op.montant;
            } else if (op.type.equals("RETR")) {
                solde = solde - op.montant;
            }
        }

        return solde;
    }
}
