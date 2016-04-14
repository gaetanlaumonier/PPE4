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
@DatabaseTable(tableName="cv_experience_prof")
public class Cv_experience_prof {
    @DatabaseField(id=true)
    private Integer id_experience_prof;
    @DatabaseField
    private String id_utilisateur;
    @DatabaseField
    private String libelle_experience_prof;
    @DatabaseField(foreign = true,columnName = "id_utilisateur", foreignAutoRefresh = false)
    private Etudiants etudiant;

    public Integer getId_experience_prof() {
        return id_experience_prof;
    }

    public void setId_experience_prof(Integer id_experience_prof) {
        this.id_experience_prof = id_experience_prof;
    }

    public String getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(String id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getLibelle_experience_prof() {
        return libelle_experience_prof;
    }

    public void setLibelle_experience_prof(String libelle_experience_prof) {
        this.libelle_experience_prof = libelle_experience_prof;
    }

    public Etudiants getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiants etudiant) {
        this.etudiant = etudiant;
    }
    
    
    
    
}
