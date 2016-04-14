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
@DatabaseTable(tableName="cv_centre_interet")
public class Cv_centre_interet {
    @DatabaseField(id=true)
    private  Integer id_centre_interet;
    @DatabaseField
    private String id_utilisateur;
    @DatabaseField
    private String libelle_centre_interet;
    
    @DatabaseField(foreign = true,columnName = "id_utilisateur", foreignAutoRefresh = false)
    private Etudiants etudiant;

    public Etudiants getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiants etudiant) {
        this.etudiant = etudiant;
    }
    

    public Integer getId_centre_interet() {
        return id_centre_interet;
    }

    public void setId_centre_interet(Integer id_centre_interet) {
        this.id_centre_interet = id_centre_interet;
    }

    public String getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(String id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getLibelle_centre_interet() {
        return libelle_centre_interet;
    }

    public void setLibelle_centre_interet(String libelle_centre_interet) {
        this.libelle_centre_interet = libelle_centre_interet;
    }
    
    
    
}
