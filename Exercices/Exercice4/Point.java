package Exercice4;

public class Point {

    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if (x >= 0) {
            this.x = x;
        } else {
            System.out.println("Erreur: x ne peut pas être négatif.");
        }
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if (y >= 0) {
            this.y = y;
        } else {
            System.out.println("Erreur: y ne peut pas être négatif.");
        }
    }

    // méthode pour déplacer le point
    public void deplacer(double dx, double dy) {
        if (x + dx >= 0 && y + dy >= 0) {
            x = x + dx;
            y = y + dy;
        } else {
            System.out.println("Déplacement impossible (coordonnées négatives).");
        }
    }

    // calcul distance à l’origine (0,0)
    public double distanceOrigine() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
