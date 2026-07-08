package Exercice3;

public class Salarie {

    private int matricule;
    private String nom;
    private int age;
    private double salaire;

    public Salarie() {
        // constructeur vide
    }

    public Salarie(int matricule, String nom, int age, double salaire) {
        // réutilisation du code => on passe par les setters (qui valident)
        this.setMatricule(matricule);
        this.setNom(nom);
        this.setAge(age);
        this.setSalaire(salaire);
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            System.out.println("Erreur: age doit être entre 18 et 65.");
        }
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        if (salaire > 0) {
            this.salaire = salaire;
        } else {
            System.out.println("Erreur: salaire doit être > 0.");
        }
    }

    @Override
    public String toString() {
        return "Salarie{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", salaire=" + salaire +
                '}';
    }
}
