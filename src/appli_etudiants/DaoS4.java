/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import appli_etudiants.CV_element.Cv_centre_interet;
import appli_etudiants.CV_element.Cv_experience_prof;
import appli_etudiants.CV_element.Cv_formation;
import appli_etudiants.CV_element.Cv_informatique;
import appli_etudiants.CV_element.Cv_langue;
import appli_etudiants.CV_element.Cv_photo;
import appli_etudiants.CV_element.Cv_titre;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verod_000
 */
public class DaoS4 {

    List<Cv_titre> listCvTitre;
    Integer indiceCv;
    static private Dao<Personne, String> personneDao;
    static private Dao<Etudiants, String> etudiantsDao;
    static private Dao<Cv_photo, Integer> photoDao;
    static private Dao<Cv_centre_interet, Integer> interetDao;
    static private Dao<Cv_formation, Integer> formationDao;
    static private Dao<Cv_titre, Integer> titreDao;
    static private Dao<Cv_experience_prof, Integer> expProDao;
    static private Dao<Cv_langue, Integer> langueDao;
    static private Dao<Cv_informatique, Integer> informatiqueDao;
    static private ConnectionSource connectionSource;
    static private String databaseUrl;
    static DaoS4 monDaoS4;

    private DaoS4() {
        try {
            DaoS4.databaseUrl="jdbc:mysql://localhost:3306/applietudiants?user=applietudiants&password=sio";
            DaoS4.connectionSource = new JdbcConnectionSource(DaoS4.databaseUrl);
            DaoS4.personneDao = DaoManager.createDao(connectionSource, Personne.class);
            DaoS4.etudiantsDao = DaoManager.createDao(connectionSource, Etudiants.class);
            DaoS4.photoDao = DaoManager.createDao(connectionSource, Cv_photo.class);
            DaoS4.interetDao = DaoManager.createDao(connectionSource, Cv_centre_interet.class);
            DaoS4.formationDao = DaoManager.createDao(connectionSource, Cv_formation.class);
            DaoS4.titreDao = DaoManager.createDao(connectionSource, Cv_titre.class);
            DaoS4.expProDao = DaoManager.createDao(connectionSource, Cv_experience_prof.class);
            DaoS4.langueDao = DaoManager.createDao(connectionSource, Cv_langue.class);
            DaoS4.informatiqueDao = DaoManager.createDao(connectionSource, Cv_informatique.class);
        } catch (SQLException ex) {
            Logger.getLogger(DaoS4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Dao<Personne, String> personneDao() {
        if (DaoS4.monDaoS4 == null) {
            DaoS4.monDaoS4 = new DaoS4();
        }
        return DaoS4.personneDao;
    }
    
     public static Dao<Etudiants, String> etudiantsDao() {
        if (DaoS4.monDaoS4 == null) {
            DaoS4.monDaoS4 = new DaoS4();
        }
        return DaoS4.etudiantsDao;
    }
     
     public static Dao<Cv_photo, Integer> photoDao(){
         if (DaoS4.monDaoS4 == null) {
            DaoS4.monDaoS4 = new DaoS4();
        }
        return DaoS4.photoDao;
     }
     
     public static Dao<Cv_centre_interet, Integer> interetDao(){
         if (DaoS4.monDaoS4 == null) {
            DaoS4.monDaoS4 = new DaoS4();
        }
        return DaoS4.interetDao;
     }
     
     public static Dao<Cv_formation, Integer> formationDao(){
         if (DaoS4.monDaoS4 == null) {
            DaoS4.monDaoS4 = new DaoS4();
        }
        return DaoS4.formationDao;
     }
     
     public static Dao<Cv_titre, Integer> titreDao(){
         if (DaoS4.monDaoS4 == null) {
            DaoS4.monDaoS4 = new DaoS4();
        }
        return DaoS4.titreDao;
     }
     
     public static Dao<Cv_experience_prof, Integer> expProDao(){
         if (DaoS4.monDaoS4 == null) {
            DaoS4.monDaoS4 = new DaoS4();
        }
        return DaoS4.expProDao;
     }
     
     public static Dao<Cv_langue, Integer> langueDao(){
         if (DaoS4.monDaoS4 == null) {
            DaoS4.monDaoS4 = new DaoS4();
        }
        return DaoS4.langueDao;
     }
     
     public static Dao<Cv_informatique, Integer> informatiqueDao(){
         if (DaoS4.monDaoS4 == null) {
            DaoS4.monDaoS4 = new DaoS4();
        }
        return DaoS4.informatiqueDao;
     }
     
     public static Integer getSizeFormation() {
        try {
            Integer taille = DaoS4.formationDao().queryForAll().size();
            return taille;
        } catch (SQLException ex) {
            Logger.getLogger(DaoS4.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
     
     public static String getLibelleTitre() throws SQLException
     {
         String libelle ="";
         List<Etudiants> lesEtudiants = DaoS4.etudiantsDao.queryForAll();
         List<Cv_titre> lesCvTitres = DaoS4.titreDao.queryForAll();
         for(Cv_titre unCvTitre : lesCvTitres)
         {
             DaoS4.etudiantsDao.refresh(unCvTitre.getEtudiant());
             libelle = unCvTitre.getLibelle_titre();
         }
         return libelle;
     }
     
     public static String getLibelleExpPro() throws SQLException
     {
         String libelle ="";
         List<Etudiants> lesEtudiants = DaoS4.etudiantsDao.queryForAll();
         List<Cv_experience_prof> lesExpPro = DaoS4.expProDao.queryForAll();
         for(Cv_experience_prof uneExpPro : lesExpPro)
         {
             DaoS4.etudiantsDao.refresh(uneExpPro.getEtudiant());
             libelle = uneExpPro.getLibelle_experience_prof() + System.getProperty("line.separator") + libelle;      
         }
         return libelle;
     }
     
      public static String getPhoto() throws SQLException
     {
         String libelle = null;
         List<Etudiants> lesEtudiants = DaoS4.etudiantsDao.queryForAll();
         List<Cv_photo> lesPhotos = DaoS4.photoDao.queryForAll();
         for(Cv_photo unePhoto : lesPhotos)
         {
             DaoS4.etudiantsDao.refresh(unePhoto.getEtudiant());
             libelle = unePhoto.getPhoto();      
         }
         return libelle;
     }
      
     public static String getLibelleFormation() throws SQLException
     {
         String libelle ="";
         List<Etudiants> lesEtudiants = DaoS4.etudiantsDao.queryForAll();
         List<Cv_formation> lesFormations = DaoS4.formationDao.queryForAll();
         for(Cv_formation uneForm : lesFormations)
         {
             DaoS4.etudiantsDao.refresh(uneForm.getEtudiant());
             libelle = uneForm.getLibelle_formation() + System.getProperty("line.separator") + libelle;      
         }
         return libelle;
     }
     
     public static String getLibelleLangue() throws SQLException
     {
         String libelle ="";
         List<Etudiants> lesEtudiants = DaoS4.etudiantsDao.queryForAll();
         List<Cv_langue> lesLangues = DaoS4.langueDao.queryForAll();
         for(Cv_langue uneLangue : lesLangues)
         {
             DaoS4.etudiantsDao.refresh(uneLangue.getEtudiant());
             libelle = uneLangue.getLibelle_langue() + System.getProperty("line.separator") + libelle;      
         }
         return libelle;
     }
     
     public static String getLibelleInteret() throws SQLException
     {
         String libelle ="";
         List<Etudiants> lesEtudiants = DaoS4.etudiantsDao.queryForAll();
         List<Cv_centre_interet> lesCentres = DaoS4.interetDao.queryForAll();
         for(Cv_centre_interet unCentre : lesCentres)
         {
             DaoS4.etudiantsDao.refresh(unCentre.getEtudiant());
             libelle = unCentre.getLibelle_centre_interet() + System.getProperty("line.separator") + libelle;      
         }
         return libelle;
     }
     
     public static String getLibelleInformatique() throws SQLException
     {
         String libelle ="";
         List<Etudiants> lesEtudiants = DaoS4.etudiantsDao.queryForAll();
         List<Cv_informatique> lesCompInfo = DaoS4.informatiqueDao.queryForAll();
         for(Cv_informatique uneCompInfo : lesCompInfo)
         {
             DaoS4.etudiantsDao.refresh(uneCompInfo.getEtudiant());
             libelle = uneCompInfo.getLibelle_informatique() + System.getProperty("line.separator") + libelle;      
         }
         return libelle;
     }
     
     
     
}

                