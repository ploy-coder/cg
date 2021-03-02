import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Assignment3_59050214 extends JPanel {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("Circle");
		frame.setSize(600, 600);
		Container contentPane = frame.getContentPane();
		contentPane.add(new Assignment3_59050214());
		frame.show();

	}

/////////////////////// POLYGON//////////////////////////////////////////////////////////////
	public void drawPolygon(Graphics2D g2d, int x1, int y1, int x2, int y2, int red, int green, int blue) {

		g2d.setColor(new Color(red, green, blue));// set color
		Polygon p1 = new Polygon();
		p1.addPoint(x1, y1);
		p1.addPoint(x2 + 1, y2 + 1);
		p1.addPoint(x2 - 1, y2 + 1);

		g2d.fillPolygon(p1);// fillcolor
		g2d.drawPolygon(p1);// showpolygon
	}// drawPolygon
///////////////////////drawline/////////////////////////////////////////////////////////////

	public void drawLine(Graphics2D g2d, int x1, int y1, int x2, int y2, int red, int green, int blue) {

		Graphics2D g3 = (Graphics2D) g2d;
		g3.setColor(new Color(red, green, blue)); // set color
		g3.drawLine(x1, y1, x2, y2);

	}// drawLine
///////////////////////plotEx/////////////////////////////////////////////////////////////

	public void plotEx(Graphics2D g2d, int x, int y, int r, int red, int green, int blue) {

		Graphics2D g2 = (Graphics2D) g2d;
		g2.setColor(new Color(red, green, blue));// set color
		g2.drawOval(x, y, r, r);
		g2.drawOval(x + 1, y + 1, r, r);
		g2.drawOval(x - 1, y - 1, r, r);
	}// plotEx
///////////////////////fillCircle1/////////////////////////////////////////////////////////////

	public void fillCircle1(Graphics2D g2d, int x0, int y0, int radius, int red, int green, int blue) {

		int x = 0;
		int y = radius;
		int D = 1 - radius;

		while (x <= y) {

			drawPolygon(g2d, x0, y0, x0 + x, y0 + y, red, green, blue);
			drawPolygon(g2d, x0, y0, x0 + y, y0 + x, red, green, blue);
			drawPolygon(g2d, x0, y0, x0 - y, y0 + x, red, green, blue);
			drawPolygon(g2d, x0, y0, x0 - x, y0 + y, red, green, blue);
			drawPolygon(g2d, x0, y0, x0 - x, y0 - y, red, green, blue);
			drawPolygon(g2d, x0, y0, x0 - y, y0 - x, red, green, blue);
			drawPolygon(g2d, x0, y0, x0 + y, y0 - x, red, green, blue);
			drawPolygon(g2d, x0, y0, x0 + x, y0 - y, red, green, blue);

			x = x + 1;

			if (D >= 0) {
				y = y - 1;

				D = D + 2 * x - 2 * y + 1;
			} // if
			else
				D = D + 2 * x;

		} // while

	}// fillCircle1
///////////////////////lineCircle/////////////////////////////////////////////////////////////

	public void lineCircle(Graphics2D g2d, int x0, int y0, int radius, int size, int red, int green, int blue) {
		int x = 0;
		int y = radius;
		int D = 1 - radius;

		while (x <= y) {
			plotEx(g2d, x0 + x, y0 + y, size, red, green, blue);
			plotEx(g2d, x0 + y, y0 + x, size, red, green, blue);
			plotEx(g2d, x0 - y, y0 + x, size, red, green, blue);
			plotEx(g2d, x0 - x, y0 + y, size, red, green, blue);
			plotEx(g2d, x0 - x, y0 - y, size, red, green, blue);
			plotEx(g2d, x0 - y, y0 - x, size, red, green, blue);
			plotEx(g2d, x0 + y, y0 - x, size, red, green, blue);
			plotEx(g2d, x0 + x, y0 - y, size, red, green, blue);

			x = x + 1;

			if (D >= 0) {
				y = y - 1;

				D = D + 2 * x - 2 * y + 1;
			} // if
			else
				D = D + 2 * x;

		} // while

	}// lineCircle

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		// fillCircle1(g2d, x, y, radius, red, green, blue); ==> red,green,blue color
		// code
		// fillCircle2(g2d, x, y, radius, red, green, blue); ==> red,green,blue color
		// code
		// lineCircle1(g2d, x, y, radius, size, red, green , blue); ==> red,green,blue
		// color code

