/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants.CV_element;

import appli_etudiants.Etudiants;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author verod_000
 */
@DatabaseTable(tableName="cv_informatique")
public class Cv_informatique {
    @DatabaseField(id=true)
    private Integer id_informatique;
    @DatabaseField
    private String id_utilisateur;
    @DatabaseField
    private String libelle_informatique;
    
    @DatabaseField(foreign = true,columnName = "id_utilisateur", foreignAutoRefresh = false)
    private Etudiants etudiant;

    public Etudiants getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiants etudiant) {
        this.etudiant = etudiant;
    }
    
    

    public Integer getId_informatique() {
        return id_informatique;
    }

    public void setId_informatique(Integer id_informatique) {
        this.id_informatique = id_informatique;
    }

    public String getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(String id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getLibelle_informatique() {
        return libelle_informatique;
    }

    public void setLibelle_informatique(String libelle_informatique) {
        this.libelle_informatique = libelle_informatique;
    }
    
    
    
}
