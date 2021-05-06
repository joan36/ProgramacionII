package _escacs;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Rectangle2D;

public class Tauler extends JPanel {

    private static final int DIMENSIO = 8;
    private static final int MAXIM = 600;
    private static final int COSTAT = MAXIM / DIMENSIO;
    private static final Color BLANC = Color.WHITE;
    private static final Color NEGRE = Color.BLACK;

    public Tauler() {
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int y = 0;
        for (int i = 1; i <= DIMENSIO; i++) {
            int x = 0;
            for (int j = 1; j <= DIMENSIO; j++) {
                Rectangle2D.Float r =
                        new Rectangle2D.Float(x, y, COSTAT, COSTAT);
                if ((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
                    g2d.setColor(BLANC);
                } else {
                    g2d.setColor(NEGRE);
                }
                g2d.fill(r);
                x += COSTAT;
            }
            y += COSTAT;
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(MAXIM, MAXIM);
    }
}
