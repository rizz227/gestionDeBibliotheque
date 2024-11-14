package net.java;

import net.java.baseDeDonnee.ExcelDataBase;

public class Main {
  public static void main(String[] args) {
    ExcelDataBase db = new ExcelDataBase();

    db.createClasseur();

    db.createFeuille("Utilisateur");

    db.createFeuille("Livres");

    db.createFeuille("Emprunts");

    db.saveClasseur();
  }
}
