package pack1;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel{

    private static final long serialVersionUID = 1L;

    protected void paintComponent (Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(new Color(255, 230, 204));
        g.fillRect(0, 0, 800, 600 );

        g.setColor(Color.BLACK);

        g.drawLine(325, 50, 325, 500);
        g.drawLine(475, 50, 475, 500);

        g.drawLine(175, 200, 625, 200);
        g.drawLine(175, 350, 625, 350);

        g.setColor(Color.BLACK);
        if (GUI.player == 0) {
            g.drawString("Gracz: X", 25, 50);
        }else if (GUI.player == 1) {
            g.drawString("Gracz: O", 25, 50);
        }

        if (GUI.gewiner == 1) {
            g.drawString("Wygrywa Gracz: X", 25, 100);
        }else if (GUI.gewiner == 2) {
            g.drawString("Wygrywa Gracz: O", 25, 100);
        }

        if (GUI.state[0]  == 1) {
            g.drawImage(IamgeLoader.imgX, 175, 50, 150, 150, null);
        }else if (GUI.state[0] == 2) {
            g.drawImage(IamgeLoader.imgO, 175, 50, 150, 150, null);
        }
        if (GUI.state[1]  == 1) {
            g.drawImage(IamgeLoader.imgX, 325, 50, 150, 150, null);
        }else if (GUI.state[1] == 2) {
            g.drawImage(IamgeLoader.imgO, 325, 50, 150, 150, null);
        }
        if (GUI.state[2]  == 1) {
            g.drawImage(IamgeLoader.imgX, 475, 50, 150, 150, null);
        }else if (GUI.state[2] == 2) {
            g.drawImage(IamgeLoader.imgO, 475, 50, 150, 150, null);
        }
        if (GUI.state[3]  == 1) {
            g.drawImage(IamgeLoader.imgX, 175, 200, 150, 150, null);
        }else if (GUI.state[3] == 2) {
            g.drawImage(IamgeLoader.imgO, 175, 200, 150, 150, null);
        }
        if (GUI.state[4]  == 1) {
            g.drawImage(IamgeLoader.imgX, 325, 200, 150, 150, null);
        }else if (GUI.state[4] == 2) {
            g.drawImage(IamgeLoader.imgO, 325, 200, 150, 150, null);
        }
        if (GUI.state[5]  == 1) {
            g.drawImage(IamgeLoader.imgX, 475, 200, 150, 150, null);
        }else if (GUI.state[5] == 2) {
            g.drawImage(IamgeLoader.imgO, 475, 200, 150, 150, null);
        }
        if (GUI.state[6]  == 1) {
            g.drawImage(IamgeLoader.imgX, 175, 350, 150, 150, null);
        }else if (GUI.state[6] == 2) {
            g.drawImage(IamgeLoader.imgO, 175, 350, 150, 150, null);
        }
        if (GUI.state[7]  == 1) {
            g.drawImage(IamgeLoader.imgX, 325, 350, 150, 150, null);
        }else if (GUI.state[7] == 2) {
            g.drawImage(IamgeLoader.imgO, 325, 350, 150, 150, null);
        }
        if (GUI.state[8]  == 1) {
            g.drawImage(IamgeLoader.imgX, 475, 350, 150, 150, null);
        }else if (GUI.state[8] == 2) {
            g.drawImage(IamgeLoader.imgO, 475, 350, 150, 150, null);
        }

        repaint();
    }
}