//_____________background______________

		/////////////////// green 0
		fillCircle1(g2d, 0, 0, 50, 51, 134, 46);
		fillCircle1(g2d, 0, 50, 50, 51, 134, 46);
		fillCircle1(g2d, 0, 100, 50, 51, 134, 46);
		fillCircle1(g2d, 0, 150, 50, 51, 134, 46);
		fillCircle1(g2d, 0, 200, 50, 51, 134, 46);
		fillCircle1(g2d, 0, 250, 50, 51, 134, 46);
		fillCircle1(g2d, 0, 300, 50, 51, 134, 46);
		fillCircle1(g2d, 0, 350, 50, 51, 134, 46);
		fillCircle1(g2d, 0, 400, 50, 51, 134, 46);
		fillCircle1(g2d, 0, 450, 50, 51, 134, 46);
		fillCircle1(g2d, 0, 500, 50, 51, 134, 46);
		fillCircle1(g2d, 0, 550, 50, 51, 134, 46);
		fillCircle1(g2d, 0, 600, 50, 51, 134, 46);
		/////////////////// green 1
		fillCircle1(g2d, 50, 0, 50, 51, 134, 46);
		fillCircle1(g2d, 50, 50, 50, 51, 134, 46);
		fillCircle1(g2d, 50, 100, 50, 51, 134, 46);
		fillCircle1(g2d, 50, 150, 50, 51, 134, 46);
		fillCircle1(g2d, 50, 200, 50, 51, 134, 46);
		fillCircle1(g2d, 50, 250, 50, 51, 134, 46);
		fillCircle1(g2d, 50, 300, 50, 51, 134, 46);
		fillCircle1(g2d, 50, 350, 50, 51, 134, 46);
		fillCircle1(g2d, 50, 400, 50, 51, 134, 46);
		fillCircle1(g2d, 50, 450, 50, 51, 134, 46);
		fillCircle1(g2d, 50, 500, 50, 51, 134, 46);
		fillCircle1(g2d, 50, 550, 50, 51, 134, 46);
		fillCircle1(g2d, 50, 600, 50, 51, 134, 46);
		////////////////// white 1
		fillCircle1(g2d, 150, 0, 50, 255, 255, 255);
		fillCircle1(g2d, 150, 50, 50, 255, 255, 255);
		fillCircle1(g2d, 150, 100, 50, 255, 255, 255);
		fillCircle1(g2d, 150, 150, 50, 255, 255, 255);
		fillCircle1(g2d, 150, 200, 50, 255, 255, 255);
		fillCircle1(g2d, 150, 250, 50, 255, 255, 255);
		fillCircle1(g2d, 150, 300, 50, 255, 255, 255);
		fillCircle1(g2d, 150, 350, 50, 255, 255, 255);
		fillCircle1(g2d, 150, 400, 50, 255, 255, 255);
		fillCircle1(g2d, 150, 450, 50, 255, 255, 255);
		fillCircle1(g2d, 150, 500, 50, 255, 255, 255);
		fillCircle1(g2d, 150, 550, 50, 255, 255, 255);
		fillCircle1(g2d, 150, 600, 50, 255, 255, 255);
		/////////////////////// red 1
		fillCircle1(g2d, 250, 0, 50, 247, 18, 12);
		fillCircle1(g2d, 250, 50, 50, 247, 18, 12);
		fillCircle1(g2d, 250, 100, 50, 247, 18, 12);
		fillCircle1(g2d, 250, 150, 50, 247, 18, 12);
		fillCircle1(g2d, 250, 200, 50, 247, 18, 12);
		fillCircle1(g2d, 250, 250, 50, 247, 18, 12);
		fillCircle1(g2d, 250, 300, 50, 247, 18, 12);
		fillCircle1(g2d, 250, 350, 50, 247, 18, 12);
		fillCircle1(g2d, 250, 400, 50, 247, 18, 12);
		fillCircle1(g2d, 250, 450, 50, 247, 18, 12);
		fillCircle1(g2d, 250, 500, 50, 247, 18, 12);
		fillCircle1(g2d, 250, 550, 50, 247, 18, 12);
		fillCircle1(g2d, 250, 600, 50, 247, 18, 12);
		/////////////////// green 2
		fillCircle1(g2d, 350, 0, 50, 51, 134, 46);
		fillCircle1(g2d, 350, 50, 50, 51, 134, 46);
		fillCircle1(g2d, 350, 100, 50, 51, 134, 46);
		fillCircle1(g2d, 350, 150, 50, 51, 134, 46);
		fillCircle1(g2d, 350, 200, 50, 51, 134, 46);
		fillCircle1(g2d, 350, 250, 50, 51, 134, 46);
		fillCircle1(g2d, 350, 300, 50, 51, 134, 46);
		fillCircle1(g2d, 350, 350, 50, 51, 134, 46);
		fillCircle1(g2d, 350, 400, 50, 51, 134, 46);
		fillCircle1(g2d, 350, 450, 50, 51, 134, 46);
		fillCircle1(g2d, 350, 500, 50, 51, 134, 46);
		fillCircle1(g2d, 350, 550, 50, 51, 134, 46);
		fillCircle1(g2d, 350, 600, 50, 51, 134, 46);
		////////////////// white 2
		fillCircle1(g2d, 450, 0, 50, 255, 255, 255);
		fillCircle1(g2d, 450, 50, 50, 255, 255, 255);
		fillCircle1(g2d, 450, 100, 50, 255, 255, 255);
		fillCircle1(g2d, 450, 150, 50, 255, 255, 255);
		fillCircle1(g2d, 450, 200, 50, 255, 255, 255);
		fillCircle1(g2d, 450, 250, 50, 255, 255, 255);
		fillCircle1(g2d, 450, 300, 50, 255, 255, 255);
		fillCircle1(g2d, 450, 350, 50, 255, 255, 255);
		fillCircle1(g2d, 450, 400, 50, 255, 255, 255);
		fillCircle1(g2d, 450, 450, 50, 255, 255, 255);
		fillCircle1(g2d, 450, 500, 50, 255, 255, 255);
		fillCircle1(g2d, 450, 550, 50, 255, 255, 255);
		fillCircle1(g2d, 450, 600, 50, 255, 255, 255);
		/////////////////////// red 2
		fillCircle1(g2d, 550, 0, 50, 247, 18, 12);
		fillCircle1(g2d, 550, 50, 50, 247, 18, 12);
		fillCircle1(g2d, 550, 100, 50, 247, 18, 12);
		fillCircle1(g2d, 550, 150, 50, 247, 18, 12);
		fillCircle1(g2d, 550, 200, 50, 247, 18, 12);
		fillCircle1(g2d, 550, 250, 50, 247, 18, 12);
		fillCircle1(g2d, 550, 300, 50, 247, 18, 12);
		fillCircle1(g2d, 550, 350, 50, 247, 18, 12);
		fillCircle1(g2d, 550, 400, 50, 247, 18, 12);
		fillCircle1(g2d, 550, 450, 50, 247, 18, 12);
		fillCircle1(g2d, 550, 500, 50, 247, 18, 12);
		fillCircle1(g2d, 550, 550, 50, 247, 18, 12);
		fillCircle1(g2d, 550, 600, 50, 247, 18, 12);
		/////////////////// green 3
		fillCircle1(g2d, 75, 0, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 10, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 20, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 30, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 40, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 50, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 60, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 70, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 80, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 90, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 100, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 110, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 120, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 130, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 140, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 150, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 160, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 170, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 180, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 190, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 200, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 210, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 220, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 230, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 240, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 250, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 260, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 270, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 280, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 290, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 300, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 310, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 320, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 330, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 340, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 350, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 360, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 370, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 380, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 390, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 400, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 410, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 420, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 430, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 440, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 450, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 460, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 470, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 480, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 490, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 500, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 510, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 520, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 530, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 540, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 550, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 560, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 570, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 580, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 590, 25, 51, 134, 46);
		fillCircle1(g2d, 75, 600, 25, 51, 134, 46);
		/////////////////// white 3
		fillCircle1(g2d, 125, 0, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 10, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 20, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 30, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 40, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 50, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 60, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 70, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 80, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 90, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 100, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 110, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 120, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 130, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 140, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 150, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 160, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 170, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 180, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 190, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 200, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 210, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 220, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 230, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 240, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 250, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 260, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 270, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 280, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 290, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 300, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 310, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 320, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 330, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 340, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 350, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 360, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 370, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 380, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 390, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 400, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 410, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 420, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 430, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 440, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 450, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 460, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 470, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 480, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 490, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 500, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 510, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 520, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 530, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 540, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 550, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 560, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 570, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 580, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 590, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 600, 25, 255, 255, 255);
		/////////////////// white 4 , 5 , 6
		fillCircle1(g2d, 175, 0, 25, 225, 225, 225);
		fillCircle1(g2d, 175, 10, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 20, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 30, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 40, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 50, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 60, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 70, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 80, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 90, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 100, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 110, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 120, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 130, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 140, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 150, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 160, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 170, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 180, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 190, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 200, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 210, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 220, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 230, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 240, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 250, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 260, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 270, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 280, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 290, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 300, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 310, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 320, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 330, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 340, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 350, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 360, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 370, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 380, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 390, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 400, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 410, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 420, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 430, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 440, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 450, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 460, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 470, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 480, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 490, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 500, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 510, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 520, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 530, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 540, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 550, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 560, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 570, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 580, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 590, 25, 255, 255, 255);
		fillCircle1(g2d, 175, 600, 25, 255, 255, 255);
		fillCircle1(g2d, 125, 0, 25, 255, 255, 255);

		fillCircle1(g2d, 425, 0, 25, 225, 225, 225);
		fillCircle1(g2d, 425, 10, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 20, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 30, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 40, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 50, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 60, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 70, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 80, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 90, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 100, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 110, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 120, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 130, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 140, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 150, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 160, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 170, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 180, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 190, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 200, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 210, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 220, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 230, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 240, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 250, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 260, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 270, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 280, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 290, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 300, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 310, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 320, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 330, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 340, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 350, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 360, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 370, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 380, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 390, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 400, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 410, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 420, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 430, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 440, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 450, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 460, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 470, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 480, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 490, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 500, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 510, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 520, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 530, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 540, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 550, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 560, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 570, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 580, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 590, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 600, 25, 255, 255, 255);
		fillCircle1(g2d, 425, 0, 25, 255, 255, 255);

		fillCircle1(g2d, 475, 0, 25, 225, 225, 225);
		fillCircle1(g2d, 475, 10, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 20, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 30, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 40, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 50, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 60, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 70, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 80, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 90, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 100, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 110, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 120, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 130, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 140, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 150, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 160, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 170, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 180, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 190, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 200, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 210, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 220, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 230, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 240, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 250, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 260, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 270, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 280, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 290, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 300, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 310, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 320, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 330, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 340, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 350, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 360, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 370, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 380, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 390, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 400, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 410, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 420, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 430, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 440, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 450, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 460, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 470, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 480, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 490, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 500, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 510, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 520, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 530, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 540, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 550, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 560, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 570, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 580, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 590, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 600, 25, 255, 255, 255);
		fillCircle1(g2d, 475, 0, 25, 255, 255, 255);
		/////////////////// red 3
		fillCircle1(g2d, 225, 0, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 10, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 20, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 30, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 40, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 50, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 60, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 70, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 80, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 90, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 100, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 110, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 120, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 130, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 140, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 150, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 160, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 170, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 180, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 190, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 200, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 210, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 220, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 230, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 240, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 250, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 260, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 270, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 280, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 290, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 300, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 310, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 320, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 330, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 340, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 350, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 360, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 370, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 380, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 390, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 400, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 410, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 420, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 430, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 440, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 450, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 460, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 470, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 480, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 490, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 500, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 510, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 520, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 530, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 540, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 550, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 560, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 570, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 580, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 590, 25, 247, 18, 12);
		fillCircle1(g2d, 225, 600, 25, 247, 18, 12);
		/////////////////// red 4 , 5
		fillCircle1(g2d, 275, 0, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 10, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 20, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 30, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 40, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 50, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 60, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 70, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 80, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 90, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 100, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 110, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 120, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 130, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 140, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 150, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 160, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 170, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 180, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 190, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 200, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 210, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 220, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 230, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 240, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 250, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 260, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 270, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 280, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 290, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 300, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 310, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 320, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 330, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 340, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 350, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 360, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 370, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 380, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 390, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 400, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 410, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 420, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 430, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 440, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 450, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 460, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 470, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 480, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 490, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 500, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 510, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 520, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 530, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 540, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 550, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 560, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 570, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 580, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 590, 25, 247, 18, 12);
		fillCircle1(g2d, 275, 600, 25, 247, 18, 12);

		fillCircle1(g2d, 525, 0, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 10, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 20, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 30, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 40, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 50, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 60, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 70, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 80, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 90, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 100, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 110, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 120, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 130, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 140, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 150, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 160, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 170, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 180, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 190, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 200, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 210, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 220, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 230, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 240, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 250, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 260, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 270, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 280, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 290, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 300, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 310, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 320, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 330, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 340, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 350, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 360, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 370, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 380, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 390, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 400, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 410, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 420, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 430, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 440, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 450, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 460, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 470, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 480, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 490, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 500, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 510, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 520, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 530, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 540, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 550, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 560, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 570, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 580, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 590, 25, 247, 18, 12);
		fillCircle1(g2d, 525, 600, 25, 247, 18, 12);
		/////////////////// green 4
		fillCircle1(g2d, 325, 0, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 10, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 20, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 30, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 40, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 50, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 60, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 70, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 80, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 90, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 100, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 110, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 120, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 130, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 140, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 150, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 160, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 170, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 180, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 190, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 200, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 210, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 220, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 230, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 240, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 250, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 260, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 270, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 280, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 290, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 300, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 310, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 320, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 330, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 340, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 350, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 360, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 370, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 380, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 390, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 400, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 410, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 420, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 430, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 440, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 450, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 460, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 470, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 480, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 490, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 500, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 510, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 520, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 530, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 540, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 550, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 560, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 570, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 580, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 590, 25, 51, 134, 46);
		fillCircle1(g2d, 325, 600, 25, 51, 134, 46);
		/////////////////// green 5
		fillCircle1(g2d, 375, 0, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 10, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 20, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 30, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 40, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 50, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 60, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 70, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 80, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 90, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 100, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 110, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 120, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 130, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 140, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 150, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 160, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 170, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 180, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 190, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 200, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 210, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 220, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 230, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 240, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 250, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 260, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 270, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 280, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 290, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 300, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 310, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 320, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 330, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 340, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 350, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 360, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 370, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 380, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 390, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 400, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 410, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 420, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 430, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 440, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 450, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 460, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 470, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 480, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 490, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 500, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 510, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 520, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 530, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 540, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 550, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 560, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 570, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 580, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 590, 25, 51, 134, 46);
		fillCircle1(g2d, 375, 600, 25, 51, 134, 46);
/////////////////////side1/////////////////////////////////////////////////////////////
		fillCircle1(g2d, 308, 325, 98, 73, 3, 1); // 1
		fillCircle1(g2d, 356, 560, 120, 73, 3, 1); // 2
		fillCircle1(g2d, 225, 143, 87, 73, 3, 1); // 3
		fillCircle1(g2d, 125, 447, 70, 73, 3, 1); // 4
		fillCircle1(g2d, 496, 396, 47, 73, 3, 1); // 5
		fillCircle1(g2d, -19, 124, 85, 73, 3, 1); // 8
		fillCircle1(g2d, 29, 282, 55, 73, 3, 1); // 10

/////////////////////1//////////////////////////////////////////////////////////////
		fillCircle1(g2d, 308, 324, 89, 25, 15, 6); // 1
		fillCircle1(g2d, 240, 321, 17, 217, 132, 41); // 1/1
		fillCircle1(g2d, 244, 347, 17, 217, 132, 41); // 1/2
		fillCircle1(g2d, 259, 370, 17, 217, 132, 41); // 1/3
		fillCircle1(g2d, 280, 385, 17, 217, 132, 41); // 1/4
		fillCircle1(g2d, 306, 392, 17, 217, 132, 41); // 1/5
		fillCircle1(g2d, 333, 387, 17, 217, 132, 41); // 1/6
		fillCircle1(g2d, 355, 375, 17, 217, 132, 41); // 1/7
		fillCircle1(g2d, 370, 353, 17, 217, 132, 41); // 1/8
		fillCircle1(g2d, 376, 328, 17, 217, 132, 41); // 1/9
		fillCircle1(g2d, 372, 301, 17, 217, 132, 41); // 1/10
		fillCircle1(g2d, 359, 278, 17, 217, 132, 41); // 1/11
		fillCircle1(g2d, 337, 261, 17, 217, 132, 41); // 1/12
		fillCircle1(g2d, 311, 256, 17, 217, 132, 41); // 1/13
		fillCircle1(g2d, 285, 259, 17, 217, 132, 41); // 1/14
		fillCircle1(g2d, 262, 273, 17, 217, 132, 41); // 1/15
		fillCircle1(g2d, 246, 295, 17, 217, 132, 41); // 1/16

		fillCircle1(g2d, 307, 324, 56, 219, 38, 29); // 2
		fillCircle1(g2d, 248, 310, 15, 219, 38, 29); // 2/1
		fillCircle1(g2d, 258, 288, 15, 219, 38, 29); // 2/2
		fillCircle1(g2d, 277, 271, 15, 219, 38, 29); // 2/3
		fillCircle1(g2d, 300, 263, 15, 219, 38, 29); // 2/4
		fillCircle1(g2d, 322, 264, 15, 219, 38, 29); // 2/5
		fillCircle1(g2d, 344, 273, 15, 219, 38, 29); // 2/6
		fillCircle1(g2d, 360, 290, 15, 219, 38, 29); // 2/7
		fillCircle1(g2d, 368, 312, 15, 219, 38, 29); // 2/8
		fillCircle1(g2d, 367, 338, 15, 219, 38, 29); // 2/9
		fillCircle1(g2d, 357, 358, 15, 219, 38, 29); // 2/10
		fillCircle1(g2d, 339, 375, 15, 219, 38, 29); // 2/11
		fillCircle1(g2d, 317, 384, 15, 219, 38, 29); // 2/12
		fillCircle1(g2d, 294, 382, 15, 219, 38, 29); // 2/13
		fillCircle1(g2d, 274, 373, 15, 219, 38, 29); // 2/14
		fillCircle1(g2d, 257, 354, 15, 219, 38, 29); // 2/15
		fillCircle1(g2d, 249, 333, 15, 219, 38, 29); // 2/16

		fillCircle1(g2d, 256, 330, 13, 239, 255, 248); // wegg1
		fillCircle1(g2d, 287, 373, 13, 239, 255, 248); // wegg2
		fillCircle1(g2d, 339, 369, 13, 239, 255, 248); // wegg3
		fillCircle1(g2d, 360, 321, 13, 239, 255, 248); // wegg4
		fillCircle1(g2d, 307, 323, 13, 239, 255, 248); // wegg5
		fillCircle1(g2d, 328, 273, 13, 239, 255, 248); // wegg6
		fillCircle1(g2d, 275, 281, 13, 239, 255, 248); // wegg7

		fillCircle1(g2d, 308, 322, 6, 234, 151, 11); // regg1
		fillCircle1(g2d, 257, 329, 6, 234, 151, 11); // regg2
		fillCircle1(g2d, 289, 371, 6, 234, 151, 11); // regg3
		fillCircle1(g2d, 339, 367, 6, 234, 151, 11); // regg4
		fillCircle1(g2d, 361, 319, 6, 234, 151, 11); // regg5
		fillCircle1(g2d, 329, 272, 6, 234, 151, 11); // regg6
		fillCircle1(g2d, 276, 280, 6, 234, 151, 11); // regg7

		lineCircle(g2d, 278, 314, 25, 0, 45, 122, 40);
		lineCircle(g2d, 302, 294, 25, 0, 45, 122, 40);
		lineCircle(g2d, 333, 307, 25, 0, 45, 122, 40);
		lineCircle(g2d, 337, 338, 25, 0, 45, 122, 40);
		lineCircle(g2d, 311, 354, 25, 0, 45, 122, 40);

