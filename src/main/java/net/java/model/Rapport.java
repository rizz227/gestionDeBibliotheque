package net.java.model;

public class Rapport {
  private static int compteur;
  private int idRapport;
  private Bibliothecaire bibliothecaire;

  public Rapport() {
  }

  public Rapport(int idRapport, Bibliothecaire bibliothecaire) {
    this.idRapport = idRapport;
    this.bibliothecaire = bibliothecaire;
  }

  public static int getCompteur() {
    return compteur;
  }

  public static void setCompteur(int compteur) {
    Rapport.compteur = compteur;
  }

  public int getIdRapport() {
    return idRapport;
  }

  public void setIdRapport(int idRapport) {
    this.idRapport = idRapport;
  }

  public Bibliothecaire getBibliothecaire() {
    return bibliothecaire;
  }

  public void setBibliothecaire(Bibliothecaire bibliothecaire) {
    this.bibliothecaire = bibliothecaire;
  }
}
