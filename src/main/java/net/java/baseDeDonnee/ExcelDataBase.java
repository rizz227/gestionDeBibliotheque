package net.java.baseDeDonnee;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDataBase {

  private static final String filePath = "gestion_bibliotheque.xlsx";
  private Workbook workbook;
  private Sheet sheet;

  public ExcelDataBase() {
  }

  public ExcelDataBase(Workbook workbook, Sheet sheet) {
    this.workbook = workbook;
    this.sheet = sheet;
  }

  public Workbook getWorkbook() {
    return workbook;
  }

  public void setWorkbook(Workbook workbook) {
    this.workbook = workbook;
  }

  public Sheet getSheet() {
    return sheet;
  }

  public void setSheet(Sheet sheet) {
    this.sheet = sheet;
  }

  // Créer un classeur Excel
  public void createClasseur() {
    if (workbook == null) {
      workbook = new XSSFWorkbook();
      System.out.println("Classeur Excel créé avec succès !");
    } else {
      System.out.println("Le classeur est déjà créé.");
    }
  }

  // Enregistrer le classeur Excel
  public void saveClasseur() {
    if (workbook != null) {
      try (FileOutputStream fos = new FileOutputStream(new File(this.filePath))) {
        workbook.write(fos);
        System.out.println("Classeur enregistré avec succès dans " + filePath);
      } catch (IOException e) {
        System.err.println("Erreur lors de l'enregistrement du classeur : " + e.getMessage());
      }
    } else {
      System.out.println("Erreur : le classeur n'est pas créé.");
    }
  }

  // Créer une feuille dans le classeur Excel
  public void createFeuille(String nameFeuille) {
    if (workbook != null) {
      sheet = workbook.createSheet(nameFeuille); // Correction ici
      System.out.println("Feuille '" + nameFeuille + "' créée avec succès !");
    } else {
      System.out.println("Erreur : le classeur n'est pas créé.");
    }
  }
}