/////////////////////2//////////////////////////////////////////////////////////////
		fillCircle1(g2d, 355, 562, 111, 25, 15, 6); // 2
		fillCircle1(g2d, 279, 544, 26, 209, 131, 33); // 2/1
		fillCircle1(g2d, 291, 516, 26, 209, 131, 33); // 2/2
		fillCircle1(g2d, 314, 495, 26, 209, 131, 33); // 2/3
		fillCircle1(g2d, 342, 484, 26, 209, 131, 33); // 2/4
		fillCircle1(g2d, 373, 485, 26, 209, 131, 33); // 2/5
		fillCircle1(g2d, 402, 498, 26, 209, 131, 33); // 2/6
		fillCircle1(g2d, 423, 520, 26, 209, 131, 33); // 2/7
		fillCircle1(g2d, 434, 550, 26, 209, 131, 33); // 2/8
		fillCircle1(g2d, 433, 579, 26, 209, 131, 33); // 2/9
		fillCircle1(g2d, 277, 574, 26, 209, 131, 33); // 2/10

		fillCircle1(g2d, 351, 552, 68, 240, 174, 36); // 2
		fillCircle1(g2d, 283, 562, 23, 240, 174, 36); // 2/1
		fillCircle1(g2d, 288, 587, 23, 240, 174, 36); // 2/2
		fillCircle1(g2d, 425, 592, 23, 240, 174, 36); // 2/3
		fillCircle1(g2d, 428, 564, 23, 240, 174, 36); // 2/4
		fillCircle1(g2d, 423, 537, 23, 240, 174, 36); // 2/5
		fillCircle1(g2d, 409, 513, 23, 240, 174, 36); // 2/6
		fillCircle1(g2d, 384, 497, 23, 240, 174, 36); // 2/7
		fillCircle1(g2d, 357, 491, 23, 240, 174, 36); // 2/8
		fillCircle1(g2d, 329, 495, 23, 240, 174, 36); // 2/9
		fillCircle1(g2d, 306, 511, 23, 240, 174, 36); // 2/10
		fillCircle1(g2d, 291, 534, 23, 240, 174, 36); // 2/11

		fillCircle1(g2d, 293, 561, 21, 217, 29, 0); // HAM1

		fillCircle1(g2d, 289, 551, 2, 255, 255, 255); // HAM.1
		fillCircle1(g2d, 292, 574, 2, 255, 255, 255); // HAM.2
		fillCircle1(g2d, 280, 569, 2, 255, 255, 255); // HAM.3
		fillCircle1(g2d, 298, 567, 2, 255, 255, 255); // HAM.4
		fillCircle1(g2d, 304, 571, 2, 255, 255, 255); // HAM.5
		fillCircle1(g2d, 296, 546, 2, 255, 255, 255); // HAM.6
		fillCircle1(g2d, 282, 557, 2, 255, 255, 255); // HAM.7
		fillCircle1(g2d, 303, 560, 3, 255, 255, 255); // HAM.8
		fillCircle1(g2d, 289, 566, 3, 255, 255, 255); // HAM.9
		fillCircle1(g2d, 291, 559, 3, 255, 255, 255); // HAM.10
		fillCircle1(g2d, 302, 552, 3, 255, 255, 255); // HAM.11

		fillCircle1(g2d, 325, 510, 21, 217, 29, 0); // HAM2

		fillCircle1(g2d, 322, 498, 2, 255, 255, 255); // HAM.1
		fillCircle1(g2d, 319, 523, 2, 255, 255, 255); // HAM.2
		fillCircle1(g2d, 309, 513, 2, 255, 255, 255); // HAM.3
		fillCircle1(g2d, 327, 516, 2, 255, 255, 255); // HAM.4
		fillCircle1(g2d, 332, 521, 2, 255, 255, 255); // HAM.5
		fillCircle1(g2d, 330, 495, 2, 255, 255, 255); // HAM.6
		fillCircle1(g2d, 314, 502, 2, 255, 255, 255); // HAM.7
		fillCircle1(g2d, 333, 510, 3, 255, 255, 255); // HAM.8
		fillCircle1(g2d, 318, 513, 3, 255, 255, 255); // HAM.9
		fillCircle1(g2d, 322, 506, 3, 255, 255, 255); // HAM.10
		fillCircle1(g2d, 334, 502, 3, 255, 255, 255); // HAM.11

		fillCircle1(g2d, 386, 512, 21, 217, 29, 0); // HAM3

		fillCircle1(g2d, 394, 504, 2, 255, 255, 255); // HAM.1
		fillCircle1(g2d, 371, 515, 2, 255, 255, 255); // HAM.2
		fillCircle1(g2d, 374, 501, 2, 255, 255, 255); // HAM.3
		fillCircle1(g2d, 381, 518, 2, 255, 255, 255); // HAM.4
		fillCircle1(g2d, 379, 525, 2, 255, 255, 255); // HAM.5
		fillCircle1(g2d, 400, 509, 2, 255, 255, 255); // HAM.6
		fillCircle1(g2d, 386, 500, 2, 255, 255, 255); // HAM.7
		fillCircle1(g2d, 389, 520, 3, 255, 255, 255); // HAM.8
		fillCircle1(g2d, 379, 509, 3, 255, 255, 255); // HAM.9
		fillCircle1(g2d, 387, 508, 3, 255, 255, 255); // HAM.10
		fillCircle1(g2d, 397, 516, 3, 255, 255, 255); // HAM.11

		fillCircle1(g2d, 356, 563, 21, 217, 29, 0); // HAM4

		fillCircle1(g2d, 366, 561, 2, 255, 255, 255); // HAM.1
		fillCircle1(g2d, 341, 559, 2, 255, 255, 255); // HAM.2
		fillCircle1(g2d, 351, 549, 2, 255, 255, 255); // HAM.3
		fillCircle1(g2d, 349, 567, 2, 255, 255, 255); // HAM.4
		fillCircle1(g2d, 344, 572, 2, 255, 255, 255); // HAM.5
		fillCircle1(g2d, 370, 569, 2, 255, 255, 255); // HAM.6
		fillCircle1(g2d, 362, 553, 2, 255, 255, 255); // HAM.7
		fillCircle1(g2d, 355, 572, 3, 255, 255, 255); // HAM.8
		fillCircle1(g2d, 351, 558, 3, 255, 255, 255); // HAM.9
		fillCircle1(g2d, 358, 561, 3, 255, 255, 255); // HAM.10
		fillCircle1(g2d, 363, 573, 3, 255, 255, 255); // HAM.11

		fillCircle1(g2d, 414, 565, 21, 217, 29, 0); // HAM5

		fillCircle1(g2d, 403, 558, 2, 255, 255, 255); // HAM.1
		fillCircle1(g2d, 420, 577, 2, 255, 255, 255); // HAM.2
		fillCircle1(g2d, 406, 578, 2, 255, 255, 255); // HAM.3
		fillCircle1(g2d, 420, 566, 2, 255, 255, 255); // HAM.4
		fillCircle1(g2d, 427, 566, 2, 255, 255, 255); // HAM.5
		fillCircle1(g2d, 406, 550, 2, 255, 255, 255); // HAM.6
		fillCircle1(g2d, 401, 567, 2, 255, 255, 255); // HAM.7
		fillCircle1(g2d, 420, 558, 3, 255, 255, 255); // HAM.8
		fillCircle1(g2d, 412, 571, 3, 255, 255, 255); // HAM.9
		fillCircle1(g2d, 409, 564, 3, 255, 255, 255); // HAM.10
		fillCircle1(g2d, 414, 552, 3, 255, 255, 255); // HAM.11

		fillCircle1(g2d, 326, 546, 5, 255, 109, 52); // w1
		fillCircle1(g2d, 358, 533, 5, 255, 109, 52); // w2
		fillCircle1(g2d, 382, 547, 5, 255, 109, 52); // w3

		fillCircle1(g2d, 314, 541, 2, 255, 109, 52); // w.1
		fillCircle1(g2d, 355, 518, 2, 255, 109, 52); // w.2
		fillCircle1(g2d, 396, 538, 2, 255, 109, 52); // w.3

		fillCircle1(g2d, 417, 530, 8, 75, 93, 11); // g1
		fillCircle1(g2d, 356, 491, 8, 75, 93, 11); // g2
		fillCircle1(g2d, 292, 525, 8, 75, 93, 11); // g3

