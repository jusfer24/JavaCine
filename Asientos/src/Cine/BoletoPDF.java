package Asientos.src.Cine;

import SistemaCine.src.SistemaCine.src.User;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BoletoPDF {
    private User user1;
    private Boleto boleto1;
    private Cine.Peliculas pelicula1;

    public void prueba() {
        Boleto boleto1 = new Boleto("A1", user1, pelicula1);
        // step 1: creation of a document-object        
        Document document = new Document();
     
        try {
            // step 2: creation of the writer
            PdfWriter writer = PdfWriter.getInstance(document, 
                    new FileOutputStream("BoletoMK.pdf"));

            // step 3: we open the document
            document.open();
            
            // step 4: we grab the ContentByte and do some stuff with it
            PdfContentByte cb = writer.getDirectContent();
            Graphics g = cb.createGraphicsShapes(PageSize.A5.getWidth(), PageSize.A5.getHeight());

            //--------------------- pagina 1 --------------------------
            g.setColor(new Color(0, 33, 117));
            g.drawRect(1, 1, 419, 590);
            
            g.setColor(new Color(191, 175, 0));
            g.fillOval(190, 90, 190, 100);
                        
            Font font1 = new Font("Tahoma", Font.BOLD + Font.ITALIC, 35);
            g.setFont(font1);

            g.setColor(new Color(0, 33, 117));
            g.drawString("Cine ", 80, 150);
            
            g.setColor(Color.WHITE);
            g.drawString("Andino", 200, 150);

            Font font3 = new Font("Roboto", Font.ITALIC, 12);
            g.setFont(font3);
            g.setColor(Color.BLACK);
            g.drawString("Boleto: "+boleto1.getAsiento(), 50, 190);
            g.drawString("Cedula: ", 50, 210);
            g.drawString("Nombre: "+boleto1.getUser(), 50, 230);
            g.drawString("Fecha de compra: ", 50, 250);
            g.drawString("Pelicula: ", 50, 270);
            
            ImageIcon img1 = new ImageIcon(getClass().getResource("imagenes/play_list_youtube-GUI_Java.jpg"));
            g.drawImage(img1.getImage(), 100, 280, 200, 200, null);
            
            Font font2 = new Font("Tahoma", Font.PLAIN, 15);
            g.setFont(font2);
            g.setColor(Color.BLACK);
            g.drawString("El código QR funciona como su boleto también.", 60, 480);
            
            document.newPage();

        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }

        // step 5: we close the document
        document.close();

        JOptionPane.showMessageDialog(null, 
                "Se creo exitosamente su boleto para "+" Disfrutelo");
    }

}
