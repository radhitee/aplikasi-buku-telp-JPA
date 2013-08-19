/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingGW;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author umbara
 */
public class panelTransparantGW extends JPanel {
private Color col;
 public panelTransparantGW() {
        setOpaque(false);
        col = new Color(getBackground().getRed(), getBackground().getGreen(),
                getBackground().getBlue(), 80);
    }
@Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
        col = new Color(getBackground().getRed(), getBackground().getGreen(),
                getBackground().getBlue(), 80);
        repaint();
    }
@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gr = (Graphics2D) g.create();
        gr.setColor(col);
        gr.fillRect(0, 0, getWidth(), getHeight());
        gr.dispose();
    }
}
