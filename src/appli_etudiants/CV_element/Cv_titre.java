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
@DatabaseTable(tableName="cv_titre")
public class Cv_titre {
    @DatabaseField(id=true)
    private Integer id_titre;
    @DatabaseField
    private String id_utilisateur;
    @DatabaseField
    private String libelle_titre;  
    @DatabaseField(foreign = true,columnName = "id_utilisateur", foreignAutoRefresh = false)
    private Etudiants etudiant;


    public Integer getId_titre() {
        return id_titre;
    }

    public void setId_titre(Integer id_titre) {
        this.id_titre = id_titre;
    }

    public String getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(String id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getLibelle_titre() {
        return libelle_titre;
    }

    public void setLibelle_titre(String libelle_titre) {
        this.libelle_titre = libelle_titre;
    }

    public Etudiants getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiants etudiant) {
        this.etudiant = etudiant;
    }
    
    
    
    
    
}
