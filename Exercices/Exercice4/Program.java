package Exercice4;
import java.util.ArrayList;

public class Program {

    public static Point plusProcheOrigine(ArrayList<Point> liste) {

        if (liste.isEmpty()) {
            return null;
        }

        Point plusProche = liste.get(0);
        double distanceMin = plusProche.distanceOrigine();

        for (int i = 1; i < liste.size(); i++) {
            Point p = liste.get(i);
            double distance = p.distanceOrigine();

            if (distance < distanceMin) {
                distanceMin = distance;
                plusProche = p;
            }
        }

        return plusProche;
    }

    public static void main(String[] args) {

        ArrayList<Point> points = new ArrayList<>();

        points.add(new Point(3, 4));
        points.add(new Point(1, 2));
        points.add(new Point(5, 1));
        points.add(new Point(2, 2));

        System.out.println("Liste des points :");
        for (Point p : points) {
            System.out.println(p);
        }

        Point plusProche = plusProcheOrigine(points);

        if (plusProche != null) {
            System.out.println("Point le plus proche de l'origine : " + plusProche);
            System.out.println("Distance : " + plusProche.distanceOrigine());
        }
    }
}