/////////////////////3///////////////////////////////////////////////////////////////
		fillCircle1(g2d, 226, 142, 80, 25, 15, 6); // 1
		fillCircle1(g2d, 176, 177, 16, 216, 140, 44); // 1/1
		fillCircle1(g2d, 193, 194, 16, 216, 140, 44); // 1/2
		fillCircle1(g2d, 215, 204, 16, 216, 140, 44); // 1/3
		fillCircle1(g2d, 239, 203, 16, 216, 140, 44); // 1/4
		fillCircle1(g2d, 261, 194, 16, 216, 140, 44); // 1/5
		fillCircle1(g2d, 277, 177, 16, 216, 140, 44); // 1/6
		fillCircle1(g2d, 286, 132, 16, 216, 140, 44); // 1/7
		fillCircle1(g2d, 278, 111, 16, 216, 140, 44); // 1/8
		fillCircle1(g2d, 261, 93, 16, 216, 140, 44); // 1/9
		fillCircle1(g2d, 239, 84, 16, 216, 140, 44); // 1/10
		fillCircle1(g2d, 215, 84, 16, 216, 140, 44); // 1/11
		fillCircle1(g2d, 193, 93, 16, 216, 140, 44); // 1/12
		fillCircle1(g2d, 176, 111, 16, 216, 140, 44); // 1/13
		fillCircle1(g2d, 167, 133, 16, 216, 140, 44); // 1/14
		fillCircle1(g2d, 168, 155, 16, 216, 140, 44); // 1/15
		fillCircle1(g2d, 286, 155, 16, 216, 140, 44); // 1/16

		fillCircle1(g2d, 226, 142, 50, 232, 181, 14); // 2
		fillCircle1(g2d, 169, 142, 13, 232, 181, 14); // 2/1
		fillCircle1(g2d, 173, 163, 13, 232, 181, 14); // 2/2
		fillCircle1(g2d, 177, 175, 13, 232, 181, 14); // 2/3
		fillCircle1(g2d, 188, 184, 13, 232, 181, 14); // 2/4
		fillCircle1(g2d, 204, 195, 13, 232, 181, 14); // 2/5
		fillCircle1(g2d, 226, 200, 13, 232, 181, 14); // 2/6
		fillCircle1(g2d, 247, 195, 13, 232, 181, 14); // 2/7
		fillCircle1(g2d, 265, 182, 13, 232, 181, 14); // 2/8
		fillCircle1(g2d, 278, 163, 13, 232, 181, 14); // 2/9
		fillCircle1(g2d, 281, 142, 13, 232, 181, 14); // 2/10
		fillCircle1(g2d, 264, 101, 13, 232, 181, 14); // 2/11
		fillCircle1(g2d, 244, 91, 13, 232, 181, 14); // 2/12
		fillCircle1(g2d, 223, 88, 13, 232, 181, 14); // 2/13
		fillCircle1(g2d, 201, 92, 13, 232, 181, 14); // 2/14
		fillCircle1(g2d, 183, 104, 13, 232, 181, 14); // 2/15
		fillCircle1(g2d, 173, 120, 13, 232, 181, 14); // 2/16
		fillCircle1(g2d, 276, 121, 13, 232, 181, 14); // 2/17

		fillCircle1(g2d, 280, 163, 3, 65, 105, 9); // chg1
		fillCircle1(g2d, 205, 195, 3, 65, 105, 9); // chg2
		fillCircle1(g2d, 174, 121, 3, 65, 105, 9); // chg3
		fillCircle1(g2d, 249, 92, 5, 65, 105, 9); // chg4
		fillCircle1(g2d, 251, 134, 3, 65, 105, 9); // chg5
		fillCircle1(g2d, 237, 168, 4, 65, 105, 9); // chg6
		fillCircle1(g2d, 218, 119, 3, 65, 105, 9); // chg7
		fillCircle1(g2d, 204, 152, 6, 65, 105, 9); // chg8

		fillCircle1(g2d, 251, 194, 5, 252, 8, 33); // chr1
		fillCircle1(g2d, 218, 170, 4, 252, 8, 33); // chr2
		fillCircle1(g2d, 206, 92, 4, 252, 8, 33); // chr3
		fillCircle1(g2d, 278, 122, 3, 252, 8, 33); // chr4
		fillCircle1(g2d, 253, 152, 6, 252, 8, 33); // chr5
		fillCircle1(g2d, 236, 121, 6, 252, 8, 33); // chr6
		fillCircle1(g2d, 203, 129, 4, 252, 8, 33); // chr7
		fillCircle1(g2d, 175, 166, 5, 252, 8, 33); // chr8

		lineCircle(g2d, 179, 142, 13, 2, 208, 40, 155);
		lineCircle(g2d, 195, 110, 13, 2, 208, 40, 155);
		lineCircle(g2d, 228, 97, 13, 2, 208, 40, 155);
		lineCircle(g2d, 260, 111, 13, 2, 208, 40, 155);
		lineCircle(g2d, 275, 142, 13, 2, 208, 40, 155);
		lineCircle(g2d, 263, 175, 13, 2, 208, 40, 155);
		lineCircle(g2d, 227, 192, 13, 2, 208, 40, 155);
		lineCircle(g2d, 194, 175, 13, 2, 208, 40, 155);
		lineCircle(g2d, 228, 143, 13, 2, 208, 40, 155);

		lineCircle(g2d, 179, 142, 11, 2, 255, 229, 179);
		lineCircle(g2d, 195, 110, 11, 2, 255, 229, 179);
		lineCircle(g2d, 228, 97, 11, 2, 255, 229, 179);
		lineCircle(g2d, 260, 111, 11, 2, 255, 229, 179);
		lineCircle(g2d, 275, 142, 11, 2, 255, 229, 179);
		lineCircle(g2d, 263, 175, 11, 2, 255, 229, 179);
		lineCircle(g2d, 227, 192, 11, 2, 255, 229, 179);
		lineCircle(g2d, 194, 175, 11, 2, 255, 229, 179);
		lineCircle(g2d, 228, 143, 11, 2, 255, 229, 179);

/////////////////////4//////////////////////////////////////////////////////////////
		fillCircle1(g2d, 125, 447, 65, 25, 15, 6); // 4
		fillCircle1(g2d, 78, 448, 15, 211, 134, 30); // 2/1
		fillCircle1(g2d, 81, 467, 15, 211, 134, 30); // 2/2
		fillCircle1(g2d, 92, 482, 15, 211, 134, 30); // 2/3
		fillCircle1(g2d, 109, 492, 15, 211, 134, 30); // 2/4
		fillCircle1(g2d, 127, 494, 15, 211, 134, 30); // 2/5
		fillCircle1(g2d, 144, 489, 15, 211, 134, 30); // 2/6
		fillCircle1(g2d, 160, 479, 15, 211, 134, 30); // 2/7
		fillCircle1(g2d, 171, 463, 15, 211, 134, 30); // 2/8
		fillCircle1(g2d, 173, 446, 15, 211, 134, 30); // 2/9
		fillCircle1(g2d, 170, 428, 15, 211, 134, 30); // 2/10
		fillCircle1(g2d, 158, 413, 15, 211, 134, 30); // 2/11
		fillCircle1(g2d, 142, 403, 15, 211, 134, 30); // 2/12
		fillCircle1(g2d, 125, 400, 15, 211, 134, 30); // 2/13
		fillCircle1(g2d, 106, 404, 15, 211, 134, 30); // 2/14
		fillCircle1(g2d, 90, 415, 15, 211, 134, 30); // 2/15
		fillCircle1(g2d, 81, 430, 15, 211, 134, 30); // 2/16

		fillCircle1(g2d, 126, 449, 31, 241, 172, 32); // 2
		fillCircle1(g2d, 87, 440, 17, 241, 172, 32); // 2/1
		fillCircle1(g2d, 92, 426, 17, 241, 172, 32); // 2/2
		fillCircle1(g2d, 99, 417, 17, 241, 172, 32); // 2/3
		fillCircle1(g2d, 114, 409, 17, 241, 172, 32); // 2/4
		fillCircle1(g2d, 132, 408, 17, 241, 172, 32); // 2/5
		fillCircle1(g2d, 147, 414, 17, 241, 172, 32); // 2/6
		fillCircle1(g2d, 157, 424, 17, 241, 172, 32); // 2/7
		fillCircle1(g2d, 164, 437, 17, 241, 172, 32); // 2/8
		fillCircle1(g2d, 165, 454, 17, 241, 172, 32); // 2/9
		fillCircle1(g2d, 159, 467, 17, 241, 172, 32); // 2/10
		fillCircle1(g2d, 149, 478, 17, 241, 172, 32); // 2/11
		fillCircle1(g2d, 135, 485, 17, 241, 172, 32); // 2/12
		fillCircle1(g2d, 119, 486, 17, 241, 172, 32); // 2/13
		fillCircle1(g2d, 105, 481, 17, 241, 172, 32); // 2/14
		fillCircle1(g2d, 94, 471, 17, 241, 172, 32); // 2/15
		fillCircle1(g2d, 88, 457, 17, 241, 172, 32); // 2/16

		fillCircle1(g2d, 89, 449, 12, 217, 8, 3); // HAM1

		fillCircle1(g2d, 94, 444, 1, 255, 255, 255); // HAM.1
		fillCircle1(g2d, 88, 448, 1, 255, 255, 255); // HAM.2
		fillCircle1(g2d, 86, 454, 1, 255, 255, 255); // HAM.3
		fillCircle1(g2d, 95, 449, 1, 255, 255, 255); // HAM.4
		fillCircle1(g2d, 86, 443, 1, 255, 255, 255); // HAM.5
		fillCircle1(g2d, 88, 458, 1, 255, 255, 255); // HAM.6
		fillCircle1(g2d, 81, 454, 1, 255, 255, 255); // HAM.7
		fillCircle1(g2d, 92, 453, 1, 255, 255, 255); // HAM.8
		fillCircle1(g2d, 95, 456, 1, 255, 255, 255); // HAM.9
		fillCircle1(g2d, 90, 440, 1, 255, 255, 255); // HAM.10
		fillCircle1(g2d, 83, 447, 1, 255, 255, 255); // HAM.11

		fillCircle1(g2d, 104, 417, 12, 217, 8, 3); // HAM2

		fillCircle1(g2d, 109, 420, 1, 255, 255, 255); // HAM.1
		fillCircle1(g2d, 105, 411, 1, 255, 255, 255); // HAM.2
		fillCircle1(g2d, 99, 424, 1, 255, 255, 255); // HAM.3
		fillCircle1(g2d, 95, 417, 1, 255, 255, 255); // HAM.4
		fillCircle1(g2d, 105, 421, 1, 255, 255, 255); // HAM.5
		fillCircle1(g2d, 106, 425, 1, 255, 255, 255); // HAM.6
		fillCircle1(g2d, 110, 410, 1, 255, 255, 255); // HAM.7
		fillCircle1(g2d, 100, 412, 1, 255, 255, 255); // HAM.8
		fillCircle1(g2d, 99, 418, 1, 255, 255, 255); // HAM.9
		fillCircle1(g2d, 104, 415, 1, 255, 255, 255); // HAM.10
		fillCircle1(g2d, 112, 415, 1, 255, 255, 255); // HAM.11

		fillCircle1(g2d, 140, 414, 12, 217, 8, 3); // HAM3

		fillCircle1(g2d, 143, 419, 1, 255, 255, 255); // HAM.1
		fillCircle1(g2d, 144, 409, 1, 255, 255, 255); // HAM.2
		fillCircle1(g2d, 132, 418, 1, 255, 255, 255); // HAM.3
		fillCircle1(g2d, 133, 410, 1, 255, 255, 255); // HAM.4
		fillCircle1(g2d, 139, 418, 1, 255, 255, 255); // HAM.5
		fillCircle1(g2d, 138, 422, 1, 255, 255, 255); // HAM.6
		fillCircle1(g2d, 139, 407, 1, 255, 255, 255); // HAM.7
		fillCircle1(g2d, 141, 412, 1, 255, 255, 255); // HAM.8
		fillCircle1(g2d, 148, 416, 1, 255, 255, 255); // HAM.9

		fillCircle1(g2d, 159, 443, 12, 217, 8, 3); // HAM4

		fillCircle1(g2d, 158, 449, 1, 255, 255, 255); // HAM.1
		fillCircle1(g2d, 166, 442, 1, 255, 255, 255); // HAM.2
		fillCircle1(g2d, 152, 440, 1, 255, 255, 255); // HAM.3
		fillCircle1(g2d, 157, 434, 1, 255, 255, 255); // HAM.4
		fillCircle1(g2d, 156, 445, 1, 255, 255, 255); // HAM.5
		fillCircle1(g2d, 153, 447, 1, 255, 255, 255); // HAM.6
		fillCircle1(g2d, 168, 447, 1, 255, 255, 255); // HAM.7
		fillCircle1(g2d, 164, 437, 1, 255, 255, 255); // HAM.8
		fillCircle1(g2d, 157, 439, 1, 255, 255, 255); // HAM.9
		fillCircle1(g2d, 161, 441, 1, 255, 255, 255); // HAM.10
		fillCircle1(g2d, 163, 450, 1, 255, 255, 255); // HAM.11

		fillCircle1(g2d, 145, 475, 12, 217, 8, 3); // HAM5

		fillCircle1(g2d, 139, 477, 1, 255, 255, 255); // HAM.1
		fillCircle1(g2d, 149, 481, 1, 255, 255, 255); // HAM.2
		fillCircle1(g2d, 144, 467, 1, 255, 255, 255); // HAM.3
		fillCircle1(g2d, 152, 469, 1, 255, 255, 255); // HAM.4
		fillCircle1(g2d, 141, 473, 1, 255, 255, 255); // HAM.5
		fillCircle1(g2d, 138, 472, 1, 255, 255, 255); // HAM.6
		fillCircle1(g2d, 146, 485, 1, 255, 255, 255); // HAM.7
		fillCircle1(g2d, 152, 476, 1, 255, 255, 255); // HAM.8
		fillCircle1(g2d, 148, 471, 1, 255, 255, 255); // HAM.9
		fillCircle1(g2d, 147, 477, 1, 255, 255, 255); // HAM.10
		fillCircle1(g2d, 141, 483, 1, 255, 255, 255); // HAM.11

		fillCircle1(g2d, 109, 478, 12, 217, 8, 3); // HAM6

		fillCircle1(g2d, 107, 473, 1, 255, 255, 255); // HAM.1
		fillCircle1(g2d, 106, 483, 1, 255, 255, 255); // HAM.2
		fillCircle1(g2d, 118, 475, 1, 255, 255, 255); // HAM.3
		fillCircle1(g2d, 118, 483, 1, 255, 255, 255); // HAM.4
		fillCircle1(g2d, 112, 474, 1, 255, 255, 255); // HAM.5
		fillCircle1(g2d, 113, 471, 1, 255, 255, 255); // HAM.6
		fillCircle1(g2d, 102, 482, 1, 255, 255, 255); // HAM.7
		fillCircle1(g2d, 111, 486, 1, 255, 255, 255); // HAM.8
		fillCircle1(g2d, 115, 479, 1, 255, 255, 255); // HAM.9
		fillCircle1(g2d, 109, 481, 1, 255, 255, 255); // HAM.10
		fillCircle1(g2d, 103, 477, 1, 255, 255, 255); // HAM.11

		fillCircle1(g2d, 125, 447, 12, 217, 8, 3); // HAM7

		fillCircle1(g2d, 130, 444, 1, 255, 255, 255); // HAM.1
		fillCircle1(g2d, 119, 445, 1, 255, 255, 255); // HAM.2
		fillCircle1(g2d, 131, 454, 1, 255, 255, 255); // HAM.3
		fillCircle1(g2d, 123, 456, 1, 255, 255, 255); // HAM.4
		fillCircle1(g2d, 129, 448, 1, 255, 255, 255); // HAM.5
		fillCircle1(g2d, 134, 448, 1, 255, 255, 255); // HAM.6
		fillCircle1(g2d, 120, 440, 1, 255, 255, 255); // HAM.7
		fillCircle1(g2d, 119, 451, 1, 255, 255, 255); // HAM.8
		fillCircle1(g2d, 126, 453, 1, 255, 255, 255); // HAM.9
		fillCircle1(g2d, 124, 448, 1, 255, 255, 255); // HAM.10
		fillCircle1(g2d, 126, 439, 1, 255, 255, 255); // HAM.11

		fillCircle1(g2d, 109, 440, 3, 255, 255, 252); // w1
		fillCircle1(g2d, 125, 429, 3, 255, 255, 252); // w2
		fillCircle1(g2d, 143, 437, 3, 255, 255, 252); // w3
		fillCircle1(g2d, 144, 454, 3, 255, 255, 252); // w4
		fillCircle1(g2d, 126, 467, 3, 255, 255, 252); // w5
		fillCircle1(g2d, 110, 456, 3, 255, 255, 252); // w6

		fillCircle1(g2d, 100, 464, 1, 255, 255, 252); // w.1
		fillCircle1(g2d, 128, 478, 1, 255, 255, 252); // w.2
		fillCircle1(g2d, 151, 431, 1, 255, 255, 252); // w.3
		fillCircle1(g2d, 154, 460, 1, 255, 255, 252); // w.4
		fillCircle1(g2d, 124, 415, 1, 255, 255, 252); // w.5
		fillCircle1(g2d, 100, 434, 1, 255, 255, 252); // w.6

		fillCircle1(g2d, 90, 471, 4, 75, 93, 11); // g1
		fillCircle1(g2d, 129, 486, 4, 75, 93, 11); // g2
		fillCircle1(g2d, 162, 464, 4, 75, 93, 11); // g3
		fillCircle1(g2d, 160, 423, 4, 75, 93, 11); // g4
		fillCircle1(g2d, 122, 406, 4, 75, 93, 11); // g5
		fillCircle1(g2d, 87, 427, 4, 75, 93, 11); // g6

