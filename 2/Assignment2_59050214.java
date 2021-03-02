import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Assignment2_59050214 extends JPanel {
	public static void main(String[] args) {

		JFrame f = new JFrame("Draw Polygon");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBackground(Color.white);
		f.setSize(600, 600);
		Assignment2_59050214 polygon = new Assignment2_59050214();
		f.add(polygon);
		f.setVisible(true);
	}

	public void paintComponent(Graphics g) {
		drawPolygon(g);
		Testtwo(g);

	}

	public void drawPolygon(Graphics g) {
		Polygon poly = new Polygon();
//1 
		Color my1 = new Color(202, 197, 217);
		g.setColor(my1);

		int[] x1 = { 0, 42, 72 };
		int[] y1 = { 400, 361, 400 };
		g.fillPolygon(x1, y1, 3);
//2
		Color my2 = new Color(201, 200, 198);
		g.setColor(my2);

		int[] x2 = { 94, 42, 72 };
		int[] y2 = { 354, 361, 400 };
		g.fillPolygon(x2, y2, 3);
//3
		Color my3 = new Color(218, 226, 239);
		g.setColor(my3);

		int[] x3 = { 94, 135, 72 };
		int[] y3 = { 354, 373, 400 };
		g.fillPolygon(x3, y3, 3);
//4
		Color my4 = new Color(203, 210, 236);
		g.setColor(my4);

		int[] x4 = { 72, 162, 135 };
		int[] y4 = { 400, 400, 373 };
		g.fillPolygon(x4, y4, 3);
//5
		Color my5 = new Color(208, 218, 227);
		g.setColor(my5);

		int[] x5 = { 164, 135, 162 };
		int[] y5 = { 346, 373, 400 };
		g.fillPolygon(x5, y5, 3);
//6
		Color my6 = new Color(201, 205, 206);
		g.setColor(my6);

		int[] x6 = { 164, 235, 162 };
		int[] y6 = { 346, 350, 400 };
		g.fillPolygon(x6, y6, 3);
//7
		Color my7 = new Color(197, 201, 212);
		g.setColor(my7);

		int[] x7 = { 162, 235, 249 };
		int[] y7 = { 400, 350, 400 };
		g.fillPolygon(x7, y7, 3);
//8
		Color my8 = new Color(194, 201, 192);
		g.setColor(my8);

		int[] x8 = { 235, 249, 261 };
		int[] y8 = { 352, 400, 376 };
		g.fillPolygon(x8, y8, 3);
//9
		Color my9 = new Color(192, 203, 209);
		g.setColor(my9);

		int[] x9 = { 261, 247, 300 };
		int[] y9 = { 376, 400, 400 };
		g.fillPolygon(x9, y9, 3);
//10
		Color my10 = new Color(195, 202, 212);
		g.setColor(my10);

		int[] x10 = { 261, 285, 300 };
		int[] y10 = { 376, 365, 400 };
		g.fillPolygon(x10, y10, 3);
//11
		Color my11 = new Color(205, 205, 206);
		g.setColor(my11);

		int[] x11 = { 285, 303, 300 };
		int[] y11 = { 365, 367, 400 };
		g.fillPolygon(x11, y11, 3);
//12
		Color my12 = new Color(204, 203, 200);
		g.setColor(my12);

		int[] x12 = { 303, 320, 300 };
		int[] y12 = { 367, 385, 400 };
		g.fillPolygon(x12, y12, 3);
//13
		Color my13 = new Color(194, 202, 225);
		g.setColor(my13);

		int[] x13 = { 352, 320, 300 };
		int[] y13 = { 400, 385, 400 };
		g.fillPolygon(x13, y13, 3);
//14
		Color my14 = new Color(202, 201, 207);
		g.setColor(my14);

		int[] x14 = { 352, 320, 328 };
		int[] y14 = { 400, 385, 373 };
		g.fillPolygon(x14, y14, 3);
//15
		Color my15 = new Color(192, 192, 164);
		g.setColor(my15);

		int[] x15 = { 356, 352, 328 };
		int[] y15 = { 375, 400, 373 };
		g.fillPolygon(x15, y15, 3);
//16
		Color my16 = new Color(199, 201, 200);
		g.setColor(my16);

		int[] x16 = { 352, 356, 376 };
		int[] y16 = { 400, 375, 385 };
		g.fillPolygon(x16, y16, 3);
//17
		Color my17 = new Color(197, 197, 196);
		g.setColor(my17);

		int[] x17 = { 352, 383, 400 };
		int[] y17 = { 400, 400, 370 };
		g.fillPolygon(x17, y17, 3);
//18
		Color my18 = new Color(192, 187, 165);
		g.setColor(my18);

		int[] x18 = { 383, 400, 420 };
		int[] y18 = { 400, 385, 400 };
		g.fillPolygon(x18, y18, 3);
//19
		Color my19 = new Color(197, 197, 195);
		g.setColor(my19);

		int[] x19 = { 400, 420, 383 };
		int[] y19 = { 370, 383, 400 };
		g.fillPolygon(x19, y19, 3);
//20
		Color my20 = new Color(191, 186, 148);
		g.setColor(my20);

		int[] x20 = { 383, 420, 437 };
		int[] y20 = { 400, 383, 390 };
		g.fillPolygon(x20, y20, 3);
//21
		Color my21 = new Color(191, 186, 148);
		g.setColor(my21);

		int[] x21 = { 383, 433, 437 };
		int[] y21 = { 400, 400, 390 };
		g.fillPolygon(x21, y21, 3);
//22
		Color my22 = new Color(196, 194, 208);
		g.setColor(my22);

		int[] x22 = { 437, 383, 461 };
		int[] y22 = { 390, 400, 400 };
		g.fillPolygon(x22, y22, 3);
//23
		Color my23 = new Color(191, 194, 194);
		g.setColor(my23);

		int[] x23 = { 420, 437, 433 };
		int[] y23 = { 383, 390, 366 };
		g.fillPolygon(x23, y23, 3);
//24
		Color my24 = new Color(184, 181, 139);
		g.setColor(my24);

		int[] x24 = { 433, 437, 461 };
		int[] y24 = { 366, 390, 400 };
		g.fillPolygon(x24, y24, 3);
//25
		Color my25 = new Color(177, 166, 138);
		g.setColor(my25);

		int[] x25 = { 433, 459, 461 };
		int[] y25 = { 366, 367, 400 };
		g.fillPolygon(x25, y25, 3);
//26
		Color my26 = new Color(154, 155, 156);
		g.setColor(my26);

		int[] x26 = { 459, 483, 461 };
		int[] y26 = { 367, 384, 400 };
		g.fillPolygon(x26, y26, 3);
//27
		Color my27 = new Color(177, 176, 148);
		g.setColor(my27);

		int[] x27 = { 497, 483, 461 };
		int[] y27 = { 400, 384, 400 };
		g.fillPolygon(x27, y27, 3);
/////////////////////////////////
//28
		Color my28 = new Color(208, 205, 213);
		g.setColor(my28);

		int[] x28 = { 0, 42, 0 };
		int[] y28 = { 400, 361, 345 };
		g.fillPolygon(x28, y28, 3);
//29
		Color my29 = new Color(205, 205, 193);
		g.setColor(my29);

		int[] x29 = { 0, 42, 33 };
		int[] y29 = { 345, 361, 319 };
		g.fillPolygon(x29, y29, 3);
//30
		Color my30 = new Color(199, 207, 218);
		g.setColor(my30);

		int[] x30 = { 60, 42, 33 };
		int[] y30 = { 324, 361, 319 };
		g.fillPolygon(x30, y30, 3);
//31
		Color my31 = new Color(205, 205, 193);
		g.setColor(my31);

		int[] x31 = { 60, 42, 94 };
		int[] y31 = { 324, 361, 354 };
		g.fillPolygon(x31, y31, 3);
//32
		Color my32 = new Color(216, 216, 238);
		g.setColor(my32);

		int[] x32 = { 60, 92, 94 };
		int[] y32 = { 324, 320, 354 };
		g.fillPolygon(x32, y32, 3);
//33
		Color my33 = new Color(238, 247, 244);
		g.setColor(my33);

		int[] x33 = { 92, 122, 94 };
		int[] y33 = { 320, 338, 354 };
		g.fillPolygon(x33, y33, 3);
//34
		Color my34 = new Color(196, 202, 200);
		g.setColor(my34);

		int[] x34 = { 135, 122, 94 };
		int[] y34 = { 373, 338, 354 };
		g.fillPolygon(x34, y34, 3);
//35
		Color my35 = new Color(188, 197, 214);
		g.setColor(my35);

		int[] x35 = { 135, 122, 164 };
		int[] y35 = { 373, 338, 346 };
		g.fillPolygon(x35, y35, 3);
//36
		Color my36 = new Color(201, 208, 217);
		g.setColor(my36);

		int[] x36 = { 148, 122, 164 };
		int[] y36 = { 300, 338, 346 };
		g.fillPolygon(x36, y36, 3);
//37
		Color my37 = new Color(205, 209, 218);
		g.setColor(my37);

		int[] x37 = { 164, 180, 222 };
		int[] y37 = { 346, 289, 300 };
		g.fillPolygon(x37, y37, 3);
//38
		Color my38 = new Color(195, 205, 204);
		g.setColor(my38);

		int[] x38 = { 164, 235, 222 };
		int[] y38 = { 346, 352, 300 };
		g.fillPolygon(x38, y38, 3);
//39
		Color my39 = new Color(227, 233, 247);
		g.setColor(my39);

		int[] x39 = { 252, 235, 222 };
		int[] y39 = { 312, 352, 300 };
		g.fillPolygon(x39, y39, 3);
//40
		Color my40 = new Color(205, 207, 202);
		g.setColor(my40);

		int[] x40 = { 235, 260, 252 };
		int[] y40 = { 352, 331, 312 };
		g.fillPolygon(x40, y40, 3);
//41
		Color my41 = new Color(199, 204, 203);
		g.setColor(my41);

		int[] x41 = { 235, 260, 261 };
		int[] y41 = { 352, 330, 350 };
		g.fillPolygon(x41, y41, 3);
//42
		Color my42 = new Color(210, 206, 205);
		g.setColor(my42);

		int[] x42 = { 235, 260, 261 };
		int[] y42 = { 352, 350, 376 };
		g.fillPolygon(x42, y42, 3);
//43
		Color my43 = new Color(207, 207, 205);
		g.setColor(my43);

		int[] x43 = { 260, 285, 261 };
		int[] y43 = { 350, 365, 376 };
		g.fillPolygon(x43, y43, 3);
//44
		Color my44 = new Color(205, 210, 212);
		g.setColor(my44);

		int[] x44 = { 260, 285, 285 };
		int[] y44 = { 350, 346, 365 };
		g.fillPolygon(x44, y44, 3);
//45
		Color my45 = new Color(198, 211, 230);
		g.setColor(my45);

		int[] x45 = { 280, 260, 260 };
		int[] y45 = { 340, 330, 350 };
		g.fillPolygon(x45, y45, 3);
//46
		Color my46 = new Color(201, 198, 163);
		g.setColor(my46);

		int[] x46 = { 285, 303, 285 };
		int[] y46 = { 365, 367, 346 };
		g.fillPolygon(x46, y46, 3);
//47
		Color my47 = new Color(206, 221, 230);
		g.setColor(my47);

		int[] x47 = { 285, 320, 303 };
		int[] y47 = { 346, 351, 367 };
		g.fillPolygon(x47, y47, 3);
//48
		Color my48 = new Color(207, 194, 159);
		g.setColor(my48);

		int[] x48 = { 320, 328, 303 };
		int[] y48 = { 385, 373, 367 };
		g.fillPolygon(x48, y48, 3);
//49
		Color my49 = new Color(228, 238, 251);
		g.setColor(my49);

		int[] x49 = { 320, 328, 303 };
		int[] y49 = { 351, 373, 367 };
		g.fillPolygon(x49, y49, 3);
//50
		Color my50 = new Color(189, 206, 213);
		g.setColor(my50);

		int[] x50 = { 320, 328, 346 };
		int[] y50 = { 351, 373, 354 };
		g.fillPolygon(x50, y50, 3);
//51
		Color my51 = new Color(252, 252, 254);
		g.setColor(my51);

		int[] x51 = { 328, 346, 356 };
		int[] y51 = { 373, 354, 375 };
		g.fillPolygon(x51, y51, 3);
//52
		Color my52 = new Color(211, 222, 244);
		g.setColor(my52);

		int[] x52 = { 346, 356, 362 };
		int[] y52 = { 354, 375, 357 };
		g.fillPolygon(x52, y52, 3);
//53
		Color my53 = new Color(181, 186, 161);
		g.setColor(my53);

		int[] x53 = { 356, 362, 382 };
		int[] y53 = { 375, 357, 368 };
		g.fillPolygon(x53, y53, 3);
//54
		Color my54 = new Color(159, 191, 222);
		g.setColor(my54);

		int[] x54 = { 362, 381, 381 };
		int[] y54 = { 357, 351, 369 };
		g.fillPolygon(x54, y54, 3);
//55
		Color my55 = new Color(132, 148, 111);
		g.setColor(my55);

		int[] x55 = { 381, 381, 405 };
		int[] y55 = { 351, 369, 359 };
		g.fillPolygon(x55, y55, 3);
//56 250,253,253
		Color my56 = new Color(250, 253, 253);
		g.setColor(my56);

		int[] x56 = { 381, 405, 400 };
		int[] y56 = { 351, 359, 370 };
		g.fillPolygon(x56, y56, 3);
//57
		Color my57 = new Color(195, 191, 207);
		g.setColor(my57);

		int[] x57 = { 405, 400, 433 };
		int[] y57 = { 359, 370, 366 };
		g.fillPolygon(x57, y57, 3);
//58
		Color my58 = new Color(184, 178, 152);
		g.setColor(my58);

		int[] x58 = { 405, 411, 433 };
		int[] y58 = { 359, 339, 366 };
		g.fillPolygon(x58, y58, 3);
//59
		Color my59 = new Color(168, 160, 146);
		g.setColor(my59);

		int[] x59 = { 435, 411, 433 };
		int[] y59 = { 339, 339, 366 };
		g.fillPolygon(x59, y59, 3);
//60
		Color my60 = new Color(158, 154, 135);
		g.setColor(my60);

		int[] x60 = { 459, 433, 435 };
		int[] y60 = { 367, 366, 339 };
		g.fillPolygon(x60, y60, 3);
//61
		Color my61 = new Color(136, 117, 103);
		g.setColor(my61);

		int[] x61 = { 435, 459, 462 };
		int[] y61 = { 339, 367, 358 };
		g.fillPolygon(x61, y61, 3);
//62
		Color my62 = new Color(117, 107, 46);
		g.setColor(my62);

		int[] x62 = { 462, 459, 483 };
		int[] y62 = { 358, 367, 384 };
		g.fillPolygon(x62, y62, 3);
/////////////////////////////////
//63
		Color my63 = new Color(197, 201, 200);
		g.setColor(my63);

		int[] x63 = { 0, 33, 0 };
		int[] y63 = { 345, 319, 303 };
		g.fillPolygon(x63, y63, 3);
//64
		Color my64 = new Color(191, 197, 223);
		g.setColor(my64);

		int[] x64 = { 0, 25, 33 };
		int[] y64 = { 303, 280, 319 };
		g.fillPolygon(x64, y64, 3);
//65
		Color my65 = new Color(195, 199, 198);
		g.setColor(my65);

		int[] x65 = { 25, 60, 33 };
		int[] y65 = { 280, 324, 319 };
		g.fillPolygon(x65, y65, 3);
//66
		Color my66 = new Color(197, 201, 200);
		g.setColor(my66);

		int[] x66 = { 36, 82, 60 };
		int[] y66 = { 294, 296, 324 };
		g.fillPolygon(x66, y66, 3);
//67
		Color my67 = new Color(214, 224, 234);
		g.setColor(my67);

		int[] x67 = { 60, 82, 92 };
		int[] y67 = { 324, 296, 320 };
		g.fillPolygon(x67, y67, 3);
//68
		Color my68 = new Color(198, 192, 156);
		g.setColor(my68);

		int[] x68 = { 92, 82, 108 };
		int[] y68 = { 320, 296, 310 };
		g.fillPolygon(x68, y68, 3);
//69
		Color my69 = new Color(197, 194, 160);
		g.setColor(my69);

		int[] x69 = { 82, 88, 108 };
		int[] y69 = { 296, 287, 310 };
		g.fillPolygon(x69, y69, 3);
//70
		Color my70 = new Color(195, 205, 215);
		g.setColor(my70);

		int[] x70 = { 108, 92, 122 };
		int[] y70 = { 310, 320, 338 };
		g.fillPolygon(x70, y70, 3);
//71
		Color my71 = new Color(194, 201, 209);
		g.setColor(my71);

		int[] x71 = { 88, 130, 108 };
		int[] y71 = { 287, 286, 310 };
		g.fillPolygon(x71, y71, 3);
//72
		Color my72 = new Color(200, 211, 195);
		g.setColor(my72);

		int[] x72 = { 108, 122, 148 };
		int[] y72 = { 310, 338, 300 };
		g.fillPolygon(x72, y72, 3);
//73
		Color my73 = new Color(202, 209, 228);
		g.setColor(my73);

		int[] x73 = { 108, 130, 148 };
		int[] y73 = { 310, 286, 300 };
		g.fillPolygon(x73, y73, 3);
//74
		Color my74 = new Color(199, 212, 221);
		g.setColor(my74);

		int[] x74 = { 148, 164, 180 };
		int[] y74 = { 300, 346, 289 };
		g.fillPolygon(x74, y74, 3);
//75
		Color my75 = new Color(198, 196, 173);
		g.setColor(my75);

		int[] x75 = { 180, 148, 176 };
		int[] y75 = { 289, 300, 279 };
		g.fillPolygon(x75, y75, 3);
//76
		Color my76 = new Color(198, 200, 211);
		g.setColor(my76);

		int[] x76 = { 176, 180, 218 };
		int[] y76 = { 279, 289, 266 };
		g.fillPolygon(x76, y76, 3);
//77
		Color my77 = new Color(204, 195, 161);
		g.setColor(my77);

		int[] x77 = { 218, 180, 222 };
		int[] y77 = { 266, 289, 300 };
		g.fillPolygon(x77, y77, 3);
//78
		Color my78 = new Color(209, 209, 211);
		g.setColor(my78);

		int[] x78 = { 222, 218, 244 };
		int[] y78 = { 300, 266, 283 };
		g.fillPolygon(x78, y78, 3);
//79
		Color my79 = new Color(211, 194, 162);
		g.setColor(my79);

		int[] x79 = { 222, 244, 252 };
		int[] y79 = { 300, 283, 312 };
		g.fillPolygon(x79, y79, 3);
//80
		Color my80 = new Color(210, 191, 159);
		g.setColor(my80);

		int[] x80 = { 244, 252, 282 };
		int[] y80 = { 283, 312, 290 };
		g.fillPolygon(x80, y80, 3);
//81
		Color my81 = new Color(239, 243, 249);
		g.setColor(my81);

		int[] x81 = { 282, 252, 292 };
		int[] y81 = { 290, 312, 303 };
		g.fillPolygon(x81, y81, 3);
//82
		Color my82 = new Color(203, 198, 199);
		g.setColor(my82);

		int[] x82 = { 292, 281, 252 };
		int[] y82 = { 303, 327, 312 };
		g.fillPolygon(x82, y82, 3);
//83
		Color my83 = new Color(201, 201, 175);
		g.setColor(my83);

		int[] x83 = { 252, 281, 260 };
		int[] y83 = { 312, 327, 331 };
		g.fillPolygon(x83, y83, 3);
//84
		Color my84 = new Color(217, 224, 233);
		g.setColor(my84);

		int[] x84 = { 260, 280, 281 };
		int[] y84 = { 331, 340, 327 };
		g.fillPolygon(x84, y84, 3);
//85
		Color my85 = new Color(199, 211, 227);
		g.setColor(my85);

		int[] x85 = { 280, 260, 285 };
		int[] y85 = { 340, 350, 346 };
		g.fillPolygon(x85, y85, 3);
//86
		Color my86 = new Color(180, 191, 214);
		g.setColor(my86);

		int[] x86 = { 280, 285, 290 };
		int[] y86 = { 340, 346, 339 };
		g.fillPolygon(x86, y86, 3);
//87
		Color my87 = new Color(101, 118, 117);
		g.setColor(my87);

		int[] x87 = { 290, 285, 304 };
		int[] y87 = { 339, 346, 349 };
		g.fillPolygon(x87, y87, 3);
//88
		Color my88 = new Color(60, 62, 75);
		g.setColor(my88);

		int[] x88 = { 290, 304, 320 };
		int[] y88 = { 339, 349, 345 };
		g.fillPolygon(x88, y88, 3);
//89
		Color my89 = new Color(92, 90, 91);
		g.setColor(my89);

		int[] x89 = { 320, 304, 320 };
		int[] y89 = { 345, 349, 351 };
		g.fillPolygon(x89, y89, 3);
//90
		Color my90 = new Color(197, 201, 200);
		g.setColor(my90);

		int[] x90 = { 320, 320, 346 };
		int[] y90 = { 345, 351, 354 };
		g.fillPolygon(x90, y90, 3);
//91
		Color my91 = new Color(27, 23, 27);
		g.setColor(my91);

		int[] x91 = { 320, 346, 354 };
		int[] y91 = { 345, 354, 350 };
		g.fillPolygon(x91, y91, 3);
//92
		Color my92 = new Color(70, 87, 101);
		g.setColor(my92);

		int[] x92 = { 346, 354, 362 };
		int[] y92 = { 354, 350, 357 };
		g.fillPolygon(x92, y92, 3);
//93
		Color my93 = new Color(62, 68, 82);
		g.setColor(my93);

		int[] x93 = { 354, 362, 381 };
		int[] y93 = { 350, 357, 351 };
		g.fillPolygon(x93, y93, 3);
//94
		Color my94 = new Color(159, 179, 212);
		g.setColor(my94);

		int[] x94 = { 381, 405, 393 };
		int[] y94 = { 351, 359, 344 };
		g.fillPolygon(x94, y94, 3);
//95
		Color my95 = new Color(121, 154, 109);
		g.setColor(my95);

		int[] x95 = { 393, 405, 411 };
		int[] y95 = { 344, 359, 339 };
		g.fillPolygon(x95, y95, 3);
//96
		Color my96 = new Color(177, 166, 138);
		g.setColor(my96);

		int[] x96 = { 411, 419, 435 };
		int[] y96 = { 339, 315, 339 };
		g.fillPolygon(x96, y96, 3);
//97
		Color my97 = new Color(135, 124, 104);
		g.setColor(my97);

		int[] x97 = { 419, 435, 445 };
		int[] y97 = { 315, 339, 335 };
		g.fillPolygon(x97, y97, 3);
//98
		Color my98 = new Color(132, 127, 106);
		g.setColor(my98);

		int[] x98 = { 445, 435, 462 };
		int[] y98 = { 335, 339, 358 };
		g.fillPolygon(x98, y98, 3);
/////////////////////////////////
//99
		Color my99 = new Color(189, 212, 186);
		g.setColor(my99);

		int[] x99 = { 0, 0, 25 };
		int[] y99 = { 303, 267, 280 };
		g.fillPolygon(x99, y99, 3);
//100
		Color my100 = new Color(195, 200, 207);
		g.setColor(my100);

		int[] x100 = { 0, 23, 25 };
		int[] y100 = { 267, 261, 280 };
		g.fillPolygon(x100, y100, 3);
//101
		Color my101 = new Color(190, 187, 154);
		g.setColor(my101);

		int[] x101 = { 23, 25, 46 };
		int[] y101 = { 261, 280, 269 };
		g.fillPolygon(x101, y101, 3);
//102
		Color my102 = new Color(195, 186, 153);
		g.setColor(my102);

		int[] x102 = { 46, 25, 36 };
		int[] y102 = { 269, 280, 294 };
		g.fillPolygon(x102, y102, 3);
//103
		Color my103 = new Color(192, 191, 164);
		g.setColor(my103);

		int[] x103 = { 36, 46, 60 };
		int[] y103 = { 294, 269, 280 };
		g.fillPolygon(x103, y103, 3);
//104
		Color my104 = new Color(201, 206, 209);
		g.setColor(my104);

		int[] x104 = { 36, 60, 82 };
		int[] y104 = { 294, 280, 296 };
		g.fillPolygon(x104, y104, 3);
//105
		Color my105 = new Color(190, 187, 154);
		g.setColor(my105);

		int[] x105 = { 60, 82, 60 };
		int[] y105 = { 280, 296, 265 };
		g.fillPolygon(x105, y105, 3);
//106
		Color my106 = new Color(187, 188, 156);
		g.setColor(my106);

		int[] x106 = { 60, 60, 46 };
		int[] y106 = { 265, 280, 269 };
		g.fillPolygon(x106, y106, 3);
//107
		Color my107 = new Color(181, 181, 157);
		g.setColor(my107);

		int[] x107 = { 60, 51, 97 };
		int[] y107 = { 265, 258, 251 };
		g.fillPolygon(x107, y107, 3);
//108
		Color my108 = new Color(187, 181, 157);
		g.setColor(my108);

		int[] x108 = { 97, 60, 88 };
		int[] y108 = { 251, 265, 287 };
		g.fillPolygon(x108, y108, 3);
//109
		Color my109 = new Color(192, 189, 157);
		g.setColor(my109);

		int[] x109 = { 88, 60, 82 };
		int[] y109 = { 287, 265, 296 };
		g.fillPolygon(x109, y109, 3);
//110
		Color my110 = new Color(188, 182, 156);
		g.setColor(my110);

		int[] x110 = { 88, 97, 130 };
		int[] y110 = { 287, 251, 286 };
		g.fillPolygon(x110, y110, 3);
//111
		Color my111 = new Color(169, 164, 145);
		g.setColor(my111);

		int[] x111 = { 97, 130, 125 };
		int[] y111 = { 251, 286, 252 };
		g.fillPolygon(x111, y111, 3);
//112
		Color my112 = new Color(177, 179, 155);
		g.setColor(my112);

		int[] x112 = { 125, 148, 130 };
		int[] y112 = { 252, 267, 286 };
		g.fillPolygon(x112, y112, 3);
//113
		Color my113 = new Color(198, 189, 172);
		g.setColor(my113);

		int[] x113 = { 148, 130, 148 };
		int[] y113 = { 267, 286, 300 };
		g.fillPolygon(x113, y113, 3);
//114
		Color my114 = new Color(200, 204, 213);
		g.setColor(my114);

		int[] x114 = { 148, 176, 148 };
		int[] y114 = { 300, 279, 267 };
		g.fillPolygon(x114, y114, 3);
//115
		Color my115 = new Color(187, 187, 159);
		g.setColor(my115);

		int[] x115 = { 148, 176, 183 };
		int[] y115 = { 267, 279, 252 };
		g.fillPolygon(x115, y115, 3);
//116
		Color my116 = new Color(190, 184, 148);
		g.setColor(my116);

		int[] x116 = { 183, 148, 162 };
		int[] y116 = { 252, 267, 227 };
		g.fillPolygon(x116, y116, 3);
//117
		Color my117 = new Color(147, 149, 125);
		g.setColor(my117);

		int[] x117 = { 162, 148, 125 };
		int[] y117 = { 227, 267, 252 };
		g.fillPolygon(x117, y117, 3);
//118
		Color my118 = new Color(202, 175, 146);
		g.setColor(my118);

		int[] x118 = { 162, 188, 182 };
		int[] y118 = { 227, 211, 252 };
		g.fillPolygon(x118, y118, 3);
//119
		Color my119 = new Color(204, 189, 158);
		g.setColor(my119);

		int[] x119 = { 182, 176, 218 };
		int[] y119 = { 252, 279, 266 };
		g.fillPolygon(x119, y119, 3);
//120
		Color my120 = new Color(197, 186, 154);
		g.setColor(my120);

		int[] x120 = { 218, 182, 222 };
		int[] y120 = { 266, 252, 227 };
		g.fillPolygon(x120, y120, 3);
//121

		Color my121 = new Color(183, 181, 142);
		g.setColor(my121);

		int[] x121 = { 188, 222, 182 };
		int[] y121 = { 211, 227, 252 };
		g.fillPolygon(x121, y121, 3);
//122
		Color my122 = new Color(161, 165, 140);
		g.setColor(my122);

		int[] x122 = { 222, 188, 203 };
		int[] y122 = { 227, 211, 191 };
		g.fillPolygon(x122, y122, 3);
//123
		Color my123 = new Color(177, 166, 138);
		g.setColor(my123);

		int[] x123 = { 203, 222, 245 };
		int[] y123 = { 191, 227, 213 };
		g.fillPolygon(x123, y123, 3);
//124
		Color my124 = new Color(214, 224, 234);
		g.setColor(my124);

		int[] x124 = { 250, 222, 218 };
		int[] y124 = { 244, 227, 266 };
		g.fillPolygon(x124, y124, 3);
//125
		Color my125 = new Color(205, 190, 161);
		g.setColor(my125);

		int[] x125 = { 218, 250, 244 };
		int[] y125 = { 266, 244, 283 };
		g.fillPolygon(x125, y125, 3);
//126
		Color my126 = new Color(209, 187, 146);
		g.setColor(my126);

		int[] x126 = { 250, 244, 284 };
		int[] y126 = { 244, 283, 252 };
		g.fillPolygon(x126, y126, 3);
//127
		Color my127 = new Color(197, 191, 155);
		g.setColor(my127);

		int[] x127 = { 244, 284, 282 };
		int[] y127 = { 283, 252, 290 };
		g.fillPolygon(x127, y127, 3);
//128
		Color my128 = new Color(193, 188, 149);
		g.setColor(my128);

		int[] x128 = { 250, 222, 245 };
		int[] y128 = { 244, 227, 213 };
		g.fillPolygon(x128, y128, 3);
//129
		Color my129 = new Color(144, 147, 130);
		g.setColor(my129);

		int[] x129 = { 203, 245, 239 };
		int[] y129 = { 191, 213, 171 };
		g.fillPolygon(x129, y129, 3);
//130
		Color my130 = new Color(143, 141, 130);
		g.setColor(my130);

		int[] x130 = { 239, 264, 245 };
		int[] y130 = { 171, 200, 213 };
		g.fillPolygon(x130, y130, 3);
//131
		Color my131 = new Color(144, 141, 126);
		g.setColor(my131);

		int[] x131 = { 273, 250, 263 };
		int[] y131 = { 192, 184, 200 };
		g.fillPolygon(x131, y131, 3);
//132
		Color my132 = new Color(176, 153, 135);
		g.setColor(my132);

		int[] x132 = { 273, 245, 277 };
		int[] y132 = { 192, 213, 218 };
		g.fillPolygon(x132, y132, 3);
//133
		Color my133 = new Color(198, 181, 139);
		g.setColor(my133);

		int[] x133 = { 277, 245, 250 };
		int[] y133 = { 218, 213, 244 };
		g.fillPolygon(x133, y133, 3);
//134
		Color my134 = new Color(193, 183, 148);
		g.setColor(my134);

		int[] x134 = { 250, 284, 277 };
		int[] y134 = { 244, 252, 218 };
		g.fillPolygon(x134, y134, 3);
//135
		Color my135 = new Color(147, 149, 125);
		g.setColor(my135);

		int[] x135 = { 284, 295, 282 };
		int[] y135 = { 252, 268, 290 };
		g.fillPolygon(x135, y135, 3);
//136
		Color my136 = new Color(194, 202, 230);
		g.setColor(my136);

		int[] x136 = { 282, 295, 296 };
		int[] y136 = { 290, 268, 280 };
		g.fillPolygon(x136, y136, 3);
//137
		Color my137 = new Color(162, 162, 139);
		g.setColor(my137);

		int[] x137 = { 296, 282, 292 };
		int[] y137 = { 280, 290, 303 };
		g.fillPolygon(x137, y137, 3);
//138
		Color my138 = new Color(159, 133, 113);
		g.setColor(my138);

		int[] x138 = { 292, 296, 300 };
		int[] y138 = { 303, 280, 291 };
		g.fillPolygon(x138, y138, 3);
//139
		Color my139 = new Color(185, 164, 133);
		g.setColor(my139);

		int[] x139 = { 295, 282, 300 };
		int[] y139 = { 268, 252, 241 };
		g.fillPolygon(x139, y139, 3);
//140
		Color my140 = new Color(147, 149, 125);
		g.setColor(my140);

		int[] x140 = { 300, 282, 277 };
		int[] y140 = { 241, 252, 218 };
		g.fillPolygon(x140, y140, 3);
//141
		Color my141 = new Color(160, 142, 121);
		g.setColor(my141);

		int[] x141 = { 273, 277, 289 };
		int[] y141 = { 192, 218, 201 };
		g.fillPolygon(x141, y141, 3);
//142
		Color my142 = new Color(172, 154, 132);
		g.setColor(my142);

		int[] x142 = { 277, 303, 289 };
		int[] y142 = { 218, 217, 201 };
		g.fillPolygon(x142, y142, 3);
//143
		Color my143 = new Color(170, 161, 130);
		g.setColor(my143);

		int[] x143 = { 303, 277, 300 };
		int[] y143 = { 217, 218, 241 };
		g.fillPolygon(x143, y143, 3);
//144
		Color my144 = new Color(192, 134, 159);
		g.setColor(my144);

		int[] x144 = { 300, 308, 303 };
		int[] y144 = { 241, 235, 217 };
		g.fillPolygon(x144, y144, 3);
//145
		Color my145 = new Color(156, 92, 54);
		g.setColor(my145);

		int[] x145 = { 308, 300, 306 };
		int[] y145 = { 235, 241, 251 };
		g.fillPolygon(x145, y145, 3);
//146
		Color my146 = new Color(213, 160, 181);
		g.setColor(my146);

		int[] x146 = { 306, 300, 295 };
		int[] y146 = { 251, 241, 268 };
		g.fillPolygon(x146, y146, 3);
//147
		Color my147 = new Color(224, 166, 128);
		g.setColor(my147);

		int[] x147 = { 295, 304, 306 };
		int[] y147 = { 268, 263, 251 };
		g.fillPolygon(x147, y147, 3);
/////////////////////////////////
//148
		Color my148 = new Color(185, 189, 152);
		g.setColor(my148);

		int[] x148 = { 0, 0, 23 };
		int[] y148 = { 267, 254, 261 };
		g.fillPolygon(x148, y148, 3);
//149
		Color my149 = new Color(116, 173, 122);
		g.setColor(my149);

		int[] x149 = { 0, 23, 23 };
		int[] y149 = { 254, 241, 261 };
		g.fillPolygon(x149, y149, 3);
//150
		Color my150 = new Color(190, 181, 150);
		g.setColor(my150);

		int[] x150 = { 23, 23, 53 };
		int[] y150 = { 261, 241, 257 };
		g.fillPolygon(x150, y150, 3);
//151
		Color my151 = new Color(186, 183, 152);
		g.setColor(my151);

		int[] x151 = { 53, 23, 46 };
		int[] y151 = { 257, 261, 269 };
		g.fillPolygon(x151, y151, 3);
//152
		Color my152 = new Color(195, 204, 220);
		g.setColor(my152);

		int[] x152 = { 53, 46, 60 };
		int[] y152 = { 257, 269, 265 };
		g.fillPolygon(x152, y152, 3);
//153
		Color my153 = new Color(180, 179, 148);
		g.setColor(my153);

		int[] x153 = { 23, 53, 51 };
		int[] y153 = { 241, 258, 233 };
		g.fillPolygon(x153, y153, 3);
//154
		Color my154 = new Color(184, 180, 143);
		g.setColor(my154);

		int[] x154 = { 51, 53, 97 };
		int[] y154 = { 233, 258, 251 };
		g.fillPolygon(x154, y154, 3);
//155
		Color my155 = new Color(171, 166, 147);
		g.setColor(my155);

		int[] x155 = { 97, 51, 68 };
		int[] y155 = { 251, 233, 220 };
		g.fillPolygon(x155, y155, 3);
//156
		Color my156 = new Color(154, 143, 123);
		g.setColor(my156);

		int[] x156 = { 68, 86, 97 };
		int[] y156 = { 220, 211, 251 };
		g.fillPolygon(x156, y156, 3);
//157
		Color my157 = new Color(141, 137, 108);
		g.setColor(my157);

		int[] x157 = { 97, 108, 86 };
		int[] y157 = { 251, 234, 211 };
		g.fillPolygon(x157, y157, 3);
//158
		Color my158 = new Color(94, 94, 92);
		g.setColor(my158);

		int[] x158 = { 97, 108, 125 };
		int[] y158 = { 251, 234, 252 };
		g.fillPolygon(x158, y158, 3);
//159
		Color my159 = new Color(77, 82, 88);
		g.setColor(my159);

		int[] x159 = { 86, 129, 125 };
		int[] y159 = { 211, 227, 252 };
		g.fillPolygon(x159, y159, 3);
//160
		Color my160 = new Color(93, 104, 96);
		g.setColor(my160);

		int[] x160 = { 125, 129, 139 };
		int[] y160 = { 252, 227, 230 };
		g.fillPolygon(x160, y160, 3);
//161
		Color my161 = new Color(58, 52, 51);
		g.setColor(my161);

		int[] x161 = { 139, 129, 149 };
		int[] y161 = { 230, 227, 217 };
		g.fillPolygon(x161, y161, 3);
//162
		Color my162 = new Color(146, 150, 125);
		g.setColor(my162);

		int[] x162 = { 139, 124, 163 };
		int[] y162 = { 230, 253, 227 };
		g.fillPolygon(x162, y162, 3);
//163
		Color my163 = new Color(73, 73, 65);
		g.setColor(my163);

		int[] x163 = { 163, 149, 139 };
		int[] y163 = { 227, 217, 230 };
		g.fillPolygon(x163, y163, 3);
//164
		Color my164 = new Color(55, 53, 54);
		g.setColor(my164);

		int[] x164 = { 149, 163, 163 };
		int[] y164 = { 217, 227, 208 };
		g.fillPolygon(x164, y164, 3);
//165
		Color my165 = new Color(110, 114, 99);
		g.setColor(my165);

		int[] x165 = { 163, 163, 188 };
		int[] y165 = { 208, 227, 211 };
		g.fillPolygon(x165, y165, 3);
//166
		Color my166 = new Color(50, 46, 43);
		g.setColor(my166);

		int[] x166 = { 188, 163, 192 };
		int[] y166 = { 211, 208, 191 };
		g.fillPolygon(x166, y166, 3);
//167
		Color my167 = new Color(99, 98, 93);
		g.setColor(my167);

		int[] x167 = { 192, 188, 203 };
		int[] y167 = { 191, 211, 191 };
		g.fillPolygon(x167, y167, 3);
//168
		Color my168 = new Color(40, 34, 35);
		g.setColor(my168);

		int[] x168 = { 203, 192, 218 };
		int[] y168 = { 191, 191, 174 };
		g.fillPolygon(x168, y168, 3);
//169
		Color my169 = new Color(85, 80, 84);
		g.setColor(my169);

		int[] x169 = { 218, 203, 239 };
		int[] y169 = { 174, 191, 171 };
		g.fillPolygon(x169, y169, 3);
//170
		Color my170 = new Color(51, 53, 50);
		g.setColor(my170);

		int[] x170 = { 218, 250, 239 };
		int[] y170 = { 174, 153, 171 };
		g.fillPolygon(x170, y170, 3);
//171
		Color my171 = new Color(87, 84, 98);
		g.setColor(my171);

		int[] x171 = { 250, 239, 255 };
		int[] y171 = { 153, 171, 166 };
		g.fillPolygon(x171, y171, 3);
//172
		Color my172 = new Color(107, 106, 108);
		g.setColor(my172);

		int[] x172 = { 255, 250, 239 };
		int[] y172 = { 166, 184, 171 };
		g.fillPolygon(x172, y172, 3);
//173
		Color my173 = new Color(146, 168, 213);
		g.setColor(my173);

		int[] x173 = { 255, 250, 268 };
		int[] y173 = { 166, 184, 172 };
		g.fillPolygon(x173, y173, 3);
//174
		Color my174 = new Color(160, 181, 224);
		g.setColor(my174);

		int[] x174 = { 268, 250, 273 };
		int[] y174 = { 172, 184, 192 };
		g.fillPolygon(x174, y174, 3);
//175
		Color my175 = new Color(127, 95, 106);
		g.setColor(my175);

		int[] x175 = { 268, 273, 286 };
		int[] y175 = { 172, 192, 164 };
		g.fillPolygon(x175, y175, 3);
//176
		Color my176 = new Color(123, 145, 202);
		g.setColor(my176);

		int[] x176 = { 286, 273, 295 };
		int[] y176 = { 164, 192, 185 };
		g.fillPolygon(x176, y176, 3);
//177
		Color my177 = new Color(134, 126, 115);
		g.setColor(my177);

		int[] x177 = { 295, 273, 289 };
		int[] y177 = { 185, 192, 201 };
		g.fillPolygon(x177, y177, 3);
//178
		Color my178 = new Color(144, 141, 167);
		g.setColor(my178);

		int[] x178 = { 289, 295, 302 };
		int[] y178 = { 201, 185, 191 };
		g.fillPolygon(x178, y178, 3);
//179
		Color my179 = new Color(128, 123, 120);
		g.setColor(my179);

		int[] x179 = { 289, 303, 302 };
		int[] y179 = { 201, 217, 191 };
		g.fillPolygon(x179, y179, 3);
//180
		Color my180 = new Color(110, 99, 99);
		g.setColor(my180);

		int[] x180 = { 302, 303, 310 };
		int[] y180 = { 191, 217, 195 };
		g.fillPolygon(x180, y180, 3);
//181
		Color my181 = new Color(239, 189, 165);
		g.setColor(my181);

		int[] x181 = { 310, 303, 315 };
		int[] y181 = { 195, 217, 200 };
		g.fillPolygon(x181, y181, 3);
//182
		Color my182 = new Color(207, 122, 119);
		g.setColor(my182);

		int[] x182 = { 315, 310, 303 };
		int[] y182 = { 200, 218, 217 };
		g.fillPolygon(x182, y182, 3);
//183
		Color my183 = new Color(74, 53, 56);
		g.setColor(my183);

		int[] x183 = { 310, 303, 308 };
		int[] y183 = { 218, 217, 235 };
		g.fillPolygon(x183, y183, 3);
/////////////////////////////////
//184
		Color my184 = new Color(116, 146, 73);
		g.setColor(my184);

		int[] x184 = { 0, 23, 17 };
		int[] y184 = { 254, 241, 226 };
		g.fillPolygon(x184, y184, 3);
//185
		Color my185 = new Color(170, 187, 227);
		g.setColor(my185);

		int[] x185 = { 17, 0, 0 };
		int[] y185 = { 226, 227, 254 };
		g.fillPolygon(x185, y185, 3);
//186
		Color my186 = new Color(154, 156, 135);
		g.setColor(my186);

		int[] x186 = { 17, 23, 51 };
		int[] y186 = { 226, 241, 233 };
		g.fillPolygon(x186, y186, 3);
//187
		Color my187 = new Color(141, 144, 125);
		g.setColor(my187);

		int[] x187 = { 51, 17, 46 };
		int[] y187 = { 233, 226, 203 };
		g.fillPolygon(x187, y187, 3);
//188
		Color my188 = new Color(157, 154, 123);
		g.setColor(my188);

		int[] x188 = { 46, 51, 68 };
		int[] y188 = { 203, 233, 220 };
		g.fillPolygon(x188, y188, 3);
//189
		Color my189 = new Color(146, 142, 118);
		g.setColor(my189);

		int[] x189 = { 46, 68, 71 };
		int[] y189 = { 203, 220, 199 };
		g.fillPolygon(x189, y189, 3);
//190
		Color my190 = new Color(144, 145, 129);
		g.setColor(my190);

		int[] x190 = { 71, 68, 86 };
		int[] y190 = { 199, 220, 211 };
		g.fillPolygon(x190, y190, 3);
//191
		Color my191 = new Color(128, 125, 108);
		g.setColor(my191);

		int[] x191 = { 86, 93, 71 };
		int[] y191 = { 211, 202, 199 };
		g.fillPolygon(x191, y191, 3);
//////////////////////////////////////////////////
//192
		Color my192 = new Color(139, 141, 128);
		g.setColor(my192);

		int[] x192 = { 0, 17, 15 };
		int[] y192 = { 227, 226, 211 };
		g.fillPolygon(x192, y192, 3);
//193
		Color my193 = new Color(140, 134, 119);
		g.setColor(my193);

		int[] x193 = { 15, 17, 46 };
		int[] y193 = { 211, 226, 203 };
		g.fillPolygon(x193, y193, 3);
//194
		Color my194 = new Color(157, 184, 224);
		g.setColor(my194);

		int[] x194 = { 0, 0, 15 };
		int[] y194 = { 227, 201, 211 };
		g.fillPolygon(x194, y194, 3);
//195
		Color my195 = new Color(110, 112, 99);
		g.setColor(my195);

		int[] x195 = { 15, 27, 46 };
		int[] y195 = { 211, 182, 203 };
		g.fillPolygon(x195, y195, 3);
//196
		Color my196 = new Color(109, 111, 98);
		g.setColor(my196);

		int[] x196 = { 46, 64, 71 };
		int[] y196 = { 203, 173, 199 };
		g.fillPolygon(x196, y196, 3);
//197
		Color my197 = new Color(95, 95, 92);
		g.setColor(my197);

		int[] x197 = { 64, 71, 91 };
		int[] y197 = { 173, 199, 174 };
		g.fillPolygon(x197, y197, 3);
//198
		Color my198 = new Color(99, 100, 101);
		g.setColor(my198);

		int[] x198 = { 91, 71, 93 };
		int[] y198 = { 174, 199, 202 };
		g.fillPolygon(x198, y198, 3);

		int[] x198_1 = { 93, 91, 101 };
		int[] y198_1 = { 203, 174, 195 };
		g.fillPolygon(x198_1, y198_1, 3);
//199
		Color my199 = new Color(85, 83, 84);
		g.setColor(my199);

		int[] x199 = { 64, 46, 43 };
		int[] y199 = { 173, 203, 173 };
		g.fillPolygon(x199, y199, 3);
//200
		Color my200 = new Color(85, 83, 85);
		g.setColor(my200);

		int[] x200 = { 43, 46, 27 };
		int[] y200 = { 173, 203, 182 };
		g.fillPolygon(x200, y200, 3);
//201
		Color my201 = new Color(115, 118, 101);
		g.setColor(my201);

		int[] x201 = { 27, 15, 11 };
		int[] y201 = { 182, 211, 179 };
		g.fillPolygon(x201, y201, 3);
//202
		Color my202 = new Color(122, 121, 10);
		g.setColor(my202);

		int[] x202 = { 11, 15, 0 };
		int[] y202 = { 179, 211, 201 };
		g.fillPolygon(x202, y202, 3);
//203
		Color my203 = new Color(123, 127, 103);
		g.setColor(my203);

		int[] x203 = { 0, 0, 11 };
		int[] y203 = { 201, 175, 179 };
		g.fillPolygon(x203, y203, 3);
//204
		Color my204 = new Color(44, 40, 41);
		g.setColor(my204);

		int[] x204 = { 43, 64, 67 };
		int[] y204 = { 173, 173, 163 };
		g.fillPolygon(x204, y204, 3);
//205
		Color my205 = new Color(59, 56, 63);
		g.setColor(my205);

		int[] x205 = { 67, 64, 91 };
		int[] y205 = { 163, 173, 174 };
		g.fillPolygon(x205, y205, 3);
//206
		Color my206 = new Color(63, 61, 64);
		g.setColor(my206);

		int[] x206 = { 67, 104, 91 };
		int[] y206 = { 163, 153, 174 };
		g.fillPolygon(x206, y206, 3);
//207
		Color my207 = new Color(74, 74, 74);
		g.setColor(my207);

		int[] x207 = { 91, 104, 130 };
		int[] y207 = { 174, 153, 164 };
		g.fillPolygon(x207, y207, 3);
//208
		Color my208 = new Color(30, 31, 35);
		g.setColor(my208);

		int[] x208 = { 67, 104, 107 };
		int[] y208 = { 163, 153, 135 };
		g.fillPolygon(x208, y208, 3);
//209
		Color my209 = new Color(75, 75, 75);
		g.setColor(my209);

		int[] x209 = { 91, 130, 120 };
		int[] y209 = { 174, 164, 181 };
		g.fillPolygon(x209, y209, 3);
//210
		Color my210 = new Color(67, 69, 78);
		g.setColor(my210);

		int[] x210 = { 120, 91, 108 };
		int[] y210 = { 181, 174, 188 };
		g.fillPolygon(x210, y210, 3);
//211
		Color my211 = new Color(83, 83, 79);
		g.setColor(my211);

		int[] x211 = { 108, 91, 102 };
		int[] y211 = { 188, 174, 195 };
		g.fillPolygon(x211, y211, 3);
		int[] x211_1 = { 102, 93, 91 };
		int[] y211_1 = { 195, 202, 174 };
		g.fillPolygon(x211_1, y211_1, 3);
////////////////////////////////////////////////////////////
//212
		Color my212 = new Color(138, 158, 178);
		g.setColor(my212);

		int[] x212 = { 0, 0, 11 };
		int[] y212 = { 175, 170, 179 };
		g.fillPolygon(x212, y212, 3);
//213
		Color my213 = new Color(141, 152, 195);
		g.setColor(my213);

		int[] x213 = { 11, 23, 27 };
		int[] y213 = { 179, 177, 182 };
		g.fillPolygon(x213, y213, 3);
//214
		Color my214 = new Color(242, 238, 245);
		g.setColor(my214);

		int[] x214 = { 27, 23, 33 };
		int[] y214 = { 182, 177, 172 };
		g.fillPolygon(x214, y214, 3);
//215
		Color my215 = new Color(201, 171, 171);
		g.setColor(my215);

		int[] x215 = { 33, 27, 43 };
		int[] y215 = { 172, 182, 173 };
		g.fillPolygon(x215, y215, 3);
//216
		Color my216 = new Color(196, 187, 186);
		g.setColor(my216);

		int[] x216 = { 43, 33, 56 };
		int[] y216 = { 173, 172, 160 };
		g.fillPolygon(x216, y216, 3);
//217
		Color my217 = new Color(98, 89, 90);
		g.setColor(my217);

		int[] x217 = { 43, 56, 67 };
		int[] y217 = { 173, 160, 163 };
		g.fillPolygon(x217, y217, 3);
//218
		Color my218 = new Color(153, 132, 141);
		g.setColor(my218);

		int[] x218 = { 67, 63, 71 };
		int[] y218 = { 163, 155, 148 };
		g.fillPolygon(x218, y218, 3);
//219
		Color my219 = new Color(204, 199, 209);
		g.setColor(my219);

		int[] x219 = { 67, 63, 42 };
		int[] y219 = { 163, 155, 149 };
		g.fillPolygon(x219, y219, 3);
//220
		Color my220 = new Color(174, 183, 222);
		g.setColor(my220);

		int[] x220 = { 42, 39, 67 };
		int[] y220 = { 149, 153, 163 };
		g.fillPolygon(x220, y220, 3);
//221
		Color my221 = new Color(140, 115, 131);
		g.setColor(my221);

		int[] x221 = { 39, 67, 39 };
		int[] y221 = { 157, 163, 153 };
		g.fillPolygon(x221, y221, 3);
//222
		Color my222 = new Color(189, 172, 182);
		g.setColor(my222);

		int[] x222 = { 39, 56, 33 };
		int[] y222 = { 157, 160, 172 };
		g.fillPolygon(x222, y222, 3);
//223
		Color my223 = new Color(177, 144, 163);
		g.setColor(my223);

		int[] x223 = { 39, 29, 33 };
		int[] y223 = { 157, 157, 172 };
		g.fillPolygon(x223, y223, 3);
		Color my223_1 = new Color(189, 145, 170);
		g.setColor(my223_1);

		int[] x223_1 = { 29, 33, 16 };
		int[] y223_1 = { 157, 172, 161 };
		g.fillPolygon(x223_1, y223_1, 3);
//224
		Color my224 = new Color(219, 180, 174);
		g.setColor(my224);

		int[] x224 = { 33, 23, 19 };
		int[] y224 = { 172, 177, 161 };
		g.fillPolygon(x224, y224, 3);
//225
		Color my225 = new Color(228, 175, 166);
		g.setColor(my225);

		int[] x225 = { 19, 23, 0 };
		int[] y225 = { 161, 177, 170 };
		g.fillPolygon(x225, y225, 3);
		Color my225_1 = new Color(194, 189, 219);
		g.setColor(my225_1);

		int[] x225_1 = { 0, 11, 23 };
		int[] y225_1 = { 170, 179, 177 };
		g.fillPolygon(x225_1, y225_1, 3);
//226
		Color my226 = new Color(182, 166, 159);
		g.setColor(my226);

		int[] x226 = { 0, 6, 0 };
		int[] y226 = { 170, 160, 163 };
		g.fillPolygon(x226, y226, 3);
//227
		Color my227 = new Color(200, 175, 167);
		g.setColor(my227);

		int[] x227 = { 6, 0, 19 };
		int[] y227 = { 160, 170, 161 };
		g.fillPolygon(x227, y227, 3);
//228
		Color my228 = new Color(179, 159, 168);
		g.setColor(my228);

		int[] x228 = { 0, 0, 12 };
		int[] y228 = { 163, 149, 157 };
		g.fillPolygon(x228, y228, 3);
//229
		Color my229 = new Color(48, 69, 159);
		g.setColor(my229);

		int[] x229 = { 12, 6, 19 };
		int[] y229 = { 157, 160, 161 };
		g.fillPolygon(x229, y229, 3);
//230
		Color my230 = new Color(69, 102, 177);
		g.setColor(my230);

		int[] x230 = { 19, 12, 24 };
		int[] y230 = { 161, 157, 148 };
		g.fillPolygon(x230, y230, 3);
//231
		Color my231 = new Color(82, 122, 192);
		g.setColor(my231);

		int[] x231 = { 24, 19, 29 };
		int[] y231 = { 148, 161, 157 };
		g.fillPolygon(x231, y231, 3);
//232
		Color my232 = new Color(69, 97, 173);
		g.setColor(my232);

		int[] x232 = { 29, 24, 39 };
		int[] y232 = { 157, 148, 153 };
		g.fillPolygon(x232, y232, 3);
//233
		Color my233 = new Color(60, 75, 158);
		g.setColor(my233);

		int[] x233 = { 39, 29, 39 };
		int[] y233 = { 153, 157, 157 };
		g.fillPolygon(x233, y233, 3);
//234
		Color my234 = new Color(122, 156, 198);
		g.setColor(my234);

		int[] x234 = { 24, 39, 33 };
		int[] y234 = { 148, 153, 145 };
		g.fillPolygon(x234, y234, 3);
//235
		Color my235 = new Color(177, 189, 225);
		g.setColor(my235);

		int[] x235 = { 33, 12, 24 };
		int[] y235 = { 145, 139, 148 };
		g.fillPolygon(x235, y235, 3);
//236
		Color my236 = new Color(181, 186, 224);
		g.setColor(my236);

		int[] x236 = { 12, 7, 24 };
		int[] y236 = { 139, 144, 148 };
		g.fillPolygon(x236, y236, 3);
//237
		Color my237 = new Color(147, 149, 125);
		g.setColor(my237);

		int[] x237 = { 24, 12, 7 };
		int[] y237 = { 148, 157, 144 };
		g.fillPolygon(x237, y237, 3);
//238
		Color my238 = new Color(149, 123, 144);
		g.setColor(my238);

		int[] x238 = { 7, 0, 12 };
		int[] y238 = { 144, 149, 157 };
		g.fillPolygon(x238, y238, 3);
////////////////////////////////////////////////////
//239.
		Color my239 = new Color(114, 94, 109);
		g.setColor(my239);

		int[] x239 = { 0, 7, 0 };
		int[] y239 = { 149, 144, 144 };
		g.fillPolygon(x239, y239, 3);
//240.
		Color my240 = new Color(84, 65, 140);
		g.setColor(my240);

		int[] x240 = { 0, 7, 7 };
		int[] y240 = { 144, 144, 138 };
		g.fillPolygon(x240, y240, 3);
//241.
		Color my241 = new Color(142, 142, 170);
		g.setColor(my241);

		int[] x241 = { 7, 7, 12 };
		int[] y241 = { 138, 144, 139 };
		g.fillPolygon(x241, y241, 3);
//242.
		Color my242 = new Color(157, 151, 194);
		g.setColor(my242);

		int[] x242 = { 12, 12, 7 };
		int[] y242 = { 139, 131, 138 };
		g.fillPolygon(x242, y242, 3);
//243.
		Color my243 = new Color(102, 102, 102);
		g.setColor(my243);

		int[] x243 = { 12, 0, 7 };
		int[] y243 = { 131, 130, 138 };
		g.fillPolygon(x243, y243, 3);
//244.
		Color my244 = new Color(110, 109, 112);
		g.setColor(my244);

		int[] x244 = { 0, 7, 0 };
		int[] y244 = { 130, 138, 144 };
		g.fillPolygon(x244, y244, 3);
//245.
		Color my245 = new Color(99, 98, 96);
		g.setColor(my245);

		int[] x245 = { 0, 12, 0 };
		int[] y245 = { 130, 131, 110 };
		g.fillPolygon(x245, y245, 3);
//246.
		Color my246 = new Color(93, 92, 90);
		g.setColor(my246);

		int[] x246 = { 0, 12, 23 };
		int[] y246 = { 110, 131, 114 };
		g.fillPolygon(x246, y246, 3);
//247.
		Color my247 = new Color(81, 80, 78);
		g.setColor(my247);

		int[] x247 = { 23, 0, 19 };
		int[] y247 = { 114, 110, 95 };
		g.fillPolygon(x247, y247, 3);
//248.
		Color my248 = new Color(46, 44, 45);
		g.setColor(my248);

		int[] x248 = { 19, 0, 0 };
		int[] y248 = { 95, 110, 85 };
		g.fillPolygon(x248, y248, 3);
//249.
		Color my249 = new Color(12, 12, 11);
		g.setColor(my249);

		int[] x249 = { -3, 19, 7 };
		int[] y249 = { 85, 95, 70 };
		g.fillPolygon(x249, y249, 3);
//250
		Color my250 = new Color(229, 78, 66);
		g.setColor(my250);

		int[] x250 = { 7, 19, 24 };
		int[] y250 = { 70, 95, 88 };
		g.fillPolygon(x250, y250, 3);
//251
		Color my251 = new Color(192, 75, 67);
		g.setColor(my251);

		int[] x251 = { 24, 19, 25 };
		int[] y251 = { 88, 95, 99 };
		g.fillPolygon(x251, y251, 3);
//252
		Color my252 = new Color(66, 57, 54);
		g.setColor(my252);

		int[] x252 = { 25, 19, 23 };
		int[] y252 = { 99, 95, 114 };
		g.fillPolygon(x252, y252, 3);
//253
		Color my253 = new Color(177, 167, 183);
		g.setColor(my253);

		int[] x253 = { 23, 24, 12 };
		int[] y253 = { 114, 124, 131 };
		g.fillPolygon(x253, y253, 3);
//254.wh
		Color my254 = new Color(75, 56, 73);
		g.setColor(my254);

		int[] x254 = { 23, 29, 24 };
		int[] y254 = { 114, 131, 136 };
		g.fillPolygon(x254, y254, 3);
//255.wh
		Color my255 = new Color(100, 59, 73);
		g.setColor(my255);

		int[] x255 = { 29, 24, 43 };
		int[] y255 = { 131, 136, 135 };
		g.fillPolygon(x255, y255, 3);
//256.wh
		Color my256 = new Color(82, 49, 67);
		g.setColor(my256);

		int[] x256 = { 43, 24, 50 };
		int[] y256 = { 135, 136, 144 };
		g.fillPolygon(x256, y256, 3);
//257.wh
		Color my257 = new Color(108, 45, 49);
		g.setColor(my257);

		int[] x257 = { 50, 43, 64 };
		int[] y257 = { 144, 135, 140 };
		g.fillPolygon(x257, y257, 3);
//258.wh
		Color my258 = new Color(81, 78, 91);
		g.setColor(my258);

		int[] x258 = { 64, 50, 72 };
		int[] y258 = { 140, 144, 149 };
		g.fillPolygon(x258, y258, 3);
//259.wh
		Color my259 = new Color(121, 89, 95);
		g.setColor(my259);

		int[] x259 = { 72, 64, 80 };
		int[] y259 = { 149, 140, 142 };
		g.fillPolygon(x259, y259, 3);
//260
		Color my260 = new Color(50, 37, 43);
		g.setColor(my260);

		int[] x260 = { 24, 12, 12 };
		int[] y260 = { 124, 139, 131 };
		g.fillPolygon(x260, y260, 3);
//261
		Color my261 = new Color(33, 25, 25);
		g.setColor(my261);

		int[] x261 = { 12, 24, 24 };
		int[] y261 = { 139, 136, 124 };
		g.fillPolygon(x261, y261, 3);
//262
		Color my262 = new Color(55, 35, 42);
		g.setColor(my262);

		int[] x262 = { 24, 12, 30 };
		int[] y262 = { 136, 139, 144 };
		g.fillPolygon(x262, y262, 3);
//263
		Color my263 = new Color(48, 54, 146);
		g.setColor(my263);

		int[] x263 = { 24, 30, 43 };
		int[] y263 = { 136, 144, 149 };
		g.fillPolygon(x263, y263, 3);
		Color my263_1 = new Color(74, 100, 172);
		g.setColor(my263_1);

		int[] x263_1 = { 43, 39, 30 };
		int[] y263_1 = { 149, 152, 144 };
		g.fillPolygon(x263_1, y263_1, 3);
//264
		Color my264 = new Color(25, 27, 31);
		g.setColor(my264);

		int[] x264 = { 43, 62, 50 };
		int[] y264 = { 149, 155, 144 };
		g.fillPolygon(x264, y264, 3);
//265
		Color my265 = new Color(42, 53, 67);
		g.setColor(my265);

		int[] x265 = { 50, 62, 72 };
		int[] y265 = { 144, 155, 149 };
		g.fillPolygon(x265, y265, 3);
//266
		Color my266 = new Color(52, 57, 72);
		g.setColor(my266);

		int[] x266 = { 24, 43, 50 };
		int[] y266 = { 136, 149, 144 };
		g.fillPolygon(x266, y266, 3);
//267
		Color my267 = new Color(155, 134, 143);
		g.setColor(my267);

		int[] x267 = { 62, 72, 69 };
		int[] y267 = { 155, 149, 163 };
		g.fillPolygon(x267, y267, 3);
//268
		Color my268 = new Color(147, 149, 125);
		g.setColor(my268);

		int[] x268 = { 162, 148, 125 };
		int[] y268 = { 227, 267, 252 };
		g.fillPolygon(x268, y268, 3);
/////////////////////////////bottleRED
//269
		Color my269 = new Color(193, 57, 55);
		g.setColor(my269);

		int[] x269 = { 26, 20, 36 };
		int[] y269 = { 76, 87, 91 };
		g.fillPolygon(x269, y269, 3);
		Color my269_1 = new Color(187, 212, 104);
		g.setColor(my269_1);

		int[] x269_1 = { 102, 88, 42 };
		int[] y269_1 = { 79, 85, 77 };
		g.fillPolygon(x269_1, y269_1, 3);
//270
		Color my270 = new Color(207, 49, 40);
		g.setColor(my270);

		int[] x270 = { 36, 26, 42 };
		int[] y270 = { 91, 78, 77 };
		g.fillPolygon(x270, y270, 3);
//271
		Color my271 = new Color(164, 39, 33);
		g.setColor(my271);

		int[] x271 = { 42, 36, 49 };
		int[] y271 = { 77, 91, 95 };
		g.fillPolygon(x271, y271, 3);
//272
		Color my272 = new Color(146, 34, 29);
		g.setColor(my272);

		int[] x272 = { 49, 42, 60 };
		int[] y272 = { 95, 77, 80 };
		g.fillPolygon(x272, y272, 3);
//273
		Color my273 = new Color(179, 41, 39);
		g.setColor(my273);

		int[] x273 = { 60, 49, 64 };
		int[] y273 = { 80, 95, 100 };
		g.fillPolygon(x273, y273, 3);
//274
		Color my274 = new Color(144, 42, 30);
		g.setColor(my274);

		int[] x274 = { 64, 60, 88 };
		int[] y274 = { 100, 80, 85 };
		g.fillPolygon(x274, y274, 3);
//275
		Color my275 = new Color(164, 48, 41);
		g.setColor(my275);

		int[] x275 = { 88, 64, 88 };
		int[] y275 = { 85, 100, 103 };
		g.fillPolygon(x275, y275, 3);
//276
		Color my276 = new Color(176, 44, 43);
		g.setColor(my276);

		int[] x276 = { 88, 88, 103 };
		int[] y276 = { 85, 105, 95 };
		g.fillPolygon(x276, y276, 3);
//277
		Color my277 = new Color(172, 38, 38);
		g.setColor(my277);

		int[] x277 = { 88, 99, 103 };
		int[] y277 = { 85, 81, 95 };
		g.fillPolygon(x277, y277, 3);
//278
		Color my278 = new Color(152, 43, 39);
		g.setColor(my278);

		int[] x278 = { 103, 80, 103 };
		int[] y278 = { 95, 105, 118 };
		g.fillPolygon(x278, y278, 3);
//279
		Color my279 = new Color(106, 31, 28);
		g.setColor(my279);

		int[] x279 = { 88, 97, 103 };
		int[] y279 = { 105, 125, 118 };
		g.fillPolygon(x279, y279, 3);
//280
		Color my280 = new Color(19, 17, 11);
		g.setColor(my280);

		int[] x280 = { 103, 108, 97 };
		int[] y280 = { 118, 124, 125 };
		g.fillPolygon(x280, y280, 3);
//281
		Color my281 = new Color(198, 57, 48);
		g.setColor(my281);

		int[] x281 = { 97, 88, 76 };
		int[] y281 = { 125, 105, 113 };
		g.fillPolygon(x281, y281, 3);
//282
		Color my282 = new Color(188, 62, 55);
		g.setColor(my282);

		int[] x282 = { 76, 76, 90 };
		int[] y282 = { 113, 101, 104 };
		g.fillPolygon(x282, y282, 3);
//283
		Color my283 = new Color(167, 171, 217);
		g.setColor(my283);

		int[] x283 = { 76, 76, 64 };
		int[] y283 = { 113, 101, 100 };
		g.fillPolygon(x283, y283, 3);
//284
		Color my284 = new Color(127, 163, 203);
		g.setColor(my284);

		int[] x284 = { 64, 64, 76 };
		int[] y284 = { 100, 110, 113 };
		g.fillPolygon(x284, y284, 3);
//285
		Color my285 = new Color(193, 61, 58);
		g.setColor(my285);

		int[] x285 = { 76, 64, 77 };
		int[] y285 = { 113, 110, 125 };
		g.fillPolygon(x285, y285, 3);
//286
		Color my286 = new Color(224, 61, 52);
		g.setColor(my286);

		int[] x286 = { 76, 77, 97 };
		int[] y286 = { 113, 125, 125 };
		g.fillPolygon(x286, y286, 3);
//287
		Color my287 = new Color(215, 71, 72);
		g.setColor(my287);

		int[] x287 = { 97, 80, 77 };
		int[] y287 = { 125, 143, 125 };
		g.fillPolygon(x287, y287, 3);
//288
		Color my288 = new Color(203, 62, 61);
		g.setColor(my288);

		int[] x288 = { 80, 77, 64 };
		int[] y288 = { 143, 125, 140 };
		g.fillPolygon(x288, y288, 3);
//289
		Color my289 = new Color(213, 64, 58);
		g.setColor(my289);

		int[] x289 = { 64, 64, 77 };
		int[] y289 = { 110, 140, 125 };
		g.fillPolygon(x289, y289, 3);
//290
		Color my290 = new Color(192, 61, 58);
		g.setColor(my290);

		int[] x290 = { 64, 64, 46 };
		int[] y290 = { 140, 110, 120 };
		g.fillPolygon(x290, y290, 3);
//291
		Color my291 = new Color(195, 57, 45);
		g.setColor(my291);

		int[] x291 = { 46, 64, 43 };
		int[] y291 = { 120, 140, 135 };
		g.fillPolygon(x291, y291, 3);
//292
		Color my292 = new Color(192, 60, 46);
		g.setColor(my292);

		int[] x292 = { 43, 46, 29 };
		int[] y292 = { 135, 120, 131 };
		g.fillPolygon(x292, y292, 3);
//293
		Color my293 = new Color(198, 64, 54);
		g.setColor(my293);

		int[] x293 = { 29, 23, 46 };
		int[] y293 = { 131, 114, 120 };
		g.fillPolygon(x293, y293, 3);
//294
		Color my294 = new Color(208, 66, 58);
		g.setColor(my294);

		int[] x294 = { 23, 36, 25 };
		int[] y294 = { 114, 101, 99 };
		g.fillPolygon(x294, y294, 3);
//295
		Color my295 = new Color(141, 175, 226);
		g.setColor(my295);

		int[] x295 = { 25, 24, 36 };
		int[] y295 = { 99, 88, 101 };
		g.fillPolygon(x295, y295, 3);
//296
		Color my296 = new Color(151, 154, 201);
		g.setColor(my296);

		int[] x296 = { 24, 36, 36 };
		int[] y296 = { 88, 91, 101 };
		g.fillPolygon(x296, y296, 3);
//297
		Color my297 = new Color(203, 55, 51);
		g.setColor(my297);

		int[] x297 = { 36, 23, 46 };
		int[] y297 = { 101, 114, 120 };
		g.fillPolygon(x297, y297, 3);
//298
		Color my298 = new Color(191, 55, 49);
		g.setColor(my298);

		int[] x298 = { 36, 46, 64 };
		int[] y298 = { 101, 120, 110 };
		g.fillPolygon(x298, y298, 3);
//299
		Color my299 = new Color(159, 58, 55);
		g.setColor(my299);

		int[] x299 = { 36, 36, 49 };
		int[] y299 = { 101, 91, 95 };
		g.fillPolygon(x299, y299, 3);
//300
		Color my300 = new Color(215, 64, 42);
		g.setColor(my300);

		int[] x300 = { 36, 49, 64 };
		int[] y300 = { 101, 95, 110 };
		g.fillPolygon(x300, y300, 3);
//301
		Color my301 = new Color(202, 69, 63);
		g.setColor(my301);

		int[] x301 = { 49, 64, 64 };
		int[] y301 = { 95, 100, 110 };
		g.fillPolygon(x301, y301, 3);
//////////////////PINK//////////////////////////////////////////
//302
		Color my302 = new Color(108, 107, 103);
		g.setColor(my302);

		int[] x302 = { 71, 67, 84 };
		int[] y302 = { 148, 163, 152 };
		g.fillPolygon(x302, y302, 3);
//303
		Color my303 = new Color(105, 101, 98);
		g.setColor(my303);

		int[] x303 = { 84, 71, 81 };
		int[] y303 = { 152, 148, 142 };
		g.fillPolygon(x303, y303, 3);
//304
		Color my304 = new Color(99, 99, 98);
		g.setColor(my304);

		int[] x304 = { 81, 84, 107 };
		int[] y304 = { 142, 152, 135 };
		g.fillPolygon(x304, y304, 3);
//305
		Color my305 = new Color(75, 71, 71);
		g.setColor(my305);

		int[] x305 = { 81, 107, 108 };
		int[] y305 = { 142, 135, 124 };
		g.fillPolygon(x305, y305, 3);
//306
		Color my306 = new Color(69, 40, 51);
		g.setColor(my306);

		int[] x306 = { 108, 97, 81 };
		int[] y306 = { 124, 124, 142 };
		g.fillPolygon(x306, y306, 3);
//307
		Color my307 = new Color(64, 61, 68);
		g.setColor(my307);

		int[] x307 = { 108, 107, 121 };
		int[] y307 = { 124, 135, 127 };
		g.fillPolygon(x307, y307, 3);
//308
		Color my308 = new Color(44, 41, 47);
		g.setColor(my308);

		int[] x308 = { 121, 108, 128 };
		int[] y308 = { 127, 124, 107 };
		g.fillPolygon(x308, y308, 3);
//309
		Color my309 = new Color(78, 66, 75);
		g.setColor(my309);

		int[] x309 = { 128, 121, 150 };
		int[] y309 = { 107, 127, 106 };
		g.fillPolygon(x309, y309, 3);
//310
		Color my310 = new Color(44, 43, 51);
		g.setColor(my310);

		int[] x310 = { 138, 128, 146 };
		int[] y310 = { 107, 107, 88 };
		g.fillPolygon(x310, y310, 3);
//311
		Color my311 = new Color(46, 44, 57);
		g.setColor(my311);

		int[] x311 = { 146, 138, 158 };
		int[] y311 = { 88, 107, 90 };
		g.fillPolygon(x311, y311, 3);
//312
		Color my312 = new Color(130, 124, 158);
		g.setColor(my312);

		int[] x312 = { 138, 150, 158 };
		int[] y312 = { 107, 106, 90 };
		g.fillPolygon(x312, y312, 3);
//313
		Color my313 = new Color(103, 101, 100);
		g.setColor(my313);

		int[] x313 = { 150, 158, 170 };
		int[] y313 = { 106, 90, 87 };
		g.fillPolygon(x313, y313, 3);
//314
		Color my314 = new Color(35, 38, 40);
		g.setColor(my314);

		int[] x314 = { 146, 159, 158 };
		int[] y314 = { 88, 77, 90 };
		g.fillPolygon(x314, y314, 3);
//315
		Color my315 = new Color(33, 29, 39);
		g.setColor(my315);

		int[] x315 = { 158, 159, 169 };
		int[] y315 = { 90, 77, 76 };
		g.fillPolygon(x315, y315, 3);
//316
		Color my316 = new Color(59, 58, 69);
		g.setColor(my316);

		int[] x316 = { 158, 168, 169 };
		int[] y316 = { 90, 90, 76 };
		g.fillPolygon(x316, y316, 3);
//317
		Color my317 = new Color(77, 68, 70);
		g.setColor(my317);

		int[] x317 = { 169, 159, 177 };
		int[] y317 = { 76, 77, 57 };
		g.fillPolygon(x317, y317, 3);
//318
		Color my318 = new Color(133, 94, 80);
		g.setColor(my318);

		int[] x318 = { 169, 177, 188 };
		int[] y318 = { 76, 57, 54 };
		g.fillPolygon(x318, y318, 3);
//319
		Color my319 = new Color(182, 147, 144);
		g.setColor(my319);

		int[] x319 = { 188, 188, 177 };
		int[] y319 = { 54, 40, 57 };
		g.fillPolygon(x319, y319, 3);
//320
		Color my320 = new Color(200, 130, 108);
		g.setColor(my320);

		int[] x320 = { 188, 188, 203 };
		int[] y320 = { 40, 54, 24 };
		g.fillPolygon(x320, y320, 3);
//321
		Color my321 = new Color(91, 83, 90);
		g.setColor(my321);

		int[] x321 = { 188, 203, 206 };
		int[] y321 = { 54, 24, 42 };
		g.fillPolygon(x321, y321, 3);
//322
		Color my322 = new Color(92, 81, 81);
		g.setColor(my322);

		int[] x322 = { 206, 196, 188 };
		int[] y322 = { 42, 54, 54 };
		g.fillPolygon(x322, y322, 3);
//323
		Color my323 = new Color(95, 85, 97);
		g.setColor(my323);

		int[] x323 = { 206, 203, 217 };
		int[] y323 = { 42, 24, 20 };
		g.fillPolygon(x323, y323, 3);
//324
		Color my324 = new Color(124, 109, 105);
		g.setColor(my324);

		int[] x324 = { 203, 217, 215 };
		int[] y324 = { 24, 20, 13 };
		g.fillPolygon(x324, y324, 3);
//325
		Color my325 = new Color(100, 83, 80);
		g.setColor(my325);

		int[] x325 = { 215, 217, 227 };
		int[] y325 = { 13, 20, 13 };
		g.fillPolygon(x325, y325, 3);
//326
		Color my326 = new Color(113, 109, 116);
		g.setColor(my326);

		int[] x326 = { 227, 224, 215 };
		int[] y326 = { 13, 0, 13 };
		g.fillPolygon(x326, y326, 3);
//327
		Color my327 = new Color(203, 178, 183);
		g.setColor(my327);

		int[] x327 = { 217, 227, 227 };
		int[] y327 = { 20, 13, 23 };
		g.fillPolygon(x327, y327, 3);
//328
		Color my328 = new Color(194, 143, 118);
		g.setColor(my328);

		int[] x328 = { 227, 227, 240 };
		int[] y328 = { 23, 13, 23 };
		g.fillPolygon(x328, y328, 3);
//329
		Color my329 = new Color(52, 41, 61);
		g.setColor(my329);

		int[] x329 = { 240, 227, 250 };
		int[] y329 = { 23, 13, 5 };
		g.fillPolygon(x329, y329, 3);
//330
		Color my330 = new Color(226, 225, 240);
		g.setColor(my330);

		int[] x330 = { 240, 250, 253 };
		int[] y330 = { 23, 5, 22 };
		g.fillPolygon(x330, y330, 3);
//331
		Color my331 = new Color(228, 201, 148);
		g.setColor(my331);

		int[] x331 = { 253, 240, 248 };
		int[] y331 = { 22, 23, 38 };
		g.fillPolygon(x331, y331, 3);
//332
		Color my332 = new Color(193, 136, 69);
		g.setColor(my332);

		int[] x332 = { 250, 250, 256 };
		int[] y332 = { 5, 0, 0 };
		g.fillPolygon(x332, y332, 3);
//333
		Color my333 = new Color(229, 152, 94);
		g.setColor(my333);

		int[] x333 = { 256, 250, 258 };
		int[] y333 = { 0, 5, 13 };
		g.fillPolygon(x333, y333, 3);
//334
		Color my334 = new Color(218, 155, 93);
		g.setColor(my334);

		int[] x334 = { 258, 250, 253 };
		int[] y334 = { 13, 5, 22 };
		g.fillPolygon(x334, y334, 3);
//335
		Color my335 = new Color(195, 129, 78);
		g.setColor(my335);

		int[] x335 = { 253, 258, 261 };
		int[] y335 = { 22, 13, 29 };
		g.fillPolygon(x335, y335, 3);
//336
		Color my336 = new Color(200, 140, 76);
		g.setColor(my336);

		int[] x336 = { 261, 253, 256 };
		int[] y336 = { 29, 22, 40 };
		g.fillPolygon(x336, y336, 3);
//337
		Color my337 = new Color(224, 160, 90);
		g.setColor(my337);

		int[] x337 = { 256, 261, 263 };
		int[] y337 = { 40, 29, 44 };
		g.fillPolygon(x337, y337, 3);
//338
		Color my338 = new Color(203, 145, 76);
		g.setColor(my338);

		int[] x338 = { 256, 263, 258 };
		int[] y338 = { 40, 44, 49 };
		g.fillPolygon(x338, y338, 3);
//339
		Color my339 = new Color(200, 143, 93);
		g.setColor(my339);

		int[] x339 = { 258, 263, 267 };
		int[] y339 = { 49, 40, 60 };
		g.fillPolygon(x339, y339, 3);
//340
		Color my340 = new Color(227, 158, 98);
		g.setColor(my340);

		int[] x340 = { 267, 258, 260 };
		int[] y340 = { 60, 49, 68 };
		g.fillPolygon(x340, y340, 3);
//341
		Color my341 = new Color(205, 154, 97);
		g.setColor(my341);

		int[] x341 = { 260, 267, 269 };
		int[] y341 = { 68, 60, 74 };
		g.fillPolygon(x341, y341, 3);
//342
		Color my342 = new Color(210, 152, 92);
		g.setColor(my342);

		int[] x342 = { 269, 263, 260 };
		int[] y342 = { 74, 80, 68 };
		g.fillPolygon(x342, y342, 3);
//343
		Color my343 = new Color(224, 167, 104);
		g.setColor(my343);

		int[] x343 = { 269, 263, 270 };
		int[] y343 = { 74, 80, 88 };
		g.fillPolygon(x343, y343, 3);
//344
		Color my344 = new Color(175, 135, 147);
		g.setColor(my344);

		int[] x344 = { 263, 270, 264 };
		int[] y344 = { 80, 88, 93 };
		g.fillPolygon(x344, y344, 3);
//345
		Color my345 = new Color(171, 144, 125);
		g.setColor(my345);

		int[] x345 = { 270, 264, 273 };
		int[] y345 = { 88, 93, 107 };
		g.fillPolygon(x345, y345, 3);
//346
		Color my346 = new Color(191, 154, 157);
		g.setColor(my346);

		int[] x346 = { 264, 273, 268 };
		int[] y346 = { 93, 107, 116 };
		g.fillPolygon(x346, y346, 3);
//347
		Color my347 = new Color(168, 127, 134);
		g.setColor(my347);

		int[] x347 = { 268, 273, 277 };
		int[] y347 = { 116, 107, 122 };
		g.fillPolygon(x347, y347, 3);
//348
		Color my348 = new Color(82, 77, 103);
		g.setColor(my348);

		int[] x348 = { 277, 268, 271 };
		int[] y348 = { 122, 116, 135 };
		g.fillPolygon(x348, y348, 3);
//349
		Color my349 = new Color(83, 76, 91);
		g.setColor(my349);

		int[] x349 = { 271, 277, 279 };
		int[] y349 = { 135, 122, 133 };
		g.fillPolygon(x349, y349, 3);
//350
		Color my350 = new Color(34, 25, 24);
		g.setColor(my350);

		int[] x350 = { 279, 271, 279 };
		int[] y350 = { 133, 135, 140 };
		g.fillPolygon(x350, y350, 3);
//351
		Color my351 = new Color(48, 48, 52);
		g.setColor(my351);

		int[] x351 = { 279, 271, 269 };
		int[] y351 = { 140, 135, 150 };
		g.fillPolygon(x351, y351, 3);
//352
		Color my352 = new Color(58, 55, 63);
		g.setColor(my352);

		int[] x353 = { 269, 250, 271 };
		int[] y353 = { 150, 153, 135 };
		g.fillPolygon(x353, y353, 3);
//354
		Color my354 = new Color(177, 169, 164);
		g.setColor(my354);

		int[] x354 = { 250, 256, 271 };
		int[] y354 = { 153, 138, 135 };
		g.fillPolygon(x354, y354, 3);
//355
		Color my355 = new Color(39, 44, 49);
		g.setColor(my355);

		int[] x355 = { 250, 256, 233 };
		int[] y355 = { 154, 138, 147 };
		g.fillPolygon(x355, y355, 3);
//356
		Color my356 = new Color(106, 105, 144);
		g.setColor(my356);

		int[] x356 = { 233, 250, 218 };
		int[] y356 = { 147, 154, 174 };
		g.fillPolygon(x356, y356, 3);
//357
		Color my357 = new Color(142, 118, 157);
		g.setColor(my357);

		int[] x357 = { 218, 233, 203 };
		int[] y357 = { 174, 147, 177 };
		g.fillPolygon(x357, y357, 3);
//358
		Color my358 = new Color(136, 135, 191);
		g.setColor(my358);

		int[] x358 = { 203, 218, 192 };
		int[] y358 = { 177, 174, 191 };
		g.fillPolygon(x358, y358, 3);
//359
		Color my359 = new Color(177, 155, 177);
		g.setColor(my359);

		int[] x359 = { 192, 171, 164 };
		int[] y359 = { 191, 195, 208 };
		g.fillPolygon(x359, y359, 3);
//360
		Color my360 = new Color(135, 133, 193);
		g.setColor(my360);

		int[] x360 = { 171, 192, 203 };
		int[] y360 = { 195, 191, 177 };
		g.fillPolygon(x360, y360, 3);
//361
		Color my361 = new Color(198, 178, 171);
		g.setColor(my361);

		int[] x361 = { 171, 164, 148 };
		int[] y361 = { 195, 208, 212 };
		g.fillPolygon(x361, y361, 3);
//362
		Color my362 = new Color(103, 89, 100);
		g.setColor(my362);

		int[] x362 = { 148, 147, 164 };
		int[] y362 = { 212, 219, 208 };
		g.fillPolygon(x362, y362, 3);
//////////////////BOAT1////////////////////////////////
//363
		Color my363 = new Color(46, 62, 123);
		g.setColor(my363);

		int[] x363 = { 103, 108, 128 };
		int[] y363 = { 118, 124, 107 };
		g.fillPolygon(x363, y363, 3);
//364
		Color my364 = new Color(46, 108, 164);
		g.setColor(my364);

		int[] x364 = { 128, 103, 116 };
		int[] y364 = { 107, 118, 101 };
		g.fillPolygon(x364, y364, 3);
//365
		Color my365 = new Color(61, 108, 180);
		g.setColor(my365);

		int[] x365 = { 116, 103, 103 };
		int[] y365 = { 101, 118, 93 };
		g.fillPolygon(x365, y365, 3);
//366
		Color my366 = new Color(91, 158, 221);
		g.setColor(my366);

		int[] x366 = { 103, 116, 126 };
		int[] y366 = { 93, 101, 86 };
		g.fillPolygon(x366, y366, 3);
//367
		Color my367 = new Color(76, 126, 188);
		g.setColor(my367);

		int[] x367 = { 126, 128, 116 };
		int[] y367 = { 86, 107, 101 };
		g.fillPolygon(x367, y367, 3);
//368
		Color my368 = new Color(140, 76, 56);
		g.setColor(my368);

		int[] x368 = { 103, 126, 113 };
		int[] y368 = { 93, 86, 81 };
		g.fillPolygon(x368, y368, 3);
//369
		Color my369 = new Color(39, 68, 128);
		g.setColor(my369);

		int[] x369 = { 102, 99, 124 };
		int[] y369 = { 94, 81, 70 };
		g.fillPolygon(x369, y369, 3);
//370
		Color my370 = new Color(46, 91, 167);
		g.setColor(my370);

		int[] x370 = { 113, 124, 126 };
		int[] y370 = { 81, 70, 86 };
		g.fillPolygon(x370, y370, 3);
//371
		Color my371 = new Color(80, 127, 195);
		g.setColor(my371);

		int[] x371 = { 124, 126, 132 };
		int[] y371 = { 70, 86, 79 };
		g.fillPolygon(x371, y371, 3);
//372
		Color my372 = new Color(51, 22, 17);
		g.setColor(my372);

		int[] x372 = { 132, 124, 143 };
		int[] y372 = { 79, 70, 62 };
		g.fillPolygon(x372, y372, 3);
//373
		Color my373 = new Color(171, 85, 140);
		g.setColor(my373);

		int[] x373 = { 143, 132, 144 };
		int[] y373 = { 62, 79, 89 };
		g.fillPolygon(x373, y373, 3);
//374
		Color my374 = new Color(139, 119, 186);
		g.setColor(my374);

		int[] x374 = { 144, 132, 126 };
		int[] y374 = { 89, 79, 86 };
		g.fillPolygon(x374, y374, 3);
//375
		Color my375 = new Color(100, 80, 81);
		g.setColor(my375);

		int[] x375 = { 126, 128, 146 };
		int[] y375 = { 86, 107, 89 };
		g.fillPolygon(x375, y375, 3);
//376
		Color my376 = new Color(136, 35, 37);
		g.setColor(my376);

		int[] x376 = { 143, 143, 159 };
		int[] y376 = { 90, 62, 78 };
		g.fillPolygon(x376, y376, 3);
//377
		Color my377 = new Color(111, 100, 168);
		g.setColor(my377);

		int[] x377 = { 143, 159, 165 };
		int[] y377 = { 62, 78, 52 };
		g.fillPolygon(x377, y377, 3);
//378
		Color my378 = new Color(164, 87, 79);
		g.setColor(my378);

		int[] x378 = { 165, 159, 177 };
		int[] y378 = { 52, 78, 57 };
		g.fillPolygon(x378, y378, 3);
//379
		Color my379 = new Color(9, 10, 5);
		g.setColor(my379);

		int[] x379 = { 165, 177, 188 };
		int[] y379 = { 52, 57, 40 };
		g.fillPolygon(x379, y379, 3);
///////////////////BOAT2//////////////////////////////////
//380
		Color my380 = new Color(246, 209, 203);
		g.setColor(my380);

		int[] x380 = { 93, 86, 116 };
		int[] y380 = { 202, 211, 215 };
		g.fillPolygon(x380, y380, 3);
//381
		Color my381 = new Color(146, 134, 133);
		g.setColor(my381);

		int[] x381 = { 116, 86, 129 };
		int[] y381 = { 215, 211, 227 };
		g.fillPolygon(x381, y381, 3);
//382
		Color my382 = new Color(193, 181, 179);
		g.setColor(my382);

		int[] x382 = { 129, 116, 135 };
		int[] y382 = { 227, 215, 224 };
		g.fillPolygon(x382, y382, 3);
//383
		Color my383 = new Color(251, 206, 198);
		g.setColor(my383);

		int[] x383 = { 135, 116, 137 };
		int[] y383 = { 224, 215, 218 };
		g.fillPolygon(x383, y383, 3);
//384
		Color my384 = new Color(184, 166, 203);
		g.setColor(my384);

		int[] x384 = { 137, 125, 116 };
		int[] y384 = { 218, 210, 215 };
		g.fillPolygon(x384, y384, 3);
//385
		Color my385 = new Color(169, 210, 240);
		g.setColor(my385);

		int[] x385 = { 116, 125, 101 };
		int[] y385 = { 215, 210, 195 };
		g.fillPolygon(x385, y385, 3);
//386
		Color my386 = new Color(240, 213, 229);
		g.setColor(my386);

		int[] x386 = { 101, 116, 93 };
		int[] y386 = { 195, 215, 202 };
		g.fillPolygon(x386, y386, 3);
//387
		Color my387 = new Color(168, 210, 240);
		g.setColor(my387);

		int[] x387 = { 102, 116, 125 };
		int[] y387 = { 195, 215, 210 };
		g.fillPolygon(x387, y387, 3);
//388
		Color my388 = new Color(217, 233, 240);
		g.setColor(my388);

		int[] x388 = { 102, 125, 108 };
		int[] y388 = { 195, 210, 188 };
		g.fillPolygon(x388, y388, 3);
//389
		Color my389 = new Color(228, 238, 240);
		g.setColor(my389);

		int[] x389 = { 108, 125, 123 };
		int[] y389 = { 188, 210, 193 };
		g.fillPolygon(x389, y389, 3);
//390
		Color my390 = new Color(149, 183, 219);
		g.setColor(my390);

		int[] x390 = { 123, 108, 120 };
		int[] y390 = { 193, 188, 181 };
		g.fillPolygon(x390, y390, 3);
//391
		Color my391 = new Color(226, 239, 235);
		g.setColor(my391);

		int[] x391 = { 120, 125, 137 };
		int[] y391 = { 181, 210, 190 };
		g.fillPolygon(x391, y391, 3);
//392
		Color my392 = new Color(220, 232, 234);
		g.setColor(my392);

		int[] x392 = { 137, 125, 155 };
		int[] y392 = { 190, 210, 195 };
		g.fillPolygon(x392, y392, 3);
//393
		Color my393 = new Color(203, 234, 249);
		g.setColor(my393);

		int[] x393 = { 155, 137, 147 };
		int[] y393 = { 195, 204, 214 };
		g.fillPolygon(x393, y393, 3);
//394
		Color my394 = new Color(189, 224, 244);
		g.setColor(my394);

		int[] x394 = { 147, 137, 125 };
		int[] y394 = { 214, 204, 210 };
		g.fillPolygon(x394, y394, 3);
//395
		Color my395 = new Color(250, 209, 207);
		g.setColor(my395);

		int[] x395 = { 136, 125, 147 };
		int[] y395 = { 217, 210, 214 };
		g.fillPolygon(x395, y395, 3);
//396
		Color my396 = new Color(192, 182, 176);
		g.setColor(my396);

		int[] x396 = { 148, 148, 136 };
		int[] y396 = { 214, 219, 217 };
		g.fillPolygon(x396, y396, 3);
		int[] x396_1 = { 148, 136, 136 };
		int[] y396_1 = { 219, 224, 217 };
		g.fillPolygon(x396_1, y396_1, 3);
//397
		Color my397 = new Color(252, 202, 175);
		g.setColor(my397);

		int[] x397 = { 147, 154, 171 };
		int[] y397 = { 214, 195, 195 };
		g.fillPolygon(x397, y397, 3);
//398
		Color my398 = new Color(184, 143, 125);
		g.setColor(my398);

		int[] x398 = { 154, 138, 147 };
		int[] y398 = { 195, 190, 184 };
		g.fillPolygon(x398, y398, 3);
//399
		Color my399 = new Color(149, 142, 149);
		g.setColor(my399);

		int[] x399 = { 138, 147, 130 };
		int[] y399 = { 190, 184, 180 };
		g.fillPolygon(x399, y399, 3);
//400
		Color my400 = new Color(234, 145, 118);
		g.setColor(my400);

		int[] x400 = { 130, 138, 120 };
		int[] y400 = { 180, 190, 181 };
		g.fillPolygon(x400, y400, 3);
//401
		Color my401 = new Color(176, 150, 167);
		g.setColor(my401);

		int[] x401 = { 120, 130, 130 };
		int[] y401 = { 181, 164, 180 };
		g.fillPolygon(x401, y401, 3);
//402
		Color my402 = new Color(23, 18, 22);
		g.setColor(my402);

		int[] x402 = { 130, 145, 130 };
		int[] y402 = { 164, 172, 180 };
		g.fillPolygon(x402, y402, 3);
//403
		Color my403 = new Color(25, 17, 26);
		g.setColor(my403);

		int[] x403 = { 130, 147, 145 };
		int[] y403 = { 180, 184, 172 };
		g.fillPolygon(x403, y403, 3);
//404
		Color my404 = new Color(21, 20, 25);
		g.setColor(my404);

		int[] x404 = { 145, 142, 130 };
		int[] y404 = { 172, 154, 164 };
		g.fillPolygon(x404, y404, 3);
//405
		Color my405 = new Color(239, 57, 44);
		g.setColor(my405);

		int[] x405 = { 142, 147, 177 };
		int[] y405 = { 154, 184, 180 };
		g.fillPolygon(x405, y405, 3);
//406
		Color my406 = new Color(242, 71, 61);
		g.setColor(my406);

		int[] x406 = { 142, 163, 156 };
		int[] y406 = { 154, 170, 146 };
		g.fillPolygon(x406, y406, 3);
//407
		Color my407 = new Color(237, 63, 54);
		g.setColor(my407);

		int[] x407 = { 163, 156, 185 };
		int[] y407 = { 170, 146, 142 };
		g.fillPolygon(x407, y407, 3);
//408
		Color my408 = new Color(239, 63, 49);
		g.setColor(my408);

		int[] x408 = { 185, 163, 177 };
		int[] y408 = { 142, 170, 180 };
		g.fillPolygon(x408, y408, 3);
//409
		Color my409 = new Color(235, 64, 48);
		g.setColor(my409);

		int[] x409 = { 177, 185, 185 };
		int[] y409 = { 180, 142, 175 };
		g.fillPolygon(x409, y409, 3);
//410
		Color my410 = new Color(181, 48, 37);
		g.setColor(my410);

		int[] x410 = { 177, 147, 153 };
		int[] y410 = { 180, 184, 194 };
		g.fillPolygon(x410, y410, 3);
//411
		Color my411 = new Color(159, 42, 34);
		g.setColor(my411);

		int[] x411 = { 153, 170, 177 };
		int[] y411 = { 194, 196, 180 };
		g.fillPolygon(x411, y411, 3);
//412
		Color my412 = new Color(201, 123, 92);
		g.setColor(my412);

		int[] x412 = { 170, 177, 201 };
		int[] y412 = { 196, 180, 178 };
		g.fillPolygon(x412, y412, 3);
//413
		Color my413 = new Color(95, 69, 63);
		g.setColor(my413);

		int[] x413 = { 177, 185, 201 };
		int[] y413 = { 180, 175, 178 };
		g.fillPolygon(x413, y413, 3);
//414
		Color my414 = new Color(158, 133, 161);
		g.setColor(my414);

		int[] x414 = { 201, 185, 213 };
		int[] y414 = { 178, 175, 159 };
		g.fillPolygon(x414, y414, 3);
//415
		Color my415 = new Color(137, 94, 111);
		g.setColor(my415);

		int[] x415 = { 213, 199, 230 };
		int[] y415 = { 159, 181, 150 };
		g.fillPolygon(x415, y415, 3);
//416
		Color my416 = new Color(78, 68, 77);
		g.setColor(my416);

		int[] x416 = { 230, 213, 242 };
		int[] y416 = { 150, 159, 138 };
		g.fillPolygon(x416, y416, 3);
//417
		Color my417 = new Color(99, 98, 113);
		g.setColor(my417);

		int[] x417 = { 242, 230, 258 };
		int[] y417 = { 138, 150, 138 };
		g.fillPolygon(x417, y417, 3);
//418
		Color my418 = new Color(99, 95, 112);
		g.setColor(my418);

		int[] x418 = { 255, 272, 269 };
		int[] y418 = { 138, 135, 115 };
		g.fillPolygon(x418, y418, 3);
//419
		Color my419 = new Color(37, 33, 32);
		g.setColor(my419);

		int[] x419 = { 269, 255, 241 };
		int[] y419 = { 115, 138, 138 };
		g.fillPolygon(x419, y419, 3);
//420
		Color my420 = new Color(19, 22, 23);
		g.setColor(my420);

		int[] x420 = { 241, 254, 269 };
		int[] y420 = { 138, 117, 115 };
		g.fillPolygon(x420, y420, 3);
//421
		Color my421 = new Color(33, 33, 33);
		g.setColor(my421);

		int[] x421 = { 269, 254, 260 };
		int[] y421 = { 115, 117, 106 };
		g.fillPolygon(x421, y421, 3);
//422
		Color my422 = new Color(26, 20, 29);
		g.setColor(my422);

		int[] x422 = { 260, 269, 264 };
		int[] y422 = { 106, 115, 93 };
		g.fillPolygon(x422, y422, 3);
//423
		Color my423 = new Color(56, 41, 56);
		g.setColor(my423);

		int[] x423 = { 264, 260, 263 };
		int[] y423 = { 93, 106, 79 };
		g.fillPolygon(x423, y423, 3);
//424
		Color my424 = new Color(160, 87, 77);
		g.setColor(my424);

		int[] x424 = { 263, 243, 259 };
		int[] y424 = { 79, 77, 60 };
		g.fillPolygon(x424, y424, 3);
//425
		Color my425 = new Color(157, 43, 61);
		g.setColor(my425);

		int[] x425 = { 263, 260, 242 };
		int[] y425 = { 79, 106, 90 };
		g.fillPolygon(x425, y425, 3);
//426
		Color my426 = new Color(16, 18, 13);
		g.setColor(my426);

		int[] x426 = { 242, 243, 263 };
		int[] y426 = { 90, 77, 79 };
		g.fillPolygon(x426, y426, 3);
//427
		Color my427 = new Color(203, 70, 128);
		g.setColor(my427);

		int[] x427 = { 260, 242, 243 };
		int[] y427 = { 106, 90, 102 };
		g.fillPolygon(x427, y427, 3);
//428
		Color my428 = new Color(204, 118, 105);
		g.setColor(my428);

		int[] x428 = { 243, 241, 260 };
		int[] y428 = { 102, 111, 106 };
		g.fillPolygon(x428, y428, 3);
//429
		Color my429 = new Color(155, 105, 94);
		g.setColor(my429);

		int[] x429 = { 260, 241, 253 };
		int[] y429 = { 106, 111, 119 };
		g.fillPolygon(x429, y429, 3);
//430
		Color my430 = new Color(216, 63, 72);
		g.setColor(my430);

		int[] x430 = { 253, 241, 231 };
		int[] y430 = { 119, 111, 126 };
		g.fillPolygon(x430, y430, 3);
//431
		Color my431 = new Color(240, 84, 97);
		g.setColor(my431);

		int[] x431 = { 231, 253, 241 };
		int[] y431 = { 126, 119, 138 };
		g.fillPolygon(x431, y431, 3);
//432
		Color my432 = new Color(72, 103, 174);
		g.setColor(my432);

		int[] x432 = { 242, 231, 212 };
		int[] y432 = { 138, 126, 143 };
		g.fillPolygon(x432, y432, 3);
//433
		Color my433 = new Color(196, 218, 241);
		g.setColor(my433);

		int[] x433 = { 212, 212, 242 };
		int[] y433 = { 143, 160, 138 };
		g.fillPolygon(x433, y433, 3);
//434
		Color my434 = new Color(146, 187, 228);
		g.setColor(my434);

		int[] x434 = { 212, 212, 201 };
		int[] y434 = { 160, 143, 137 };
		g.fillPolygon(x434, y434, 3);
//435
		Color my435 = new Color(74, 120, 188);
		g.setColor(my435);

		int[] x435 = { 201, 212, 231 };
		int[] y435 = { 137, 143, 126 };
		g.fillPolygon(x435, y435, 3);
//436
		Color my436 = new Color(43, 67, 155);
		g.setColor(my436);

		int[] x436 = { 201, 201, 231 };
		int[] y436 = { 137, 120, 126 };
		g.fillPolygon(x436, y436, 3);
//437
		Color my437 = new Color(205, 234, 249);
		g.setColor(my437);

		int[] x437 = { 201, 201, 185 };
		int[] y437 = { 120, 137, 125 };
		g.fillPolygon(x437, y437, 3);
//438
		Color my438 = new Color(213, 225, 248);
		g.setColor(my438);

		int[] x438 = { 185, 201, 185 };
		int[] y438 = { 125, 137, 142 };
		g.fillPolygon(x438, y438, 3);
//439
		Color my439 = new Color(233, 242, 251);
		g.setColor(my439);

		int[] x439 = { 185, 201, 212 };
		int[] y439 = { 142, 137, 160 };
		g.fillPolygon(x439, y439, 3);
//440
		Color my440 = new Color(242, 216, 233);
		g.setColor(my440);

		int[] x440 = { 212, 185, 185 };
		int[] y440 = { 160, 142, 175 };
		g.fillPolygon(x440, y440, 3);
//441
		Color my441 = new Color(246, 195, 184);
		g.setColor(my441);

		int[] x441 = { 185, 156, 165 };
		int[] y441 = { 142, 147, 134 };
		g.fillPolygon(x441, y441, 3);
//442
		Color my442 = new Color(245, 97, 90);
		g.setColor(my442);

		int[] x442 = { 165, 185, 185 };
		int[] y442 = { 134, 142, 125 };
		g.fillPolygon(x442, y442, 3);
//443
		Color my443 = new Color(241, 98, 81);
		g.setColor(my443);

		int[] x443 = { 185, 165, 160 };
		int[] y443 = { 125, 134, 118 };
		g.fillPolygon(x443, y443, 3);
//444
		Color my444 = new Color(231, 52, 38);
		g.setColor(my444);

		int[] x444 = { 160, 185, 171 };
		int[] y444 = { 118, 125, 109 };
		g.fillPolygon(x444, y444, 3);
//445
		Color my445 = new Color(155, 56, 61);
		g.setColor(my445);

		int[] x445 = { 171, 189, 185 };
		int[] y445 = { 109, 109, 125 };
		g.fillPolygon(x445, y445, 3);
//446
		Color my446 = new Color(238, 73, 61);
		g.setColor(my446);

		int[] x446 = { 160, 156, 165 };
		int[] y446 = { 118, 147, 134 };
		g.fillPolygon(x446, y446, 3);
//447
		Color my447 = new Color(240, 72, 61);
		g.setColor(my447);

		int[] x447 = { 156, 160, 143 };
		int[] y447 = { 147, 118, 125 };
		g.fillPolygon(x447, y447, 3);
//448
		Color my448 = new Color(242, 117, 94);
		g.setColor(my448);

		int[] x448 = { 143, 156, 136 };
		int[] y448 = { 125, 147, 141 };
		g.fillPolygon(x448, y448, 3);
//449
		Color my449 = new Color(238, 85, 79);
		g.setColor(my449);

		int[] x449 = { 135, 143, 138 };
		int[] y449 = { 131, 125, 141 };
		g.fillPolygon(x449, y449, 3);
//450
		Color my450 = new Color(245, 126, 170);
		g.setColor(my450);

		int[] x450 = { 138, 143, 132 };
		int[] y450 = { 141, 154, 163 };
		g.fillPolygon(x450, y450, 3);
//451
		Color my451 = new Color(237, 76, 63);
		g.setColor(my451);

		int[] x451 = { 143, 156, 138 };
		int[] y451 = { 154, 147, 141 };
		g.fillPolygon(x451, y451, 3);
//452
		Color my452 = new Color(219, 63, 85);
		g.setColor(my452);

		int[] x452 = { 138, 132, 128 };
		int[] y452 = { 141, 165, 151 };
		g.fillPolygon(x452, y452, 3);
//453
		Color my453 = new Color(71, 65, 69);
		g.setColor(my453);

		int[] x453 = { 128, 132, 104 };
		int[] y453 = { 151, 165, 155 };
		g.fillPolygon(x453, y453, 3);
//454
		Color my454 = new Color(68, 63, 69);
		g.setColor(my454);

		int[] x454 = { 103, 128, 117 };
		int[] y454 = { 155, 152, 142 };
		g.fillPolygon(x454, y454, 3);
//455
		Color my455 = new Color(47, 42, 49);
		g.setColor(my455);

		int[] x455 = { 103, 117, 107 };
		int[] y455 = { 155, 142, 134 };
		g.fillPolygon(x455, y455, 3);
//456
		Color my456 = new Color(38, 33, 40);
		g.setColor(my456);

		int[] x456 = { 107, 117, 137 };
		int[] y456 = { 134, 142, 130 };
		g.fillPolygon(x456, y456, 3);
//457
		Color my457 = new Color(33, 34, 37);
		g.setColor(my457);

		int[] x457 = { 117, 138, 135 };
		int[] y457 = { 142, 141, 131 };
		g.fillPolygon(x457, y457, 3);
//458
		Color my458 = new Color(47, 44, 41);
		g.setColor(my458);

		int[] x458 = { 138, 117, 129 };
		int[] y458 = { 141, 142, 153 };
		g.fillPolygon(x458, y458, 3);
//459
		Color my459 = new Color(29, 27, 30);
		g.setColor(my459);

		int[] x459 = { 135, 135, 107 };
		int[] y459 = { 117, 131, 134 };
		g.fillPolygon(x459, y459, 3);
//460
		Color my460 = new Color(25, 25, 19);
		g.setColor(my460);

		int[] x460 = { 135, 144, 160 };
		int[] y460 = { 117, 126, 119 };
		g.fillPolygon(x460, y460, 3);
//461
		Color my461 = new Color(30, 31, 30);
		g.setColor(my461);

		int[] x461 = { 134, 135, 144 };
		int[] y461 = { 117, 131, 126 };
		g.fillPolygon(x461, y461, 3);
//462
		Color my462 = new Color(25, 23, 27);
		g.setColor(my462);

		int[] x462 = { 134, 160, 150 };
		int[] y462 = { 117, 119, 106 };
		g.fillPolygon(x462, y462, 3);
//463
		Color my463 = new Color(14, 15, 19);
		g.setColor(my463);

		int[] x463 = { 150, 168, 173 };
		int[] y463 = { 106, 88, 96 };
		g.fillPolygon(x463, y463, 3);
//464
		Color my464 = new Color(26, 22, 26);
		g.setColor(my464);

		int[] x464 = { 173, 159, 150 };
		int[] y464 = { 96, 120, 106 };
		g.fillPolygon(x464, y464, 3);
//465
		Color my465 = new Color(84, 63, 70);
		g.setColor(my465);

		int[] x465 = { 159, 171, 173 };
		int[] y465 = { 120, 110, 96 };
		g.fillPolygon(x465, y465, 3);
//466
		Color my466 = new Color(139, 86, 120);
		g.setColor(my466);

		int[] x466 = { 171, 173, 195 };
		int[] y466 = { 110, 96, 89 };
		g.fillPolygon(x466, y466, 3);
//467
		Color my467 = new Color(141, 87, 120);
		g.setColor(my467);

		int[] x467 = { 195, 189, 171 };
		int[] y467 = { 89, 109, 110 };
		g.fillPolygon(x467, y467, 3);
//468
		Color my468 = new Color(134, 96, 145);
		g.setColor(my468);

		int[] x468 = { 173, 180, 195 };
		int[] y468 = { 96, 80, 89 };
		g.fillPolygon(x468, y468, 3);
//469
		Color my469 = new Color(111, 169, 225);
		g.setColor(my469);

		int[] x469 = { 195, 194, 180 };
		int[] y469 = { 89, 73, 80 };
		g.fillPolygon(x469, y469, 3);
//470
		Color my470 = new Color(63, 72, 161);
		g.setColor(my470);

		int[] x470 = { 194, 211, 213 };
		int[] y470 = { 73, 91, 66 };
		g.fillPolygon(x470, y470, 3);
//471
		Color my471 = new Color(190, 80, 132);
		g.setColor(my471);

		int[] x471 = { 211, 194, 195 };
		int[] y471 = { 91, 73, 89 };
		g.fillPolygon(x471, y471, 3);
//472
		Color my472 = new Color(155, 170, 215);
		g.setColor(my472);

		int[] x472 = { 213, 211, 223 };
		int[] y472 = { 66, 91, 79 };
		g.fillPolygon(x472, y472, 3);
//473
		Color my473 = new Color(114, 83, 161);
		g.setColor(my473);

		int[] x473 = { 223, 211, 227 };
		int[] y473 = { 79, 91, 94 };
		g.fillPolygon(x473, y473, 3);
//474
		Color my474 = new Color(43, 45, 124);
		g.setColor(my474);

		int[] x474 = { 211, 227, 211 };
		int[] y474 = { 91, 94, 102 };
		g.fillPolygon(x474, y474, 3);
//475
		Color my475 = new Color(44, 49, 133);
		g.setColor(my475);

		int[] x475 = { 211, 227, 231 };
		int[] y475 = { 102, 94, 108 };
		g.fillPolygon(x475, y475, 3);
//476
		Color my476 = new Color(68, 98, 174);
		g.setColor(my476);

		int[] x476 = { 231, 211, 211 };
		int[] y476 = { 108, 102, 116 };
		g.fillPolygon(x476, y476, 3);
//477
		Color my477 = new Color(68, 100, 171);
		g.setColor(my477);

		int[] x477 = { 211, 211, 199 };
		int[] y477 = { 116, 102, 107 };
		g.fillPolygon(x477, y477, 3);
//478
		Color my478 = new Color(70, 101, 181);
		g.setColor(my478);

		int[] x478 = { 199, 199, 188 };
		int[] y478 = { 107, 120, 110 };
		g.fillPolygon(x478, y478, 3);
//479
		Color my479 = new Color(67, 100, 180);
		g.setColor(my479);

		int[] x479 = { 188, 185, 199 };
		int[] y479 = { 110, 124, 120 };
		g.fillPolygon(x479, y479, 3);
//480
		Color my480 = new Color(67, 99, 174);
		g.setColor(my480);

		int[] x480 = { 201, 231, 231 };
		int[] y480 = { 120, 108, 126 };
		g.fillPolygon(x480, y480, 3);
//481
		Color my481 = new Color(67, 99, 174);
		g.setColor(my481);

		int[] x481 = { 199, 199, 211 };
		int[] y481 = { 107, 121, 116 };
		g.fillPolygon(x481, y481, 3);
//482
		Color my482 = new Color(20, 18, 14);
		g.setColor(my482);

		int[] x482 = { 199, 188, 195 };
		int[] y482 = { 107, 110, 88 };
		g.fillPolygon(x482, y482, 3);
//483
		Color my483 = new Color(57, 55, 148);
		g.setColor(my483);

		int[] x483 = { 195, 199, 211 };
		int[] y483 = { 88, 107, 102 };
		g.fillPolygon(x483, y483, 3);
//484
		Color my484 = new Color(199, 69, 92);
		g.setColor(my484);

		int[] x484 = { 211, 211, 195 };
		int[] y484 = { 102, 90, 88 };
		g.fillPolygon(x484, y484, 3);
//485
		Color my485 = new Color(147, 149, 125);
		g.setColor(my485);

		int[] x485 = { 162, 148, 125 };
		int[] y485 = { 227, 267, 252 };
		g.fillPolygon(x485, y485, 3);
//486
		Color my486 = new Color(60, 163, 212);
		g.setColor(my486);

		int[] x486 = { 173, 168, 181 };
		int[] y486 = { 96, 88, 81 };
		g.fillPolygon(x486, y486, 3);
//487
		Color my487 = new Color(57, 162, 202);
		g.setColor(my487);

		int[] x487 = { 168, 168, 181 };
		int[] y487 = { 88, 75, 81 };
		g.fillPolygon(x487, y487, 3);
//488
		Color my488 = new Color(54, 160, 197);
		g.setColor(my488);

		int[] x488 = { 181, 168, 176 };
		int[] y488 = { 81, 75, 68 };
		g.fillPolygon(x488, y488, 3);
//489
		Color my489 = new Color(56, 172, 192);
		g.setColor(my489);

		int[] x489 = { 176, 181, 195 };
		int[] y489 = { 68, 81, 74 };
		g.fillPolygon(x489, y489, 3);
//490
		Color my490 = new Color(49, 168, 203);
		g.setColor(my490);

		int[] x490 = { 176, 195, 188 };
		int[] y490 = { 68, 74, 54 };
		g.fillPolygon(x490, y490, 3);
//491
		Color my491 = new Color(44, 110, 113);
		g.setColor(my491);

		int[] x491 = { 188, 195, 198 };
		int[] y491 = { 54, 74, 54 };
		g.fillPolygon(x491, y491, 3);
//492
		Color my492 = new Color(149, 178, 218);
		g.setColor(my492);

		int[] x492 = { 198, 195, 211 };
		int[] y492 = { 52, 74, 67 };
		g.fillPolygon(x492, y492, 3);
//493
		Color my493 = new Color(195, 90, 155);
		g.setColor(my493);

		int[] x493 = { 211, 198, 205 };
		int[] y493 = { 67, 52, 41 };
		g.fillPolygon(x493, y493, 3);
//494
		Color my494 = new Color(112, 58, 56);
		g.setColor(my494);

		int[] x494 = { 205, 217, 222 };
		int[] y494 = { 41, 41, 51 };
		g.fillPolygon(x494, y494, 3);
//495
		Color my495 = new Color(151, 152, 203);
		g.setColor(my495);

		int[] x495 = { 205, 211, 222 };
		int[] y495 = { 41, 67, 51 };
		g.fillPolygon(x495, y495, 3);
//496
		Color my496 = new Color(237, 166, 200);
		g.setColor(my496);

		int[] x496 = { 211, 222, 230 };
		int[] y496 = { 67, 78, 63 };
		g.fillPolygon(x496, y496, 3);
//497
		Color my497 = new Color(68, 91, 168);
		g.setColor(my497);

		int[] x497 = { 222, 235, 226 };
		int[] y497 = { 78, 78, 95 };
		g.fillPolygon(x497, y497, 3);
//498
		Color my498 = new Color(59, 39, 97);
		g.setColor(my498);

		int[] x498 = { 226, 235, 242 };
		int[] y498 = { 95, 78, 90 };
		g.fillPolygon(x498, y498, 3);
//499
		Color my499 = new Color(120, 140, 188);
		g.setColor(my499);

		int[] x499 = { 242, 235, 244 };
		int[] y499 = { 90, 78, 78 };
		g.fillPolygon(x499, y499, 3);
//500
		Color my500 = new Color(102, 123, 190);
		g.setColor(my500);

		int[] x500 = { 244, 222, 230 };
		int[] y500 = { 78, 78, 63 };
		g.fillPolygon(x500, y500, 3);
//551
		Color my551 = new Color(93, 43, 69);
		g.setColor(my551);

		int[] x551 = { 244, 226, 242 };
		int[] y551 = { 103, 95, 90 };
		g.fillPolygon(x551, y551, 3);
//552
		Color my552 = new Color(36, 35, 95);
		g.setColor(my552);

		int[] x552 = { 226, 244, 240 };
		int[] y552 = { 95, 103, 113 };
		g.fillPolygon(x552, y552, 3);
//553
		Color my553 = new Color(38, 35, 95);
		g.setColor(my553);

		int[] x553 = { 226, 240, 230 };
		int[] y553 = { 95, 113, 108 };
		g.fillPolygon(x553, y553, 3);
//554
		Color my554 = new Color(33, 37, 55);
		g.setColor(my554);

		int[] x554 = { 230, 240, 230 };
		int[] y554 = { 108, 113, 128 };
		g.fillPolygon(x554, y554, 3);
//555
		Color my555 = new Color(157, 70, 133);
		g.setColor(my555);

		int[] x555 = { 230, 211, 222 };
		int[] y555 = { 65, 67, 51 };
		g.fillPolygon(x555, y555, 3);
//556
		Color my556 = new Color(75, 57, 56);
		g.setColor(my556);

		int[] x556 = { 215, 222, 229 };
		int[] y556 = { 41, 53, 44 };
		g.fillPolygon(x556, y556, 3);
//557
		Color my557 = new Color(168, 101, 87);
		g.setColor(my557);

		int[] x557 = { 222, 230, 229 };
		int[] y557 = { 53, 64, 44 };
		g.fillPolygon(x557, y557, 3);
//558
		Color my558 = new Color(214, 168, 167);
		g.setColor(my558);

		int[] x558 = { 229, 230, 240 };
		int[] y558 = { 44, 64, 48 };
		g.fillPolygon(x558, y558, 3);
//559
		Color my559 = new Color(138, 128, 137);
		g.setColor(my559);

		int[] x559 = { 230, 244, 240 };
		int[] y559 = { 64, 78, 48 };
		g.fillPolygon(x559, y559, 3);
//560
		Color my560 = new Color(58, 50, 81);
		g.setColor(my560);

		int[] x560 = { 240, 233, 247 };
		int[] y560 = { 48, 30, 37 };
		g.fillPolygon(x560, y560, 3);
//561
		Color my561 = new Color(54, 51, 90);
		g.setColor(my561);

		int[] x561 = { 240, 228, 233 };
		int[] y561 = { 48, 44, 30 };
		g.fillPolygon(x561, y561, 3);
//562
		Color my562 = new Color(34, 40, 68);
		g.setColor(my562);

		int[] x562 = { 233, 220, 228 };
		int[] y562 = { 30, 33, 44 };
		g.fillPolygon(x562, y562, 3);
//563
		Color my563 = new Color(21, 21, 25);
		g.setColor(my563);

		int[] x563 = { 228, 220, 216 };
		int[] y563 = { 44, 33, 42 };
		g.fillPolygon(x563, y563, 3);
//564
		Color my564 = new Color(208, 199, 225);
		g.setColor(my554);

		int[] x564 = { 216, 205, 217 };
		int[] y564 = { 42, 42, 19 };
		g.fillPolygon(x564, y564, 3);
//565
		Color my565 = new Color(235, 219, 196);
		g.setColor(my565);

		int[] x565 = { 217, 216, 226 };
		int[] y565 = { 19, 42, 22 };
		g.fillPolygon(x565, y565, 3);
//566
		Color my566 = new Color(43, 34, 67);
		g.setColor(my566);

		int[] x566 = { 220, 233, 226 };
		int[] y566 = { 33, 30, 22 };
		g.fillPolygon(x566, y566, 3);
//567
		Color my567 = new Color(35, 19, 30);
		g.setColor(my567);

		int[] x567 = { 233, 226, 241 };
		int[] y567 = { 30, 22, 23 };
		g.fillPolygon(x567, y567, 3);
//568
		Color my568 = new Color(38, 29, 55);
		g.setColor(my568);

		int[] x568 = { 233, 241, 246 };
		int[] y568 = { 30, 23, 36 };
		g.fillPolygon(x568, y568, 3);
//569
		Color my569 = new Color(235, 188, 171);
		g.setColor(my569);

		int[] x569 = { 246, 253, 256 };
		int[] y569 = { 36, 23, 40 };
		g.fillPolygon(x569, y569, 3);
//570
		Color my570 = new Color(201, 170, 159);
		g.setColor(my570);

		int[] x570 = { 246, 258, 256 };
		int[] y570 = { 36, 48, 40 };
		g.fillPolygon(x570, y570, 3);
//571
		Color my571 = new Color(4, 5, 0);
		g.setColor(my571);

		int[] x571 = { 256, 251, 246 };
		int[] y571 = { 47, 49, 36 };
		g.fillPolygon(x571, y571, 3);
//572
		Color my572 = new Color(147, 149, 125);
		g.setColor(my572);

		int[] x572 = { 246, 251, 240 };
		int[] y572 = { 36, 49, 48 };
		g.fillPolygon(x572, y572, 3);
//573
		Color my573 = new Color(37, 39, 62);
		g.setColor(my573);

		int[] x573 = { 240, 244, 260 };
		int[] y573 = { 48, 78, 61 };
		g.fillPolygon(x573, y573, 3);
//574
		Color my574 = new Color(119, 118, 134);
		g.setColor(my574);

		int[] x574 = { 240, 258, 260 };
		int[] y574 = { 48, 47, 61 };
		g.fillPolygon(x574, y574, 3);
////////////////////////////////////////////////////////
//575
		Color my575 = new Color(129, 140, 195);
		g.setColor(my575);

		int[] x575 = { 278, 300, 310 };
		int[] y575 = { 139, 148, 128 };
		g.fillPolygon(x575, y575, 3);
//576
		Color my576 = new Color(159, 186, 125);
		g.setColor(my576);

		int[] x576 = { 162, 148, 125 };
		int[] y576 = { 227, 267, 252 };
		g.fillPolygon(x576, y576, 3);
//577
		Color my577 = new Color(116, 101, 100);
		g.setColor(my577);

		int[] x577 = { 250, 269, 255 };
		int[] y577 = { 153, 150, 167 };
		g.fillPolygon(x577, y577, 3);
//578
		Color my578 = new Color(112, 85, 83);
		g.setColor(my578);

		int[] x578 = { 269, 255, 269 };
		int[] y578 = { 150, 167, 173 };
		g.fillPolygon(x578, y578, 3);
//579
		Color my579 = new Color(159, 182, 223);
		g.setColor(my579);

		int[] x579 = { 269, 269, 286 };
		int[] y579 = { 150, 173, 164 };
		g.fillPolygon(x579, y579, 3);
//580
		Color my580 = new Color(118, 83, 74);
		g.setColor(my580);

		int[] x580 = { 286, 269, 296 };
		int[] y580 = { 164, 150, 154 };
		g.fillPolygon(x580, y580, 3);
//581
		Color my581 = new Color(138, 157, 203);
		g.setColor(my581);

		int[] x581 = { 296, 269, 300 };
		int[] y581 = { 154, 150, 148 };
		g.fillPolygon(x581, y581, 3);
//582
		Color my582 = new Color(122, 92, 78);
		g.setColor(my582);

		int[] x582 = { 300, 269, 278 };
		int[] y582 = { 148, 150, 139 };
		g.fillPolygon(x582, y582, 3);
//583
		Color my583 = new Color(122, 141, 206);
		g.setColor(my583);

		int[] x583 = { 286, 296, 304 };
		int[] y583 = { 164, 154, 162 };
		g.fillPolygon(x583, y583, 3);
//584
		Color my584 = new Color(128, 138, 193);
		g.setColor(my584);

		int[] x584 = { 304, 286, 294 };
		int[] y584 = { 162, 164, 185 };
		g.fillPolygon(x584, y584, 3);
//585
		Color my585 = new Color(105, 87, 85);
		g.setColor(my585);

		int[] x585 = { 294, 304, 313 };
		int[] y585 = { 185, 162, 175 };
		g.fillPolygon(x585, y585, 3);
//586
		Color my586 = new Color(61, 65, 68);
		g.setColor(my586);

		int[] x586 = { 313, 310, 296 };
		int[] y586 = { 175, 128, 154 };
		g.fillPolygon(x586, y586, 3);
//587
		Color my587 = new Color(179, 194, 222);
		g.setColor(my587);

		int[] x587 = { 294, 316, 313 };
		int[] y587 = { 185, 201, 175 };
		g.fillPolygon(x587, y587, 3);
///////////////////////////////////////////////////////////
//588
		Color my588 = new Color(84, 66, 59);
		g.setColor(my588);

		int[] x588 = { 278, 310, 311 };
		int[] y588 = { 139, 128, 106 };
		g.fillPolygon(x588, y588, 3);
//589
		Color my589 = new Color(59, 62, 56);
		g.setColor(my589);

		int[] x589 = { 311, 290, 278 };
		int[] y589 = { 106, 115, 139 };
		g.fillPolygon(x589, y589, 3);
//590
		Color my590 = new Color(142, 117, 108);
		g.setColor(my590);

		int[] x590 = { 290, 278, 277 };
		int[] y590 = { 115, 139, 125 };
		g.fillPolygon(x590, y590, 3);
//591
		Color my591 = new Color(39, 32, 40);
		g.setColor(my591);

		int[] x591 = { 277, 290, 273 };
		int[] y591 = { 125, 115, 107 };
		g.fillPolygon(x591, y591, 3);
//592
		Color my592 = new Color(21, 19, 24);
		g.setColor(my592);

		int[] x592 = { 273, 290, 270 };
		int[] y592 = { 107, 93, 88 };
		g.fillPolygon(x592, y592, 3);
//593
		Color my593 = new Color(32, 32, 46);
		g.setColor(my593);

		int[] x593 = { 270, 281, 290 };
		int[] y593 = { 88, 81, 93 };
		g.fillPolygon(x593, y593, 3);
//594
		Color my594 = new Color(188, 145, 156);
		g.setColor(my594);

		int[] x594 = { 281, 290, 302 };
		int[] y594 = { 81, 93, 75 };
		g.fillPolygon(x594, y594, 3);
//595
		Color my595 = new Color(82, 55, 74);
		g.setColor(my595);

		int[] x595 = { 281, 270, 269 };
		int[] y595 = { 81, 88, 75 };
		g.fillPolygon(x595, y595, 3);
//596
		Color my596 = new Color(25, 31, 56);
		g.setColor(my596);

		int[] x596 = { 281, 275, 285 };
		int[] y596 = { 81, 71, 60 };
		g.fillPolygon(x596, y596, 3);
//597
		Color my597 = new Color(236, 206, 223);
		g.setColor(my597);

		int[] x597 = { 281, 285, 302 };
		int[] y597 = { 81, 60, 75 };
		g.fillPolygon(x597, y597, 3);
//598
		Color my598 = new Color(36, 69, 67);
		g.setColor(my598);

		int[] x598 = { 269, 281, 275 };
		int[] y598 = { 75, 81, 71 };
		g.fillPolygon(x598, y598, 3);
//599
		Color my599 = new Color(125, 140, 199);
		g.setColor(my599);

		int[] x599 = { 275, 269, 266 };
		int[] y599 = { 71, 75, 61 };
		g.fillPolygon(x599, y599, 3);
//600
		Color my600 = new Color(25, 25, 32);
		g.setColor(my600);

		int[] x600 = { 266, 285, 275 };
		int[] y600 = { 61, 60, 71 };
		g.fillPolygon(x600, y600, 3);
//601
		Color my601 = new Color(17, 15, 19);
		g.setColor(my601);

		int[] x601 = { 266, 263, 285 };
		int[] y601 = { 61, 44, 60 };
		g.fillPolygon(x601, y601, 3);
//602
		Color my602 = new Color(253, 233, 213);
		g.setColor(my602);

		int[] x602 = { 263, 270, 285 };
		int[] y602 = { 44, 32, 60 };
		g.fillPolygon(x602, y602, 3);
//603
		Color my603 = new Color(232, 223, 238);
		g.setColor(my603);

		int[] x603 = { 263, 260, 270 };
		int[] y603 = { 44, 30, 32 };
		g.fillPolygon(x603, y603, 3);
//604
		Color my604 = new Color(8, 10, 9);
		g.setColor(my604);

		int[] x604 = { 285, 270, 288 };
		int[] y604 = { 60, 32, 39 };
		g.fillPolygon(x604, y604, 3);
//605
		Color my605 = new Color(216, 200, 182);
		g.setColor(my605);

		int[] x605 = { 260, 271, 270 };
		int[] y605 = { 30, 26, 32 };
		g.fillPolygon(x605, y605, 3);
//606
		Color my606 = new Color(165, 151, 151);
		g.setColor(my606);

		int[] x606 = { 271, 288, 270 };
		int[] y606 = { 26, 39, 32 };
		g.fillPolygon(x606, y606, 3);
//607
		Color my607 = new Color(253, 235, 203);
		g.setColor(my607);

		int[] x607 = { 260, 256, 271 };
		int[] y607 = { 30, 4, 26 };
		g.fillPolygon(x607, y607, 3);
//608
		Color my608 = new Color(255, 233, 232);
		g.setColor(my608);

		int[] x608 = { 271, 256, 290 };
		int[] y608 = { 26, 4, 4 };
		g.fillPolygon(x608, y608, 3);
//609
		Color my609 = new Color(221, 200, 218);
		g.setColor(my609);

		int[] x609 = { 290, 288, 271 };
		int[] y609 = { 4, 39, 26 };
		g.fillPolygon(x609, y609, 3);
//610
		Color my610 = new Color(251, 239, 220);
		g.setColor(my610);

		int[] x610 = { 290, 288, 309 };
		int[] y610 = { 4, 39, 42 };
		g.fillPolygon(x610, y610, 3);
/////////////////////////////////////////////////////
//611
		Color my611 = new Color(240, 249, 250);
		g.setColor(my611);

		int[] x611 = { 288, 296, 309 };
		int[] y611 = { 39, 49, 42 };
		g.fillPolygon(x611, y611, 3);
//612
		Color my612 = new Color(4, 9, 5);
		g.setColor(my612);

		int[] x612 = { 309, 296, 319 };
		int[] y612 = { 42, 49, 55 };
		g.fillPolygon(x612, y612, 3);
//613
		Color my613 = new Color(48, 49, 43);
		g.setColor(my613);

		int[] x613 = { 319, 303, 309 };
		int[] y613 = { 55, 64, 42 };
		g.fillPolygon(x613, y613, 3);
//614
		Color my614 = new Color(26, 26, 27);
		g.setColor(my614);

		int[] x614 = { 309, 303, 286 };
		int[] y614 = { 42, 64, 61 };
		g.fillPolygon(x614, y614, 3);
//615
		Color my615 = new Color(245, 246, 252);
		g.setColor(my615);

		int[] x615 = { 286, 309, 288 };
		int[] y615 = { 61, 42, 39 };
		g.fillPolygon(x615, y615, 3);
//616
		Color my616 = new Color(252, 179, 125);
		g.setColor(my616);

		int[] x616 = { 286, 303, 300 };
		int[] y616 = { 61, 64, 79 };
		g.fillPolygon(x616, y616, 3);
//617
		Color my617 = new Color(11, 17, 20);
		g.setColor(my617);

		int[] x617 = { 300, 303, 319 };
		int[] y617 = { 79, 64, 55 };
		g.fillPolygon(x617, y617, 3);
//618
		Color my618 = new Color(70, 61, 66);
		g.setColor(my618);

		int[] x618 = { 319, 300, 323 };
		int[] y618 = { 55, 79, 59 };
		g.fillPolygon(x618, y618, 3);
//619
		Color my619 = new Color(26, 20, 21);
		g.setColor(my619);

		int[] x619 = { 323, 311, 300 };
		int[] y619 = { 59, 90, 79 };
		g.fillPolygon(x619, y619, 3);
//620
		Color my620 = new Color(74, 73, 69);
		g.setColor(my620);

		int[] x620 = { 311, 331, 323 };
		int[] y620 = { 90, 62, 59 };
		g.fillPolygon(x620, y620, 3);
//621
		Color my621 = new Color(25, 26, 21);
		g.setColor(my621);

		int[] x621 = { 331, 311, 339 };
		int[] y621 = { 62, 90, 67 };
		g.fillPolygon(x621, y621, 3);
//622
		Color my622 = new Color(104, 98, 78);
		g.setColor(my622);

		int[] x622 = { 339, 326, 311 };
		int[] y622 = { 67, 88, 90 };
		g.fillPolygon(x622, y622, 3);
//623
		Color my623 = new Color(93, 82, 81);
		g.setColor(my623);

		int[] x623 = { 311, 326, 311 };
		int[] y623 = { 90, 88, 107 };
		g.fillPolygon(x623, y623, 3);
//624
		Color my624 = new Color(149, 151, 209);
		g.setColor(my624);

		int[] x624 = { 339, 334, 311 };
		int[] y624 = { 67, 94, 107 };
		g.fillPolygon(x624, y624, 3);
//625
		Color my625 = new Color(27, 26, 21);
		g.setColor(my625);

		int[] x625 = { 300, 311, 290 };
		int[] y625 = { 79, 90, 93 };
		g.fillPolygon(x625, y625, 3);
//626
		Color my626 = new Color(93, 96, 129);
		g.setColor(my626);

		int[] x626 = { 290, 311, 290 };
		int[] y626 = { 93, 90, 115 };
		g.fillPolygon(x626, y626, 3);
//627
		Color my627 = new Color(45, 36, 37);
		g.setColor(my627);

		int[] x627 = { 311, 311, 290 };
		int[] y627 = { 90, 107, 115 };
		g.fillPolygon(x627, y627, 3);
//628
		Color my628 = new Color(39, 37, 42);
		g.setColor(my628);

		int[] x628 = { 290, 290, 271 };
		int[] y628 = { 115, 93, 107 };
		g.fillPolygon(x628, y628, 3);
//629
		Color my629 = new Color(104, 99, 91);
		g.setColor(my629);

		int[] x629 = { 311, 328, 334 };
		int[] y629 = { 107, 113, 94 };
		g.fillPolygon(x629, y629, 3);
//630
		Color my630 = new Color(129, 144, 200);
		g.setColor(my630);

		int[] x630 = { 328, 311, 309 };
		int[] y630 = { 113, 107, 129 };
		g.fillPolygon(x630, y630, 3);
//631
		Color my631 = new Color(117, 130, 191);
		g.setColor(my631);

		int[] x631 = { 309, 328, 311 };
		int[] y631 = { 129, 113, 156 };
		g.fillPolygon(x631, y631, 3);
//632
		Color my632 = new Color(143, 123, 171);
		g.setColor(my632);

		int[] x632 = { 311, 312, 325 };
		int[] y632 = { 156, 176, 186 };
		g.fillPolygon(x632, y632, 3);
//633
		Color my633 = new Color(178, 198, 231);
		g.setColor(my633);

		int[] x633 = { 311, 325, 333 };
		int[] y633 = { 156, 186, 163 };
		g.fillPolygon(x633, y633, 3);
//634
		Color my634 = new Color(23, 26, 62);
		g.setColor(my634);

		int[] x634 = { 333, 311, 331 };
		int[] y634 = { 163, 156, 153 };
		g.fillPolygon(x634, y634, 3);
//635
		Color my635 = new Color(170, 129, 127);
		g.setColor(my635);

		int[] x635 = { 311, 331, 316 };
		int[] y635 = { 156, 153, 143 };
		g.fillPolygon(x635, y635, 3);
//636
		Color my636 = new Color(188, 150, 185);
		g.setColor(my636);

		int[] x636 = { 311, 327, 339 };
		int[] y636 = { 156, 113, 124 };
		g.fillPolygon(x636, y636, 3);
//637
		Color my637 = new Color(224, 213, 238);
		g.setColor(my637);

		int[] x637 = { 316, 339, 343 };
		int[] y637 = { 143, 124, 148 };
		g.fillPolygon(x637, y637, 3);
//638
		Color my638 = new Color(249, 207, 227);
		g.setColor(my638);

		int[] x638 = { 343, 339, 352 };
		int[] y638 = { 148, 124, 133 };
		g.fillPolygon(x638, y638, 3);
////639
//	  Color my639 = new Color (194,167,207);
//	  g.setColor(my639);
//
//	  int [ ] x639 = {352,148,125};
//	  int [ ] y639 = {133,267,252};
//       g.fillPolygon(x639, y639, 3);
////640
//	  Color my640 = new Color (118,196,232);
//	  g.setColor(my630);
//
//	  int [ ] x640 = {162,148,125};
//	  int [ ] y640 = {227,267,252};
//       g.fillPolygon(x640, y640, 3);
////641
//	  Color my641 = new Color (248,132,91);
//	  g.setColor(my641);
//
//	  int [ ] x641 = {162,148,125};
//	  int [ ] y641 = {227,267,252};
//       g.fillPolygon(x641, y641, 3);
//642
		Color my642 = new Color(147, 149, 125);
		g.setColor(my642);

		int[] x642 = { 162, 148, 125 };
		int[] y642 = { 227, 267, 252 };
		g.fillPolygon(x642, y642, 3);
//643
		Color my643 = new Color(147, 149, 125);
		g.setColor(my643);

		int[] x643 = { 162, 148, 125 };
		int[] y643 = { 227, 267, 252 };
		g.fillPolygon(x643, y643, 3);
//644
		Color my644 = new Color(147, 149, 125);
		g.setColor(my644);

		int[] x644 = { 162, 148, 125 };
		int[] y644 = { 227, 267, 252 };
		g.fillPolygon(x644, y644, 3);
//645
		Color my645 = new Color(147, 149, 125);
		g.setColor(my645);

		int[] x645 = { 162, 148, 125 };
		int[] y645 = { 227, 267, 252 };
		g.fillPolygon(x645, y645, 3);
//646
		Color my646 = new Color(147, 149, 125);
		g.setColor(my646);

		int[] x646 = { 162, 148, 125 };
		int[] y646 = { 227, 267, 252 };
		g.fillPolygon(x646, y646, 3);
//647
		Color my647 = new Color(147, 149, 125);
		g.setColor(my647);

		int[] x647 = { 162, 148, 125 };
		int[] y647 = { 227, 267, 252 };
		g.fillPolygon(x647, y647, 3);
//648
		Color my648 = new Color(147, 149, 125);
		g.setColor(my648);

		int[] x648 = { 162, 148, 125 };
		int[] y648 = { 227, 267, 252 };
		g.fillPolygon(x648, y648, 3);
//649
		Color my649 = new Color(147, 149, 125);
		g.setColor(my649);

		int[] x649 = { 162, 148, 125 };
		int[] y649 = { 227, 267, 252 };
		g.fillPolygon(x649, y649, 3);
//650
		Color my650 = new Color(147, 149, 125);
		g.setColor(my650);

		int[] x650 = { 162, 148, 125 };
		int[] y650 = { 227, 267, 252 };
		g.fillPolygon(x650, y650, 3);
		g.drawPolygon(poly);
	}

	public static void Testtwo(Graphics g) {
		Polygon poly = new Polygon();
//651
		Color my651 = new Color(207, 194, 159);
		g.setColor(my651);

		int[] x651 = { 393, 399, 355 };
		int[] y651 = { 363, 372, 376 };
		g.fillPolygon(x651, y651, 3);
//652
		Color my652 = new Color(207, 194, 159);
		g.setColor(my652);

		int[] x652 = { 401, 376, 355 };
		int[] y652 = { 371, 386, 376 };
		g.fillPolygon(x652, y652, 3);
//653
		Color my653 = new Color(198, 200, 211);
		g.setColor(my653);

		int[] x653 = { 401, 424, 434 };
		int[] y653 = { 371, 384, 363 };
		g.fillPolygon(x653, y653, 3);
//654
		Color my654 = new Color(123, 94, 69);
		g.setColor(my654);

		int[] x654 = { 429, 421, 458 };
		int[] y654 = { 301, 320, 343 };
		g.fillPolygon(x654, y654, 3);
//655
		Color my655 = new Color(123, 94, 69);
		g.setColor(my655);

		int[] x655 = { 444, 453, 495 };
		int[] y655 = { 335, 335, 400 };
		g.fillPolygon(x655, y655, 3);
//656
		Color my656 = new Color(123, 94, 69);
		g.setColor(my656);

		int[] x656 = { 453, 507, 490 };
		int[] y656 = { 335, 400, 400 };
		g.fillPolygon(x656, y656, 3);

//1     
		Color a = new Color(128, 210, 232);
		g.setColor(a);
		int[] a1 = { 0, 54, 31 };
		int[] a2 = { 0, 0, 30 };
		g.fillPolygon(a1, a2, 3);
//2
		Color b = new Color(117, 209, 232);
		g.setColor(b);
		int[] b1 = { 0, 0, 31 };
		int[] b2 = { 0, 70, 30 };
		g.fillPolygon(b1, b2, 3);
//3
		Color c = new Color(220, 240, 229);
		g.setColor(c);
		int[] c1 = { 31, 54, 54 };
		int[] c2 = { 30, 0, 30 };
		g.fillPolygon(c1, c2, 3);
//4
		Color d = new Color(217, 235, 205);
		g.setColor(d);
		int[] d1 = { 31, 0, 54 };
		int[] d2 = { 30, 70, 72 };
		g.fillPolygon(d1, d2, 3);
//5
		Color e = new Color(214, 236, 215);
		g.setColor(e);
		int[] e1 = { 31, 54, 54 };
		int[] e2 = { 30, 30, 72 };
		g.fillPolygon(e1, e2, 3);
//6
		Color f = new Color(214, 236, 215);
		g.setColor(f);
		int[] f1 = { 67, 54, 54 };
		int[] f2 = { 55, 30, 72 };
		g.fillPolygon(f1, f2, 3);
//7
		Color h = new Color(230, 242, 230);
		g.setColor(h);
		int[] h1 = { 54, 54, 81 };
		int[] h2 = { 0, 30, 0 };
		g.fillPolygon(h1, h2, 3);
//8
		Color i = new Color(222, 241, 235);
		g.setColor(i);
		int[] i1 = { 54, 86, 81 };
		int[] i2 = { 30, 18, 0 };
		g.fillPolygon(i1, i2, 3);
//9
		Color j = new Color(218, 237, 217);
		g.setColor(j);
		int[] j1 = { 54, 86, 76 };
		int[] j2 = { 30, 18, 76 };
		g.fillPolygon(j1, j2, 3);
//10
		Color k = new Color(218, 237, 217);
		g.setColor(k);
		int[] k1 = { 95, 86, 76 };
		int[] k2 = { 51, 18, 76 };
		g.fillPolygon(k1, k2, 3);
//11
		Color l = new Color(214, 233, 201);
		g.setColor(l);
		int[] l1 = { 67, 54, 76 };
		int[] l2 = { 55, 72, 76 };
		g.fillPolygon(l1, l2, 3);
//12
		Color m = new Color(223, 239, 210);
		g.setColor(m);
		int[] m1 = { 100, 95, 76 };
		int[] m2 = { 79, 51, 76 };
		g.fillPolygon(m1, m2, 3);
//13
		Color n = new Color(181, 216, 96);
		g.setColor(n);
		int[] n1 = { 0, 11, 54 };
		int[] n2 = { 70, 77, 72 };
		g.fillPolygon(n1, n2, 3);
//14
		Color o = new Color(181, 216, 96);
		g.setColor(o);
		int[] o1 = { 100, 11, 54 };
		int[] o2 = { 79, 77, 72 };
		g.fillPolygon(o1, o2, 3);
//15
		Color p = new Color(204, 215, 239);
		g.setColor(p);
		int[] p1 = { 81, 86, 100 };
		int[] p2 = { 0, 18, 0 };
		g.fillPolygon(p1, p2, 3);
//16
		Color q = new Color(187, 196, 229);
		g.setColor(q);
		int[] q1 = { 113, 86, 100 };
		int[] q2 = { 29, 18, 0 };
		g.fillPolygon(q1, q2, 3);
//17
		Color r = new Color(180, 195, 227);
		g.setColor(r);
		int[] r1 = { 113, 86, 95 };
		int[] r2 = { 29, 18, 51 };
		g.fillPolygon(r1, r2, 3);
//18
		Color s = new Color(167, 184, 221);
		g.setColor(s);
		int[] s1 = { 123, 100, 95 };
		int[] s2 = { 65, 81, 51 };
		g.fillPolygon(s1, s2, 3);
//19
		Color t = new Color(173, 185, 223);
		g.setColor(t);
		int[] t1 = { 123, 113, 95 };
		int[] t2 = { 65, 29, 51 };
		g.fillPolygon(t1, t2, 3);
//20
		Color u = new Color(189, 198, 229);
		g.setColor(u);
		int[] u1 = { 100, 113, 116 };
		int[] u2 = { 0, 29, 0 };
		g.fillPolygon(u1, u2, 3);
//21
		Color v = new Color(179, 185, 222);
		g.setColor(v);
		int[] v1 = { 145, 113, 116 };
		int[] v2 = { 25, 29, 0 };
		g.fillPolygon(v1, v2, 3);
//22
		Color w = new Color(166, 180, 219);
		g.setColor(w);
		int[] w1 = { 123, 113, 145 };
		int[] w2 = { 65, 29, 25 };
		g.fillPolygon(w1, w2, 3);
//23
		Color x = new Color(156, 169, 215);
		g.setColor(x);
		int[] x1 = { 123, 171, 145 };
		int[] x2 = { 65, 50, 25 };
		g.fillPolygon(x1, x2, 3);
//24
		Color y = new Color(58, 73, 167);
		g.setColor(y);
		int[] y1 = { 100, 171, 123 };
		int[] y2 = { 81, 50, 65 };
		g.fillPolygon(y1, y2, 3);
//25
		Color z = new Color(247, 170, 188);
		g.setColor(z);
		int[] z1 = { 116, 145, 141 };
		int[] z2 = { 0, 25, 0 };
		g.fillPolygon(z1, z2, 3);
//26
		Color A = new Color(245, 126, 152);
		g.setColor(A);
		int[] A1 = { 157, 145, 141 };
		int[] A2 = { 11, 25, 0 };
		g.fillPolygon(A1, A2, 3);
//27
		Color B = new Color(241, 120, 138);
		g.setColor(B);
		int[] B1 = { 157, 145, 170 };
		int[] B2 = { 11, 25, 27 };
		g.fillPolygon(B1, B2, 3);
//28
		Color C = new Color(243, 128, 152);
		g.setColor(C);
		int[] C1 = { 171, 145, 170 };
		int[] C2 = { 50, 25, 27 };
		g.fillPolygon(C1, C2, 3);
//29
		Color D = new Color(239, 72, 89);
		g.setColor(D);
		int[] D1 = { 141, 157, 167 };
		int[] D2 = { 0, 11, 0 };
		g.fillPolygon(D1, D2, 3);
//30
		Color E = new Color(191, 66, 65);
		g.setColor(E);
		int[] E1 = { 178, 157, 167 };
		int[] E2 = { 4, 11, 0 };
		g.fillPolygon(E1, E2, 3);
//31
		Color F = new Color(240, 79, 87);
		g.setColor(F);
		int[] F1 = { 178, 157, 169 };
		int[] F2 = { 4, 11, 26 };
		g.fillPolygon(F1, F2, 3);
//32
		Color G = new Color(219, 57, 49);
		g.setColor(G);
		int[] G1 = { 171, 178, 169 };
		int[] G2 = { 50, 4, 26 };
		g.fillPolygon(G1, G2, 3);
//33
		Color H = new Color(205, 198, 227);
		g.setColor(H);
		int[] H1 = { 167, 196, 178 };
		int[] H2 = { 0, 0, 4 };
		g.fillPolygon(H1, H2, 3);
//34
		Color I = new Color(27, 17, 20);
		g.setColor(I);
		int[] I1 = { 196, 196, 178 };
		int[] I2 = { 13, 0, 4 };
		g.fillPolygon(I1, I2, 3);
//35
		Color J = new Color(61, 47, 63);
		g.setColor(J);
		int[] J1 = { 196, 175, 178 };
		int[] J2 = { 13, 20, 4 };
		g.fillPolygon(J1, J2, 3);
//36
		Color K = new Color(55, 49, 60);
		g.setColor(K);
		int[] K1 = { 196, 175, 191 };
		int[] K2 = { 13, 20, 30 };
		g.fillPolygon(K1, K2, 3);
//37
		Color L = new Color(161, 122, 152);
		g.setColor(L);
		int[] L1 = { 172, 176, 183 };
		int[] L2 = { 39, 13, 25 };
		g.fillPolygon(L1, L2, 3);
//38
		Color M = new Color(87, 67, 76);
		g.setColor(M);
		int[] M1 = { 172, 191, 183 };
		int[] M2 = { 39, 30, 25 };
		g.fillPolygon(M1, M2, 3);
//39
		Color N = new Color(129, 82, 82);
		g.setColor(N);
		int[] N1 = { 196, 196, 215 };
		int[] N2 = { 13, 0, 13 };
		g.fillPolygon(N1, N2, 3);
//40
		Color O = new Color(185, 209, 241);
		g.setColor(O);
		int[] O1 = { 223, 196, 215 };
		int[] O2 = { 0, 0, 13 };
		g.fillPolygon(O1, O2, 3);
//41
		Color P = new Color(16, 18, 17);
		g.setColor(P);
		int[] P1 = { 188, 196, 215 };
		int[] P2 = { 40, 13, 13 };
		g.fillPolygon(P1, P2, 3);
//42
		Color Q = new Color(16, 18, 17);
		g.setColor(Q);
		int[] Q1 = { 188, 172, 191 };
		int[] Q2 = { 40, 39, 30 };
		g.fillPolygon(Q1, Q2, 3);
//43
		Color R = new Color(150, 86, 68);
		g.setColor(R);
		int[] R1 = { 188, 172, 172 };
		int[] R2 = { 40, 50, 39 };
		g.fillPolygon(R1, R2, 3);
//44
		Color S = new Color(15, 5, 9);
		g.setColor(S);
		int[] S1 = { 0, 25, 0 };
		int[] S2 = { 70, 76, 76 };
		g.fillPolygon(S1, S2, 3);
//45
		Color T = new Color(15, 5, 9);
		g.setColor(T);
		int[] T1 = { 0, 25, 0 };
		int[] T2 = { 81, 76, 76 };
		g.fillPolygon(T1, T2, 3);
//47
		Color V = new Color(28, 28, 28);
		g.setColor(V);
		int[] V1 = { 0, 25, 18 };
		int[] V2 = { 81, 76, 86 };
		g.fillPolygon(V1, V2, 3);
//46
		Color U = new Color(240, 74, 67);
		g.setColor(U);
		int[] U1 = { 18, 25, 25 };
		int[] U2 = { 86, 76, 86 };
		g.fillPolygon(U1, U2, 3);
//////////////////////////////////////////////right
//48
		Color W = new Color(244, 133, 149);
		g.setColor(W);
		int[] W1 = { 600, 600, 571 };
		int[] W2 = { 0, 57, 32 };
		g.fillPolygon(W1, W2, 3);
//49
		Color X = new Color(244, 169, 181);
		g.setColor(X);
		int[] X1 = { 571, 600, 571 };
		int[] X2 = { 0, 0, 32 };
		g.fillPolygon(X1, X2, 3);
//50
		Color Y = new Color(237, 122, 140);
		g.setColor(Y);
		int[] Y1 = { 571, 558, 571 };
		int[] Y2 = { 0, 25, 32 };
		g.fillPolygon(Y1, Y2, 3);
//51
		Color Z = new Color(246, 158, 174);
		g.setColor(Z);
		int[] Z1 = { 571, 558, 528 };
		int[] Z2 = { 0, 25, 0 };
		g.fillPolygon(Z1, Z2, 3);
//52
		Color aa = new Color(243, 115, 117);
		g.setColor(aa);
		int[] aa1 = { 571, 571, 600 };
		int[] aa2 = { 32, 72, 57 };
		g.fillPolygon(aa1, aa2, 3);
//53
		Color bb = new Color(243, 115, 117);
		g.setColor(bb);
		int[] bb1 = { 600, 571, 600 };
		int[] bb2 = { 110, 72, 57 };
		g.fillPolygon(bb1, bb2, 3);
//54
		Color cc = new Color(243, 115, 130);
		g.setColor(cc);
		int[] cc1 = { 571, 571, 558 };
		int[] cc2 = { 32, 72, 25 };
		g.fillPolygon(cc1, cc2, 3);
//55
		Color dd = new Color(246, 124, 142);
		g.setColor(dd);
		int[] dd1 = { 528, 528, 558 };
		int[] dd2 = { 0, 55, 25 };
		g.fillPolygon(dd1, dd2, 3);
//56
		Color ee = new Color(243, 120, 140);
		g.setColor(ee);
		int[] ee1 = { 571, 528, 558 };
		int[] ee2 = { 72, 55, 25 };
		g.fillPolygon(ee1, ee2, 3);
//57
		Color ff = new Color(243, 120, 140);
		g.setColor(ff);
		int[] ff1 = { 571, 528, 558 };
		int[] ff2 = { 72, 55, 25 };
		g.fillPolygon(ff1, ff2, 3);
//58
		Color gg = new Color(243, 108, 122);
		g.setColor(gg);
		int[] gg1 = { 571, 565, 600 };
		int[] gg2 = { 72, 115, 110 };
		g.fillPolygon(gg1, gg2, 3);
//59
		Color hh = new Color(243, 108, 122);
		g.setColor(hh);
		int[] hh1 = { 571, 565, 541 };
		int[] hh2 = { 72, 115, 101 };
		g.fillPolygon(hh1, hh2, 3);
//60
		Color ii = new Color(244, 136, 149);
		g.setColor(ii);
		int[] ii1 = { 528, 571, 541 };
		int[] ii2 = { 55, 72, 101 };
		g.fillPolygon(ii1, ii2, 3);
//61
		Color jj = new Color(244, 136, 149);
		g.setColor(jj);
		int[] jj1 = { 528, 498, 490 };
		int[] jj2 = { 0, 59, 13 };
		g.fillPolygon(jj1, jj2, 3);
//62
		Color kk = new Color(241, 123, 137);
		g.setColor(kk);
		int[] kk1 = { 528, 498, 528 };
		int[] kk2 = { 0, 59, 55 };
		g.fillPolygon(kk1, kk2, 3);
//63
		Color ll = new Color(245, 125, 150);
		g.setColor(ll);
		int[] ll1 = { 528, 490, 464 };
		int[] ll2 = { 0, 13, 0 };
		g.fillPolygon(ll1, ll2, 3);
//64
		Color mm = new Color(244, 136, 149);
		g.setColor(mm);
		int[] mm1 = { 498, 490, 464 };
		int[] mm2 = { 59, 13, 43 };
		g.fillPolygon(mm1, mm2, 3);
//65
		Color nn = new Color(246, 158, 172);
		g.setColor(nn);
		int[] nn1 = { 395, 415, 464 };
		int[] nn2 = { 0, 46, 0 };
		g.fillPolygon(nn1, nn2, 3);
//66
		Color oo = new Color(240, 118, 133);
		g.setColor(oo);
		int[] oo1 = { 464, 490, 464 };
		int[] oo2 = { 43, 13, 0 };
		g.fillPolygon(oo1, oo2, 3);
//67
		Color pp = new Color(240, 116, 127);
		g.setColor(pp);
		int[] pp1 = { 464, 490, 464 };
		int[] pp2 = { 43, 13, 0 };
		g.fillPolygon(pp1, pp2, 3);
//68
		Color qq = new Color(242, 116, 128);
		g.setColor(qq);
		int[] qq1 = { 464, 415, 464 };
		int[] qq2 = { 43, 45, 0 };
		g.fillPolygon(qq1, qq2, 3);
//69
		Color rr = new Color(244, 127, 143);
		g.setColor(rr);
		int[] rr1 = { 463, 477, 414 };
		int[] rr2 = { 42, 95, 45 };
		g.fillPolygon(rr1, rr2, 3);
//70
		Color ss = new Color(244, 127, 143);
		g.setColor(ss);
		int[] ss1 = { 463, 477, 498 };
		int[] ss2 = { 42, 95, 59 };
		g.fillPolygon(ss1, ss2, 3);
//71
		Color tt = new Color(244, 127, 143);
		g.setColor(tt);
		int[] tt1 = { 477, 528, 498 };
		int[] tt2 = { 95, 55, 59 };
		g.fillPolygon(tt1, tt2, 3);
//72
		Color uu = new Color(245, 138, 154);
		g.setColor(uu);
		int[] uu1 = { 477, 528, 545 };
		int[] uu2 = { 95, 55, 101 };
		g.fillPolygon(uu1, uu2, 3);
//73
		Color vv = new Color(230, 243, 246);
		g.setColor(vv);
		int[] vv1 = { 395, 397, 415 };
		int[] vv2 = { 0, 27, 45 };
		g.fillPolygon(vv1, vv2, 3);
//74
		Color ww = new Color(205, 197, 221);
		g.setColor(ww);
		int[] ww1 = { 397, 413, 415 };
		int[] ww2 = { 27, 57, 45 };
		g.fillPolygon(ww1, ww2, 3);
//75
		Color xx = new Color(184, 47, 47);
		g.setColor(xx);
		int[] xx1 = { 397, 404, 413 };
		int[] xx2 = { 27, 65, 57 };
		g.fillPolygon(xx1, xx2, 3);
//76
		Color yy = new Color(240, 66, 59);
		g.setColor(yy);
		int[] yy1 = { 477, 415, 413 };
		int[] yy2 = { 95, 45, 57 };
		g.fillPolygon(yy1, yy2, 3);
//77
		Color zz = new Color(175, 112, 48);
		g.setColor(zz);
		int[] zz1 = { 600, 600, 565 };
		int[] zz2 = { 109, 127, 115 };
		g.fillPolygon(zz1, zz2, 3);
//78
		Color AA = new Color(252, 254, 253);
		g.setColor(AA);
		int[] AA1 = { 514, 552, 565 };
		int[] AA2 = { 132, 132, 115 };
		g.fillPolygon(AA1, AA2, 3);

//82
		Color EE = new Color(252, 254, 253);
		g.setColor(EE);
		int[] EE1 = { 514, 512, 565 };
		int[] EE2 = { 132, 127, 115 };
		g.fillPolygon(EE1, EE2, 3);

//79
		Color BB = new Color(195, 198, 229);
		g.setColor(BB);
		int[] BB1 = { 514, 514, 565 };
		int[] BB2 = { 104, 127, 115 };
		g.fillPolygon(BB1, BB2, 3);
//80
		Color CC = new Color(187, 201, 237);
		g.setColor(CC);
		int[] CC1 = { 475, 477, 515 };
		int[] CC2 = { 127, 95, 104 };
		g.fillPolygon(CC1, CC2, 3);
//81
		Color DD = new Color(188, 194, 229);
		g.setColor(DD);
		int[] DD1 = { 474, 514, 514 };
		int[] DD2 = { 125, 132, 104 };
		g.fillPolygon(DD1, DD2, 3);
//83
		Color FF = new Color(247, 88, 94);
		g.setColor(FF);
		int[] FF1 = { 474, 544, 565 };
		int[] FF2 = { 95, 100, 115 };
		g.fillPolygon(FF1, FF2, 3);
//84
		Color GG = new Color(230, 69, 55);
		g.setColor(GG);
		int[] GG1 = { 469, 477, 448 };
		int[] GG2 = { 113, 95, 100 };
		g.fillPolygon(GG1, GG2, 3);
//85
		Color HH = new Color(120, 82, 113);
		g.setColor(HH);
		int[] HH1 = { 469, 477, 475 };
		int[] HH2 = { 113, 95, 124 };
		g.fillPolygon(HH1, HH2, 3);
//86
		Color II = new Color(240, 67, 60);
		g.setColor(II);
		int[] II1 = { 448, 477, 413 };
		int[] II2 = { 100, 95, 56 };
		g.fillPolygon(II1, II2, 3);
//87
		Color JJ = new Color(240, 67, 60);
		g.setColor(JJ);
		int[] JJ1 = { 448, 403, 413 };
		int[] JJ2 = { 100, 64, 56 };
		g.fillPolygon(JJ1, JJ2, 3);
//88
		Color KK = new Color(224, 147, 58);
		g.setColor(KK);
		int[] KK1 = { 563, 554, 585 };
		int[] KK2 = { 110, 132, 122 };
		g.fillPolygon(KK1, KK2, 3);
//89
		Color LL = new Color(247, 150, 167);
		g.setColor(LL);
		int[] LL1 = { 600, 585, 600 };
		int[] LL2 = { 127, 122, 154 };
		g.fillPolygon(LL1, LL2, 3);
//90
		Color MM = new Color(246, 165, 182);
		g.setColor(MM);
		int[] MM1 = { 572, 585, 600 };
		int[] MM2 = { 157, 122, 154 };
		g.fillPolygon(MM1, MM2, 3);
//91
		Color NN = new Color(253, 242, 134);
		g.setColor(NN);
		int[] NN1 = { 572, 585, 554 };
		int[] NN2 = { 157, 122, 132 };
		g.fillPolygon(NN1, NN2, 3);
//92
		Color OO = new Color(119, 209, 205);
		g.setColor(OO);
		int[] OO1 = { 572, 600, 600 };
		int[] OO2 = { 157, 172, 154 };
		g.fillPolygon(OO1, OO2, 3);
//93
		Color PP = new Color(123, 202, 244);
		g.setColor(PP);
		int[] PP1 = { 572, 600, 600 };
		int[] PP2 = { 157, 172, 214 };
		g.fillPolygon(PP1, PP2, 3);
//94
		Color QQ = new Color(254, 242, 110);
		g.setColor(QQ);
		int[] QQ1 = { 572, 560, 587 };
		int[] QQ2 = { 157, 187, 187 };
		g.fillPolygon(QQ1, QQ2, 3);
//95
		Color RR = new Color(254, 233, 91);
		g.setColor(RR);
		int[] RR1 = { 577, 587, 600 };
		int[] RR2 = { 219, 187, 214 };
		g.fillPolygon(RR1, RR2, 3);
//96
		Color SS = new Color(255, 237, 99);
		g.setColor(SS);
		int[] SS1 = { 577, 560, 587 };
		int[] SS2 = { 219, 187, 187 };
		g.fillPolygon(SS1, SS2, 3);
//97
		Color TT = new Color(254, 235, 77);
		g.setColor(TT);
		int[] TT1 = { 577, 560, 545 };
		int[] TT2 = { 219, 187, 227 };
		g.fillPolygon(TT1, TT2, 3);
//98
		Color UU = new Color(255, 221, 87);
		g.setColor(UU);
		int[] UU1 = { 561, 530, 545 };
		int[] UU2 = { 260, 282, 227 };
		g.fillPolygon(UU1, UU2, 3);
//99
		Color VV = new Color(255, 237, 99);
		g.setColor(VV);
		int[] VV1 = { 561, 577, 545 };
		int[] VV2 = { 260, 219, 227 };
		g.fillPolygon(VV1, VV2, 3);
//100
		Color WW = new Color(254, 226, 93);
		g.setColor(WW);
		int[] WW1 = { 600, 577, 600 };
		int[] WW2 = { 214, 219, 262 };
		g.fillPolygon(WW1, WW2, 3);
//101
		Color XX = new Color(255, 221, 85);
		g.setColor(XX);
		int[] XX1 = { 561, 577, 600 };
		int[] XX2 = { 260, 219, 262 };
		g.fillPolygon(XX1, XX2, 3);
//102
		Color YY = new Color(254, 224, 83);
		g.setColor(YY);
		int[] YY1 = { 561, 530, 574 };
		int[] YY2 = { 260, 282, 277 };
		g.fillPolygon(YY1, YY2, 3);
//103
		Color ZZ = new Color(254, 220, 84);
		g.setColor(ZZ);
		int[] ZZ1 = { 561, 600, 574 };
		int[] ZZ2 = { 260, 262, 277 };
		g.fillPolygon(ZZ1, ZZ2, 3);
//104
		Color Aa = new Color(254, 220, 84);
		g.setColor(Aa);
		int[] Aa1 = { 530, 600, 600 };
		int[] Aa2 = { 282, 262, 282 };
		g.fillPolygon(Aa1, Aa2, 3);
//105
		Color Bb = new Color(252, 184, 64);
		g.setColor(Bb);
		int[] Bb1 = { 530, 600, 600 };
		int[] Bb2 = { 282, 282, 285 };
		g.fillPolygon(Bb1, Bb2, 3);
//106
		Color Cc = new Color(247, 158, 169);
		g.setColor(Cc);
		int[] Cc1 = { 575, 560, 513 };
		int[] Cc2 = { 157, 188, 188 };
		g.fillPolygon(Cc1, Cc2, 3);
//107
		Color Dd = new Color(246, 141, 154);
		g.setColor(Dd);
		int[] Dd1 = { 545, 560, 513 };
		int[] Dd2 = { 230, 188, 188 };
		g.fillPolygon(Dd1, Dd2, 3);
//108
		Color Ee = new Color(243, 125, 137);
		g.setColor(Ee);
		int[] Ee1 = { 458, 545, 513 };
		int[] Ee2 = { 230, 230, 188 };
		g.fillPolygon(Ee1, Ee2, 3);
//109
		Color Ff = new Color(249, 135, 149);
		g.setColor(Ff);
		int[] Ff1 = { 458, 545, 530 };
		int[] Ff2 = { 230, 230, 282 };
		g.fillPolygon(Ff1, Ff2, 3);
//110
		Color Gg = new Color(128, 208, 209);
		g.setColor(Gg);
		int[] Gg1 = { 572, 510, 520 };
		int[] Gg2 = { 157, 148, 181 };
		g.fillPolygon(Gg1, Gg2, 3);
//111
		Color Hh = new Color(128, 206, 208);
		g.setColor(Hh);
		int[] Hh1 = { 575, 510, 513 };
		int[] Hh2 = { 157, 148, 188 };
		g.fillPolygon(Hh1, Hh2, 3);
//112
		Color Ii = new Color(122, 203, 197);
		g.setColor(Ii);
		int[] Ii1 = { 450, 510, 513 };
		int[] Ii2 = { 156, 148, 188 };
		g.fillPolygon(Ii1, Ii2, 3);
//112
		Color Jj = new Color(122, 203, 197);
		g.setColor(Jj);
		int[] Jj1 = { 450, 510, 513 };
		int[] Jj2 = { 156, 148, 188 };
		g.fillPolygon(Jj1, Jj2, 3);
//113
		Color Kk = new Color(123, 203, 203);
		g.setColor(Kk);
		int[] Kk1 = { 450, 458, 513 };
		int[] Kk2 = { 156, 230, 188 };

		g.fillPolygon(Kk1, Kk2, 3);
//114
		Color Ll = new Color(115, 168, 222);
		g.setColor(Ll);
		int[] Ll1 = { 450, 487, 510 };
		int[] Ll2 = { 156, 128, 148 };
		g.fillPolygon(Ll1, Ll2, 3);
//116
		Color Nn = new Color(114, 180, 225);
		g.setColor(Nn);
		int[] Nn1 = { 515, 487, 510 };
		int[] Nn2 = { 132, 128, 148 };
		g.fillPolygon(Nn1, Nn2, 3);
//115
		Color Mm = new Color(129, 190, 235);
		g.setColor(Mm);
		int[] Mm1 = { 572, 515, 510 };
		int[] Mm2 = { 157, 132, 148 };
		g.fillPolygon(Mm1, Mm2, 3);
//117
		Color Oo = new Color(145, 199, 253);
		g.setColor(Oo);
		int[] Oo1 = { 572, 515, 553 };
		int[] Oo2 = { 157, 132, 132 };
		g.fillPolygon(Oo1, Oo2, 3);
//118
		Color Pp = new Color(146, 76, 100);
		g.setColor(Pp);
		int[] Pp1 = { 600, 564, 600 };
		int[] Pp2 = { 285, 282, 300 };
		g.fillPolygon(Pp1, Pp2, 3);
//119
		Color Qq = new Color(233, 171, 108);
		g.setColor(Qq);
		int[] Qq1 = { 529, 564, 600 };
		int[] Qq2 = { 282, 282, 300 };
		g.fillPolygon(Qq1, Qq2, 3);
//120
		Color Rr = new Color(234, 173, 106);
		g.setColor(Rr);
		int[] Rr1 = { 529, 590, 600 };
		int[] Rr2 = { 282, 323, 300 };
		g.fillPolygon(Rr1, Rr2, 3);
//121 
		Color Ss = new Color(184, 81, 87);
		g.setColor(Ss);
		int[] Ss1 = { 495, 495, 510 };
		int[] Ss2 = { 263, 273, 273 };
		g.fillPolygon(Ss1, Ss2, 3);
//122
		Color Tt = new Color(228, 176, 117);
		g.setColor(Tt);
		int[] Tt1 = { 498, 495, 510 };
		int[] Tt2 = { 316, 273, 273 };
		g.fillPolygon(Tt1, Tt2, 3);
//123
		Color Uu = new Color(240, 182, 119);
		g.setColor(Uu);
		int[] Uu1 = { 498, 510, 519 };
		int[] Uu2 = { 316, 273, 285 };
		g.fillPolygon(Uu1, Uu2, 3);
//124
		Color Vv = new Color(236, 103, 114);
		g.setColor(Vv);
		int[] Vv1 = { 510, 530, 519 };
		int[] Vv2 = { 273, 280, 285 };
		g.fillPolygon(Vv1, Vv2, 3);
//125
		Color Ww = new Color(245, 134, 145);
		g.setColor(Ww);
		int[] Ww1 = { 510, 530, 502 };
		int[] Ww2 = { 273, 280, 262 };
		g.fillPolygon(Ww1, Ww2, 3);
//126
		Color Xx = new Color(239, 106, 121);
		g.setColor(Xx);
		int[] Xx1 = { 510, 495, 502 };
		int[] Xx2 = { 273, 263, 262 };
		g.fillPolygon(Xx1, Xx2, 3);
//127
		Color Yy = new Color(241, 135, 148);
		g.setColor(Yy);
		int[] Yy1 = { 459, 495, 502 };
		int[] Yy2 = { 230, 263, 262 };
		g.fillPolygon(Yy1, Yy2, 3);
//128
		Color Zz = new Color(229, 179, 106);
		g.setColor(Zz);
		int[] Zz1 = { 497, 509, 519 };
		int[] Zz2 = { 316, 318, 285 };
		g.fillPolygon(Zz1, Zz2, 3);
//129
		Color aA = new Color(229, 179, 106);
		g.setColor(aA);
		int[] aA1 = { 497, 509, 519 };
		int[] aA2 = { 316, 318, 285 };
		g.fillPolygon(aA1, aA2, 3);
//130
		Color bB = new Color(229, 179, 106);
		g.setColor(bB);
		int[] bB1 = { 530, 509, 519 };
		int[] bB2 = { 280, 318, 285 };
		g.fillPolygon(bB1, bB2, 3);
//131
		Color cC = new Color(222, 195, 124);
		g.setColor(cC);
		int[] cC1 = { 396, 389, 418 };
		int[] cC2 = { 0, 0, 188 };
		g.fillPolygon(cC1, cC2, 3);
//132
		Color dD = new Color(220, 201, 170);
		g.setColor(dD);
		int[] dD1 = { 389, 411, 418 };
		int[] dD2 = { 0, 188, 188 };
		g.fillPolygon(dD1, dD2, 3);
//133
		Color eE = new Color(191, 185, 156);
		g.setColor(eE);
		int[] eE1 = { 421, 411, 418 };
		int[] eE2 = { 200, 188, 188 };
		g.fillPolygon(eE1, eE2, 3);
//133
		Color fF = new Color(191, 185, 156);
		g.setColor(fF);
		int[] fF1 = { 425, 411, 418 };
		int[] fF2 = { 228, 188, 188 };
		g.fillPolygon(fF1, fF2, 3);
//134
		Color gG = new Color(191, 185, 156);
		g.setColor(gG);
		int[] gG1 = { 425, 418, 411 };
		int[] gG2 = { 228, 228, 188 };
		g.fillPolygon(gG1, gG2, 3);
//135
		Color hH = new Color(101, 160, 215);
		g.setColor(hH);
		int[] hH1 = { 389, 400, 365 };
		int[] hH2 = { 0, 77, 77 };
		g.fillPolygon(hH1, hH2, 3);
//136
		Color iI = new Color(109, 179, 228);
		g.setColor(iI);
		int[] iI1 = { 389, 365, 365 };
		int[] iI2 = { 0, 0, 77 };
		g.fillPolygon(iI1, iI2, 3);
//137
		Color jJ = new Color(102, 169, 221);
		g.setColor(jJ);
		int[] jJ1 = { 365, 342, 365 };
		int[] jJ2 = { 0, 30, 77 };
		g.fillPolygon(jJ1, jJ2, 3);
//138
		Color kK = new Color(94, 148, 212);
		g.setColor(kK);
		int[] kK1 = { 322, 342, 365 };
		int[] kK2 = { 59, 30, 77 };
		g.fillPolygon(kK1, kK2, 3);
//139
		Color lL = new Color(255, 235, 111);
		g.setColor(lL);
		int[] lL1 = { 322, 322, 365 };
		int[] lL2 = { 59, 0, 0 };
		g.fillPolygon(lL1, lL2, 3);
//140
		Color mM = new Color(254, 182, 82);
		g.setColor(mM);
		int[] mM1 = { 322, 322, 300 };
		int[] mM2 = { 59, 0, 24 };
		g.fillPolygon(mM1, mM2, 3);
//141
		Color nN = new Color(250, 129, 66);
		g.setColor(nN);
		int[] nN1 = { 286, 322, 300 };
		int[] nN2 = { 9, 0, 24 };
		g.fillPolygon(nN1, nN2, 3);
//142
		Color oO = new Color(250, 129, 66);
		g.setColor(oO);
		int[] oO1 = { 286, 322, 277 };
		int[] oO2 = { 9, 0, 0 };
		g.fillPolygon(oO1, oO2, 3);
//143
		Color pP = new Color(250, 165, 77);
		g.setColor(pP);
		int[] pP1 = { 322, 300, 277 };
		int[] pP2 = { 59, 24, 0 };
		g.fillPolygon(pP1, pP2, 3);
//144
		Color qQ = new Color(240, 67, 61);
		g.setColor(qQ);
		int[] qQ1 = { 222, 227, 251 };
		int[] qQ2 = { 0, 13, 6 };
		g.fillPolygon(qQ1, qQ2, 3);
//145
		Color rR = new Color(232, 71, 56);
		g.setColor(rR);
		int[] rR1 = { 222, 320, 251 };
		int[] rR2 = { 0, 0, 6 };
		g.fillPolygon(rR1, rR2, 3);
//146
		Color sS = new Color(234, 159, 108);
		g.setColor(sS);
		int[] sS1 = { 340, 372, 348 };
		int[] sS2 = { 67, 75, 88 };
		g.fillPolygon(sS1, sS2, 3);
//147
		Color tT = new Color(83, 137, 206);
		g.setColor(tT);
		int[] tT1 = { 340, 348, 336 };
		int[] tT2 = { 67, 88, 79 };
		g.fillPolygon(tT1, tT2, 3);
//148
		Color uU = new Color(74, 59, 65);
		g.setColor(uU);
		int[] uU1 = { 333, 348, 336 };
		int[] uU2 = { 94, 88, 79 };
		g.fillPolygon(uU1, uU2, 3);
//149
		Color vV = new Color(77, 69, 116);
		g.setColor(vV);
		int[] vV1 = { 333, 348, 337 };
		int[] vV2 = { 94, 88, 102 };
		g.fillPolygon(vV1, vV2, 3);
//150
		Color wW = new Color(133, 150, 207);
		g.setColor(wW);
		int[] wW1 = { 352, 348, 337 };
		int[] wW2 = { 107, 88, 102 };
		g.fillPolygon(wW1, wW2, 3);
//151
		Color xX = new Color(128, 107, 177);
		g.setColor(xX);
		int[] xX1 = { 352, 348, 366 };
		int[] xX2 = { 107, 88, 93 };
		g.fillPolygon(xX1, xX2, 3);
//152
		Color yY = new Color(128, 82, 49);
		g.setColor(yY);
		int[] yY1 = { 372, 348, 366 };
		int[] yY2 = { 75, 88, 93 };
		g.fillPolygon(yY1, yY2, 3);
//153
		Color zZ = new Color(196, 128, 91);
		g.setColor(zZ);
		int[] zZ1 = { 372, 366, 379 };
		int[] zZ2 = { 75, 93, 84 };
		g.fillPolygon(zZ1, zZ2, 3);
//154
		Color aaa = new Color(183, 53, 64);
		g.setColor(aaa);
		int[] aaa1 = { 372, 386, 379 };
		int[] aaa2 = { 75, 78, 84 };
		g.fillPolygon(aaa1, aaa2, 3);
//155
		Color bbb = new Color(156, 146, 121);
		g.setColor(bbb);
		int[] bbb1 = { 600, 600, 570 };
		int[] bbb2 = { 370, 400, 400 };
		g.fillPolygon(bbb1, bbb2, 3);
//156
		Color ccc = new Color(151, 132, 108);
		g.setColor(ccc);
		int[] ccc1 = { 600, 578, 570 };
		int[] ccc2 = { 370, 370, 400 };
		g.fillPolygon(ccc1, ccc2, 3);
//157
		Color ddd = new Color(149, 142, 132);
		g.setColor(ddd);
		int[] ddd1 = { 524, 547, 570 };
		int[] ddd2 = { 400, 384, 400 };
		g.fillPolygon(ddd1, ddd2, 3);
//158
		Color eee = new Color(138, 129, 111);
		g.setColor(ddd);
		int[] eee1 = { 547, 578, 570 };
		int[] eee2 = { 384, 370, 400 };
		g.fillPolygon(eee1, eee2, 3);
//159
		Color fff = new Color(138, 120, 105);
		g.setColor(fff);
		int[] fff1 = { 600, 600, 578 };
		int[] fff2 = { 370, 350, 370 };
		g.fillPolygon(fff1, fff2, 3);
//160
		Color ggg = new Color(120, 115, 84);
		g.setColor(ggg);
		int[] ggg1 = { 591, 600, 600 };
		int[] ggg2 = { 323, 286, 360 };
		g.fillPolygon(ggg1, ggg2, 3);
//161
		Color hhh = new Color(110, 103, 91);
		g.setColor(hhh);
		int[] hhh1 = { 574, 591, 600 };
		int[] hhh2 = { 353, 323, 360 };
		g.fillPolygon(hhh1, hhh2, 3);
//162
		Color iii = new Color(130, 118, 102);
		g.setColor(iii);
		int[] iii1 = { 574, 578, 600 };
		int[] iii2 = { 353, 370, 360 };
		g.fillPolygon(iii1, iii2, 3);
//163
		Color jjj = new Color(219, 168, 110);
		g.setColor(jjj);
		int[] jjj1 = { 509, 528, 545 };
		int[] jjj2 = { 317, 282, 307 };
		g.fillPolygon(jjj1, jjj2, 3);
//164
		Color kkk = new Color(61, 52, 85);
		g.setColor(kkk);
		int[] kkk1 = { 508, 525, 516 };
		int[] kkk2 = { 319, 319, 333 };
		g.fillPolygon(kkk1, kkk2, 3);
//165
		Color lll = new Color(156, 146, 203);
		g.setColor(lll);
		int[] lll1 = { 508, 504, 516 };
		int[] lll2 = { 319, 325, 333 };
		g.fillPolygon(lll1, lll2, 3);
//166
		Color mmm = new Color(183, 169, 219);
		g.setColor(mmm);
		int[] mmm1 = { 504, 512, 516 };
		int[] mmm2 = { 325, 339, 333 };
		g.fillPolygon(mmm1, mmm2, 3);
//167
		Color nnn = new Color(141, 164, 216);
		g.setColor(nnn);
		int[] nnn1 = { 516, 525, 530 };
		int[] nnn2 = { 333, 319, 335 };
		g.fillPolygon(nnn1, nnn2, 3);
//168
		Color ooo = new Color(131, 124, 180);
		g.setColor(ooo);
		int[] ooo1 = { 531, 525, 530 };
		int[] ooo2 = { 315, 319, 335 };
		g.fillPolygon(ooo1, ooo2, 3);
//169
		Color ppp = new Color(104, 131, 192);
		g.setColor(ppp);
		int[] ppp1 = { 531, 545, 530 };
		int[] ppp2 = { 315, 338, 335 };
		g.fillPolygon(ppp1, ppp2, 3);
//170
		Color qqq = new Color(153, 160, 212);
		g.setColor(qqq);
		int[] qqq1 = { 531, 545, 551 };
		int[] qqq2 = { 315, 338, 322 };
		g.fillPolygon(qqq1, qqq2, 3);
//171
		Color rrr = new Color(115, 92, 142);
		g.setColor(rrr);
		int[] rrr1 = { 531, 544, 551 };
		int[] rrr2 = { 315, 308, 322 };
		g.fillPolygon(rrr1, rrr2, 3);
//172
		Color sss = new Color(144, 127, 159);
		g.setColor(sss);
		int[] sss1 = { 563, 544, 551 };
		int[] sss2 = { 315, 308, 322 };
		g.fillPolygon(sss1, sss2, 3);
//173
		Color ttt = new Color(201, 216, 242);
		g.setColor(ttt);
		int[] ttt1 = { 563, 563, 551 };
		int[] ttt2 = { 315, 331, 322 };
		g.fillPolygon(ttt1, ttt2, 3);
//174
		Color uuu = new Color(167, 183, 228);
		g.setColor(uuu);
		int[] uuu1 = { 545, 563, 551 };
		int[] uuu2 = { 338, 331, 322 };
		g.fillPolygon(uuu1, uuu2, 3);
//175
		Color vvv = new Color(203, 155, 94);
		g.setColor(vvv);
		int[] vvv1 = { 520, 507, 525 };
		int[] vvv2 = { 310, 319, 319 };
		g.fillPolygon(vvv1, vvv2, 3);
//176
		Color www = new Color(220, 171, 110);
		g.setColor(www);
		int[] www1 = { 544, 520, 525 };
		int[] www2 = { 308, 310, 319 };
		g.fillPolygon(www1, www2, 3);
//177
		Color xxx = new Color(114, 122, 194);
		g.setColor(xxx);
		int[] xxx1 = { 563, 563, 573 };
		int[] xxx2 = { 315, 331, 323 };
		g.fillPolygon(xxx1, xxx2, 3);
//178
		Color yyy = new Color(90, 104, 179);
		g.setColor(yyy);
		int[] yyy1 = { 569, 563, 573 };
		int[] yyy2 = { 342, 331, 323 };
		g.fillPolygon(yyy1, yyy2, 3);
//179
		Color zzz = new Color(122, 146, 200);
		g.setColor(zzz);
		int[] zzz1 = { 569, 563, 545 };
		int[] zzz2 = { 342, 331, 338 };
		g.fillPolygon(zzz1, zzz2, 3);
//180
		Color AAA = new Color(98, 132, 194);
		g.setColor(AAA);
		int[] AAA1 = { 573, 582, 569 };
		int[] AAA2 = { 323, 340, 342 };
		g.fillPolygon(AAA1, AAA2, 3);
//181
		Color BBB = new Color(168, 146, 165);
		g.setColor(BBB);
		int[] BBB1 = { 573, 582, 591 };
		int[] BBB2 = { 323, 340, 324 };
		g.fillPolygon(BBB1, BBB2, 3);
//182
		Color CCC = new Color(240, 179, 102);
		g.setColor(CCC);
		int[] CCC1 = { 528, 544, 568 };
		int[] CCC2 = { 280, 311, 308 };
		g.fillPolygon(CCC1, CCC2, 3);
//183
		Color DDD = new Color(240, 179, 102);
		g.setColor(DDD);
		int[] DDD1 = { 563, 544, 568 };
		int[] DDD2 = { 317, 311, 308 };
		g.fillPolygon(DDD1, DDD2, 3);
//183
		Color EEE = new Color(240, 179, 102);
		g.setColor(EEE);
		int[] EEE1 = { 563, 573, 568 };
		int[] EEE2 = { 317, 324, 308 };
		g.fillPolygon(EEE1, EEE2, 3);
//184
		Color FFF = new Color(240, 179, 102);
		g.setColor(FFF);
		int[] FFF1 = { 593, 573, 568 };
		int[] FFF2 = { 324, 324, 308 };
		g.fillPolygon(FFF1, FFF2, 3);
//185
		Color GGG = new Color(187, 183, 217);
		g.setColor(GGG);
		int[] GGG1 = { 583, 570, 574 };
		int[] GGG2 = { 340, 342, 353 };
		g.fillPolygon(GGG1, GGG2, 3);
//186
		Color HHH = new Color(118, 127, 133);
		g.setColor(HHH);
		int[] HHH1 = { 545, 570, 574 };
		int[] HHH2 = { 338, 342, 353 };
		g.fillPolygon(HHH1, HHH2, 3);
//187
		Color III = new Color(181, 174, 216);
		g.setColor(III);
		int[] III1 = { 545, 550, 574 };
		int[] III2 = { 338, 353, 353 };
		g.fillPolygon(III1, III2, 3);
//188
		Color JJJ = new Color(103, 98, 123);
		g.setColor(JJJ);
		int[] JJJ1 = { 497, 504, 510 };
		int[] JJJ2 = { 315, 325, 315 };
		g.fillPolygon(JJJ1, JJJ2, 3);
//189
		Color KKK = new Color(201, 165, 155);
		g.setColor(KKK);
		int[] KKK1 = { 539, 529, 551 };
		int[] KKK2 = { 342, 352, 352 };
		g.fillPolygon(KKK1, KKK2, 3);
//190
		Color LLL = new Color(143, 157, 214);
		g.setColor(LLL);
		int[] LLL1 = { 545, 551, 530 };
		int[] LLL2 = { 338, 352, 335 };
		g.fillPolygon(LLL1, LLL2, 3);
//191
		Color MMM = new Color(165, 154, 209);
		g.setColor(MMM);
		int[] MMM1 = { 529, 530, 539 };
		int[] MMM2 = { 352, 335, 342 };
		g.fillPolygon(MMM1, MMM2, 3);
//192
		Color NNN = new Color(165, 154, 209);
		g.setColor(NNN);
		int[] NNN1 = { 517, 529, 530 };
		int[] NNN2 = { 333, 352, 335 };
		g.fillPolygon(NNN1, NNN2, 3);
//193
		Color OOO = new Color(182, 166, 187);
		g.setColor(OOO);
		int[] OOO1 = { 517, 529, 511 };
		int[] OOO2 = { 333, 352, 340 };
		g.fillPolygon(OOO1, OOO2, 3);
//194
		Color PPP = new Color(85, 82, 75);
		g.setColor(PPP);
		int[] PPP1 = { 548, 548, 575 };
		int[] PPP2 = { 353, 384, 353 };
		g.fillPolygon(PPP1, PPP2, 3);
//195
		Color QQQ = new Color(125, 109, 95);
		g.setColor(QQQ);
		int[] QQQ1 = { 578, 548, 575 };
		int[] QQQ2 = { 370, 384, 353 };
		g.fillPolygon(QQQ1, QQQ2, 3);
//196
		Color RRR = new Color(133, 136, 113);
		g.setColor(RRR);
		int[] RRR1 = { 524, 548, 516 };
		int[] RRR2 = { 400, 384, 387 };
		g.fillPolygon(RRR1, RRR2, 3);
//197
		Color SSS = new Color(158, 156, 131);
		g.setColor(SSS);
		int[] SSS1 = { 524, 505, 516 };
		int[] SSS2 = { 400, 400, 387 };
		g.fillPolygon(SSS1, SSS2, 3);
//198
		Color TTT = new Color(150, 146, 141);
		g.setColor(TTT);
		int[] TTT1 = { 493, 505, 516 };
		int[] TTT2 = { 387, 400, 387 };
		g.fillPolygon(TTT1, TTT2, 3);
//199
		Color UUU = new Color(130, 129, 127);
		g.setColor(UUU);
		int[] UUU1 = { 493, 504, 516 };
		int[] UUU2 = { 387, 365, 387 };
		g.fillPolygon(UUU1, UUU2, 3);
//200
		Color VVV = new Color(105, 105, 102);
		g.setColor(VVV);
		int[] VVV1 = { 528, 548, 516 };
		int[] VVV2 = { 372, 384, 387 };
		g.fillPolygon(VVV1, VVV2, 3);
//201
		Color WWW = new Color(81, 80, 78);
		g.setColor(WWW);
		int[] WWW1 = { 528, 548, 548 };
		int[] WWW2 = { 372, 384, 353 };
		g.fillPolygon(WWW1, WWW2, 3);
//202
		Color XXX = new Color(81, 80, 78);
		g.setColor(XXX);
		int[] XXX1 = { 529, 516, 550 };
		int[] XXX2 = { 351, 387, 352 };
		g.fillPolygon(XXX1, XXX2, 3);
//203
		Color YYY = new Color(112, 110, 108);
		g.setColor(YYY);
		int[] YYY1 = { 504, 516, 522 };
		int[] YYY2 = { 365, 387, 372 };
		g.fillPolygon(YYY1, YYY2, 3);
//204
		Color ZZZ = new Color(125, 119, 107);
		g.setColor(ZZZ);
		int[] ZZZ1 = { 439, 455, 465 };
		int[] ZZZ2 = { 285, 300, 280 };
		g.fillPolygon(ZZZ1, ZZZ2, 3);
//205
		Color aAA = new Color(118, 117, 97);
		g.setColor(aAA);
		int[] aAA1 = { 439, 428, 465 };
		int[] aAA2 = { 285, 260, 280 };
		g.fillPolygon(aAA1, aAA2, 3);
//206
		Color bBB = new Color(145, 134, 114);
		g.setColor(bBB);
		int[] bBB1 = { 439, 417, 431 };
		int[] bBB2 = { 285, 290, 265 };
		g.fillPolygon(bBB1, bBB2, 3);
//207
		Color cCC = new Color(129, 124, 118);
		g.setColor(cCC);
		int[] cCC1 = { 417, 417, 431 };
		int[] cCC2 = { 248, 290, 265 };
		g.fillPolygon(cCC1, cCC2, 3);
//208
		Color dDD = new Color(60, 59, 65);
		g.setColor(dDD);
		int[] dDD1 = { 431, 412, 424 };
		int[] dDD2 = { 244, 236, 227 };
		g.fillPolygon(dDD1, dDD2, 3);
//209
		Color eEE = new Color(86, 85, 84);
		g.setColor(eEE);
		int[] eEE1 = { 417, 412, 431 };
		int[] eEE2 = { 248, 236, 244 };
		g.fillPolygon(eEE1, eEE2, 3);
//210
		Color fFF = new Color(86, 85, 84);
		g.setColor(fFF);
		int[] fFF1 = { 416, 428, 432 };
		int[] fFF2 = { 247, 261, 240 };
		g.fillPolygon(fFF1, fFF2, 3);
//211
		Color gGG = new Color(32, 27, 33);
		g.setColor(gGG);
		int[] gGG1 = { 430, 440, 446 };
		int[] gGG2 = { 244, 256, 250 };
		g.fillPolygon(gGG1, gGG2, 3);
//212
		Color hHH = new Color(73, 82, 89);
		g.setColor(hHH);
		int[] hHH1 = { 430, 426, 440 };
		int[] hHH2 = { 244, 260, 256 };
		g.fillPolygon(hHH1, hHH2, 3);
//213
		Color iII = new Color(79, 92, 81);
		g.setColor(iII);
		int[] iII1 = { 440, 426, 440 };
		int[] iII2 = { 266, 260, 256 };
		g.fillPolygon(iII1, iII2, 3);
//214
		Color jJJ = new Color(68, 69, 74);
		g.setColor(jJJ);
		int[] jJJ1 = { 440, 459, 440 };
		int[] jJJ2 = { 266, 266, 256 };
		g.fillPolygon(jJJ1, jJJ2, 3);
//215
		Color kKK = new Color(48, 53, 53);
		g.setColor(kKK);
		int[] kKK1 = { 446, 459, 440 };
		int[] kKK2 = { 250, 266, 256 };
		g.fillPolygon(kKK1, kKK2, 3);
//216
		Color lLL = new Color(79, 82, 85);
		g.setColor(lLL);
		int[] lLL1 = { 464, 459, 440 };
		int[] lLL2 = { 280, 266, 266 };
		g.fillPolygon(lLL1, lLL2, 3);
//217
		Color mMM = new Color(114, 106, 104);
		g.setColor(mMM);
		int[] mMM1 = { 455, 474, 474 };
		int[] mMM2 = { 300, 304, 324 };
		g.fillPolygon(mMM1, mMM2, 3);
//218
		Color nNN = new Color(114, 106, 104);
		g.setColor(nNN);
		int[] nNN1 = { 455, 474, 474 };
		int[] nNN2 = { 300, 304, 324 };
		g.fillPolygon(nNN1, nNN2, 3);
//219
		Color oOO = new Color(88, 88, 86);
		g.setColor(oOO);
		int[] oOO1 = { 497, 474, 474 };
		int[] oOO2 = { 316, 304, 324 };
		g.fillPolygon(oOO1, oOO2, 3);
//220
		Color pPP = new Color(76, 77, 71);
		g.setColor(pPP);
		int[] pPP1 = { 498, 472, 504 };
		int[] pPP2 = { 316, 324, 324 };
		g.fillPolygon(pPP1, pPP2, 3);
//221
		Color qQQ = new Color(100, 96, 95);
		g.setColor(qQQ);
		int[] qQQ1 = { 483, 472, 504 };
		int[] qQQ2 = { 345, 324, 324 };
		g.fillPolygon(qQQ1, qQQ2, 3);
//222
		Color rRR = new Color(106, 102, 101);
		g.setColor(rRR);
		int[] rRR1 = { 483, 502, 504 };
		int[] rRR2 = { 345, 344, 324 };
		g.fillPolygon(rRR1, rRR2, 3);
//223
		Color sSS = new Color(109, 110, 112);
		g.setColor(sSS);
		int[] sSS1 = { 483, 502, 504 };
		int[] sSS2 = { 345, 344, 364 };
		g.fillPolygon(sSS1, sSS2, 3);
//224
		Color tTT = new Color(132, 120, 122);
		g.setColor(tTT);
		int[] tTT1 = { 483, 475, 504 };
		int[] tTT2 = { 345, 364, 364 };
		g.fillPolygon(tTT1, tTT2, 3);
//225
		Color uUU = new Color(135, 133, 118);
		g.setColor(uUU);
		int[] uUU1 = { 494, 476, 505 };
		int[] uUU2 = { 386, 363, 363 };
		g.fillPolygon(uUU1, uUU2, 3);
//226
		Color vVV = new Color(100, 96, 95);
		g.setColor(vVV);
		int[] vVV1 = { 522, 530, 503 };
		int[] vVV2 = { 372, 350, 365 };
		g.fillPolygon(vVV1, vVV2, 3);
//227
		Color wWW = new Color(83, 81, 84);
		g.setColor(wWW);
		int[] wWW1 = { 512, 530, 503 };
		int[] wWW2 = { 338, 350, 365 };
		g.fillPolygon(wWW1, wWW2, 3);
//228
		Color xXX = new Color(82, 81, 79);
		g.setColor(xXX);
		int[] xXX1 = { 512, 504, 502 };
		int[] xXX2 = { 338, 323, 343 };
		g.fillPolygon(xXX1, xXX2, 3);
//229
		Color yYY = new Color(82, 81, 79);
		g.setColor(yYY);
		int[] yYY1 = { 512, 503, 502 };
		int[] yYY2 = { 338, 365, 343 };
		g.fillPolygon(yYY1, yYY2, 3);
//230
		Color zZZ = new Color(127, 127, 125);
		g.setColor(zZZ);
		int[] zZZ1 = { 455, 455, 474 };
		int[] zZZ2 = { 338, 300, 322 };
		g.fillPolygon(zZZ1, zZZ2, 3);
//231
		Color AaA = new Color(129, 125, 107);
		g.setColor(AaA);
		int[] AaA1 = { 455, 474, 474 };
		int[] AaA2 = { 338, 364, 322 };
		g.fillPolygon(AaA1, AaA2, 3);
//232
		Color BbB = new Color(132, 128, 115);
		g.setColor(BbB);
		int[] BbB1 = { 484, 474, 474 };
		int[] BbB2 = { 344, 364, 322 };
		g.fillPolygon(BbB1, BbB2, 3);
//233
		Color CcC = new Color(142, 144, 141);
		g.setColor(CcC);
		int[] CcC1 = { 455, 455, 437 };
		int[] CcC2 = { 300, 338, 315 };
		g.fillPolygon(CcC1, CcC2, 3);
//234
		Color DdD = new Color(140, 127, 112);
		g.setColor(DdD);
		int[] DdD1 = { 455, 437, 437 };
		int[] DdD2 = { 300, 280, 315 };
		g.fillPolygon(DdD1, DdD2, 3);
//235
		Color EeE = new Color(132, 115, 108);
		g.setColor(EeE);
		int[] EeE1 = { 416, 437, 437 };
		int[] EeE2 = { 286, 284, 314 };
		g.fillPolygon(EeE1, EeE2, 3);
//236
		Color FfF = new Color(36, 39, 42);
		g.setColor(FfF);
		int[] FfF1 = { 483, 495, 497 };
		int[] FfF2 = { 272, 272, 296 };
		g.fillPolygon(FfF1, FfF2, 3);
//237
		Color GgG = new Color(183, 198, 227);
		g.setColor(GgG);
		int[] GgG1 = { 487, 498, 497 };
		int[] GgG2 = { 293, 319, 296 };
		g.fillPolygon(GgG1, GgG2, 3);
//238
		Color HhH = new Color(180, 167, 192);
		g.setColor(HhH);
		int[] HhH1 = { 487, 483, 497 };
		int[] HhH2 = { 293, 272, 296 };
		g.fillPolygon(HhH1, HhH2, 3);
//239
		Color IiI = new Color(159, 140, 159);
		g.setColor(IiI);
		int[] IiI1 = { 483, 483, 473 };
		int[] IiI2 = { 272, 252, 268 };
		g.fillPolygon(IiI1, IiI2, 3);
//240
		Color JjJ = new Color(132, 124, 183);
		g.setColor(JjJ);
		int[] JjJ1 = { 483, 480, 473 };
		int[] JjJ2 = { 272, 279, 268 };
		g.fillPolygon(JjJ1, JjJ2, 3);
//241
		Color KkK = new Color(111, 98, 108);
		g.setColor(KkK);
		int[] KkK1 = { 483, 480, 487 };
		int[] KkK2 = { 272, 279, 293 };
		g.fillPolygon(KkK1, KkK2, 3);
//242
		Color LlL = new Color(47, 44, 34);
		g.setColor(LlL);
		int[] LlL1 = { 471, 480, 487 };
		int[] LlL2 = { 286, 279, 293 };
		g.fillPolygon(LlL1, LlL2, 3);
//243
		Color MmM = new Color(55, 56, 51);
		g.setColor(MmM);
		int[] MmM1 = { 471, 474, 487 };
		int[] MmM2 = { 286, 304, 293 };
		g.fillPolygon(MmM1, MmM2, 3);
//244
		Color NnN = new Color(56, 55, 59);
		g.setColor(NnN);
		int[] NnN1 = { 498, 474, 487 };
		int[] NnN2 = { 318, 304, 293 };
		g.fillPolygon(NnN1, NnN2, 3);
//245
		Color OoO = new Color(86, 86, 86);
		g.setColor(OoO);
		int[] OoO1 = { 471, 474, 455 };
		int[] OoO2 = { 286, 304, 300 };
		g.fillPolygon(OoO1, OoO2, 3);
//246
		Color PpP = new Color(86, 86, 86);
		g.setColor(PpP);
		int[] PpP1 = { 471, 464, 455 };
		int[] PpP2 = { 286, 279, 300 };
		g.fillPolygon(PpP1, PpP2, 3);
//247
		Color QqQ = new Color(120, 122, 193);
		g.setColor(QqQ);
		int[] QqQ1 = { 471, 464, 480 };
		int[] QqQ2 = { 286, 279, 279 };
		g.fillPolygon(QqQ1, QqQ2, 3);
//248
		Color RrR = new Color(43, 74, 61);
		g.setColor(RrR);
		int[] RrR1 = { 483, 495, 495 };
		int[] RrR2 = { 272, 272, 263 };
		g.fillPolygon(RrR1, RrR2, 3);
//249
		Color SsS = new Color(43, 74, 61);
		g.setColor(SsS);
		int[] SsS1 = { 483, 483, 495 };
		int[] SsS2 = { 272, 252, 263 };
		g.fillPolygon(SsS1, SsS2, 3);
//250
		Color TtT = new Color(165, 167, 207);
		g.setColor(TtT);
		int[] TtT1 = { 480, 465, 473 };
		int[] TtT2 = { 279, 279, 268 };
		g.fillPolygon(TtT1, TtT2, 3);
//251
		Color UuU = new Color(178, 193, 226);
		g.setColor(UuU);
		int[] UuU1 = { 465, 458, 473 };
		int[] UuU2 = { 279, 266, 268 };
		g.fillPolygon(UuU1, UuU2, 3);
//252
		Color VvV = new Color(192, 210, 241);
		g.setColor(VvV);
		int[] VvV1 = { 468, 458, 473 };
		int[] VvV2 = { 256, 266, 268 };
		g.fillPolygon(VvV1, VvV2, 3);
//253
		Color WwW = new Color(194, 205, 234);
		g.setColor(WwW);
		int[] WwW1 = { 468, 473, 483 };
		int[] WwW2 = { 256, 268, 253 };
		g.fillPolygon(WwW1, WwW2, 3);
//254
		Color XxX = new Color(182, 177, 231);
		g.setColor(XxX);
		int[] XxX1 = { 466, 483, 461 };
		int[] XxX2 = { 257, 256, 238 };
		g.fillPolygon(XxX1, XxX2, 3);
//255
		Color YyY = new Color(231, 245, 252);
		g.setColor(YyY);
		int[] YyY1 = { 466, 459, 461 };
		int[] YyY2 = { 257, 266, 238 };
		g.fillPolygon(YyY1, YyY2, 3);
//256
		Color ZzZ = new Color(217, 241, 252);
		g.setColor(ZzZ);
		int[] ZzZ1 = { 453, 459, 461 };
		int[] ZzZ2 = { 243, 266, 238 };
		g.fillPolygon(ZzZ1, ZzZ2, 3);
//257
		Color AAa = new Color(233, 110, 112);
		g.setColor(AAa);
		int[] AAa1 = { 481, 484, 461 };
		int[] AAa2 = { 257, 252, 239 };
		g.fillPolygon(AAa1, AAa2, 3);
//258
		Color BBb = new Color(233, 110, 112);
		g.setColor(BBb);
		int[] BBb1 = { 459, 484, 461 };
		int[] BBb2 = { 231, 252, 239 };
		g.fillPolygon(BBb1, BBb2, 3);
//259
		Color CCc = new Color(49, 30, 48);
		g.setColor(CCc);
		int[] CCc1 = { 459, 453, 461 };
		int[] CCc2 = { 231, 243, 239 };
		g.fillPolygon(CCc1, CCc2, 3);
//260
		Color DDd = new Color(49, 30, 48);
		g.setColor(DDd);
		int[] DDd1 = { 459, 453, 453 };
		int[] DDd2 = { 231, 243, 231 };
		g.fillPolygon(DDd1, DDd2, 3);
//261
		Color EEe = new Color(127, 54, 44);
		g.setColor(EEe);
		int[] EEe1 = { 419, 433, 424 };
		int[] EEe2 = { 87, 87, 98 };
		g.fillPolygon(EEe1, EEe2, 3);
//262
		Color FFf = new Color(165, 92, 88);
		g.setColor(FFf);
		int[] FFf1 = { 433, 433, 424 };
		int[] FFf2 = { 101, 87, 98 };
		g.fillPolygon(FFf1, FFf2, 3);
//263
		Color GGg = new Color(31, 24, 26);
		g.setColor(GGg);
		int[] GGg1 = { 433, 433, 447 };
		int[] GGg2 = { 101, 87, 99 };
		g.fillPolygon(GGg1, GGg2, 3);
//264
		Color HHh = new Color(154, 102, 139);
		g.setColor(HHh);
		int[] HHh1 = { 419, 433, 419 };
		int[] HHh2 = { 87, 87, 76 };
		g.fillPolygon(HHh1, HHh2, 3);
//265
		Color IIi = new Color(73, 31, 38);
		g.setColor(IIi);
		int[] IIi1 = { 419, 411, 419 };
		int[] IIi2 = { 87, 85, 76 };
		g.fillPolygon(IIi1, IIi2, 3);
//266
		Color JJj = new Color(73, 31, 38);
		g.setColor(JJj);
		int[] JJj1 = { 419, 411, 419 };
		int[] JJj2 = { 87, 85, 76 };
		g.fillPolygon(JJj1, JJj2, 3);
//267
		Color KKk = new Color(203, 192, 200);
		g.setColor(KKk);
		int[] KKk1 = { 404, 411, 419 };
		int[] KKk2 = { 76, 85, 76 };
		g.fillPolygon(KKk1, KKk2, 3);
//268
		Color LLl = new Color(228, 54, 50);
		g.setColor(LLl);
		int[] LLl1 = { 404, 404, 419 };
		int[] LLl2 = { 76, 63, 76 };
		g.fillPolygon(LLl1, LLl2, 3);
//269
		Color MMm = new Color(226, 60, 36);
		g.setColor(MMm);
		int[] MMm1 = { 404, 411, 406 };
		int[] MMm2 = { 76, 85, 94 };
		g.fillPolygon(MMm1, MMm2, 3);
//270
		Color NNn = new Color(109, 198, 82);
		g.setColor(NNn);
		int[] NNn1 = { 414, 411, 406 };
		int[] NNn2 = { 94, 85, 94 };
		g.fillPolygon(NNn1, NNn2, 3);
//271
		Color OOo = new Color(48, 27, 23);
		g.setColor(OOo);
		int[] OOo1 = { 419, 411, 414 };
		int[] OOo2 = { 86, 85, 94 };
		g.fillPolygon(OOo1, OOo2, 3);
//272
		Color PPp = new Color(170, 105, 101);
		g.setColor(PPp);
		int[] PPp1 = { 419, 425, 414 };
		int[] PPp2 = { 86, 98, 94 };
		g.fillPolygon(PPp1, PPp2, 3);
//273
		Color QQq = new Color(122, 126, 79);
		g.setColor(QQq);
		int[] QQq1 = { 406, 407, 414 };
		int[] QQq2 = { 94, 104, 94 };
		g.fillPolygon(QQq1, QQq2, 3);
//274
		Color RRr = new Color(36, 18, 28);
		g.setColor(RRr);
		int[] RRr1 = { 416, 407, 414 };
		int[] RRr2 = { 104, 104, 94 };
		g.fillPolygon(RRr1, RRr2, 3);
//275
		Color SSs = new Color(196, 100, 69);
		g.setColor(SSs);
		int[] SSs1 = { 416, 425, 414 };
		int[] SSs2 = { 104, 98, 94 };
		g.fillPolygon(SSs1, SSs2, 3);
//276
		Color TTt = new Color(181, 220, 137);
		g.setColor(TTt);
		int[] TTt1 = { 416, 425, 427 };
		int[] TTt2 = { 104, 98, 104 };
		g.fillPolygon(TTt1, TTt2, 3);
//277
		Color UUu = new Color(136, 102, 181);
		g.setColor(UUu);
		int[] UUu1 = { 416, 409, 407 };
		int[] UUu2 = { 104, 114, 104 };
		g.fillPolygon(UUu1, UUu2, 3);
//278
		Color VVv = new Color(30, 99, 71);
		g.setColor(VVv);
		int[] VVv1 = { 416, 409, 424 };
		int[] VVv2 = { 104, 114, 116 };
		g.fillPolygon(VVv1, VVv2, 3);
//279
		Color WWw = new Color(155, 90, 78);
		g.setColor(WWw);
		int[] WWw1 = { 416, 427, 424 };
		int[] WWw2 = { 104, 104, 116 };
		g.fillPolygon(WWw1, WWw2, 3);
//280
		Color XXx = new Color(93, 149, 103);
		g.setColor(XXx);
		int[] XXx1 = { 410, 409, 424 };
		int[] XXx2 = { 128, 114, 116 };
		g.fillPolygon(XXx1, XXx2, 3);
//281
		Color YYy = new Color(89, 100, 81);
		g.setColor(YYy);
		int[] YYy1 = { 410, 420, 424 };
		int[] YYy2 = { 128, 128, 116 };
		g.fillPolygon(YYy1, YYy2, 3);
//282
		Color ZZz = new Color(53, 56, 114);
		g.setColor(ZZz);
		int[] ZZz1 = { 410, 420, 411 };
		int[] ZZz2 = { 128, 128, 138 };
		g.fillPolygon(ZZz1, ZZz2, 3);
//283
		Color aaA = new Color(181, 187, 225);
		g.setColor(aaA);
		int[] aaA1 = { 417, 421, 411 };
		int[] aaA2 = { 141, 135, 138 };
		g.fillPolygon(aaA1, aaA2, 3);
//284
		Color bbB = new Color(150, 162, 211);
		g.setColor(bbB);
		int[] bbB1 = { 412, 424, 411 };
		int[] bbB2 = { 144, 144, 138 };
		g.fillPolygon(bbB1, bbB2, 3);
//285
		Color ccC = new Color(197, 58, 39);
		g.setColor(ccC);
		int[] ccC1 = { 412, 424, 414 };
		int[] ccC2 = { 144, 144, 160 };
		g.fillPolygon(ccC1, ccC2, 3);
//286
		Color ddD = new Color(170, 123, 71);
		g.setColor(ddD);
		int[] ddD1 = { 424, 422, 414 };
		int[] ddD2 = { 144, 160, 160 };
		g.fillPolygon(ddD1, ddD2, 3);
//287
		Color eeE = new Color(125, 107, 71);
		g.setColor(eeE);
		int[] eeE1 = { 415, 422, 414 };
		int[] eeE2 = { 170, 160, 160 };
		g.fillPolygon(eeE1, eeE2, 3);
//288
		Color ffF = new Color(51, 22, 17);
		g.setColor(ffF);
		int[] ffF1 = { 415, 418, 422 };
		int[] ffF2 = { 170, 185, 160 };
		g.fillPolygon(ffF1, ffF2, 3);
//289
		Color ggG = new Color(7, 0, 0);
		g.setColor(ggG);
		int[] ggG1 = { 421, 424, 428 };
		int[] ggG2 = { 135, 144, 119 };
		g.fillPolygon(ggG1, ggG2, 3);
//290
		Color hhH = new Color(150, 110, 100);
		g.setColor(hhH);
		int[] hhH1 = { 432, 424, 428 };
		int[] hhH2 = { 135, 144, 119 };
		g.fillPolygon(hhH1, hhH2, 3);
//291
		Color iiI = new Color(76, 61, 54);
		g.setColor(iiI);
		int[] iiI1 = { 421, 424, 417 };
		int[] iiI2 = { 135, 144, 142 };
		g.fillPolygon(iiI1, iiI2, 3);
//292
		Color jjJ = new Color(215, 173, 161);
		g.setColor(jjJ);
		int[] jjJ1 = { 421, 424, 428 };
		int[] jjJ2 = { 158, 144, 153 };
		g.fillPolygon(jjJ1, jjJ2, 3);
//293
		Color kkK = new Color(191, 109, 100);
		g.setColor(kkK);
		int[] kkK1 = { 421, 425, 428 };
		int[] kkK2 = { 158, 170, 153 };
		g.fillPolygon(kkK1, kkK2, 3);
//294
		Color llL = new Color(156, 102, 100);
		g.setColor(llL);
		int[] llL1 = { 421, 425, 417 };
		int[] llL2 = { 158, 170, 185 };
		g.fillPolygon(llL1, llL2, 3);
//295
		Color mmM = new Color(149, 97, 98);
		g.setColor(mmM);
		int[] mmM1 = { 419, 425, 417 };
		int[] mmM2 = { 196, 170, 185 };
		g.fillPolygon(mmM1, mmM2, 3);
//296
		Color nnN = new Color(46, 45, 43);
		g.setColor(nnN);
		int[] nnN1 = { 419, 422, 430 };
		int[] nnN2 = { 196, 219, 210 };
		g.fillPolygon(nnN1, nnN2, 3);
//297
		Color ooO = new Color(85, 83, 84);
		g.setColor(ooO);
		int[] ooO1 = { 423, 430, 441 };
		int[] ooO2 = { 227, 244, 237 };
		g.fillPolygon(ooO1, ooO2, 3);
//298
		Color ppP = new Color(85, 83, 84);
		g.setColor(ppP);
		int[] ppP1 = { 430, 430, 441 };
		int[] ppP2 = { 248, 244, 237 };
		g.fillPolygon(ppP1, ppP2, 3);
//300
		Color qqQ = new Color(220, 205, 79);
		g.setColor(qqQ);
		int[] qqQ1 = { 456, 456, 444 };
		int[] qqQ2 = { 196, 210, 200 };
		g.fillPolygon(qqQ1, qqQ2, 3);
//301
		Color rrR = new Color(39, 36, 43);
		g.setColor(rrR);
		int[] rrR1 = { 440, 456, 443 };
		int[] rrR2 = { 194, 210, 227 };
		g.fillPolygon(rrR1, rrR2, 3);
//302
		Color ssS = new Color(39, 36, 43);
		g.setColor(ssS);
		int[] ssS1 = { 458, 456, 443 };
		int[] ssS2 = { 232, 210, 227 };
		g.fillPolygon(ssS1, ssS2, 3);
//303
		Color ttT = new Color(128, 113, 113);
		g.setColor(ttT);
		int[] ttT1 = { 437, 440, 438 };
		int[] ttT2 = { 190, 196, 203 };
		g.fillPolygon(ttT1, ttT2, 3);
//304
		Color uuU = new Color(167, 146, 116);
		g.setColor(uuU);
		int[] uuU1 = { 446, 440, 438 };
		int[] uuU2 = { 249, 196, 203 };
		g.fillPolygon(uuU1, uuU2, 3);
//305
		Color vvV = new Color(203, 152, 91);
		g.setColor(vvV);
		int[] vvV1 = { 446, 442, 440 };
		int[] vvV2 = { 252, 250, 196 };
		g.fillPolygon(vvV1, vvV2, 3);
//306
		Color wwW = new Color(91, 89, 90);
		g.setColor(wwW);
		int[] wwW1 = { 442, 442, 432 };
		int[] wwW2 = { 237, 250, 245 };
		g.fillPolygon(wwW1, wwW2, 3);
//307
		Color xxX = new Color(56, 54, 62);
		g.setColor(xxX);
		int[] xxX1 = { 459, 445, 454 };
		int[] xxX2 = { 268, 252, 244 };
		g.fillPolygon(xxX1, xxX2, 3);
//308
		Color yyY = new Color(85, 83, 84);
		g.setColor(yyY);
		int[] yyY1 = { 444, 453, 454 };
		int[] yyY2 = { 252, 228, 245 };
		g.fillPolygon(yyY1, yyY2, 3);
//309
		Color zzZ = new Color(85, 83, 84);
		g.setColor(zzZ);
		int[] zzZ1 = { 444, 453, 443 };
		int[] zzZ2 = { 252, 228, 226 };
		g.fillPolygon(zzZ1, zzZ2, 3);
//310
		Color aAa = new Color(71, 69, 69);
		g.setColor(aAa);
		int[] aAa1 = { 431, 421, 441 };
		int[] aAa2 = { 204, 219, 216 };
		g.fillPolygon(aAa1, aAa2, 3);
//311
		Color bBb = new Color(71, 69, 69);
		g.setColor(bBb);
		int[] bBb1 = { 425, 421, 441 };
		int[] bBb2 = { 229, 219, 216 };
		g.fillPolygon(bBb1, bBb2, 3);
//312
		Color cCc = new Color(71, 69, 69);
		g.setColor(cCc);
		int[] cCc1 = { 425, 442, 441 };
		int[] cCc2 = { 229, 240, 216 };
		g.fillPolygon(cCc1, cCc2, 3);
//313
		Color dDd = new Color(46, 44, 40);
		g.setColor(dDd);
		int[] dDd1 = { 419, 438, 441 };
		int[] dDd2 = { 193, 193, 216 };
		g.fillPolygon(dDd1, dDd2, 3);
//314
		Color eEe = new Color(46, 45, 43);
		g.setColor(eEe);
		int[] eEe1 = { 431, 422, 419 };
		int[] eEe2 = { 204, 218, 193 };
		g.fillPolygon(eEe1, eEe2, 3);
//315
		Color fFf = new Color(86, 76, 88);
		g.setColor(fFf);
		int[] fFf1 = { 439, 445, 445 };
		int[] fFf2 = { 130, 121, 141 };
		g.fillPolygon(fFf1, fFf2, 3);
//316
		Color gGg = new Color(63, 62, 71);
		g.setColor(gGg);
		int[] gGg1 = { 439, 442, 445 };
		int[] gGg2 = { 130, 151, 141 };
		g.fillPolygon(gGg1, gGg2, 3);
//317
		Color hHh = new Color(63, 62, 71);
		g.setColor(hHh);
		int[] hHh1 = { 442, 449, 445 };
		int[] hHh2 = { 151, 155, 141 };
		g.fillPolygon(hHh1, hHh2, 3);
//318
		Color iIi = new Color(74, 72, 86);
		g.setColor(iIi);
		int[] iIi1 = { 442, 449, 445 };
		int[] iIi2 = { 151, 155, 174 };
		g.fillPolygon(iIi1, iIi2, 3);
//319
		Color jJj = new Color(43, 40, 55);
		g.setColor(jJj);
		int[] jJj1 = { 453, 449, 445 };
		int[] jJj2 = { 196, 155, 174 };
		g.fillPolygon(jJj1, jJj2, 3);
//320
		Color kKk = new Color(86, 53, 45);
		g.setColor(kKk);
		int[] kKk1 = { 453, 445, 446 };
		int[] kKk2 = { 196, 193, 186 };
		g.fillPolygon(kKk1, kKk2, 3);
//321
		Color lLl = new Color(163, 103, 88);
		g.setColor(lLl);
		int[] lLl1 = { 453, 445, 444 };
		int[] lLl2 = { 196, 193, 200 };
		g.fillPolygon(lLl1, lLl2, 3);
//322
		Color mMm = new Color(185, 117, 107);
		g.setColor(mMm);
		int[] mMm1 = { 435, 445, 444 };
		int[] mMm2 = { 189, 193, 200 };
		g.fillPolygon(mMm1, mMm2, 3);
//323
		Color nNn = new Color(152, 78, 64);
		g.setColor(nNn);
		int[] nNn1 = { 435, 445, 447 };
		int[] nNn2 = { 189, 193, 185 };
		g.fillPolygon(nNn1, nNn2, 3);
//324
		Color oOo = new Color(51, 44, 49);
		g.setColor(oOo);
		int[] oOo1 = { 435, 445, 445 };
		int[] oOo2 = { 99, 121, 99 };
		g.fillPolygon(oOo1, oOo2, 3);
//325
		Color pPp = new Color(46, 42, 50);
		g.setColor(pPp);
		int[] pPp1 = { 435, 445, 440 };
		int[] pPp2 = { 99, 121, 128 };
		g.fillPolygon(pPp1, pPp2, 3);
//326
		Color qQq = new Color(179, 134, 139);
		g.setColor(qQq);
		int[] qQq1 = { 448, 445, 445 };
		int[] qQq2 = { 126, 121, 99 };
		g.fillPolygon(qQq1, qQq2, 3);
//327
		Color rRr = new Color(126, 103, 100);
		g.setColor(rRr);
		int[] rRr1 = { 448, 445, 445 };
		int[] rRr2 = { 126, 121, 143 };
		g.fillPolygon(rRr1, rRr2, 3);
//328
		Color sSs = new Color(126, 103, 100);
		g.setColor(sSs);
		int[] sSs1 = { 448, 450, 445 };
		int[] sSs2 = { 126, 159, 143 };
		g.fillPolygon(sSs1, sSs2, 3);
//329
		Color tTt = new Color(75, 55, 45);
		g.setColor(tTt);
		int[] tTt1 = { 448, 463, 449 };
		int[] tTt2 = { 126, 131, 142 };
		g.fillPolygon(tTt1, tTt2, 3);
//330
		Color uUu = new Color(73, 61, 108);
		g.setColor(uUu);
		int[] uUu1 = { 459, 449, 446 };
		int[] uUu2 = { 150, 156, 145 };
		g.fillPolygon(uUu1, uUu2, 3);
//331
		Color vVv = new Color(170, 159, 217);
		g.setColor(vVv);
		int[] vVv1 = { 459, 449, 463 };
		int[] vVv2 = { 150, 142, 131 };
		g.fillPolygon(vVv1, vVv2, 3);
//332
		Color wWw = new Color(106, 67, 67);
		g.setColor(wWw);
		int[] wWw1 = { 483, 459, 463 };
		int[] wWw2 = { 131, 149, 131 };
		g.fillPolygon(wWw1, wWw2, 3);
//333
		Color xXx = new Color(170, 159, 217);
		g.setColor(xXx);
		int[] xXx1 = { 450, 448, 459 };
		int[] xXx2 = { 140, 146, 150 };
		g.fillPolygon(xXx1, xXx2, 3);
//334
		Color yYy = new Color(43, 40, 55);
		g.setColor(yYy);
		int[] yYy1 = { 450, 445, 455 };
		int[] yYy2 = { 156, 170, 198 };
		g.fillPolygon(yYy1, yYy2, 3);
//335
		Color zZz = new Color(43, 40, 55);
		g.setColor(zZz);
		int[] zZz1 = { 445, 445, 455 };
		int[] zZz2 = { 186, 170, 198 };
		g.fillPolygon(zZz1, zZz2, 3);
//336
		Color aaaa = new Color(119, 92, 111);
		g.setColor(aaaa);
		int[] aaaa1 = { 444, 469, 448 };
		int[] aaaa2 = { 98, 112, 126 };
		g.fillPolygon(aaaa1, aaaa2, 3);
//337
		Color bbbb = new Color(61, 59, 66);
		g.setColor(bbbb);
		int[] bbbb1 = { 464, 469, 448 };
		int[] bbbb2 = { 132, 112, 126 };
		g.fillPolygon(bbbb1, bbbb2, 3);
//338
		Color cccc = new Color(76, 58, 55);
		g.setColor(cccc);
		int[] cccc1 = { 464, 469, 476 };
		int[] cccc2 = { 132, 112, 124 };
		g.fillPolygon(cccc1, cccc2, 3);
//339
		Color dddd = new Color(66, 45, 53);
		g.setColor(dddd);
		int[] dddd1 = { 488, 464, 476 };
		int[] dddd2 = { 129, 132, 124 };
		g.fillPolygon(dddd1, dddd2, 3);
//340
		Color eeee = new Color(106, 67, 67);
		g.setColor(eeee);
		int[] eeee1 = { 488, 464, 460 };
		int[] eeee2 = { 129, 131, 149 };
		g.fillPolygon(eeee1, eeee2, 3);
//341
		Color ffff = new Color(52, 60, 69);
		g.setColor(ffff);
		int[] ffff1 = { 433, 432, 425 };
		int[] ffff2 = { 100, 138, 98 };
		g.fillPolygon(ffff1, ffff2, 3);
//342
		Color gggg = new Color(83, 71, 115);
		g.setColor(gggg);
		int[] gggg1 = { 425, 430, 420 };
		int[] gggg2 = { 103, 120, 129 };
		g.fillPolygon(gggg1, gggg2, 3);
//343
		Color hhhh = new Color(53, 45, 85);
		g.setColor(hhhh);
		int[] hhhh1 = { 423, 427, 410 };
		int[] hhhh2 = { 138, 124, 134 };
		g.fillPolygon(hhhh1, hhhh2, 3);
//344
		Color iiii = new Color(10, 14, 12);
		g.setColor(iiii);
		int[] iiii1 = { 432, 432, 441 };
		int[] iiii2 = { 97, 131, 128 };
		g.fillPolygon(iiii1, iiii2, 3);
//345
		Color jjjj = new Color(10, 14, 12);
		g.setColor(jjjj);
		int[] jjjj1 = { 432, 439, 441 };
		int[] jjjj2 = { 97, 98, 128 };
		g.fillPolygon(jjjj1, jjjj2, 3);
//346
		Color kkkk = new Color(150, 110, 100);
		g.setColor(kkkk);
		int[] kkkk1 = { 432, 428, 423 };
		int[] kkkk2 = { 135, 154, 145 };
		g.fillPolygon(kkkk1, kkkk2, 3);
//347
		Color llll = new Color(36, 32, 40);
		g.setColor(llll);
		int[] llll1 = { 441, 432, 428 };
		int[] llll2 = { 128, 131, 154 };
		g.fillPolygon(llll1, llll2, 3);
//348
		Color mmmm = new Color(35, 32, 39);
		g.setColor(mmmm);
		int[] mmmm1 = { 444, 441, 428 };
		int[] mmmm2 = { 154, 128, 154 };
		g.fillPolygon(mmmm1, mmmm2, 3);
//349
		Color nnnn = new Color(41, 32, 35);
		g.setColor(nnnn);
		int[] nnnn1 = { 444, 418, 428 };
		int[] nnnn2 = { 154, 193, 154 };
		g.fillPolygon(nnnn1, nnnn2, 3);
//350
		Color oooo = new Color(33, 33, 37);
		g.setColor(oooo);
		int[] oooo1 = { 444, 445, 418 };
		int[] oooo2 = { 154, 186, 193 };
		g.fillPolygon(oooo1, oooo2, 3);
//351
		Color pppp = new Color(47, 45, 41);
		g.setColor(pppp);
		int[] pppp1 = { 435, 439, 418 };
		int[] pppp2 = { 188, 193, 193 };
		g.fillPolygon(pppp1, pppp2, 3);
//352
		Color qqqq = new Color(146, 158, 222);
		g.setColor(qqqq);
		int[] qqqq1 = { 435, 439, 418 };
		int[] qqqq2 = { 188, 193, 193 };
		g.fillPolygon(qqqq1, qqqq2, 3);
//353
		Color rrrr = new Color(44, 54, 76);
		g.setColor(rrrr);
		int[] rrrr1 = { 365, 378, 375 };
		int[] rrrr2 = { 92, 84, 104 };
		g.fillPolygon(rrrr1, rrrr2, 3);
//354
		Color ssss = new Color(154, 156, 210);
		g.setColor(ssss);
		int[] ssss1 = { 386, 386, 378 };
		int[] ssss2 = { 76, 95, 84 };
		g.fillPolygon(ssss1, ssss2, 3);
//355
		Color tttt = new Color(14, 24, 23);
		g.setColor(tttt);
		int[] tttt1 = { 375, 386, 378 };
		int[] tttt2 = { 104, 95, 84 };
		g.fillPolygon(tttt1, tttt2, 3);
//356
		Color uuuu = new Color(28, 64, 120);
		g.setColor(uuuu);
		int[] uuuu1 = { 386, 386, 400 };
		int[] uuuu2 = { 76, 95, 76 };
		g.fillPolygon(uuuu1, uuuu2, 3);
//357
		Color vvvv = new Color(209, 67, 37);
		g.setColor(vvvv);
		int[] vvvv1 = { 402, 386, 400 };
		int[] vvvv2 = { 103, 95, 76 };
		g.fillPolygon(vvvv1, vvvv2, 3);
//358
		Color wwww = new Color(137, 97, 68);
		g.setColor(wwww);
		int[] wwww1 = { 402, 386, 392 };
		int[] wwww2 = { 103, 95, 105 };
		g.fillPolygon(wwww1, wwww2, 3);
//358
		Color xxxx = new Color(71, 68, 69);
		g.setColor(xxxx);
		int[] xxxx1 = { 386, 386, 392 };
		int[] xxxx2 = { 109, 95, 105 };
		g.fillPolygon(xxxx1, xxxx2, 3);
//359
		Color yyyy = new Color(126, 95, 156);
		g.setColor(yyyy);
		int[] yyyy1 = { 386, 386, 375 };
		int[] yyyy2 = { 109, 95, 104 };
		g.fillPolygon(yyyy1, yyyy2, 3);
//360
		Color zzzz = new Color(82, 63, 52);
		g.setColor(zzzz);
		int[] zzzz1 = { 365, 365, 375 };
		int[] zzzz2 = { 92, 106, 104 };
		g.fillPolygon(zzzz1, zzzz2, 3);
//361
		Color AAAA = new Color(115, 105, 114);
		g.setColor(AAAA);
		int[] AAAA1 = { 365, 365, 352 };
		int[] AAAA2 = { 92, 106, 106 };
		g.fillPolygon(AAAA1, AAAA2, 3);
//362
		Color BBBB = new Color(11, 20, 17);
		g.setColor(BBBB);
		int[] BBBB1 = { 402, 392, 403 };
		int[] BBBB2 = { 103, 105, 114 };
		g.fillPolygon(BBBB1, BBBB2, 3);
//362
		Color CCCC = new Color(11, 20, 17);
		g.setColor(CCCC);
		int[] CCCC1 = { 392, 386, 403 };
		int[] CCCC2 = { 103, 109, 114 };
		g.fillPolygon(CCCC1, CCCC2, 3);
//363
		Color DDDD = new Color(115, 48, 32);
		g.setColor(DDDD);
		int[] DDDD1 = { 389, 386, 403 };
		int[] DDDD2 = { 117, 109, 114 };
		g.fillPolygon(DDDD1, DDDD2, 3);
//364
		Color EEEE = new Color(206, 179, 215);
		g.setColor(EEEE);
		int[] EEEE1 = { 389, 397, 403 };
		int[] EEEE2 = { 117, 124, 114 };
		g.fillPolygon(EEEE1, EEEE2, 3);
//365
		Color FFFF = new Color(98, 192, 121);
		g.setColor(FFFF);
		int[] FFFF1 = { 404, 397, 403 };
		int[] FFFF2 = { 124, 124, 114 };
		g.fillPolygon(FFFF1, FFFF2, 3);
//366
		Color GGGG = new Color(115, 124, 193);
		g.setColor(GGGG);
		int[] GGGG1 = { 386, 376, 373 };
		int[] GGGG2 = { 109, 103, 114 };
		g.fillPolygon(GGGG1, GGGG2, 3);
//367
		Color HHHH = new Color(146, 151, 205);
		g.setColor(HHHH);
		int[] HHHH1 = { 365, 376, 373 };
		int[] HHHH2 = { 106, 103, 114 };
		g.fillPolygon(HHHH1, HHHH2, 3);
//368
		Color IIII = new Color(151, 158, 211);
		g.setColor(IIII);
		int[] IIII1 = { 365, 358, 373 };
		int[] IIII2 = { 106, 116, 114 };
		g.fillPolygon(IIII1, IIII2, 3);
//369
		Color JJJJ = new Color(129, 133, 194);
		g.setColor(JJJJ);
		int[] JJJJ1 = { 367, 358, 373 };
		int[] JJJJ2 = { 129, 116, 114 };
		g.fillPolygon(JJJJ1, JJJJ2, 3);
//370
		Color KKKK = new Color(110, 119, 191);
		g.setColor(KKKK);
		int[] KKKK1 = { 367, 375, 373 };
		int[] KKKK2 = { 129, 129, 114 };
		g.fillPolygon(KKKK1, KKKK2, 3);
//371
		Color LLLL = new Color(113, 132, 194);
		g.setColor(LLLL);
		int[] LLLL1 = { 385, 375, 373 };
		int[] LLLL2 = { 126, 129, 114 };
		g.fillPolygon(LLLL1, LLLL2, 3);
//372
		Color MMMM = new Color(113, 132, 194);
		g.setColor(MMMM);
		int[] MMMM1 = { 385, 385, 373 };
		int[] MMMM2 = { 126, 106, 114 };
		g.fillPolygon(MMMM1, MMMM2, 3);
//373
		Color NNNN = new Color(88, 97, 168);
		g.setColor(NNNN);
		int[] NNNN1 = { 385, 385, 390 };
		int[] NNNN2 = { 126, 106, 116 };
		g.fillPolygon(NNNN1, NNNN2, 3);
//374
		Color OOOO = new Color(134, 128, 190);
		g.setColor(OOOO);
		int[] OOOO1 = { 385, 396, 390 };
		int[] OOOO2 = { 126, 124, 116 };
		g.fillPolygon(OOOO1, OOOO2, 3);
//375
		Color PPPP = new Color(102, 108, 172);
		g.setColor(PPPP);
		int[] PPPP1 = { 385, 396, 391 };
		int[] PPPP2 = { 126, 124, 135 };
		g.fillPolygon(PPPP1, PPPP2, 3);
//376
		Color QQQQ = new Color(108, 102, 169);
		g.setColor(QQQQ);
		int[] QQQQ1 = { 385, 383, 391 };
		int[] QQQQ2 = { 126, 136, 135 };
		g.fillPolygon(QQQQ1, QQQQ2, 3);
//377
		Color RRRR = new Color(129, 139, 196);
		g.setColor(RRRR);
		int[] RRRR1 = { 385, 383, 375 };
		int[] RRRR2 = { 126, 136, 129 };
		g.fillPolygon(RRRR1, RRRR2, 3);
//378
		Color SSSS = new Color(199, 121, 94);
		g.setColor(SSSS);
		int[] SSSS1 = { 383, 375, 375 };
		int[] SSSS2 = { 136, 141, 129 };
		g.fillPolygon(SSSS1, SSSS2, 3);
//379
		Color TTTT = new Color(189, 103, 102);
		g.setColor(TTTT);
		int[] TTTT1 = { 370, 375, 375 };
		int[] TTTT2 = { 136, 141, 129 };
		g.fillPolygon(TTTT1, TTTT2, 3);
//380
		Color UUUU = new Color(20, 12, 10);
		g.setColor(UUUU);
		int[] UUUU1 = { 370, 367, 375 };
		int[] UUUU2 = { 136, 129, 129 };
		g.fillPolygon(UUUU1, UUUU2, 3);
//381
		Color VVVV = new Color(157, 85, 77);
		g.setColor(VVVV);
		int[] VVVV1 = { 370, 365, 375 };
		int[] VVVV2 = { 136, 139, 141 };
		g.fillPolygon(VVVV1, VVVV2, 3);
//382
		Color WWWW = new Color(178, 108, 82);
		g.setColor(WWWW);
		int[] WWWW1 = { 370, 367, 365 };
		int[] WWWW2 = { 136, 129, 139 };
		g.fillPolygon(WWWW1, WWWW2, 3);
//383
		Color XXXX = new Color(7, 11, 18);
		g.setColor(XXXX);
		int[] XXXX1 = { 356, 367, 365 };
		int[] XXXX2 = { 129, 129, 139 };
		g.fillPolygon(XXXX1, XXXX2, 3);
//384
		Color YYYY = new Color(22, 31, 42);
		g.setColor(YYYY);
		int[] YYYY1 = { 356, 367, 359 };
		int[] YYYY2 = { 129, 129, 116 };
		g.fillPolygon(YYYY1, YYYY2, 3);
//385
		Color ZZZZ = new Color(214, 154, 167);
		g.setColor(ZZZZ);
		int[] ZZZZ1 = { 333, 328, 337 };
		int[] ZZZZ2 = { 94, 113, 102 };
		g.fillPolygon(ZZZZ1, ZZZZ2, 3);
//386
		Color aAAA = new Color(113, 91, 176);
		g.setColor(aAAA);
		int[] aAAA1 = { 347, 328, 337 };
		int[] aAAA2 = { 116, 113, 102 };
		g.fillPolygon(aAAA1, aAAA2, 3);
//386
		Color bBBB = new Color(113, 91, 176);
		g.setColor(bBBB);
		int[] bBBB1 = { 347, 328, 340 };
		int[] bBBB2 = { 116, 113, 124 };
		g.fillPolygon(bBBB1, bBBB2, 3);
//387
		Color cCCC = new Color(52, 53, 85);
		g.setColor(cCCC);
		int[] cCCC1 = { 347, 352, 337 };
		int[] cCCC2 = { 116, 106, 102 };
		g.fillPolygon(cCCC1, cCCC2, 3);
//388
		Color dDDD = new Color(96, 100, 157);
		g.setColor(dDDD);
		int[] dDDD1 = { 347, 352, 359 };
		int[] dDDD2 = { 116, 106, 116 };
		g.fillPolygon(dDDD1, dDDD2, 3);
//389
		Color eEEE = new Color(32, 32, 50);
		g.setColor(eEEE);
		int[] eEEE1 = { 364, 352, 359 };
		int[] eEEE2 = { 106, 106, 116 };
		g.fillPolygon(eEEE1, eEEE2, 3);
//390
		Color fFFF = new Color(118, 95, 132);
		g.setColor(fFFF);
		int[] fFFF1 = { 356, 347, 359 };
		int[] fFFF2 = { 129, 116, 116 };
		g.fillPolygon(fFFF1, fFFF2, 3);
//391
		Color gGGG = new Color(123, 113, 178);
		g.setColor(gGGG);
		int[] gGGG1 = { 356, 338, 347 };
		int[] gGGG2 = { 129, 124, 116 };
		g.fillPolygon(gGGG1, gGGG2, 3);
//391
		Color hHHH = new Color(165, 33, 44);
		g.setColor(hHHH);
		int[] hHHH1 = { 329, 341, 329 };
		int[] hHHH2 = { 113, 124, 130 };
		g.fillPolygon(hHHH1, hHHH2, 3);
//392
		Color iIII = new Color(254, 144, 123);
		g.setColor(iIII);
		int[] iIII1 = { 336, 341, 329 };
		int[] iIII2 = { 135, 124, 130 };
		g.fillPolygon(iIII1, iIII2, 3);
//393
		Color jJJJ = new Color(230, 213, 228);
		g.setColor(jJJJ);
		int[] jJJJ1 = { 336, 341, 351 };
		int[] jJJJ2 = { 135, 124, 135 };
		g.fillPolygon(jJJJ1, jJJJ2, 3);
//394
		Color kKKK = new Color(250, 135, 111);
		g.setColor(kKKK);
		int[] kKKK1 = { 357, 341, 351 };
		int[] kKKK2 = { 126, 124, 135 };
		g.fillPolygon(kKKK1, kKKK2, 3);
//395
		Color lLLL = new Color(194, 118, 111);
		g.setColor(lLLL);
		int[] lLLL1 = { 357, 364, 351 };
		int[] lLLL2 = { 126, 138, 135 };
		g.fillPolygon(lLLL1, lLLL2, 3);
//396
		Color mMMM = new Color(246, 78, 89);
		g.setColor(mMMM);
		int[] mMMM1 = { 328, 325, 336 };
		int[] mMMM2 = { 129, 145, 135 };
		g.fillPolygon(mMMM1, mMMM2, 3);
//397
		Color nNNN = new Color(225, 212, 237);
		g.setColor(nNNN);
		int[] nNNN1 = { 325, 341, 336 };
		int[] nNNN2 = { 145, 150, 135 };
		g.fillPolygon(nNNN1, nNNN2, 3);
//398
		Color oOOO = new Color(247, 211, 227);
		g.setColor(oOOO);
		int[] oOOO1 = { 350, 341, 336 };
		int[] oOOO2 = { 135, 150, 135 };
		g.fillPolygon(oOOO1, oOOO2, 3);
//399
		Color pPPP = new Color(200, 164, 206);
		g.setColor(pPPP);
		int[] pPPP1 = { 350, 341, 354 };
		int[] pPPP2 = { 135, 150, 144 };
		g.fillPolygon(pPPP1, pPPP2, 3);
//400
		Color qQQQ = new Color(255, 135, 130);
		g.setColor(qQQQ);
		int[] qQQQ1 = { 350, 364, 354 };
		int[] qQQQ2 = { 135, 138, 144 };
		g.fillPolygon(qQQQ1, qQQQ2, 3);
//401
		Color rRRR = new Color(209, 212, 234);
		g.setColor(rRRR);
		int[] rRRR1 = { 366, 364, 354 };
		int[] rRRR2 = { 147, 138, 144 };
		g.fillPolygon(rRRR1, rRRR2, 3);
//402
		Color sSSS = new Color(242, 117, 144);
		g.setColor(sSSS);
		int[] sSSS1 = { 366, 364, 376 };
		int[] sSSS2 = { 147, 138, 141 };
		g.fillPolygon(sSSS1, sSSS2, 3);
//403
		Color tTTT = new Color(241, 139, 124);
		g.setColor(tTTT);
		int[] tTTT1 = { 366, 381, 376 };
		int[] tTTT2 = { 147, 157, 141 };
		g.fillPolygon(tTTT1, tTTT2, 3);
//404
		Color uUUU = new Color(44, 52, 123);
		g.setColor(uUUU);
		int[] uUUU1 = { 405, 406, 398 };
		int[] uUUU2 = { 129, 144, 138 };
		g.fillPolygon(uUUU1, uUUU2, 3);
//405
		Color vVVV = new Color(51, 41, 57);
		g.setColor(vVVV);
		int[] vVVV1 = { 379, 406, 407 };
		int[] vVVV2 = { 158, 144, 149 };
		g.fillPolygon(vVVV1, vVVV2, 3);
//405
		Color wWWW = new Color(51, 41, 57);
		g.setColor(wWWW);
		int[] wWWW1 = { 379, 376, 405 };
		int[] wWWW2 = { 158, 140, 145 };
		g.fillPolygon(wWWW1, wWWW2, 3);
//406
		Color xXXX = new Color(51, 41, 57);
		g.setColor(xXXX);
		int[] xXXX1 = { 383, 376, 405 };
		int[] xXXX2 = { 136, 140, 145 };
		g.fillPolygon(xXXX1, xXXX2, 3);
//407
		Color yYYY = new Color(51, 41, 57);
		g.setColor(yYYY);
		int[] yYYY1 = { 383, 399, 407 };
		int[] yYYY2 = { 136, 137, 146 };
		g.fillPolygon(yYYY1, yYYY2, 3);
//408
		Color zZZZ = new Color(51, 41, 57);
		g.setColor(zZZZ);
		int[] zZZZ1 = { 383, 399, 392 };
		int[] zZZZ2 = { 136, 137, 135 };
		g.fillPolygon(zZZZ1, zZZZ2, 3);
//409
		Color AaAA = new Color(51, 41, 57);
		g.setColor(AaAA);
		int[] AaAA1 = { 404, 399, 392 };
		int[] AaAA2 = { 130, 137, 135 };
		g.fillPolygon(AaAA1, AaAA2, 3);
//410
		Color BbBB = new Color(51, 41, 57);
		g.setColor(BbBB);
		int[] BbBB1 = { 404, 404, 397 };
		int[] BbBB2 = { 130, 124, 124 };
		g.fillPolygon(BbBB1, BbBB2, 3);
//411
		Color CcCC = new Color(51, 41, 57);
		g.setColor(CcCC);
		int[] CcCC1 = { 404, 396, 390 };
		int[] CcCC2 = { 130, 124, 137 };
		g.fillPolygon(CcCC1, CcCC2, 3);
//411
		Color DdDD = new Color(255, 139, 150);
		g.setColor(DdDD);
		int[] DdDD1 = { 354, 341, 348 };
		int[] DdDD2 = { 143, 149, 158 };
		g.fillPolygon(DdDD1, DdDD2, 3);
//412
		Color EeEE = new Color(118, 196, 232);
		g.setColor(EeEE);
		int[] EeEE1 = { 354, 367, 348 };
		int[] EeEE2 = { 143, 147, 158 };
		g.fillPolygon(EeEE1, EeEE2, 3);
//413
		Color FfFF = new Color(232, 234, 246);
		g.setColor(FfFF);
		int[] FfFF1 = { 367, 367, 348 };
		int[] FfFF2 = { 164, 147, 158 };
		g.fillPolygon(FfFF1, FfFF2, 3);
//414
		Color GgGG = new Color(244, 213, 211);
		g.setColor(GgGG);
		int[] GgGG1 = { 367, 367, 381 };
		int[] GgGG2 = { 164, 147, 157 };
		g.fillPolygon(GgGG1, GgGG2, 3);
//415
		Color HhHH = new Color(247, 137, 91);
		g.setColor(HhHH);
		int[] HhHH1 = { 324, 341, 322 };
		int[] HhHH2 = { 145, 150, 157 };
		g.fillPolygon(HhHH1, HhHH2, 3);
//416
		Color IiII = new Color(29, 40, 76);
		g.setColor(IiII);
		int[] IiII1 = { 329, 332, 322 };
		int[] IiII2 = { 169, 153, 157 };
		g.fillPolygon(HhHH1, HhHH2, 3);
//417
		Color JjJJ = new Color(108, 196, 237);
		g.setColor(JjJJ);
		int[] JjJJ1 = { 341, 332, 349 };
		int[] JjJJ2 = { 150, 153, 157 };
		g.fillPolygon(JjJJ1, JjJJ2, 3);
//418
		Color KkKK = new Color(101, 182, 234);
		g.setColor(KkKK);
		int[] KkKK1 = { 342, 332, 349 };
		int[] KkKK2 = { 162, 153, 157 };
		g.fillPolygon(KkKK1, KkKK2, 3);
//419
		Color LlLL = new Color(107, 160, 220);
		g.setColor(LlLL);
		int[] LlLL1 = { 342, 332, 332 };
		int[] LlLL2 = { 162, 153, 162 };
		g.fillPolygon(LlLL1, LlLL2, 3);
//420
		Color MmMM = new Color(150, 160, 217);
		g.setColor(MmMM);
		int[] MmMM1 = { 332, 332, 325 };
		int[] MmMM2 = { 153, 169, 156 };
		g.fillPolygon(MmMM1, MmMM2, 3);
//421
		Color NnNN = new Color(250, 176, 158);
		g.setColor(NnNN);
		int[] NnNN1 = { 364, 382, 375 };
		int[] NnNN2 = { 162, 158, 168 };
		g.fillPolygon(NnNN1, NnNN2, 3);
//422
		Color OoOO = new Color(184, 59, 53);
		g.setColor(OoOO);
		int[] OoOO1 = { 386, 382, 375 };
		int[] OoOO2 = { 171, 158, 168 };
		g.fillPolygon(OoOO1, OoOO2, 3);
//423
		Color PpPP = new Color(30, 64, 129);
		g.setColor(PpPP);
		int[] PpPP1 = { 386, 382, 394 };
		int[] PpPP2 = { 171, 158, 158 };
		g.fillPolygon(PpPP1, PpPP2, 3);
//424
		Color QqQQ = new Color(67, 121, 199);
		g.setColor(QqQQ);
		int[] QqQQ1 = { 400, 382, 394 };
		int[] QqQQ2 = { 149, 158, 158 };
		g.fillPolygon(QqQQ1, QqQQ2, 3);
//425
		Color RrRR = new Color(159, 132, 199);
		g.setColor(RrRR);
		int[] RrRR1 = { 400, 409, 394 };
		int[] RrRR2 = { 149, 158, 158 };
		g.fillPolygon(RrRR1, RrRR2, 3);
//426
		Color SsSS = new Color(164, 102, 144);
		g.setColor(SsSS);
		int[] SsSS1 = { 400, 409, 409 };
		int[] SsSS2 = { 149, 158, 149 };
		g.fillPolygon(SsSS1, SsSS2, 3);
//427
		Color TtTT = new Color(36, 95, 167);
		g.setColor(TtTT);
		int[] TtTT1 = { 411, 409, 394 };
		int[] TtTT2 = { 176, 158, 158 };
		g.fillPolygon(TtTT1, TtTT2, 3);

//428
		Color UuUU = new Color(78, 185, 75);
		g.setColor(UuUU);
		int[] UuUU1 = { 331, 253, 331 };
		int[] UuUU2 = { 140, 176, 258 };
		g.fillPolygon(UuUU1, UuUU2, 3);

//429
		Color VvVV = new Color(78, 185, 75);
		g.setColor(VvVV);
		int[] VvVV1 = { 331, 414, 331 };
		int[] VvVV2 = { 258, 348, 376 };
		g.fillPolygon(VvVV1, VvVV2, 3);
//430
		Color WwWW = new Color(250, 169, 169);
		g.setColor(WwWW);
		int[] WwWW1 = { 253, 331, 205 };
		int[] WwWW2 = { 176, 258, 268 };
		g.fillPolygon(WwWW1, WwWW2, 3);
//431
		Color XxXX = new Color(250, 169, 169);
		g.setColor(XxXX);
		int[] XxXX1 = { 331, 439, 414 };
		int[] XxXX2 = { 258, 268, 348 };
		g.fillPolygon(XxXX1, XxXX2, 3);
//432
		Color YyYY = new Color(250, 243, 125);
		g.setColor(YyYY);
		int[] YyYY1 = { 331, 439, 416 };
		int[] YyYY2 = { 258, 268, 187 };
		g.fillPolygon(YyYY1, YyYY2, 3);
//433
		Color ZzZZ = new Color(250, 243, 125);
		g.setColor(ZzZZ);
		int[] ZzZZ1 = { 331, 205, 251 };
		int[] ZzZZ2 = { 258, 268, 346 };
		g.fillPolygon(ZzZZ1, ZzZZ2, 3);
//434
		Color AAaA = new Color(131, 249, 220);
		g.setColor(AAaA);
		int[] AAaA1 = { 331, 331, 416 };
		int[] AAaA2 = { 258, 140, 187 };
		g.fillPolygon(AAaA1, AAaA2, 3);
//436
		Color CCcC = new Color(131, 249, 220);
		g.setColor(CCcC);
		int[] CCcC1 = { 331, 251, 331 };
		int[] CCcC2 = { 258, 346, 376 };
		g.fillPolygon(CCcC1, CCcC2, 3);

//437
		Color DDdD = new Color(60, 59, 65);
		g.setColor(DDdD);
		int[] DDdD1 = { 385, 394, 410 };
		int[] DDdD2 = { 172, 158, 175 };
		g.fillPolygon(DDdD1, DDdD2, 3);
//438
		Color EEeE = new Color(53, 66, 94);
		g.setColor(EEeE);
		int[] EEeE1 = { 385, 413, 410 };
		int[] EEeE2 = { 172, 183, 175 };
		g.fillPolygon(EEeE1, EEeE2, 3);

//49    
		Color bbbbbb = new Color(202, 202, 202);
		g.setColor(bbbbbb);
		int[] bbbbbb2 = { 530, 580, 538 };
		int[] bbbbbb1 = { 295, 345, 222 };
		g.fillPolygon(bbbbbb1, bbbbbb2, 3);
//48    
		Color aaaaaa = new Color(230, 239, 247);
		g.setColor(aaaaaa);
		int[] aaaaaa2 = { 575, 580, 538 };
		int[] aaaaaa1 = { 212, 345, 222 };
		g.fillPolygon(aaaaaa1, aaaaaa2, 3);
//47    
		Color dddddd = new Color(182, 185, 156);
		g.setColor(dddddd);
		int[] dddddd1 = { 212, 345, 205 };
		int[] dddddd2 = { 575, 580, 600 };
		g.fillPolygon(dddddd1, dddddd2, 3);
//46   
		Color eeeeee = new Color(182, 185, 156);
		g.setColor(eeeeee);
		int[] eeeeee1 = { 222, 109, 205 };
		int[] eeeeee2 = { 538, 600, 600 };
		g.fillPolygon(eeeeee1, eeeeee2, 3);
//45  
		Color ffffff = new Color(208, 205, 214);
		g.setColor(ffffff);
		int[] ffffff1 = { 0, 109, 0 };
		int[] ffffff2 = { 557, 600, 600 };
		g.fillPolygon(ffffff1, ffffff2, 3);
//44 
		Color gggggg = new Color(204, 198, 200);
		g.setColor(gggggg);
		int[] gggggg1 = { 0, 109, 95 };
		int[] gggggg2 = { 557, 600, 567 };
		g.fillPolygon(gggggg1, gggggg2, 3);
//43
		Color hhhhhh = new Color(216, 219, 239);
		g.setColor(hhhhhh);
		int[] hhhhhh1 = { 0, 76, 95 };
		int[] hhhhhh2 = { 557, 532, 567 };
		g.fillPolygon(hhhhhh1, hhhhhh2, 3);
//42
		Color iiiiii = new Color(202, 206, 215);
		g.setColor(iiiiii);
		int[] iiiiii1 = { 0, 76, 33 };
		int[] iiiiii2 = { 557, 532, 520 };
		g.fillPolygon(iiiiii1, iiiiii2, 3);
//41
		Color jjjjjj = new Color(199, 207, 218);
		g.setColor(jjjjjj);
		int[] jjjjjj1 = { 0, 0, 33 };
		int[] jjjjjj2 = { 557, 433, 520 };
		g.fillPolygon(jjjjjj1, jjjjjj2, 3);
//40
		Color kkkkkk = new Color(177, 179, 155);
		g.setColor(kkkkkk);
		int[] kkkkkk1 = { 76, 109, 147 };
		int[] kkkkkk2 = { 532, 600, 500 };
		g.fillPolygon(kkkkkk1, kkkkkk2, 3);
//39
		Color llllll = new Color(191, 199, 218);
		g.setColor(llllll);
		int[] llllll1 = { 223, 109, 147 };
		int[] llllll2 = { 540, 600, 500 };
		g.fillPolygon(llllll1, llllll2, 3);
//38
		Color mmmmmm = new Color(194, 198, 197);
		g.setColor(mmmmmm);
		int[] mmmmmm1 = { 76, 70, 147 };
		int[] mmmmmm2 = { 532, 461, 500 };
		g.fillPolygon(mmmmmm1, mmmmmm2, 3);
//37
		Color nnnnnn = new Color(238, 247, 246);
		g.setColor(nnnnnn);
		int[] nnnnnn1 = { 33, 70, 0 };
		int[] nnnnnn2 = { 520, 461, 433 };
		g.fillPolygon(nnnnnn1, nnnnnn2, 3);
//Dont know
		Color cccccc = new Color(194, 199, 197);
		g.setColor(cccccc);
		int[] cccccc1 = { 33, 76, 70 };
		int[] cccccc2 = { 520, 532, 461 };
		g.fillPolygon(cccccc1, cccccc2, 3);
//36
		Color oooooo = new Color(197, 186, 154);
		g.setColor(oooooo);
		int[] oooooo1 = { 147, 70, 153 };
		int[] oooooo2 = { 500, 461, 432 };
		g.fillPolygon(oooooo1, oooooo2, 3);
//35
		Color pppppp = new Color(196, 199, 214);
		g.setColor(pppppp);
		int[] pppppp1 = { 147, 213, 153 };
		int[] pppppp2 = { 500, 440, 432 };
		g.fillPolygon(pppppp1, pppppp2, 3);
//34
		Color qqqqqq = new Color(230, 218, 199);
		g.setColor(qqqqqq);
		int[] qqqqqq1 = { 147, 213, 223 };
		int[] qqqqqq2 = { 500, 440, 540 };
		g.fillPolygon(qqqqqq1, qqqqqq2, 3);
//33
		Color rrrrrr = new Color(193, 206, 224);
		g.setColor(rrrrrr);
		int[] rrrrrr1 = { 305, 213, 300 };
		int[] rrrrrr2 = { 472, 440, 400 };
		g.fillPolygon(rrrrrr1, rrrrrr2, 3);
//32
		Color ssssss = new Color(194, 186, 157);
		g.setColor(ssssss);
		int[] ssssss1 = { 305, 372, 350 };
		int[] ssssss2 = { 472, 431, 400 };
		g.fillPolygon(ssssss1, ssssss2, 3);
//31
		Color tttttt = new Color(196, 193, 204);
		g.setColor(tttttt);
		int[] tttttt1 = { 305, 300, 361 };
		int[] tttttt2 = { 472, 530, 526 };
		g.fillPolygon(tttttt1, tttttt2, 3);
//30
		Color uuuuuu = new Color(209, 202, 187);
		g.setColor(uuuuuu);
		int[] uuuuuu1 = { 222, 300, 305 };
		int[] uuuuuu2 = { 538, 530, 472 };
		g.fillPolygon(uuuuuu1, uuuuuu2, 3);
		g.drawPolygon(poly);
//29
		Color vvvvvv = new Color(218, 226, 233);
		g.setColor(vvvvvv);
		int[] vvvvvv1 = { 213, 223, 305 };
		int[] vvvvvv2 = { 440, 540, 472 };
		g.fillPolygon(vvvvvv1, vvvvvv2, 3);
//28
		Color wwwwww = new Color(192, 197, 202);
		g.setColor(wwwwww);
		int[] wwwwww1 = { 305, 300, 372 };
		int[] wwwwww2 = { 472, 530, 431 };
		g.fillPolygon(wwwwww1, wwwwww2, 3);
//27
		Color xxxxxx = new Color(193, 183, 147);
		g.setColor(xxxxxx);
		int[] xxxxxx1 = { 345, 295, 361 };
		int[] xxxxxx2 = { 580, 530, 526 };
		g.fillPolygon(xxxxxx1, xxxxxx2, 3);
//26
		Color yyyyyy = new Color(226, 240, 251);
		g.setColor(yyyyyy);
		int[] yyyyyy1 = { 205, 345, 422 };
		int[] yyyyyy2 = { 600, 580, 600 };
		g.fillPolygon(yyyyyy1, yyyyyy2, 3);
//25
		Color zzzzzzz = new Color(250, 253, 253);
		g.setColor(zzzzzzz);
		int[] zzzzzzz1 = { 361, 345, 430 };
		int[] zzzzzzz2 = { 526, 580, 515 };
		g.fillPolygon(zzzzzzz1, zzzzzzz2, 3);
		// 641
		Color my641w = new Color(202, 197, 217);
		g.setColor(my641w);

		int[] x641w = { 0, 72, 0 };
		int[] y641w = { 441, 400, 400 };
		g.fillPolygon(x641w, y641w, 3);
		// 642
		Color my642w = new Color(218, 226, 239);
		g.setColor(my642w);

		int[] x642w = { 72, 70, 0 };
		int[] y642w = { 400, 463, 441 };
		g.fillPolygon(x642w, y642w, 3);
		// 643
		Color my643w = new Color(213, 224, 235);
		g.setColor(my643w);

		int[] x643w = { 72, 70, 154 };
		int[] y643w = { 400, 463, 434 };
		g.fillPolygon(x643w, y643w, 3);
		// 644
		Color my644w = new Color(193, 199, 208);
		g.setColor(my644w);

		int[] x644w = { 154, 72, 162 };
		int[] y644w = { 434, 400, 400 };
		g.fillPolygon(x644w, y644w, 3);
		// 645
		Color my645w = new Color(208, 218, 227);
		g.setColor(my645w);

		int[] x645w = { 162, 154, 211 };
		int[] y645w = { 400, 434, 439 };
		g.fillPolygon(x645w, y645w, 3);
		// 646
		Color my646w = new Color(214, 224, 234);
		g.setColor(my646w);

		int[] x646w = { 162, 211, 246 };
		int[] y646w = { 400, 439, 400 };
		g.fillPolygon(x646w, y646w, 3);
		// 647
		Color my647 = new Color(199, 207, 218);
		g.setColor(my647);

		int[] x647 = { 246, 211, 300 };
		int[] y647 = { 400, 439, 400 };
		g.fillPolygon(x647, y647, 3);
		// 648
		Color my648w = new Color(201, 205, 206);
		g.setColor(my648w);

		int[] x648w = { 300, 308, 351 };
		int[] y648w = { 400, 470, 400 };
		g.fillPolygon(x648w, y648w, 3);
		// 649
		Color my649w = new Color(189, 212, 186);
		g.setColor(my649w);

		int[] x649w = { 351, 445, 416 };
		int[] y649w = { 400, 455, 400 };
		g.fillPolygon(x649w, y649w, 3);
		// 650
		Color my650w = new Color(195, 205, 204);
		g.setColor(my650w);

		int[] x650w = { 416, 445, 504 };
		int[] y650w = { 400, 455, 400 };
		g.fillPolygon(x650w, y650w, 3);
		// 651
		Color my651w = new Color(214, 224, 234);
		g.setColor(my651w);

		int[] x651w = { 504, 445, 600 };
		int[] y651w = { 400, 455, 400 };
		g.fillPolygon(x651w, y651w, 3);
		// 652
		Color my652w = new Color(227, 233, 245);
		g.setColor(my652w);

		int[] x652w = { 600, 545, 600 };
		int[] y652w = { 400, 419, 491 };
		g.fillPolygon(x652w, y652w, 3);
		// 653
		Color my653w = new Color(199, 199, 197);
		g.setColor(my653w);

		int[] x653w = { 600, 545, 545 };
		int[] y653w = { 491, 419, 527 };
		g.fillPolygon(x653w, y653w, 3);
		// 654
		Color my654w = new Color(197, 197, 194);
		g.setColor(my654w);

		int[] x654w = { 600, 555, 600 };
		int[] y654w = { 491, 570, 600 };
		g.fillPolygon(x654w, y654w, 3);
		// 655
		Color my655w = new Color(211, 208, 213);
		g.setColor(my655w);

		int[] x655w = { 555, 545, 600 };
		int[] y655w = { 570, 527, 491 };
		g.fillPolygon(x655w, y655w, 3);
		// 656
		Color my656w = new Color(194, 201, 209);
		g.setColor(my656w);

		int[] x656w = { 555, 600, 422 };
		int[] y656w = { 570, 600, 600 };
		g.fillPolygon(x656w, y656w, 3);
		// 657
		Color my657 = new Color(202, 220, 230);
		g.setColor(my657);

		int[] x657 = { 487, 555, 545 };
		int[] y657 = { 584, 570, 527 };
		g.fillPolygon(x657, y657, 3);
		// 658
		Color my658w = new Color(203, 210, 236);
		g.setColor(my658w);

		int[] x658w = { 545, 545, 445 };
		int[] y658w = { 527, 419, 455 };
		g.fillPolygon(x658w, y658w, 3);
		// 659
		Color my659w = new Color(187, 196, 205);
		g.setColor(my659w);

		int[] x659w = { 445, 545, 487 };
		int[] y659w = { 455, 527, 584 };
		g.fillPolygon(x659w, y659w, 3);
		// 660
		Color my660w = new Color(200, 204, 215);
		g.setColor(my660w);

		int[] x660w = { 445, 487, 427 };
		int[] y660w = { 455, 584, 519 };
		g.fillPolygon(x660w, y660w, 3);
		// 661
		Color my661w = new Color(194, 201, 209);
		g.setColor(my661w);

		int[] x661w = { 445, 351, 427 };
		int[] y661w = { 455, 400, 519 };
		g.fillPolygon(x661w, y661w, 3);
		// 662
		Color my662w = new Color(188, 197, 212);
		g.setColor(my662w);

		int[] x662w = { 427, 351, 361 };
		int[] y662w = { 519, 400, 527 };
		g.fillPolygon(x662w, y662w, 3);
		// 663
		Color my663w = new Color(192, 189, 198);
		g.setColor(my643w);

		int[] x663w = { 427, 487, 421 };
		int[] y663w = { 519, 584, 600 };
		g.fillPolygon(x663w, y663w, 3);
		// 664
		Color my664w = new Color(197, 201, 2);
		g.setColor(my664w);

		int[] x664w = { 427, 421, 345 };
		int[] y664w = { 519, 600, 579 };
		g.fillPolygon(x664w, y664w, 3);

		Color my690w = new Color(147, 149, 125);
		g.setColor(my690w);

		int[] x690w = { 162, 148, 125 };
		int[] y690w = { 227, 267, 252 };
		g.fillPolygon(x690w, y690w, 3);

		Color qwer = new Color(193, 206, 224);
		g.setColor(qwer);
		int[] qwer1 = { 300, 309, 208 };
		int[] qwer2 = { 400, 473, 440 };
		g.fillPolygon(qwer1, qwer2, 3);
		Color asdf = new Color(197, 197, 195);
		g.setColor(asdf);
		int[] asdf1 = { 427, 423, 340 };
		int[] asdf2 = { 518, 600, 583 };
		g.fillPolygon(asdf1, asdf2, 3);
		g.drawPolygon(poly);
	}
}