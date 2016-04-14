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
@DatabaseTable(tableName="cv_langue")
public class Cv_langue {
    @DatabaseField(id=true)
    private Integer id_langue;
    @DatabaseField
    private String id_utilisateur;
    @DatabaseField
    private String libelle_langue;
    
    @DatabaseField(foreign = true,columnName = "id_utilisateur", foreignAutoRefresh = false)
    private Etudiants etudiant;

    public Etudiants getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiants etudiant) {
        this.etudiant = etudiant;
    }
    

    public Integer getId_langue() {
        return id_langue;
    }

    public void setId_langue(Integer id_langue) {
        this.id_langue = id_langue;
    }

    public String getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(String id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getLibelle_langue() {
        return libelle_langue;
    }

    public void setLibelle_langue(String libelle_langue) {
        this.libelle_langue = libelle_langue;
    }
    
    
}
