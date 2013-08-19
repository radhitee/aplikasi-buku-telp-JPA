/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingGW;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author umbara
 */
public class panelGW extends JPanel {
Image img;//membuat objek img dari class Image

    public panelGW() {
        //saat dikonstruktor kita deklarasikan objek img dari class Image
        img = new ImageIcon(getClass().getResource("/swingGW/gambar.jpg")).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        /*mengconvert Graphics menjadi Graphics2D, krn sebetulnya class inilah
        yang kita gunakan untuk manipulasi, bukan class Graphics*/
        Graphics2D gd = (Graphics2D) g.create();
        gd.drawImage(img, 0, 0, getWidth(), getHeight(), this);//draw gambar kita
        gd.dispose();
    }
    
}
