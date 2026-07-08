package Exercice3;

public class Program {

    public static void main(String[] args) {

        // s1 via constructeur vide
        Salarie s1 = new Salarie();

        // modifier via setters
        s1.setMatricule(1);
        s1.setNom("Amrani");
        s1.setAge(30);
        s1.setSalaire(8000);

        // afficher via getters
        System.out.println("Matricule: " + s1.getMatricule());
        System.out.println("Nom: " + s1.getNom());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Salaire: " + s1.getSalaire());

        // afficher via toString()
        System.out.println("s1 => " + s1.toString());

        // tester validations
        System.out.println("Test age negatif:");
        s1.setAge(-5);

        System.out.println("Test salaire nul:");
        s1.setSalaire(0);

        // s2 via constructeur avec paramètres
        Salarie s2 = new Salarie(2, "Sara", 17, -1000);

        // afficher s2
        System.out.println("s2 => " + s2.toString());
    }
}
