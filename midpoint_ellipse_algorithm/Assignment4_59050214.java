import javax.swing.*;
import java.awt.*;

public class Assignment4_59050214 extends JPanel {
	class Vector {
		int x, y;

		Vector(int x, int y) {
			this.x = x;
			this.y = y;
		}

		Vector() {
			x = y = 0;
		}
	}

	public static void main(String[] args) {
		Assignment4_59050214 m = new Assignment4_59050214();

		JFrame f = new JFrame();
		f.add(m); // Add JPanel into JFrame f
		f.setTitle("Ellipse"); // Set Title for the Panel Screen
		f.setSize(600, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	protected void paintComponent(Graphics g2d) {

		createEllipse(g2d, new Vector(0, 300), 300, 600, new Color(255, 255, 255));
		createEllipse(g2d, new Vector(300, 100), 300, 600, new Color(255, 255, 255));
		createEllipse(g2d, new Vector(600, 300), 300, 600, new Color(255, 255, 255));
/////////////////////////////////////////////////////////////1
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(13, 0, 45, 41);
		g2d.fillRect(98, 0, 45, 41);
		g2d.fillRect(185, 0, 45, 41);
		g2d.fillRect(270, 0, 45, 41);
		g2d.fillRect(356, 0, 45, 41);
		g2d.fillRect(442, 0, 45, 41);
		g2d.fillRect(527, 0, 45, 41);
		g2d.setColor(new Color(97, 106, 106));
		g2d.fillRect(0, 41, 600, 3);
/////////////////////////////////////////////////////////////2
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(25, 44, 45, 41);
		g2d.fillRect(111, 44, 45, 41);
		g2d.fillRect(197, 44, 45, 41);
		g2d.fillRect(282, 44, 45, 41);
		g2d.fillRect(367, 44, 45, 41);
		g2d.fillRect(454, 44, 45, 41);
		g2d.fillRect(540, 44, 45, 41);
		g2d.setColor(new Color(97, 106, 106));
		g2d.fillRect(0, 84, 600, 3);
/////////////////////////////////////////////////////////////3
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(37, 87, 45, 41);
		g2d.fillRect(123, 87, 45, 41);
		g2d.fillRect(209, 87, 45, 41);
		g2d.fillRect(295, 87, 45, 41);
		g2d.fillRect(380, 87, 45, 41);
		g2d.fillRect(466, 87, 45, 41);
		g2d.fillRect(551, 87, 45, 41);
		g2d.setColor(new Color(97, 106, 106));
		g2d.fillRect(0, 127, 600, 3);
/////////////////////////////////////////////////////////////4
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(25, 130, 45, 41);
		g2d.fillRect(111, 130, 45, 41);
		g2d.fillRect(196, 130, 45, 41);
		g2d.fillRect(282, 130, 45, 41);
		g2d.fillRect(367, 130, 45, 41);
		g2d.fillRect(454, 130, 45, 41);
		g2d.fillRect(540, 130, 45, 41);
		g2d.setColor(new Color(97, 106, 106));
		g2d.fillRect(0, 170, 600, 3);
/////////////////////////////////////////////////////////////5
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(14, 173, 45, 41);
		g2d.fillRect(98, 173, 45, 41);
		g2d.fillRect(186, 173, 45, 41);
		g2d.fillRect(271, 173, 45, 41);
		g2d.fillRect(356, 173, 45, 41);
		g2d.fillRect(441, 173, 45, 41);
		g2d.fillRect(529, 173, 45, 41);
		g2d.setColor(new Color(97, 106, 106));
		g2d.fillRect(0, 211, 600, 3);
/////////////////////////////////////////////////////////////6
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(26, 214, 45, 41);
		g2d.fillRect(110, 214, 45, 41);
		g2d.fillRect(197, 214, 45, 41);
		g2d.fillRect(282, 214, 45, 41);
		g2d.fillRect(367, 214, 45, 41);
		g2d.fillRect(454, 214, 45, 41);
		g2d.fillRect(539, 214, 45, 41);
		g2d.setColor(new Color(97, 106, 106));
		g2d.fillRect(0, 254, 600, 3);
/////////////////////////////////////////////////////////////7
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(37, 257, 45, 41);
		g2d.fillRect(122, 257, 45, 41);
		g2d.fillRect(209, 257, 45, 41);
		g2d.fillRect(295, 257, 45, 41);
		g2d.fillRect(380, 257, 45, 41);
		g2d.fillRect(466, 257, 45, 41);
		g2d.fillRect(552, 257, 45, 41);
		g2d.setColor(new Color(97, 106, 106));
		g2d.fillRect(0, 297, 600, 3);
/////////////////////////////////////////////////////////////8
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(24, 300, 45, 41);
		g2d.fillRect(110, 300, 45, 41);
		g2d.fillRect(197, 300, 45, 41);
		g2d.fillRect(282, 300, 45, 41);
		g2d.fillRect(367, 300, 45, 41);
		g2d.fillRect(454, 300, 45, 41);
		g2d.fillRect(540, 300, 45, 41);
		g2d.setColor(new Color(97, 106, 106));
		g2d.fillRect(0, 340, 600, 3);
/////////////////////////////////////////////////////////////9
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(13, 343, 45, 41);
		g2d.fillRect(99, 343, 45, 41);
		g2d.fillRect(184, 343, 45, 41);
		g2d.fillRect(270, 343, 45, 41);
		g2d.fillRect(356, 343, 45, 41);
		g2d.fillRect(443, 343, 45, 41);
		g2d.fillRect(528, 343, 45, 41);
		g2d.setColor(new Color(97, 106, 106));
		g2d.fillRect(0, 381, 600, 3);
/////////////////////////////////////////////////////////////10
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(25, 384, 45, 41);
		g2d.fillRect(110, 384, 45, 41);
		g2d.fillRect(197, 384, 45, 41);
		g2d.fillRect(283, 384, 45, 41);
		g2d.fillRect(368, 384, 45, 41);
		g2d.fillRect(453, 384, 45, 41);
		g2d.fillRect(539, 384, 45, 41);
		g2d.setColor(new Color(97, 106, 106));
		g2d.fillRect(0, 425, 600, 3);
/////////////////////////////////////////////////////////////11
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(13, 428, 45, 41);
		g2d.fillRect(100, 428, 45, 41);
		g2d.fillRect(184, 428, 45, 41);
		g2d.fillRect(271, 428, 45, 41);
		g2d.fillRect(357, 428, 45, 41);
		g2d.fillRect(442, 428, 45, 41);
		g2d.fillRect(528, 428, 45, 41);
		g2d.setColor(new Color(97, 106, 106));
		g2d.fillRect(0, 468, 600, 3);
/////////////////////////////////////////////////////////////12
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(26, 471, 45, 41);
		g2d.fillRect(111, 471, 45, 41);
		g2d.fillRect(197, 471, 45, 41);
		g2d.fillRect(283, 471, 45, 41);
		g2d.fillRect(368, 471, 45, 41);
		g2d.fillRect(453, 471, 45, 41);
		g2d.fillRect(539, 471, 45, 41);
		g2d.setColor(new Color(97, 106, 106));
		g2d.fillRect(0, 510, 600, 3);
/////////////////////////////////////////////////////////////13
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(37, 513, 45, 41);
		g2d.fillRect(123, 513, 45, 41);
		g2d.fillRect(208, 513, 45, 41);
		g2d.fillRect(297, 513, 45, 41);
		g2d.fillRect(380, 513, 45, 41);
		g2d.fillRect(465, 513, 45, 41);
		g2d.fillRect(551, 513, 45, 41);
		g2d.setColor(new Color(97, 106, 106));
		g2d.fillRect(0, 554, 600, 3);
/////////////////////////////////////////////////////////////14
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(24, 557, 45, 41);
		g2d.fillRect(111, 557, 45, 41);
		g2d.fillRect(197, 557, 45, 41);
		g2d.fillRect(283, 557, 45, 41);
		g2d.fillRect(368, 557, 45, 41);
		g2d.fillRect(453, 557, 45, 41);
		g2d.fillRect(539, 557, 45, 41);
		g2d.setColor(new Color(97, 106, 106));
		g2d.fillRect(0, 597, 600, 3);

	}

	private void setBackground(Graphics g2d, Color color) {
		g2d.setColor(color);
		for (int i = 0; i < 600; i++) {
			for (int j = 0; j < 600; j++)
				plot(g2d, new Vector(i, j));
		}

	}

	private void plot(Graphics g2d, Vector i) {
		g2d.fillRect(i.x, i.y, 1, 1);
	}

	private void plotQuad(Graphics g2d, Vector i, int x, int y, Color color) {
		plot(g2d, new Vector(i.x + x, i.y + y));
		plot(g2d, new Vector(i.x + x, i.y - y));
		plot(g2d, new Vector(i.x - x, i.y - y));
		plot(g2d, new Vector(i.x - x, i.y + y));

		g2d.setColor(color);

		int xPoly[] = { i.x + x, i.x + x, i.x - x, i.x - x };
		int yPoly[] = { i.y + y, i.y - y, i.y - y, i.y + y };

		Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);

		g2d.drawPolygon(poly);
		g2d.fillPolygon(poly);
	}

	private void createEllipse(Graphics g2d, Vector i, int a, int b, Color color) {

		g2d.setColor(color);

		int a2 = a * a, b2 = b * b;
		int twoA2 = 2 * a2, twoB2 = 2 * b2;

		// Region 1
		int x = 0, y = b;
		int D = Math.round(b2 - a2 * b + a2 / 4);
		int Dx = 0, Dy = twoA2 * y;

		while (Dx <= Dy) {
			plotQuad(g2d, i, x, y, color);

			x++;
			Dx += twoB2;
			D += Dx + b2;

			if (D >= 0) {
				y--;
				Dy -= twoA2;
				D -= Dy;
			}
		}

		// Region 2
		x = a;
		y = 0;
		D = Math.round(b2 - a2 * b + a2 / 4);
		Dx = twoB2 * x;
		Dy = 0;

		while (Dx >= Dy) {
			plotQuad(g2d, i, x, y, color);

			y++;
			Dy += twoA2;
			D += Dy + a2;

			if (D >= 0) {
				x--;
				Dx -= twoB2;
				D -= Dx;
			}
		}

	}
}