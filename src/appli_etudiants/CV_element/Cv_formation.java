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
@DatabaseTable(tableName="cv_formation")
public class Cv_formation {
    @DatabaseField(id=true)
    private Integer id_formation;
    @DatabaseField
    private String id_utilisateur;
    @DatabaseField
    private String libelle_formation;
    @DatabaseField(foreign = true,columnName = "id_utilisateur", foreignAutoRefresh = false)
    private Etudiants etudiant;

    public Etudiants getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiants etudiant) {
        this.etudiant = etudiant;
    }
    

    public Integer getId_formation() {
        return id_formation;
    }

    public void setId_formation(Integer id_formation) {
        this.id_formation = id_formation;
    }

    public String getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(String id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getLibelle_formation() {
        return libelle_formation;
    }

    public void setLibelle_formation(String libelle_formation) {
        this.libelle_formation = libelle_formation;
    }
    
    
    
}
