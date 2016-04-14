/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

/**
 *
 * @author verod_000
 */
import com.lowagie.text.BadElementException;
import java.io.FileOutputStream;
import com.lowagie.text.Chunk;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.pdf.draw.LineSeparator;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import java.io.IOException;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfGState;

public class ExportPDF {

    public static void main(Etudiants etudiant) throws SQLException, FileNotFoundException, BadElementException, IOException {
        try {
            Document document = new Document(PageSize.A4);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("c:/testPDF.pdf"));
            document.open();
            PdfContentByte canvas = writer.getDirectContentUnder();
            Image image = Image.getInstance("c:/fond_cv.jpg");
            image.setAbsolutePosition(0,80);
            canvas.saveState();
            PdfGState state = new PdfGState();
            state.setFillOpacity(0.6f);
            canvas.setGState(state);
            canvas.addImage(image);
            canvas.restoreState();
            
            LineSeparator lineSepa = new LineSeparator();
            lineSepa.setLineColor(new Color(21, 96, 189));
            Paragraph para1 = new Paragraph();
            Paragraph para2 = new Paragraph(etudiant.getAdresse_rue());
            Paragraph para3 = new Paragraph(etudiant.getCode_postal()+ " " + etudiant.getVille());
            Paragraph para4 = new Paragraph(etudiant.getMail(), FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD, new Color(21, 96, 189)));
            Paragraph para5 = new Paragraph(etudiant.getTel_personnel());
            Paragraph para6 = new Paragraph(etudiant.getTel_professionnel());
            Paragraph para7 = new Paragraph(etudiant.getSite_web());
            para1.add(new Chunk(etudiant.getPrenom(), FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLD, new Color(21, 96, 189))));
            para1.add(new Chunk(" " + etudiant.getNom(), FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLD)));

            Image image1 = Image.getInstance(DaoS4.getPhoto());
            image1.scalePercent(50);
            image1.setAlignment(Image.RIGHT | Image.TEXTWRAP);
            image1.scaleAbsolute(94, 94);
            document.add(image1);

            document.add(para1);
            document.add(para2);
            document.add(para3);
            document.add(para4);
            document.add(para5);
            document.add(para6);
            para7.setSpacingAfter(25f);
            document.add(para7);
            Paragraph para8 = new Paragraph(DaoS4.getLibelleTitre());
            para8.setSpacingBefore(25f);
            para8.setSpacingAfter(20f);
            document.add(para8);

            Paragraph para9 = new Paragraph(new Chunk("EXPERIENCE PROFESSIONELLE", FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD, new Color(21, 96, 189))));
            para9.setSpacingBefore(15f);
            para9.setSpacingAfter(15f);
            document.add(para9);
            document.add(lineSepa);
            Paragraph para10 = new Paragraph(DaoS4.getLibelleExpPro());
            para10.setSpacingAfter(15f);
            document.add(para10);

            Paragraph para11 = new Paragraph(new Chunk("FORMATION", FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD, new Color(21, 96, 189))));
            para11.setSpacingBefore(15f);
            para11.setSpacingAfter(15f);
            document.add(para11);
            document.add(lineSepa);
            Paragraph para12 = new Paragraph(DaoS4.getLibelleFormation());
            para12.setSpacingAfter(15f);
            document.add(para12);

            Paragraph para13 = new Paragraph(new Chunk("INFORMATIQUE", FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD, new Color(21, 96, 189))));
            para13.setSpacingBefore(15f);
            para13.setSpacingAfter(15f);
            document.add(para13);
            document.add(lineSepa);
            Paragraph para14 = new Paragraph(DaoS4.getLibelleInformatique());
            para14.setSpacingAfter(15f);
            document.add(para14);

            Paragraph para15 = new Paragraph(new Chunk("LANGUE", FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD, new Color(21, 96, 189))));
            para15.setSpacingBefore(15f);
            para15.setSpacingAfter(15f);
            document.add(para15);
            document.add(lineSepa);
            Paragraph para16 = new Paragraph(DaoS4.getLibelleLangue());
            para16.setSpacingAfter(15f);
            document.add(para16);

            Paragraph para17 = new Paragraph(new Chunk("CENTRES D'INTERET", FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD, new Color(21, 96, 189))));
            para17.setSpacingBefore(15f);
            para17.setSpacingAfter(15f);
            document.add(para17);
            document.add(lineSepa);
            Paragraph para18 = new Paragraph(DaoS4.getLibelleInteret());
            para18.setSpacingAfter(15f);
            document.add(para18);

            document.close();
        } catch (DocumentException ex) {
            Logger.getLogger(ExportPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