/////////////////////5//////////////////////////////////////////////////////////////
		fillCircle1(g2d, 496, 394, 43, 25, 15, 6); // 5
		fillCircle1(g2d, 464, 395, 10, 211, 134, 30); // 2/1
		fillCircle1(g2d, 466, 407, 10, 211, 134, 30); // 2/2
		fillCircle1(g2d, 473, 417, 10, 211, 134, 30); // 2/3
		fillCircle1(g2d, 484, 424, 10, 211, 134, 30); // 2/4
		fillCircle1(g2d, 497, 426, 10, 211, 134, 30); // 2/5
		fillCircle1(g2d, 508, 422, 10, 211, 134, 30); // 2/6
		fillCircle1(g2d, 519, 415, 10, 211, 134, 30); // 2/7
		fillCircle1(g2d, 526, 405, 10, 211, 134, 30); // 2/8
		fillCircle1(g2d, 528, 393, 10, 211, 134, 30); // 2/9
		fillCircle1(g2d, 525, 381, 10, 211, 134, 30); // 2/10
		fillCircle1(g2d, 517, 371, 10, 211, 134, 30); // 2/11
		fillCircle1(g2d, 507, 365, 10, 211, 134, 30); // 2/12
		fillCircle1(g2d, 495, 363, 10, 211, 134, 30); // 2/13
		fillCircle1(g2d, 482, 366, 10, 211, 134, 30); // 2/14
		fillCircle1(g2d, 472, 373, 10, 211, 134, 30); // 2/15
		fillCircle1(g2d, 466, 383, 10, 211, 134, 30); // 2/16

		fillCircle1(g2d, 496, 396, 21, 241, 172, 32); // 5
		fillCircle1(g2d, 470, 400, 11, 241, 172, 32); // 2/1
		fillCircle1(g2d, 474, 410, 11, 241, 172, 32); // 2/2
		fillCircle1(g2d, 482, 417, 11, 241, 172, 32); // 2/3
		fillCircle1(g2d, 491, 420, 11, 241, 172, 32); // 2/4
		fillCircle1(g2d, 502, 420, 11, 241, 172, 32); // 2/5
		fillCircle1(g2d, 512, 415, 11, 241, 172, 32); // 2/6
		fillCircle1(g2d, 518, 408, 11, 241, 172, 32); // 2/7
		fillCircle1(g2d, 522, 399, 11, 241, 172, 32); // 2/8
		fillCircle1(g2d, 521, 387, 11, 241, 172, 32); // 2/9
		fillCircle1(g2d, 517, 379, 11, 241, 172, 32); // 2/10
		fillCircle1(g2d, 510, 372, 11, 241, 172, 32); // 2/11
		fillCircle1(g2d, 500, 368, 11, 241, 172, 32); // 2/12
		fillCircle1(g2d, 488, 369, 11, 241, 172, 32); // 2/13
		fillCircle1(g2d, 478, 374, 11, 241, 172, 32); // 2/14
		fillCircle1(g2d, 473, 380, 11, 241, 172, 32); // 2/15
		fillCircle1(g2d, 470, 389, 11, 241, 172, 32); // 2/16

		fillCircle1(g2d, 495, 394, 8, 217, 8, 3); // HAM1
		fillCircle1(g2d, 484, 415, 8, 217, 8, 3); // HAM2
		fillCircle1(g2d, 505, 372, 8, 217, 8, 3); // HAM3
		fillCircle1(g2d, 518, 391, 8, 217, 8, 3); // HAM4
		fillCircle1(g2d, 509, 413, 8, 217, 8, 3); // HAM5
		fillCircle1(g2d, 481, 374, 8, 217, 8, 3); // HAM6
		fillCircle1(g2d, 471, 395, 8, 217, 8, 3); // HAM7

		fillCircle1(g2d, 484, 389, 1, 255, 255, 252); // w1
		fillCircle1(g2d, 495, 381, 1, 255, 255, 252); // w2
		fillCircle1(g2d, 507, 387, 1, 255, 255, 252); // w3
		fillCircle1(g2d, 508, 398, 1, 255, 255, 252); // w4
		fillCircle1(g2d, 495, 407, 1, 255, 255, 252); // w5
		fillCircle1(g2d, 485, 400, 1, 255, 255, 252); // w6

		fillCircle1(g2d, 469, 380, 3, 75, 93, 11); // g1
		fillCircle1(g2d, 493, 366, 3, 75, 93, 11); // g2
		fillCircle1(g2d, 518, 378, 3, 75, 93, 11); // g3
		fillCircle1(g2d, 520, 405, 3, 75, 93, 11); // g4
		fillCircle1(g2d, 498, 420, 3, 75, 93, 11); // g5
		fillCircle1(g2d, 471, 410, 3, 75, 93, 11); // g6

/////////////////////6//////////////////////////////////////////////////////////////
		fillCircle1(g2d, 406, 162, 71, 73, 3, 1); // 1
		fillCircle1(g2d, 406, 162, 66, 25, 15, 6); // 1
		fillCircle1(g2d, 397, 114, 15, 225, 123, 38); // 1/1
		fillCircle1(g2d, 416, 115, 15, 225, 123, 38); // 1/2
		fillCircle1(g2d, 432, 122, 15, 225, 123, 38); // 1/4
		fillCircle1(g2d, 445, 135, 15, 225, 123, 38); // 1/5
		fillCircle1(g2d, 451, 151, 15, 225, 123, 38); // 1/6
		fillCircle1(g2d, 451, 170, 15, 225, 123, 38); // 1/7
		fillCircle1(g2d, 445, 187, 15, 225, 123, 38); // 1/8
		fillCircle1(g2d, 432, 199, 15, 225, 123, 38); // 1/9
		fillCircle1(g2d, 415, 207, 15, 225, 123, 38); // 1/10
		fillCircle1(g2d, 396, 207, 15, 225, 123, 38); // 1/11
		fillCircle1(g2d, 379, 200, 15, 225, 123, 38); // 1/12
		fillCircle1(g2d, 366, 187, 15, 225, 123, 38); // 1/13
		fillCircle1(g2d, 359, 168, 15, 225, 123, 38); // 1/14
		fillCircle1(g2d, 359, 151, 15, 225, 123, 38); // 1/15
		fillCircle1(g2d, 365, 135, 15, 225, 123, 38); // 1/16
		fillCircle1(g2d, 380, 121, 15, 225, 123, 38); // 1/17

		///////////// sauce
		fillCircle1(g2d, 404, 120, 15, 222, 33, 29); // 1
		fillCircle1(g2d, 389, 123, 15, 222, 33, 29); // 2
		fillCircle1(g2d, 421, 123, 15, 222, 33, 29); // 3
		fillCircle1(g2d, 435, 132, 15, 222, 33, 29); // 4
		fillCircle1(g2d, 443, 145, 15, 222, 33, 29); // 5
		fillCircle1(g2d, 446, 160, 15, 222, 33, 29); // 6
		fillCircle1(g2d, 444, 175, 15, 222, 33, 29); // 7
		fillCircle1(g2d, 435, 190, 15, 222, 33, 29); // 8
		fillCircle1(g2d, 422, 198, 15, 222, 33, 29); // 9
		fillCircle1(g2d, 406, 202, 15, 222, 33, 29); // 10
		fillCircle1(g2d, 391, 199, 15, 222, 33, 29); // 11
		fillCircle1(g2d, 376, 191, 15, 222, 33, 29); // 12
		fillCircle1(g2d, 366, 175, 15, 222, 33, 29); // 13
		fillCircle1(g2d, 364, 160, 15, 222, 33, 29); // 14
		fillCircle1(g2d, 366, 145, 15, 222, 33, 29); // 15
		fillCircle1(g2d, 375, 132, 15, 222, 33, 29); // 16
		fillCircle1(g2d, 388, 123, 15, 222, 33, 29); // 17
		fillCircle1(g2d, 405, 161, 40, 222, 33, 29); // 18
		///////////////////// purple
		lineCircle(g2d, 409, 152, 13, 0, 160, 58, 101); // 1
		lineCircle(g2d, 409, 152, 10, 0, 251, 227, 214);
		lineCircle(g2d, 409, 152, 8, 0, 222, 33, 29);
		lineCircle(g2d, 413, 163, 13, 0, 160, 58, 101); // 2
		lineCircle(g2d, 413, 163, 10, 0, 251, 227, 214);
		lineCircle(g2d, 413, 163, 8, 0, 222, 33, 29);
		lineCircle(g2d, 400, 161, 13, 0, 160, 58, 101); // 3
		lineCircle(g2d, 400, 161, 10, 0, 251, 227, 214);
		lineCircle(g2d, 400, 161, 8, 0, 222, 33, 29);

		fillCircle1(g2d, 421, 137, 2, 249, 159, 49); // 1yellow
		fillCircle1(g2d, 394, 139, 2, 249, 159, 49); // 2
		fillCircle1(g2d, 380, 161, 2, 249, 159, 49); // 3
		fillCircle1(g2d, 436, 161, 2, 249, 159, 49); // 4
		fillCircle1(g2d, 394, 184, 2, 249, 159, 49); // 5
		fillCircle1(g2d, 420, 185, 2, 249, 159, 49); // 6

		fillCircle1(g2d, 403, 130, 6, 67, 102, 34); // 1green
		fillCircle1(g2d, 432, 145, 6, 67, 102, 34); // 2
		fillCircle1(g2d, 378, 148, 6, 67, 102, 34); // 3
		fillCircle1(g2d, 434, 175, 6, 67, 102, 34); // 4
		fillCircle1(g2d, 407, 190, 6, 67, 102, 34); // 5
		fillCircle1(g2d, 379, 178, 6, 67, 102, 34); // 6
		fillCircle1(g2d, 404, 114, 2, 67, 102, 34); // 7
		fillCircle1(g2d, 444, 136, 2, 67, 102, 34); // 8
		fillCircle1(g2d, 365, 142, 2, 67, 102, 34); // 9
		fillCircle1(g2d, 365, 179, 2, 67, 102, 34); // 10
		fillCircle1(g2d, 446, 180, 2, 67, 102, 34); // 11
		fillCircle1(g2d, 408, 207, 2, 67, 102, 34); // 12

		fillCircle1(g2d, 417, 118, 3, 255, 255, 255); // 1black
		fillCircle1(g2d, 390, 121, 2, 0, 0, 0); // 2
		fillCircle1(g2d, 435, 126, 2, 255, 255, 255); // 3
		fillCircle1(g2d, 372, 132, 4, 0, 0, 0); // 4
		fillCircle1(g2d, 439, 130, 2, 255, 255, 255); // 5
		fillCircle1(g2d, 449, 145, 2, 0, 0, 0); // 6
		fillCircle1(g2d, 450, 169, 5, 255, 255, 255); // 6
		fillCircle1(g2d, 404, 114, 3, 0, 0, 0); // 7
		fillCircle1(g2d, 362, 154, 3, 255, 255, 255); // 8
		fillCircle1(g2d, 365, 179, 2, 0, 0, 0); // 9
		fillCircle1(g2d, 377, 193, 2, 255, 255, 255); // 10
		fillCircle1(g2d, 395, 205, 2, 0, 0, 0); // 11
		fillCircle1(g2d, 420, 203, 4, 255, 255, 255); // 12
		fillCircle1(g2d, 438, 191, 2, 0, 0, 0); // 13

