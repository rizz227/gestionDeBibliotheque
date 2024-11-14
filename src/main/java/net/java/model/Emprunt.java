package net.java.model;

import java.util.Date;
import java.util.List;

public class Emprunt {

  private static final int MAX = 3;
  private static int compteur;
  private int idEmrunt;
  private List<Livre> livreList;
  private Membre membre;
  private Bibliothecaire bibliothecaire;
  private Date dateEmrunt;
  private Date dateRetourPrevue;
  private Date dateRetourEffective;

  public Emprunt() {

  }

  public Emprunt(List<Livre> livreList, Membre membre, Bibliothecaire bibliothecaire, Date dateEmrunt, Date dateRetourPrevue, Date dateRetourEffective) {
    if (livreList.size() > MAX) {
      throw new IllegalArgumentException("Le nombre maximum des livres emprunté est : " + MAX);
    }
    this.idEmrunt = compteur++;
    this.livreList = livreList;
    this.membre = membre;
    this.bibliothecaire = bibliothecaire;
    this.dateEmrunt = dateEmrunt;
    this.dateRetourPrevue = dateRetourPrevue;
    this.dateRetourEffective = dateRetourEffective;
  }

  public int getIdEmrunt() {
    return idEmrunt;
  }

  public void setIdEmrunt(int idEmrunt) {
    this.idEmrunt = idEmrunt;
  }

  public List<Livre> getLivreList() {
    return livreList;
  }

  public void setLivreList(List<Livre> livreList) {
    this.livreList = livreList;
  }

  public Membre getMembre() {
    return membre;
  }

  public void setMembre(Membre membre) {
    this.membre = membre;
  }

  public Bibliothecaire getBibliothecaire() {
    return bibliothecaire;
  }

  public void setBibliothecaire(Bibliothecaire bibliothecaire) {
    this.bibliothecaire = bibliothecaire;
  }

  public Date getDateEmrunt() {
    return dateEmrunt;
  }

  public void setDateEmrunt(Date dateEmrunt) {
    this.dateEmrunt = dateEmrunt;
  }

  public Date getDateRetourPrevue() {
    return dateRetourPrevue;
  }

  public void setDateRetourPrevue(Date dateRetourPrevue) {
    this.dateRetourPrevue = dateRetourPrevue;
  }

  public Date getDateRetourEffective() {
    return dateRetourEffective;
  }

  public void setDateRetourEffective(Date dateRetourEffective) {
    this.dateRetourEffective = dateRetourEffective;
  }
}
