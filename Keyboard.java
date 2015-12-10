package Homework;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Keyboard extends JPanel {

	public void paintComponent(Graphics g) { // Võtab akna suuruse ja joonistab
												// klahvid
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();

		g.setColor(Color.WHITE);
		g.fill3DRect(0, 0, width/21, height, true);
	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Java!");
		Keyboard content = new Keyboard();
		window.setContentPane(content);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocation(190, 150);
		window.setSize(1050, 300);
		window.setVisible(true);

	}

}