/////////////////////7//////////////////////////////////////////////////////////////
		fillCircle1(g2d, 576, 124, 87, 73, 3, 1); // 1
		fillCircle1(g2d, 576, 124, 82, 25, 15, 6); // 1
		fillCircle1(g2d, 535, 84, 20, 205, 131, 34); // 1/1
		fillCircle1(g2d, 523, 103, 20, 205, 131, 34); // 1/2
		fillCircle1(g2d, 519, 123, 20, 205, 131, 34); // 1/4
		fillCircle1(g2d, 523, 144, 20, 205, 131, 34); // 1/5
		fillCircle1(g2d, 536, 163, 20, 205, 131, 34); // 1/6
		fillCircle1(g2d, 555, 176, 20, 205, 131, 34); // 1/7
		fillCircle1(g2d, 576, 179, 20, 205, 131, 34); // 1/8
		fillCircle1(g2d, 597, 174, 20, 205, 131, 34); // 1/9
		fillCircle1(g2d, 595, 70, 20, 205, 131, 34); // 1/10
		fillCircle1(g2d, 574, 67, 20, 205, 131, 34); // 1/11
		fillCircle1(g2d, 553, 72, 20, 205, 131, 34); // 1/12

		///////////// sauce
		fillCircle1(g2d, 546, 81, 18, 222, 33, 29); // 1
		fillCircle1(g2d, 531, 95, 18, 222, 33, 29); // 2
		fillCircle1(g2d, 564, 72, 18, 222, 33, 29); // 3
		fillCircle1(g2d, 585, 71, 18, 222, 33, 29); // 4
		fillCircle1(g2d, 524, 114, 18, 222, 33, 29); // 5
		fillCircle1(g2d, 524, 134, 18, 222, 33, 29); // 6
		fillCircle1(g2d, 533, 153, 18, 222, 33, 29); // 7
		fillCircle1(g2d, 546, 165, 18, 222, 33, 29); // 8
		fillCircle1(g2d, 564, 174, 18, 222, 33, 29); // 9
		fillCircle1(g2d, 585, 174, 18, 222, 33, 29); // 10
		fillCircle1(g2d, 581, 121, 54, 222, 33, 29); // 11

		fillCircle1(g2d, 564, 77, 4, 249, 159, 49); // 1yellow
		fillCircle1(g2d, 568, 97, 4, 249, 159, 49); // 2
		fillCircle1(g2d, 595, 108, 4, 249, 159, 49); // 3
		fillCircle1(g2d, 549, 116, 4, 249, 159, 49); // 4
		fillCircle1(g2d, 527, 109, 4, 249, 159, 49); // 5
		fillCircle1(g2d, 600, 136, 4, 249, 159, 49); // 6
		fillCircle1(g2d, 554, 144, 4, 249, 159, 49); // 7
		fillCircle1(g2d, 579, 151, 4, 249, 159, 49); // 8
		fillCircle1(g2d, 535, 156, 4, 249, 159, 49); // 9
		fillCircle1(g2d, 584, 171, 4, 249, 159, 49); // 10

		fillCircle1(g2d, 543, 87, 8, 255, 239, 203); // 1white
		fillCircle1(g2d, 590, 77, 8, 255, 239, 203); // 2
		fillCircle1(g2d, 574, 121, 8, 255, 239, 203); // 3
		fillCircle1(g2d, 528, 132, 8, 255, 239, 203); // 4
		fillCircle1(g2d, 559, 167, 8, 255, 239, 203); // 5
		fillCircle1(g2d, 600, 162, 8, 255, 239, 203); // 6

		fillCircle1(g2d, 592, 76, 4, 249, 159, 49); // 1yellow
		fillCircle1(g2d, 544, 86, 4, 249, 159, 49); // 2
		fillCircle1(g2d, 577, 122, 4, 249, 159, 49); // 3
		fillCircle1(g2d, 529, 131, 4, 249, 159, 49); // 4
		fillCircle1(g2d, 560, 167, 4, 249, 159, 49); // 5

/////////////////////8//////////////////////////////////////////////////////////////
		fillCircle1(g2d, -19, 124, 79, 25, 15, 6); // 1
		fillCircle1(g2d, 16, 89, 23, 205, 131, 34); // 1/1
		fillCircle1(g2d, 0, 79, 23, 205, 131, 34); // 1/2
		fillCircle1(g2d, 1, 170, 23, 205, 131, 34); // 1/3
		fillCircle1(g2d, 17, 160, 23, 205, 131, 34); // 1/4
		fillCircle1(g2d, 27, 144, 23, 205, 131, 34); // 1/5
		fillCircle1(g2d, 31, 124, 23, 205, 131, 34); // 1/6
		fillCircle1(g2d, 28, 106, 23, 205, 131, 34); // 1/7

		fillCircle1(g2d, -19, 123, 50, 220, 43, 25); // 2
		fillCircle1(g2d, -8, 75, 15, 220, 43, 25); // 2/1
		fillCircle1(g2d, -7, 175, 15, 220, 43, 25); // 2/2
		fillCircle1(g2d, 10, 166, 15, 220, 43, 25); // 2/3
		fillCircle1(g2d, 24, 153, 15, 220, 43, 25); // 2/4
		fillCircle1(g2d, 32, 135, 15, 220, 43, 25); // 2/5
		fillCircle1(g2d, 31, 114, 15, 220, 43, 25); // 2/6
		fillCircle1(g2d, 23, 96, 15, 220, 43, 25); // 2/7
		fillCircle1(g2d, 9, 84, 15, 220, 43, 25); // 2/8

		fillCircle1(g2d, 13, 160, 13, 239, 255, 248); // wegg1
		fillCircle1(g2d, 26, 117, 13, 239, 255, 248); // wegg2
		fillCircle1(g2d, -3, 83, 13, 239, 255, 248); // wegg3

		fillCircle1(g2d, 12, 161, 6, 232, 148, 0); // regg1
		fillCircle1(g2d, 26, 118, 6, 232, 148, 0); // regg2
		fillCircle1(g2d, -3, 83, 6, 232, 148, 0); // regg3

		fillCircle1(g2d, 20, 94, 7, 241, 148, 29); // regg4
		fillCircle1(g2d, 27, 140, 7, 241, 148, 29); // regg5
		fillCircle1(g2d, 2, 104, 6, 241, 180, 29); // regg6
		fillCircle1(g2d, 7, 132, 6, 241, 180, 29); // regg7

