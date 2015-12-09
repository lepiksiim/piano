/** This program should create piano keyboard.
 * If user clicks on the right key, correct sound should be heard.
 */

package Homework;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;





public class Piano extends JApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void paint(Graphics g) {
		g.setColor(Color.white);
		int w = getWidth();
		int h = getHeight();
		
		g.fillRect(0, 0, w, h);
		
		g.setColor(Color.black);
		g.fillRect(100, 100, 20, 20);
	}

}
