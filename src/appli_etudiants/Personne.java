/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author nc
 */
@DatabaseTable(tableName = "utilisateurs")

public class Personne {

    @DatabaseField(canBeNull = true)
    private String nom;

    @DatabaseField(canBeNull = true)
    private String prenom;

    @DatabaseField(canBeNull = true)
    private String mail;

    @DatabaseField(canBeNull = true)
    private String date_de_naissance;

    @DatabaseField(canBeNull = true)
    private String adresse_rue;
    
    @DatabaseField(canBeNull = true)
    private String code_postal;
    
    @DatabaseField(canBeNull = true)
    private String ville;

    @DatabaseField(canBeNull = true)
    private String Tel_personnel;
    
    @DatabaseField(canBeNull = true)
    private String Tel_professionnel;

    @DatabaseField(canBeNull = true)
    private String site_web;
    
    @DatabaseField(canBeNull = true)
    private String annee_entree_promotion;
    
    @DatabaseField(canBeNull = true)
    private String annee_sortie_promotion;
    
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(String date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }
    public String getAdresse_rue() {
        return adresse_rue;
    }

    public void setAdresse_rue(String adresse_rue) {
        this.adresse_rue = adresse_rue;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public String getTel_personnel() {
        return Tel_personnel;
    }

    public void setTel_personnel(String Tel_personnel) {
        this.Tel_personnel = Tel_personnel;
    }

    public String getTel_professionnel() {
        return Tel_professionnel;
    }

    public void setTel_professionnel(String Tel_professionnel) {
        this.Tel_professionnel = Tel_professionnel;
    }
    public String getSite_web() {
        return site_web;
    }

    public void setSite_web(String site_web) {
        this.site_web = site_web;
    }

    public String getAnnee_entree_promotion() {
        return annee_entree_promotion;
    }

    public void setAnnee_entree_promotion(String annee_entree_promotion) {
        this.annee_entree_promotion = annee_entree_promotion;
    }

    public String getAnnee_sortie_promotion() {
        return annee_sortie_promotion;
    }

    public void setAnnee_sortie_promotion(String annee_sortie_promotion) {
        this.annee_sortie_promotion = annee_sortie_promotion;
    }
}
