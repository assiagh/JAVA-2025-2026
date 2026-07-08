package Applications.BankAccountManagement;

import java.time.LocalDate;

public class Operation {
    public LocalDate date;
    public double montant;
    public String type; // "VERS" ou "RETR"

    public Operation(LocalDate date, double montant, String type) {
        this.date = date;
        this.montant = montant;
        this.type = type;
    }

    public String toString() {
        return "Operation{date=" + date + ", montant=" + montant + ", type=" + type + "}";
    }
}
