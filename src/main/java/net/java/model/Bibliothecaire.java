package net.java.model;

import java.util.Date;
import java.util.List;

public class Bibliothecaire extends Utilisateur{

  private List<Emprunt> empruntList;
  private List<Rapport> rapportList;

  private Bibliothecaire(){
    super();
  }

  public Bibliothecaire(List<Emprunt> empruntList, List<Rapport> rapportList) {
    this.empruntList = empruntList;
    this.rapportList = rapportList;
  }

  public Bibliothecaire(String nom, String prenom, Date ddn, String email, String mdp, List<Emprunt> empruntList, List<Rapport> rapportList) {
    super(nom, prenom, ddn, email, mdp);
    this.empruntList = empruntList;
    this.rapportList = rapportList;
  }

  public List<Emprunt> getEmpruntList() {
    return empruntList;
  }

  public void setEmpruntList(List<Emprunt> empruntList) {
    this.empruntList = empruntList;
  }

  public List<Rapport> getRapportList() {
    return rapportList;
  }

  public void setRapportList(List<Rapport> rapportList) {
    this.rapportList = rapportList;
  }
}
