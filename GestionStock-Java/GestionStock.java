package com.steps.app_bdcc;

import java.util.Scanner;

public class GestionStock {

    static int MAX_PRODUITS = 100;
    static int[] codesProduits = new int[MAX_PRODUITS];
    static String[] nomsProduits = new String[MAX_PRODUITS];
    static int[] quantites = new int[MAX_PRODUITS];
    static double[] prix = new double[MAX_PRODUITS];
    static int nbProduits = 0;

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int choix;
        do {
            afficherMenu();
            choix = sc.nextInt();
            sc.nextLine(); // vider le buffer
            switch (choix) {
                case 1:
                    ajouterProduit();
                    break;
                case 2:
                    modifierProduit();
                    break;
                case 3:
                    supprimerProduit();
                    break;
                case 4:
                    afficherProduits();
                    break;
                case 5:
                    rechercherProduit();
                    break;
                case 6:
                    calculerValeurStock();
                    break;
                case 0:
                    System.out.println("Quitter l'application...");
                    break;
                default:
                    System.out.println("Option invalide, veuillez réessayer !");
            }
        } while (choix != 0);
    }

    static void afficherMenu() {
        System.out.println("\n----- Gestion de Stock -----");
        System.out.println("1. Ajouter un produit");
        System.out.println("2. Modifier un produit");
        System.out.println("3. Supprimer un produit");
        System.out.println("4. Afficher la liste des produits");
        System.out.println("5. Rechercher un produit");
        System.out.println("6. Calculer la valeur totale du stock");
        System.out.println("0. Quitter");
        System.out.print("Choisissez une option : ");
    }

    // 1. Ajouter un produit
    static void ajouterProduit() {
        if (nbProduits >= MAX_PRODUITS) {
            System.out.println("Stock plein ! Impossible d’ajouter plus de produits.");
            return;
        }

        System.out.print("Code du produit : ");
        int code = sc.nextInt();
        sc.nextLine();

        System.out.print("Nom du produit : ");
        String nom = sc.nextLine();

        System.out.print("Quantité : ");
        int quantite = sc.nextInt();

        System.out.print("Prix unitaire : ");
        double prixUnitaire = sc.nextDouble();

        codesProduits[nbProduits] = code;
        nomsProduits[nbProduits] = nom;
        quantites[nbProduits] = quantite;
        prix[nbProduits] = prixUnitaire;
        nbProduits++;

        System.out.println("Produit ajouté avec succès !");
    }

    // 2. Modifier un produit
    // ================================
    static void modifierProduit() {
        System.out.print("Entrez le code du produit à modifier : ");
        int code = sc.nextInt();
        sc.nextLine();

        int index = trouverIndexParCode(code);
        if (index == -1) {
            System.out.println("Produit non trouvé !");
            return;
        }

        System.out.print("Nouveau nom : ");
        String nouveauNom = sc.nextLine();

        System.out.print("Nouvelle quantité : ");
        int nouvelleQuantite = sc.nextInt();

        System.out.print("Nouveau prix : ");
        double nouveauPrix = sc.nextDouble();

        nomsProduits[index] = nouveauNom;
        quantites[index] = nouvelleQuantite;
        prix[index] = nouveauPrix;

        System.out.println("Produit modifié avec succès !");
    }

    // 3. Supprimer un produit
    // ================================
    static void supprimerProduit() {
        System.out.print("Entrez le code du produit à supprimer : ");
        int code = sc.nextInt();

        int index = trouverIndexParCode(code);
        if (index == -1) {
            System.out.println("Produit non trouvé !");
            return;
        }

        // Décaler les éléments vers la gauche
        for (int i = index; i < nbProduits - 1; i++) {
            codesProduits[i] = codesProduits[i + 1];
            nomsProduits[i] = nomsProduits[i + 1];
            quantites[i] = quantites[i + 1];
            prix[i] = prix[i + 1];
        }
        nbProduits--;

        System.out.println("Produit supprimé avec succès !");
    }

    // 4. Afficher la liste des produits
    // ================================
    static void afficherProduits() {
        if (nbProduits == 0) {
            System.out.println("Aucun produit dans le stock.");
            return;
        }

        System.out.println("\n--- Liste des produits ---");
        System.out.printf("%-10s %-20s %-10s %-10s%n", "Code", "Nom", "Quantité", "Prix");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < nbProduits; i++) {
            System.out.printf("%-10d %-20s %-10d %-10.2f%n",
                    codesProduits[i], nomsProduits[i], quantites[i], prix[i]);
        }
    }

    // 5. Rechercher un produit par nom
    // ================================
    static void rechercherProduit() {
        System.out.print("Entrez le nom du produit à rechercher : ");
        String nomRecherche = sc.nextLine();

        boolean trouve = false;
        for (int i = 0; i < nbProduits; i++) {
            if (nomsProduits[i].equalsIgnoreCase(nomRecherche)) {
                System.out.println("Produit trouvé :");
                System.out.println("Code : " + codesProduits[i]);
                System.out.println("Quantité : " + quantites[i]);
                System.out.println("Prix : " + prix[i]);
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucun produit trouvé avec ce nom.");
        }
    }

    // 6. Calculer la valeur totale du stock
    // ================================
    static void calculerValeurStock() {
        double total = 0;
        for (int i = 0; i < nbProduits; i++) {
            total += quantites[i] * prix[i];
        }
        System.out.printf("Valeur totale du stock : %.2f%n", total);
    }

    // Méthode utilitaire : chercher un produit par code
    // ================================
    static int trouverIndexParCode(int code) {
        for (int i = 0; i < nbProduits; i++) {
            if (codesProduits[i] == code)
                return i;
        }
        return -1;
    }
}