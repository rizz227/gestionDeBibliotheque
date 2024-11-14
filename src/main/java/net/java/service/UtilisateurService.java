package net.java.service;

import net.java.model.Utilisateur;

import java.util.List;

public interface UtilisateurService {
  public List<Utilisateur> getAllUtilisateurs();
  public Utilisateur getUtilisateur(int id);
  public void ajouterUtilisateur(Utilisateur utilisateur);
  public void modifierUtilisateur(int id,Utilisateur utilisateur);
  public void supprimerUtilisateur(int id);
}
