import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assignment5_59050214 extends JFrame {

	public Assignment5_59050214() {
		add(new RacaCar());
	}

	public static void main(String[] args) {

		Assignment5_59050214 frame = new Assignment5_59050214();
		frame.setTitle("Need For Speed");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setVisible(true);
	}

	class RacaCar extends JPanel implements ActionListener {
		private int xBase = 20;

		public RacaCar() {
			Timer timer = new Timer(20, this);
			timer.start();

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int yBase = getHeight();
			if (xBase > getWidth())
				xBase = 20;
			else
				xBase += 2;

			Color colorBG = new Color(30, 26, 68);
			g.setColor(colorBG);
			g.fillRect(0, 0, 600, 600);
			Color e = new Color(59, 52, 53);

/////////////////////////////////////////////////star
			Color e1 = new Color(255, 255, 255);
			g.setColor(e1);

			g.fillOval(yBase - 400, xBase + 43, 5, 5);
			g.fillOval(yBase - 500, xBase + 60, 5, 5);
			g.fillOval(yBase - 100, xBase + 100, 5, 5);
			g.fillOval(yBase - 300, xBase + 90, 5, 5);
			g.fillOval(yBase - 10, xBase + 20, 5, 5);
			g.fillOval(yBase - 50, xBase + 60, 5, 5);
			g.fillOval(yBase - 150, xBase + 100, 5, 5);
			g.fillOval(yBase - 200, xBase + 90, 5, 5);
			g.fillOval(yBase - 420, xBase + 60, 5, 5);
			g.fillOval(yBase - 600, xBase + 60, 5, 5);
			g.fillOval(yBase - 540, xBase + 100, 5, 5);
			g.fillOval(yBase - 480, xBase + 90, 5, 5);

			g.fillOval(30, 100, 5, 5);
			g.fillOval(70, 80, 5, 5);
			g.fillOval(90, 150, 5, 5);
			g.fillOval(130, 80, 5, 5);
			g.fillOval(170, 40, 5, 5);
			g.fillOval(240, 20, 5, 5);
			g.fillOval(280, 100, 5, 5);
			g.fillOval(310, 150, 5, 5);
			g.fillOval(340, 80, 5, 5);
			g.fillOval(360, 100, 5, 5);
			g.fillOval(380, 50, 5, 5);
			g.fillOval(400, 150, 5, 5);

			g.fillOval(420, 100, 5, 5);
			g.fillOval(440, 80, 5, 5);
			g.fillOval(470, 150, 5, 5);
			g.fillOval(480, 80, 5, 5);
			g.fillOval(500, 40, 5, 5);
			g.fillOval(520, 20, 5, 5);
			g.fillOval(550, 100, 5, 5);
			g.fillOval(570, 150, 5, 5);
			g.fillOval(580, 80, 5, 5);
			g.fillOval(590, 100, 5, 5);
			g.fillOval(600, 50, 5, 5);

			g.fillOval(10, 20, 5, 5);
			g.fillOval(20, 80, 5, 5);
			g.fillOval(40, 10, 5, 5);
			g.fillOval(60, 30, 5, 5);
			g.fillOval(80, 20, 5, 5);
			g.fillOval(110, 20, 5, 5);
			g.fillOval(150, 150, 5, 5);
			g.fillOval(210, 80, 5, 5);
			g.fillOval(240, 100, 5, 5);
			g.fillOval(280, 50, 5, 5);

////////////////////////////////Sky&Mt.

			Color color11 = new Color(30, 77, 123);
			g.setColor(color11);
			g.fillOval(-55, 95, 188, 188);
			g.fillOval(89, 158, 234, 234);
			g.fillOval(276, 117, 262, 262);
			g.fillOval(459, 74, 269, 269);

			Color color12 = new Color(69, 123, 222);
			g.setColor(color12);
			g.fillOval(-54, 247, 224, 224);
			g.fillOval(141, 321, 231, 169);
			g.fillOval(321, 206, 382, 309);

///////////////////////////////ราง
			Color color6 = new Color(231, 218, 207);
			g.setColor(color6);
			g.fillRect(553, 225, 47, 49);
			g.fillRect(456, 225, 95, 49);
			g.fillRect(359, 225, 95, 49);
			g.fillRect(262, 225, 95, 49);
			g.fillRect(165, 225, 95, 49);
			g.fillRect(66, 225, 97, 49);
			g.fillRect(0, 225, 64, 49);
			g.fillRect(542, 274, 30, 107);

			g.setColor(color6);
			int[] x63 = { 556, 532, 580 };
			int[] y63 = { 257, 288, 288 };
			g.fillPolygon(x63, y63, 3);

			Color color61 = new Color(185, 175, 166);
			g.setColor(color61);
			g.fillRect(553, 238, 47, 15);
			g.fillRect(456, 238, 95, 15);
			g.fillRect(359, 238, 95, 15);
			g.fillRect(262, 238, 95, 15);
			g.fillRect(165, 238, 95, 15);
			g.fillRect(66, 238, 97, 15);
			g.fillRect(0, 238, 64, 15);

			Color color62 = new Color(205, 195, 185);
			g.setColor(color62);
			g.fillRect(553, 258, 47, 8);
			g.fillRect(456, 258, 95, 8);
			g.fillRect(359, 258, 95, 8);
			g.fillRect(262, 258, 95, 8);
			g.fillRect(165, 258, 95, 8);
			g.fillRect(66, 258, 97, 8);
			g.fillRect(0, 258, 64, 8);

//g.setColor(e);
//g.fillOval(xBase+53, yBase-28 ,5,5);
//g.fillOval(xBase+228, yBase-28 ,5,5);

////////////////////////////////////////////////////////BTS

			Color bts1 = new Color(255, 255, 255);
			g.setColor(bts1);
			g.fillRect(-xBase + 310, yBase - 377, 153, 41); // คัน1
			g.fillRect(-xBase + 465, yBase - 377, 133, 41); // คัน2
			g.fillRect(-xBase + 600, yBase - 377, 157, 41); // คัน3

			g.setColor(e);
			for (int i = 310; i <= 312; i++) {
				g.drawRect(-xBase + i, yBase - 371, 10, 25);// หน้า1
			}
			g.fillRect(-xBase + 310, yBase - 371, 153, 3); // เส้นB1
			g.fillRect(-xBase + 465, yBase - 371, 153, 3); // เส้นB2
			g.fillRect(-xBase + 600, yBase - 371, 157, 3); // เส้นB3

			Color bts2 = new Color(215, 84, 49);
			g.setColor(bts2);
			g.fillRect(-xBase + 310, yBase - 343, 17, 4); // เส้นR1
			g.fillRect(-xBase + 330, yBase - 369, 133, 4); // เส้นR1
			g.fillRect(-xBase + 327, yBase - 369, 4, 30); // เส้นR1

			g.fillRect(-xBase + 465, yBase - 369, 133, 4); // เส้นR2
			g.fillRect(-xBase + 600, yBase - 369, 138, 4); // เส้นR3
			g.setColor(e);
			for (int i = 746; i <= 748; i++) {
				g.drawRect(-xBase + i, yBase - 371, 10, 25);// หน้า3
			}
			g.setColor(bts2);
			g.fillRect(-xBase + 740, yBase - 343, 17, 4); // เส้นR3
			g.fillRect(-xBase + 738, yBase - 369, 4, 30); // เส้นR3

			Color bts3 = new Color(0, 86, 126);
			g.setColor(bts3);
			g.fillRect(-xBase + 342, yBase - 348, 120, 12); // เส้นB3
			g.fillRect(-xBase + 466, yBase - 348, 131, 12); // เส้นB2
			g.fillRect(-xBase + 601, yBase - 348, 130, 12); // เส้นB3

			g.setColor(e);
			g.drawRect(-xBase + 345, yBase - 362, 10, 10);// หน้าต่าง1
			g.drawRect(-xBase + 360, yBase - 362, 10, 10);// หน้าต่าง1
			g.drawRect(-xBase + 374, yBase - 362, 50, 10);// หน้าต่าง1
			g.drawRect(-xBase + 427, yBase - 362, 10, 10);// หน้าต่าง1
			g.drawRect(-xBase + 440, yBase - 362, 10, 10);// หน้าต่าง1

			g.setColor(e);
			g.drawRect(-xBase + 481, yBase - 362, 10, 10);// หน้าต่าง2
			g.drawRect(-xBase + 495, yBase - 362, 10, 10);// หน้าต่าง2
			g.drawRect(-xBase + 510, yBase - 362, 50, 10);// หน้าต่าง2
			g.drawRect(-xBase + 564, yBase - 362, 10, 10);// หน้าต่าง2
			g.drawRect(-xBase + 577, yBase - 362, 10, 10);// หน้าต่าง2

			g.setColor(e);
			g.drawRect(-xBase + 617, yBase - 362, 10, 10);// หน้าต่าง3
			g.drawRect(-xBase + 631, yBase - 362, 10, 10);// หน้าต่าง3
			g.drawRect(-xBase + 646, yBase - 362, 50, 10);// หน้าต่าง3
			g.drawRect(-xBase + 700, yBase - 362, 10, 10);// หน้าต่าง3
			g.drawRect(-xBase + 713, yBase - 362, 10, 10);// หน้าต่าง3

///////////////////////////////////////////วัด
			Color color7 = new Color(246, 179, 26);
			g.setColor(color7);
			g.fillRect(0, 346, 221, 109);
			g.fillRect(190, 390, 410, 65);

			g.setColor(color7);
			int[] x20 = { 155, 223, 222 };
			int[] y20 = { 346, 339, 357 };
			g.fillPolygon(x20, y20, 3);
			g.setColor(color7);
			int[] x21 = { 223, 191, 155 };
			int[] y21 = { 339, 315, 346 };
			g.fillPolygon(x21, y21, 3);
			g.setColor(color7);
			int[] x22 = { 220, 222, 237 };
			int[] y22 = { 356, 340, 348 };
			g.fillPolygon(x22, y22, 3);

			g.setColor(color7);
			int[] x23 = { 191, 155, 121 };
			int[] y23 = { 315, 346, 313 };
			g.fillPolygon(x23, y23, 3);
			g.setColor(color7);
			int[] x24 = { 121, 155, 70 };
			int[] y24 = { 313, 346, 346 };
			g.fillPolygon(x24, y24, 3);
			g.setColor(color7);
			int[] x25 = { 70, 39, 0 };
			int[] y25 = { 346, 315, 346 };
			g.fillPolygon(x25, y25, 3);
			g.setColor(color7);
			int[] x26 = { 70, 39, 39 };
			int[] y26 = { 346, 315, 304 };
			g.fillPolygon(x26, y26, 3);
			g.setColor(color7);
			int[] x27 = { 39, 70, 121 };
			int[] y27 = { 304, 346, 313 };
			g.fillPolygon(x27, y27, 3);
			g.setColor(color7);
			int[] x28 = { 121, 39, 73 };
			int[] y28 = { 313, 304, 280 };
			g.fillPolygon(x28, y28, 3);
			g.setColor(color7);
			int[] x29 = { 121, 73, 74 };
			int[] y29 = { 313, 280, 272 };
			g.fillPolygon(x29, y29, 3);
			g.setColor(color7);
			int[] x30 = { 74, 121, 115 };
			int[] y30 = { 272, 313, 223 };
			g.fillPolygon(x30, y30, 3);
			g.setColor(color7);
			int[] x31 = { 115, 121, 155 };
			int[] y31 = { 223, 313, 272 };
			g.fillPolygon(x31, y31, 3);
			g.setColor(color7);
			int[] x32 = { 155, 153, 121 };
			int[] y32 = { 272, 280, 313 };
			g.fillPolygon(x32, y32, 3);
			g.setColor(color7);
			int[] x33 = { 121, 153, 189 };
			int[] y33 = { 313, 280, 303 };
			g.fillPolygon(x33, y33, 3);
			g.setColor(color7);
			int[] x34 = { 189, 189, 121 };
			int[] y34 = { 303, 316, 313 };
			g.fillPolygon(x34, y34, 3);
			g.setColor(color7);
			int[] x35 = { 189, 189, 198 };
			int[] y35 = { 316, 302, 308 };
			g.fillPolygon(x35, y35, 3);

			g.setColor(color7);
			int[] x66 = { 37, 30, 42 };
			int[] y66 = { 320, 295, 303 };
			g.fillPolygon(x66, y66, 3);
			g.setColor(color7);
			int[] x67 = { 76, 67, 67 };
			int[] y67 = { 274, 262, 288 };
			g.fillPolygon(x67, y67, 3);

			g.setColor(color7);
			int[] x68 = { 115, 115, 109 };
			int[] y68 = { 196, 225, 220 };
			g.fillPolygon(x68, y68, 3);
			g.setColor(color7);
			int[] x69 = { 120, 115, 115 };
			int[] y69 = { 220, 196, 225 };
			g.fillPolygon(x69, y69, 3);

			g.setColor(color7);
			int[] x70 = { 150, 162, 162 };
			int[] y70 = { 283, 286, 260 };
			g.fillPolygon(x70, y70, 3);
			g.setColor(color7);
			int[] x71 = { 185, 198, 198 };
			int[] y71 = { 303, 295, 310 };
			g.fillPolygon(x71, y71, 3);
			g.setColor(color7);
			int[] x72 = { 237, 228, 237 };
			int[] y72 = { 332, 343, 349 };
			g.fillPolygon(x72, y72, 3);

////////////////////////////////////////////รั้ว
			Color color8 = new Color(212, 104, 32);
			g.setColor(color8);
			g.fillRect(0, 374, 138, 70);
			g.fillRect(250, 374, 345, 70);

			g.fillRect(0, 355, 12, 19);
			g.fillRect(17, 355, 30, 19);
			g.fillRect(51, 355, 30, 19);
			g.fillRect(85, 355, 28, 19);
			g.fillRect(113, 339, 25, 35);

			g.fillRect(250, 339, 25, 35);
			g.fillRect(275, 355, 30, 19);
			g.fillRect(307, 355, 30, 19);
			g.fillRect(341, 355, 30, 19);
			g.fillRect(376, 355, 30, 19);
			g.fillRect(410, 355, 30, 19);
			g.fillRect(444, 355, 30, 19);
			g.fillRect(478, 355, 30, 19);
			g.fillRect(512, 355, 30, 19);
			g.fillRect(546, 355, 30, 19);
			g.fillRect(581, 355, 19, 19);

			g.setColor(color8);
			int[] x36 = { 0, 12, 0 };
			int[] y36 = { 355, 355, 343 };
			g.fillPolygon(x36, y36, 3);
			g.setColor(color8);
			int[] x37 = { 17, 47, 32 };
			int[] y37 = { 355, 355, 343 };
			g.fillPolygon(x37, y37, 3);
			g.setColor(color8);
			int[] x38 = { 81, 51, 67 };
			int[] y38 = { 355, 355, 343 };
			g.fillPolygon(x38, y38, 3);
			g.setColor(color8);
			int[] x39 = { 113, 85, 99 };
			int[] y39 = { 355, 355, 343 };
			g.fillPolygon(x39, y39, 3);
			g.setColor(color8);
			int[] x40 = { 138, 113, 138 };
			int[] y40 = { 339, 339, 319 };
			g.fillPolygon(x40, y40, 3);

			g.setColor(color8);
			int[] x41 = { 250, 275, 250 };
			int[] y41 = { 339, 339, 319 };
			g.fillPolygon(x41, y41, 3);
			g.setColor(color8);
			int[] x42 = { 275, 305, 289 };
			int[] y42 = { 355, 355, 343 };
			g.fillPolygon(x42, y42, 3);
			g.setColor(color8);
			int[] x43 = { 307, 337, 321 };
			int[] y43 = { 355, 355, 343 };
			g.fillPolygon(x43, y43, 3);
			g.setColor(color8);
			int[] x44 = { 341, 371, 358 };
			int[] y44 = { 355, 355, 343 };
			g.fillPolygon(x44, y44, 3);
			g.setColor(color8);
			int[] x45 = { 376, 406, 391 };
			int[] y45 = { 355, 355, 343 };
			g.fillPolygon(x45, y45, 3);
			g.setColor(color8);
			int[] x46 = { 410, 440, 425 };
			int[] y46 = { 355, 355, 343 };
			g.fillPolygon(x46, y46, 3);
			g.setColor(color8);
			int[] x47 = { 444, 474, 458 };
			int[] y47 = { 355, 355, 343 };
			g.fillPolygon(x47, y47, 3);
			g.setColor(color8);
			int[] x48 = { 478, 508, 493 };
			int[] y48 = { 355, 355, 343 };
			g.fillPolygon(x48, y48, 3);
			g.setColor(color8);
			int[] x49 = { 512, 542, 526 };
			int[] y49 = { 355, 355, 343 };
			g.fillPolygon(x49, y49, 3);
			g.setColor(color8);
			int[] x50 = { 546, 576, 561 };
			int[] y50 = { 355, 355, 343 };
			g.fillPolygon(x50, y50, 3);
			g.setColor(color8);
			int[] x51 = { 581, 600, 600 };
			int[] y51 = { 355, 355, 343 };
			g.fillPolygon(x51, y51, 3);

//////////////////////////////////////////ถนน
			Color color9 = new Color(162, 152, 143);
			g.setColor(color9);
			g.fillRect(0, 444, 600, 156);

////////////////////////////////////////////////////รูล่าง
			Color praew1 = new Color(244, 210, 158);
			g.setColor(praew1);
			g.fillRect(293, 395, 27, 9);

			Color praew2 = new Color(249, 147, 30);
			g.setColor(praew2);

			g.fillRect(19, 422, 4, 6);
			g.fillRect(47, 422, 4, 6);
			g.fillRect(79, 422, 4, 6);
			g.fillRect(306, 422, 4, 6);
			g.fillRect(335, 422, 4, 6);
			g.fillRect(364, 422, 4, 6);
			g.fillRect(395, 422, 4, 6);
			g.fillRect(424, 422, 4, 6);
			g.fillRect(454, 422, 4, 6);
			g.fillRect(484, 422, 4, 6);
			g.fillRect(515, 422, 4, 6);
			g.fillRect(545, 422, 4, 6);
			g.fillRect(575, 422, 4, 6);
			g.fillRect(605, 422, 4, 6);

//////////////////////////////////////////////////////////รูบน   

			g.setColor(praew2);

			g.fillOval(28, 358, 3, 3);
			g.fillOval(34, 358, 3, 3);
			g.fillOval(31, 355, 3, 3);
			g.fillOval(31, 361, 3, 3);

			g.fillOval(62, 358, 3, 3);
			g.fillOval(68, 358, 3, 3);
			g.fillOval(65, 355, 3, 3);
			g.fillOval(65, 361, 3, 3);

			g.fillOval(96, 358, 3, 3);
			g.fillOval(102, 358, 3, 3);
			g.fillOval(99, 355, 3, 3);
			g.fillOval(99, 361, 3, 3);

			g.setColor(color12);

			g.fillOval(285, 358, 3, 3);
			g.fillOval(291, 358, 3, 3);
			g.fillOval(288, 355, 3, 3);
			g.fillOval(288, 361, 3, 3);

			g.fillOval(318, 358, 3, 3);
			g.fillOval(324, 358, 3, 3);
			g.fillOval(321, 355, 3, 3);
			g.fillOval(321, 361, 3, 3);

			g.fillOval(352, 358, 3, 3);
			g.fillOval(358, 358, 3, 3);
			g.fillOval(355, 355, 3, 3);
			g.fillOval(355, 361, 3, 3);

			g.fillOval(386, 358, 3, 3);
			g.fillOval(392, 358, 3, 3);
			g.fillOval(389, 355, 3, 3);
			g.fillOval(389, 361, 3, 3);

			g.fillOval(420, 358, 3, 3);
			g.fillOval(426, 358, 3, 3);
			g.fillOval(423, 355, 3, 3);
			g.fillOval(423, 361, 3, 3);

			g.fillOval(454, 358, 3, 3);
			g.fillOval(460, 358, 3, 3);
			g.fillOval(457, 355, 3, 3);
			g.fillOval(457, 361, 3, 3);

			g.fillOval(489, 358, 3, 3);
			g.fillOval(495, 358, 3, 3);
			g.fillOval(492, 355, 3, 3);
			g.fillOval(492, 361, 3, 3);

			g.fillOval(523, 358, 3, 3);
			g.fillOval(529, 358, 3, 3);
			g.fillOval(526, 355, 3, 3);
			g.fillOval(526, 361, 3, 3);

			g.fillOval(593, 358, 3, 3);
			g.fillOval(599, 358, 3, 3);
			g.fillOval(596, 355, 3, 3);
			g.fillOval(596, 361, 3, 3);

			Color praew3 = new Color(231, 218, 207);
			g.setColor(praew3);

			g.fillOval(557, 358, 3, 3);
			g.fillOval(563, 358, 3, 3);
			g.fillOval(560, 355, 3, 3);
			g.fillOval(560, 361, 3, 3);

////////////////////////////////////////////////BUSSTOP
			Color BST1 = new Color(212, 214, 215);
			g.setColor(BST1);
			for (int i = 484; i <= 489; i++) {
				g.drawLine(i, 317, i, 480);
			}

			for (int i = 533; i <= 538; i++) {
				g.drawLine(i, 317, i, 480);
			}
			g.fillOval(484, 293, 54, 43);

			Color BST2 = new Color(0, 116, 190);
			g.setColor(BST2);
			g.fillOval(489, 298, 44, 40);
			g.fillRect(489, 318, 44, 31);

			Color BST3 = new Color(255, 255, 254);
			g.setColor(BST3);
			g.fillRect(489, 349, 44, 6);
			Color BST4 = new Color(219, 218, 198);
			g.setColor(BST4);
			g.fillRect(489, 355, 44, 17);
			g.setColor(BST3);
			g.fillRect(494, 316, 31, 11);
			g.fillOval(498, 326, 5, 5);
			g.fillOval(514, 326, 5, 5);

			g.setColor(BST2);
			g.fillRect(506, 319, 4, 4);
			g.setColor(BST2);
			g.fillRect(514, 319, 4, 4);
			g.setColor(BST2);
			g.fillRect(522, 319, 4, 4);
			g.setColor(BST2);
			g.fillRect(497, 319, 4, 7);

////////////////////////////////////////////////BUS
			Color a = new Color(163, 32, 44);
			g.setColor(a);
			g.fillRect(xBase, yBase - 120, 285, 100);
			g.fillRect(xBase + 16, yBase - 123, 25, 4);
			g.fillRect(xBase + 90, yBase - 123, 25, 4);
			g.fillRect(xBase + 165, yBase - 123, 25, 4);
			g.fillRect(xBase + 239, yBase - 123, 25, 4);

			Color d2 = new Color(255, 243, 216);
			g.setColor(d2);
			g.fillRect(xBase, yBase - 62, 285, 8);

			Color d3 = new Color(0, 161, 62);
			g.setColor(d3);
			g.fillRect(xBase, yBase - 64, 285, 3);

			Color b = new Color(255, 255, 255);
			g.setColor(b);
			g.fillRect(xBase + 9, yBase - 100, 47, 34);
			g.fillRect(xBase + 60, yBase - 100, 47, 34);
			g.fillRect(xBase + 165, yBase - 100, 47, 34);
			g.fillRect(xBase + 218, yBase - 100, 47, 34);
			g.fillRect(xBase + 270, yBase - 100, 10, 34);
			g.fillRect(xBase + 115, yBase - 105, 19, 80);
			g.fillRect(xBase + 140, yBase - 105, 19, 80);

			Color c = new Color(27, 64, 82);
			g.setColor(c);
			g.fillRect(xBase + 12, yBase - 97, 42, 28);
			g.fillRect(xBase + 63, yBase - 97, 42, 28);
			g.fillRect(xBase + 168, yBase - 97, 42, 28);
			g.fillRect(xBase + 221, yBase - 97, 42, 28);
			g.fillRect(xBase + 273, yBase - 97, 5, 28);
			g.fillRect(xBase + 118, yBase - 102, 14, 74);
			g.fillRect(xBase + 143, yBase - 102, 14, 74);

			Color d = new Color(255, 23, 22);
			g.setColor(d);
			g.fillRect(xBase - 4, yBase - 50, 4, 13);

			Color d1 = new Color(255, 218, 21);
			g.setColor(d1);
			g.fillRect(xBase - 4, yBase - 40, 4, 10);
			g.fillRect(xBase + 285, yBase - 40, 4, 13);

			g.setColor(e);
			g.fillOval(xBase + 35, yBase - 45, 40, 40);
			g.fillOval(xBase + 210, yBase - 45, 40, 40);

			g.setColor(e1);
			g.fillOval(xBase + 43, yBase - 38, 25, 25);
			g.fillOval(xBase + 218, yBase - 38, 25, 25);

//	  Color z = new Color (128,210,232);
//	  g.setColor(z);
//	  int [ ] z1 = {0,54,31};
//      int [ ] z2 = {0,0,30 };
//       g.fillPolygon(z1, z2, 3);
//g.fillPolygon(poly);

		}
	}
}