/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants.CV_element;

import appli_etudiants.Etudiants;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author verod_000
 */
@DatabaseTable(tableName = "cv_photo")
public class Cv_photo {

    @DatabaseField(id=true)
    private Integer id_cv_photo;
    @DatabaseField(foreign = true,columnName = "id_utilisateur", foreignAutoRefresh = false)
    private Etudiants etudiant;
    @DatabaseField
    private String photo;
    
    public Etudiants getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiants etudiant) {
        this.etudiant = etudiant;
    }
    
    public Integer getId_photo() {
        return id_cv_photo;
    }

    public void setId_photo(Integer id_photo) {
        this.id_cv_photo = id_photo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

}
