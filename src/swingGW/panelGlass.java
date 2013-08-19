/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingGW;

/**
 *
 * @author umbara
 */
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;

/**
 *
 * @author usu
 */
public class panelGlass extends JPanel {

    public panelGlass() {
        super();
        setLayout(null);
        setOpaque(false);
        addMouseListener(new MouseAdapter() {
        });
        addKeyListener(new KeyAdapter() {
        });
    }

    public void showPanel(JPanel panel, Dimension size) {
        removeAll();
        add(panel);
        panel.setBounds(100, 100, size.width, size.height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        GradientPaint paint = new GradientPaint(0, 0, Color.GREEN, getWidth(), getHeight(), Color.YELLOW);

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setComposite(AlphaComposite.SrcOver.derive(0.5F));
        g2.setPaint(paint);
        g2.fillRect(0, 0, getWidth(), getHeight());
    }
}

