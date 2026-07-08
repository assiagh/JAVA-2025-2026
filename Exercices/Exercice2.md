# Exercice 2 : Réaliser l’exercice n°1 des pages 40–41 dans POO_JAVA.pdf.
### Exercice 1 — Analyse du code source

Soit le code source suivant :

### Program 1

```java
1  |  class Point {
2  |      private int x; private int y;
3  |      Point() {
4  |          this.x = -1; this.y = -1;
5  |      }
6  |      void deplacer(int x, int y) {
7  |          Point p = new Point();
8  |          p.x += x; p.y += y;
9  |      }
10 |      @Override
11 |      public String toString() {
12 |          return x + " " + y;
13 |      }
14 |  }
15 |  public class Question3 {
16 |      public static void main(String[] args) {
17 |          Point p = new Point();
18 |          p.deplacer(3, 4);
19 |          System.out.println(p);
20 |      }
21 |  }
```
**Code 3.10 – Program 1**

---

## Questions

1. Si le Program1 ne contient pas d’erreur d’exécution :

   * Résultat affiché par le programme : `-1 -1`

   Le point est initialise a (-1, -1). La methode deplacer(3,4) cree un nouveau point a l’interieur de la methode, donc elle ne modifie pas le point principal. Par consequent, les valeurs de x et y restent inchangées.

2. Si le programme contient des erreurs :

   * Lignes contenant des erreurs :

Il n’y a pas d’erreurs de compilation, mais il y a une erreur logique dans la methode deplacer.
   * Corrections à effectuer :

Il faut modifier les coordonnees de l’objet courant au lieu de creer un nouveau point.
```
void deplacer(int x, int y) {
   this.x += x;
   this.y += y;
}
```
   * Résultat à afficher après correction : ``2 3``
---
