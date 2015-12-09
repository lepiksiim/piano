/** This program should create piano keyboard.
 * If user clicks on the right key, correct sound should be heard.
 */

package Homework;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Piano implements Runnable {

	public void run() {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setSize(1050, 300);

		window.setLayout(new FlowLayout());

		// Siia for tsükkel, mis loob klahvinupud

		JButton button = new JButton("Key");
		button.addMouseListener(new MouseAdapter() {
			
			//Siia see, et iga klahvi vajutuse peale kostab õige heli
			
			public void mouseClicked(MouseEvent e) {
				System.out.println("click");
			}
		});
		window.add(button);
	}

	// g.setColor(Color.white); //creates white background
	// int w = getWidth();
	// int h = getHeight();
	// g.fillRect(0, 0, w, h);
	// g.setColor(Color.black); //creates a black rectangle
	// g.fillRect(100, 100, 20, 20);
	// }

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Piano());

	}

}
