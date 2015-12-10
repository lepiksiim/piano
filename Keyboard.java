/** This program creates GUI that shows a keyboard of the piano.
	Size of the window is changeable and therefore the keys do change their size as well.
	By clicking on the keys different sounds should be heard.
*/
package Homework;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.*;
import java.awt.FlowLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Keyboard extends JPanel implements MouseListener {

	public void paintComponent(Graphics g) { // Võtab akna suuruse ja joonistab
												// klahvid
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		int x = 0;
		g.setColor(Color.WHITE);
		for (int i = 0; i < 21; i++) {
			g.fill3DRect(x, 0, width / 21, height, true);
			x = x + width / 21;
		}
		int y = width / 28;
		g.setColor(Color.BLACK);
		for (int k = 0; k < 3; k++) {
			for (int j = 0; j < 7; j++) {
				if (j == 2 || j == 6) {
					y = y + width / 21;
					continue;
				} else {
					g.fill3DRect(y, 0, width / 40, height / 2, true);
					y = y + width / 21;
				}
			}
		}

	}

	public Keyboard() {
		addMouseListener(this);
	}

	public void MousePressed(MouseEvent evt) {
		int pressedX = evt.getX();
		int pressedY = evt.getY();
		// Mida siis teeb.

	}

	public void mouseClicked(MouseEvent evt) {
	}

	public void mouseReleased(MouseEvent evt) {
	}

	public void mouseEntered(MouseEvent evt) {
	}

	public void mouseExited(MouseEvent evt) {
	}

	public static void main(String[] args) {

		JFrame window = new JFrame("Piano Keyboard");
		Keyboard content = new Keyboard();
		window.setContentPane(content);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocation(190, 150);
		window.setSize(1050, 300);
		window.setVisible(true);

	}

}
