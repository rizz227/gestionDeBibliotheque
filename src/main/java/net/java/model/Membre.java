package net.java.model;

import java.util.Date;
import java.util.List;

public class Membre extends Utilisateur{

  private int nbrEmprunt;
  private List<Emprunt> empruntList;

public Membre(){

}

  public Membre(int nbrEmprunt, List<Emprunt> empruntList) {
    this.nbrEmprunt = nbrEmprunt;
    this.empruntList = empruntList;
  }

  public Membre(String nom, String prenom, Date ddn, String email, String mdp, int nbrEmprunt, List<Emprunt> empruntList) {
    super(nom, prenom, ddn, email, mdp);
    this.nbrEmprunt = nbrEmprunt;
    this.empruntList = empruntList;
  }

  public int getNbrEmprunt() {
    return nbrEmprunt;
  }

  public void setNbrEmprunt(int nbrEmprunt) {
    this.nbrEmprunt = nbrEmprunt;
  }

  public List<Emprunt> getEmpruntList() {
    return empruntList;
  }

  public void setEmpruntList(List<Emprunt> empruntList) {
    this.empruntList = empruntList;
  }
}
