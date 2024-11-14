package net.java.model;

import net.java.enumeration.Genre;

import java.util.Date;

public class Livre {

  private static int compteur;
  private int idLivre;
  private String auteur;
  private Date annee;
  private boolean estDisponible = false;
  private Genre genre;
  private int nbrEmprunt;
  private Emprunt emprunt;
  public Livre() {

  }

  public Livre(String auteur,Date annee,Genre genre, int nbrEmprunt,Emprunt emprunt) {
    this.idLivre = compteur++;
    this.auteur = auteur;
    this.annee = annee;
    this.genre = genre;
    this.nbrEmprunt = nbrEmprunt;
    this.emprunt = emprunt;
  }

  public int getNbrEmprunt() {
    return nbrEmprunt;
  }

  public void setNbrEmprunt(int nbrEmprunt) {
    this.nbrEmprunt = nbrEmprunt;
  }

  public Genre getGenre() {
    return genre;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  public boolean isEstDisponible() {
    return estDisponible;
  }

  public void setEstDisponible(boolean estDisponible) {
    this.estDisponible = estDisponible;
  }

  public Date getAnnee() {
    return annee;
  }

  public void setAnnee(Date annee) {
    this.annee = annee;
  }

  public String getAuteur() {
    return auteur;
  }

  public void setAuteur(String auteur) {
    this.auteur = auteur;
  }

  public int getIdLivre() {
    return idLivre;
  }

  public void setIdLivre(int idLivre) {
    this.idLivre = idLivre;
  }

  public static int getCompteur() {
    return compteur;
  }

  public static void setCompteur(int compteur) {
    Livre.compteur = compteur;
  }

  public Emprunt getEmprunt() {
    return emprunt;
  }

  public void setEmprunt(Emprunt emprunt) {
    this.emprunt = emprunt;
  }
}
