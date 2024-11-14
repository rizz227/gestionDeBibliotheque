package net.java.service;

import net.java.model.Utilisateur;

import java.io.File;
import java.util.List;

public class UtilisateurServiceImp implements UtilisateurService {

  private File file;
  private List<Utilisateur> utilisateurList;
  
  @Override
  public List<Utilisateur> getAllUtilisateurs() {
    return List.of();
  }

  @Override
  public Utilisateur getUtilisateur(int id) {
    return null;
  }

  @Override
  public void ajouterUtilisateur(Utilisateur utilisateur) {

  }

  @Override
  public void modifierUtilisateur(int id, Utilisateur utilisateur) {

  }

  @Override
  public void supprimerUtilisateur(int id) {

  }


//  @Override
//  public List<ParcourResponseDto> getAllParcour() {
//    List<Parcour> parcours = parcourRepository.findAll();
//    return parcours.stream().map(parcour -> modelMapper.map(parcour,ParcourResponseDto.class)).collect(Collectors.toList());
//  }
}