/////////////////////9//////////////////////////////////////////////////////////////

		fillCircle1(g2d, 503, 254, 58, 73, 3, 1); // 1
		fillCircle1(g2d, 503, 254, 53, 25, 15, 6); // 1
		fillCircle1(g2d, 496, 220, 14, 213, 137, 17); // 1/1
		fillCircle1(g2d, 509, 219, 14, 213, 137, 17); // 1/2
		fillCircle1(g2d, 523, 225, 14, 213, 137, 17); // 1/5
		fillCircle1(g2d, 533, 235, 14, 213, 137, 17); // 1/4
		fillCircle1(g2d, 539, 246, 14, 213, 137, 17); // 1/6
		fillCircle1(g2d, 539, 259, 14, 213, 137, 17); // 1/7
		fillCircle1(g2d, 535, 273, 14, 213, 137, 17); // 1/8
		fillCircle1(g2d, 526, 282, 14, 213, 137, 17); // 1/9
		fillCircle1(g2d, 512, 290, 14, 213, 137, 17); // 1/10
		fillCircle1(g2d, 499, 289, 14, 213, 137, 17); // 1/11
		fillCircle1(g2d, 485, 284, 14, 213, 137, 17); // 1/12
		fillCircle1(g2d, 477, 276, 14, 213, 137, 17); // 1/13
		fillCircle1(g2d, 470, 262, 14, 213, 137, 17); // 1/14
		fillCircle1(g2d, 470, 249, 14, 213, 137, 17); // 1/15
		fillCircle1(g2d, 475, 235, 14, 213, 137, 17); // 1/16
		fillCircle1(g2d, 484, 226, 14, 213, 137, 17); // 1/17

		fillCircle1(g2d, 492, 223, 12, 250, 190, 32); // 1sauce
		fillCircle1(g2d, 504, 221, 12, 250, 190, 32); // 2
		fillCircle1(g2d, 516, 223, 12, 250, 190, 32); // 3
		fillCircle1(g2d, 526, 230, 12, 250, 190, 32); // 4
		fillCircle1(g2d, 535, 240, 12, 250, 190, 32); // 5
		fillCircle1(g2d, 538, 254, 12, 250, 190, 32); // 6
		fillCircle1(g2d, 536, 265, 12, 250, 190, 32); // 7
		fillCircle1(g2d, 530, 276, 12, 250, 190, 32); // 8
		fillCircle1(g2d, 518, 285, 12, 250, 190, 32); // 9
		fillCircle1(g2d, 507, 288, 12, 250, 190, 32); // 10
		fillCircle1(g2d, 481, 279, 12, 250, 190, 32); // 12
		fillCircle1(g2d, 474, 268, 12, 250, 190, 32); // 13
		fillCircle1(g2d, 471, 256, 12, 250, 190, 32); // 14
		fillCircle1(g2d, 473, 242, 12, 250, 190, 32); // 15
		fillCircle1(g2d, 481, 231, 12, 250, 190, 32); // 16
		fillCircle1(g2d, 491, 224, 12, 250, 190, 32); // 17
		fillCircle1(g2d, 493, 285, 12, 250, 190, 32); // 17
		fillCircle1(g2d, 507, 251, 30, 250, 190, 32); // 11

		fillCircle1(g2d, 478, 256, 11, 237, 57, 22); // 1 red
		fillCircle1(g2d, 504, 228, 11, 237, 57, 22); // 2
		fillCircle1(g2d, 505, 256, 11, 237, 57, 22); // 3
		fillCircle1(g2d, 533, 256, 11, 237, 57, 22); // 4
		fillCircle1(g2d, 508, 281, 11, 237, 57, 22); // 5

		fillCircle1(g2d, 502, 225, 3, 255, 255, 255); // 1white
		fillCircle1(g2d, 507, 230, 3, 255, 255, 255); // 2
		fillCircle1(g2d, 503, 232, 3, 255, 255, 255); // 3
		fillCircle1(g2d, 478, 251, 3, 255, 255, 255); // 4
		fillCircle1(g2d, 475, 258, 3, 255, 255, 255); // 5
		fillCircle1(g2d, 483, 257, 3, 255, 255, 255); // 6
		fillCircle1(g2d, 501, 253, 3, 255, 255, 255); // 7
		fillCircle1(g2d, 508, 252, 3, 255, 255, 255); // 8
		fillCircle1(g2d, 505, 259, 3, 255, 255, 255); // 9
		fillCircle1(g2d, 531, 251, 3, 255, 255, 255); // 10
		fillCircle1(g2d, 537, 255, 3, 255, 255, 255); // 11
		fillCircle1(g2d, 530, 259, 3, 255, 255, 255); // 12
		fillCircle1(g2d, 505, 278, 3, 255, 255, 255); // 13
		fillCircle1(g2d, 505, 285, 3, 255, 255, 255); // 14
		fillCircle1(g2d, 510, 282, 3, 255, 255, 255); // 15

		fillCircle1(g2d, 487, 227, 3, 255, 255, 255); // 1white
		fillCircle1(g2d, 475, 239, 3, 255, 255, 255); // 2
		fillCircle1(g2d, 477, 271, 3, 255, 255, 255); // 3
		fillCircle1(g2d, 490, 282, 3, 255, 255, 255); // 4
		fillCircle1(g2d, 523, 282, 3, 255, 255, 255); // 5
		fillCircle1(g2d, 536, 271, 3, 255, 255, 255); // 6
		fillCircle1(g2d, 531, 237, 3, 255, 255, 255); // 7
		fillCircle1(g2d, 521, 226, 3, 255, 255, 255); // 8

		fillCircle1(g2d, 478, 230, 1, 88, 101, 12); // 1green
		fillCircle1(g2d, 480, 231, 1, 88, 101, 12); // 2
		fillCircle1(g2d, 482, 232, 1, 88, 101, 12); // 3
		fillCircle1(g2d, 484, 233, 1, 88, 101, 12); // 4
		fillCircle1(g2d, 486, 234, 1, 88, 101, 12); // 5
		fillCircle1(g2d, 488, 235, 1, 88, 101, 12); // 6
		fillCircle1(g2d, 490, 236, 1, 88, 101, 12); // 7
		fillCircle1(g2d, 492, 237, 1, 88, 101, 12); // 8

		fillCircle1(g2d, 533, 227, 1, 88, 101, 12); // 9
		fillCircle1(g2d, 531, 228, 1, 88, 101, 12); // 10
		fillCircle1(g2d, 529, 229, 1, 88, 101, 12); // 11
		fillCircle1(g2d, 527, 230, 1, 88, 101, 12); // 12
		fillCircle1(g2d, 525, 231, 1, 88, 101, 12); // 13
		fillCircle1(g2d, 523, 232, 1, 88, 101, 12); // 14
		fillCircle1(g2d, 521, 233, 1, 88, 101, 12); // 15
		fillCircle1(g2d, 519, 234, 1, 88, 101, 12); // 16

		fillCircle1(g2d, 477, 281, 1, 88, 101, 12); // 17
		fillCircle1(g2d, 479, 280, 1, 88, 101, 12); // 18
		fillCircle1(g2d, 481, 279, 1, 88, 101, 12); // 19
		fillCircle1(g2d, 483, 278, 1, 88, 101, 12); // 20
		fillCircle1(g2d, 485, 277, 1, 88, 101, 12); // 21
		fillCircle1(g2d, 487, 276, 1, 88, 101, 12); // 22
		fillCircle1(g2d, 489, 275, 1, 88, 101, 12); // 23
		fillCircle1(g2d, 491, 274, 1, 88, 101, 12); // 24

		fillCircle1(g2d, 534, 279, 1, 88, 101, 12); // 25
		fillCircle1(g2d, 532, 277, 1, 88, 101, 12); // 26
		fillCircle1(g2d, 530, 275, 1, 88, 101, 12); // 27
		fillCircle1(g2d, 528, 273, 1, 88, 101, 12); // 28
		fillCircle1(g2d, 526, 271, 1, 88, 101, 12); // 29
		fillCircle1(g2d, 524, 269, 1, 88, 101, 12); // 30
		fillCircle1(g2d, 522, 267, 1, 88, 101, 12); // 31
		fillCircle1(g2d, 520, 265, 1, 88, 101, 12); // 32

/////////////////////10//////////////////////////////////////////////////////////////
		fillCircle1(g2d, 29, 282, 51, 25, 15, 6); // 1
		fillCircle1(g2d, 1, 305, 13, 213, 137, 17); // 1/1
		fillCircle1(g2d, 11, 314, 13, 213, 137, 17); // 1/2
		fillCircle1(g2d, 27, 317, 13, 213, 137, 17); // 1/3
		fillCircle1(g2d, 40, 317, 13, 213, 137, 17); // 1/4
		fillCircle1(g2d, 53, 308, 13, 213, 137, 17); // 1/5
		fillCircle1(g2d, 62, 299, 13, 213, 137, 17); // 1/6
		fillCircle1(g2d, 65, 286, 13, 213, 137, 17); // 1/7
		fillCircle1(g2d, 64, 271, 13, 213, 137, 17); // 1/8
		fillCircle1(g2d, 57, 257, 13, 213, 137, 17); // 1/9
		fillCircle1(g2d, 46, 249, 13, 213, 137, 17); // 1/10
		fillCircle1(g2d, 33, 246, 13, 213, 137, 17); // 1/11
		fillCircle1(g2d, 19, 247, 13, 213, 137, 17); // 1/12
		fillCircle1(g2d, 6, 254, 13, 213, 137, 17); // 1/13

		fillCircle1(g2d, 27, 282, 32, 250, 190, 32); // 2
		fillCircle1(g2d, 3, 260, 11, 250, 190, 32); // 2/1
		fillCircle1(g2d, 8, 309, 11, 250, 190, 32); // 2/2
		fillCircle1(g2d, 19, 315, 11, 250, 190, 32); // 2/3
		fillCircle1(g2d, 34, 316, 11, 250, 190, 32); // 2/4
		fillCircle1(g2d, 34, 315, 11, 250, 190, 32); // 2/5
		fillCircle1(g2d, 46, 311, 11, 250, 190, 32); // 2/6
		fillCircle1(g2d, 55, 304, 11, 250, 190, 32); // 2/7
		fillCircle1(g2d, 63, 290, 11, 250, 190, 32); // 2/8
		fillCircle1(g2d, 62, 278, 11, 250, 190, 32); // 2/9
		fillCircle1(g2d, 58, 265, 11, 250, 190, 32); // 2/10
		fillCircle1(g2d, 51, 256, 11, 250, 190, 32); // 2/11
		fillCircle1(g2d, 39, 249, 11, 250, 190, 32); // 2/12
		fillCircle1(g2d, 26, 248, 11, 250, 190, 32); // 2/13
		fillCircle1(g2d, 13, 251, 11, 250, 190, 32); // 2/14

		fillCircle1(g2d, 8, 265, 11, 237, 57, 22); // r1
		fillCircle1(g2d, 14, 303, 11, 237, 57, 22); // r2
		fillCircle1(g2d, 50, 299, 11, 237, 57, 22); // r3
		fillCircle1(g2d, 46, 261, 11, 237, 57, 22); // r4
		fillCircle1(g2d, 29, 282, 11, 237, 57, 22); // r5

		fillCircle1(g2d, 17, 250, 3, 255, 255, 255); // r1
		fillCircle1(g2d, 34, 249, 3, 255, 255, 255); // r2
		fillCircle1(g2d, 60, 269, 3, 255, 255, 255); // r3
		fillCircle1(g2d, 59, 286, 3, 255, 255, 255); // r4
		fillCircle1(g2d, 42, 313, 3, 255, 255, 255); // r5
		fillCircle1(g2d, 25, 314, 3, 255, 255, 255); // r6
		fillCircle1(g2d, 0, 293, 3, 255, 255, 255); // r7

		fillCircle1(g2d, 46, 301, 1, 255, 255, 255); // w1
		fillCircle1(g2d, 52, 302, 1, 255, 255, 255); // w2
		fillCircle1(g2d, 50, 295, 1, 255, 255, 255); // w3

		fillCircle1(g2d, 9, 305, 1, 255, 255, 255); // w1
		fillCircle1(g2d, 15, 306, 1, 255, 255, 255); // w2
		fillCircle1(g2d, 13, 299, 1, 255, 255, 255); // w3

		fillCircle1(g2d, 41, 263, 1, 255, 255, 255); // w1
		fillCircle1(g2d, 47, 264, 1, 255, 255, 255); // w2
		fillCircle1(g2d, 45, 257, 1, 255, 255, 255); // w3

		fillCircle1(g2d, 27, 277, 1, 255, 255, 255); // w1
		fillCircle1(g2d, 27, 284, 1, 255, 255, 255); // w2
		fillCircle1(g2d, 33, 281, 1, 255, 255, 255); // w3

		fillCircle1(g2d, 10, 268, 1, 255, 255, 255); // w1
		fillCircle1(g2d, 11, 262, 1, 255, 255, 255); // w2
		fillCircle1(g2d, 4, 264, 1, 255, 255, 255); // w3

		lineCircle(g2d, 11, 283, 7, 0, 87, 100, 12);
		lineCircle(g2d, 29, 265, 7, 0, 87, 100, 12);
		lineCircle(g2d, 48, 278, 7, 0, 87, 100, 12);
		lineCircle(g2d, 31, 300, 7, 0, 87, 100, 12);

