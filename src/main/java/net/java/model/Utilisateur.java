package net.java.model;

import java.util.Date;

public abstract class Utilisateur {
  private static int compteur;
  private int idUtilisateur;
  private String nom;
  private String prenom;
  private Date ddn;
  private String email;
  private String mdp;

  public Utilisateur() {
  }

  public Utilisateur(String nom, String prenom, Date ddn, String email, String mdp) {
    this.idUtilisateur = compteur++;
    this.nom = nom;
    this.prenom = prenom;
    this.ddn = ddn;
    this.email = email;
    this.mdp = mdp;
  }

  public int getIdUtilisateur() {
    return idUtilisateur;
  }

  public void setIdUtilisateur(int idUtilisateur) {
    this.idUtilisateur = idUtilisateur;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public Date getDdn() {
    return ddn;
  }

  public void setDdn(Date ddn) {
    this.ddn = ddn;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getMdp() {
    return mdp;
  }

  public void setMdp(String mdp) {
    this.mdp = mdp;
  }
}