////////////////////11///////////////////////////////////////////////////////////////
		fillCircle1(g2d, 375, -28, 112, 73, 3, 1); // 1
		fillCircle1(g2d, 375, -28, 106, 25, 15, 6); // 1
		fillCircle1(g2d, 334, 26, 33, 213, 137, 17); // 1/1
		fillCircle1(g2d, 310, 0, 33, 213, 137, 17); // 1/2
		fillCircle1(g2d, 359, 35, 33, 213, 137, 17); // 1/5
		fillCircle1(g2d, 384, 39, 33, 213, 137, 17); // 1/4
		fillCircle1(g2d, 417, 27, 33, 213, 137, 17); // 1/6
		fillCircle1(g2d, 436, 2, 33, 213, 137, 17); // 1/7

		fillCircle1(g2d, 315, -17, 30, 251, 165, 46); // 1sauce
		fillCircle1(g2d, 330, 9, 30, 251, 165, 46); // 2
		fillCircle1(g2d, 350, 26, 30, 251, 165, 46); // 3
		fillCircle1(g2d, 376, 28, 30, 251, 165, 46); // 4
		fillCircle1(g2d, 403, 24, 30, 251, 165, 46); // 5
		fillCircle1(g2d, 423, 9, 30, 251, 165, 46); // 6
		fillCircle1(g2d, 431, -10, 30, 251, 165, 46); // 7

		fillCircle1(g2d, 342, 8, 20, 237, 57, 22); // 1 red
		fillCircle1(g2d, 417, 8, 20, 237, 57, 22); // 2

		fillCircle1(g2d, 335, 8, 3, 255, 255, 255); // 1white
		fillCircle1(g2d, 347, 8, 3, 255, 255, 255); // 2
		fillCircle1(g2d, 338, 20, 3, 255, 255, 255); // 3
		fillCircle1(g2d, 352, 17, 3, 255, 255, 255); // 4
		fillCircle1(g2d, 340, 0, 3, 255, 255, 255); // 5

		fillCircle1(g2d, 415, 3, 3, 255, 255, 255); // 6
		fillCircle1(g2d, 417, 20, 3, 255, 255, 255); // 7
		fillCircle1(g2d, 412, 12, 3, 255, 255, 255); // 8
		fillCircle1(g2d, 432, 14, 3, 255, 255, 255); // 9
		fillCircle1(g2d, 427, 5, 3, 255, 255, 255); // 10

		fillCircle1(g2d, 450, 3, 8, 88, 101, 12); // 1green
		fillCircle1(g2d, 382, 46, 8, 88, 101, 12); // 2
		fillCircle1(g2d, 300, 0, 8, 88, 101, 12); // 3
		fillCircle1(g2d, 382, 13, 8, 88, 101, 12); // 4
		fillCircle1(g2d, 338, 46, 8, 88, 101, 12); // 5

		fillCircle1(g2d, 319, 27, 5, 0, 0, 0); // 1black
		fillCircle1(g2d, 360, 42, 5, 0, 0, 0); // 2
		fillCircle1(g2d, 417, 42, 5, 0, 0, 0); // 3
		fillCircle1(g2d, 388, 0, 5, 0, 0, 0); // 4
		fillCircle1(g2d, 400, 32, 5, 0, 0, 0); // 5

//////////////////////////12///////////////////////////////////////////////////////////////
		fillCircle1(g2d, 105, 11, 74, 73, 3, 1); // 1
		fillCircle1(g2d, 105, 11, 67, 25, 15, 6); // 1

		fillCircle1(g2d, 60, 4, 17, 213, 137, 17); // 1/1
		fillCircle1(g2d, 60, 22, 17, 213, 137, 17); // 1/2
		fillCircle1(g2d, 67, 39, 17, 213, 137, 17); // 1/5
		fillCircle1(g2d, 80, 52, 17, 213, 137, 17); // 1/4
		fillCircle1(g2d, 96, 58, 17, 213, 137, 17); // 1/6
		fillCircle1(g2d, 115, 58, 17, 213, 137, 17); // 1/7
		fillCircle1(g2d, 131, 51, 17, 213, 137, 17); // 1/8
		fillCircle1(g2d, 144, 39, 17, 213, 137, 17); // 1/9
		fillCircle1(g2d, 150, 22, 17, 213, 137, 17); // 1/10
		fillCircle1(g2d, 150, 5, 17, 213, 137, 17); // 1/11

		fillCircle1(g2d, 67, 0, 14, 250, 187, 56); // 1sauce
		fillCircle1(g2d, 64, 14, 14, 250, 187, 56); // 2
		fillCircle1(g2d, 67, 31, 14, 250, 187, 56); // 3
		fillCircle1(g2d, 76, 45, 14, 250, 187, 56); // 4
		fillCircle1(g2d, 89, 53, 14, 250, 187, 56); // 5
		fillCircle1(g2d, 106, 56, 14, 250, 187, 56); // 6
		fillCircle1(g2d, 122, 52, 14, 250, 187, 56); // 7
		fillCircle1(g2d, 136, 43, 14, 250, 187, 56); // 8
		fillCircle1(g2d, 144, 29, 14, 250, 187, 56); // 9
		fillCircle1(g2d, 147, 13, 14, 250, 187, 56); // 10
		fillCircle1(g2d, 144, 0, 14, 250, 187, 56); // 11
		fillCircle1(g2d, 107, 17, 50, 250, 187, 56); // 12

		fillCircle1(g2d, 70, 30, 6, 255, 255, 255); // 1white
		fillCircle1(g2d, 85, 52, 6, 255, 255, 255); // 2
		fillCircle1(g2d, 128, 51, 6, 255, 255, 255); // 3
		fillCircle1(g2d, 144, 29, 6, 255, 255, 255); // 4

		fillCircle1(g2d, 70, 46, 2, 88, 101, 12); // 1green
		fillCircle1(g2d, 72, 45, 2, 88, 101, 12); // 2
		fillCircle1(g2d, 74, 44, 2, 88, 101, 12); // 3
		fillCircle1(g2d, 76, 43, 2, 88, 101, 12); // 4
		fillCircle1(g2d, 78, 42, 2, 88, 101, 12); // 5
		fillCircle1(g2d, 80, 41, 2, 88, 101, 12); // 6
		fillCircle1(g2d, 82, 40, 2, 88, 101, 12); // 7
		fillCircle1(g2d, 84, 39, 2, 88, 101, 12); // 8
		fillCircle1(g2d, 86, 38, 2, 88, 101, 12); // 9
		fillCircle1(g2d, 88, 37, 2, 88, 101, 12); // 10

		fillCircle1(g2d, 144, 46, 2, 88, 101, 12); // 1green
		fillCircle1(g2d, 142, 45, 2, 88, 101, 12); // 2
		fillCircle1(g2d, 140, 44, 2, 88, 101, 12); // 3
		fillCircle1(g2d, 138, 43, 2, 88, 101, 12); // 4
		fillCircle1(g2d, 136, 42, 2, 88, 101, 12); // 5
		fillCircle1(g2d, 134, 41, 2, 88, 101, 12); // 6
		fillCircle1(g2d, 132, 40, 2, 88, 101, 12); // 7
		fillCircle1(g2d, 130, 39, 2, 88, 101, 12); // 8
		fillCircle1(g2d, 128, 38, 2, 88, 101, 12); // 9
		fillCircle1(g2d, 126, 37, 2, 88, 101, 12); // 10

		fillCircle1(g2d, 106, 47, 12, 227, 27, 0); // 1red
		fillCircle1(g2d, 72, 5, 12, 227, 27, 0); // 2
		fillCircle1(g2d, 106, 14, 12, 227, 27, 0); // 3
		fillCircle1(g2d, 139, 8, 12, 227, 27, 0); // 4

/////////////////////////13///////////////////////////////////////////////////////////////
		fillCircle1(g2d, 150, 303, 44, 73, 3, 1); // 1
		fillCircle1(g2d, 150, 303, 38, 25, 15, 6); // 1

		fillCircle1(g2d, 131, 287, 11, 213, 137, 17); // 1/1
		fillCircle1(g2d, 125, 297, 11, 213, 137, 17); // 1/2
		fillCircle1(g2d, 125, 307, 11, 213, 137, 17); // 1/5
		fillCircle1(g2d, 128, 316, 11, 213, 137, 17); // 1/4
		fillCircle1(g2d, 134, 323, 11, 213, 137, 17); // 1/6
		fillCircle1(g2d, 142, 327, 11, 213, 137, 17); // 1/7
		fillCircle1(g2d, 154, 327, 11, 213, 137, 17); // 1/8
		fillCircle1(g2d, 164, 324, 11, 213, 137, 17); // 1/9
		fillCircle1(g2d, 170, 319, 11, 213, 137, 17); // 1/10
		fillCircle1(g2d, 174, 310, 11, 213, 137, 17); // 1/11
		fillCircle1(g2d, 175, 300, 11, 213, 137, 17); // 1/12
		fillCircle1(g2d, 164, 283, 11, 213, 137, 17); // 1/13
		fillCircle1(g2d, 154, 280, 11, 213, 137, 17); // 1/14
		fillCircle1(g2d, 141, 281, 11, 213, 137, 17); // 1/15
		fillCircle1(g2d, 171, 290, 11, 213, 137, 17); // 1/16

		fillCircle1(g2d, 148, 284, 10, 219, 38, 29); // 1sauce
		fillCircle1(g2d, 159, 284, 10, 219, 38, 29); // 2
		fillCircle1(g2d, 168, 290, 10, 219, 38, 29); // 3
		fillCircle1(g2d, 173, 300, 10, 219, 38, 29); // 4
		fillCircle1(g2d, 173, 310, 10, 219, 38, 29); // 5
		fillCircle1(g2d, 170, 316, 10, 219, 38, 29); // 6
		fillCircle1(g2d, 165, 321, 10, 219, 38, 29); // 7
		fillCircle1(g2d, 157, 324, 10, 219, 38, 29); // 8
		fillCircle1(g2d, 149, 324, 10, 219, 38, 29); // 9
		fillCircle1(g2d, 140, 322, 10, 219, 38, 29); // 10
		fillCircle1(g2d, 131, 318, 10, 219, 38, 29); // 11
		fillCircle1(g2d, 129, 310, 10, 219, 38, 29); // 12
		fillCircle1(g2d, 127, 300, 10, 219, 38, 29); // 13
		fillCircle1(g2d, 131, 293, 10, 219, 38, 29); // 14
		fillCircle1(g2d, 138, 285, 10, 219, 38, 29); // 15
		fillCircle1(g2d, 151, 300, 20, 219, 38, 29); // 16

		fillCircle1(g2d, 135, 282, 3, 255, 255, 255); // 1white
		fillCircle1(g2d, 135, 323, 3, 255, 255, 255); // 2
		fillCircle1(g2d, 125, 305, 3, 255, 255, 255); // 3
		fillCircle1(g2d, 174, 305, 3, 255, 255, 255); // 4
		fillCircle1(g2d, 166, 282, 3, 255, 255, 255); // 5
		fillCircle1(g2d, 166, 323, 3, 255, 255, 255); // 6

		fillCircle1(g2d, 127, 294, 2, 88, 101, 12); // 1green
		fillCircle1(g2d, 129, 319, 2, 88, 101, 12); // 2
		fillCircle1(g2d, 150, 327, 2, 88, 101, 12); // 3
		fillCircle1(g2d, 172, 316, 2, 88, 101, 12); // 4
		fillCircle1(g2d, 172, 294, 2, 88, 101, 12); // 5
		fillCircle1(g2d, 151, 282, 2, 88, 101, 12); // 6

		fillCircle1(g2d, 142, 290, 2, 250, 190, 32); // 1yellow
		fillCircle1(g2d, 160, 290, 2, 250, 190, 32); // 2
		fillCircle1(g2d, 160, 315, 2, 250, 190, 32); // 3
		fillCircle1(g2d, 142, 315, 2, 250, 190, 32); // 4
		fillCircle1(g2d, 164, 302, 2, 250, 190, 32); // 5
		fillCircle1(g2d, 137, 300, 2, 250, 190, 32); // 6

		fillCircle1(g2d, 152, 295, 2, 255, 106, 52); // 1pink
		fillCircle1(g2d, 144, 308, 2, 255, 106, 52); // 2
		fillCircle1(g2d, 155, 308, 2, 255, 106, 52); // 3

	}

}
