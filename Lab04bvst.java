// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
		g.drawLine(100,100,100,450);
		g.drawLine(100,100,450,100);
		g.drawLine(450,100,450,450);
		g.drawLine(100,450,450,450);
		//face 2
		g.drawLine(200,200,200,550);
		g.drawLine(200,200,550,200);
		g.drawLine(550,200,550,550);
		g.drawLine(200,550,550,550);
		//connections
		g.drawLine(100,450,200,550);
		g.drawLine(450,100,550,200);
		g.drawLine(450,450,550,550);
		g.drawLine(100,100,200,200);
		// DRAW SPHERE
		g.drawOval(100,100,400,400);
		g.drawOval(100,275,400,50);
		g.drawOval(100,200,400,200);
		g.drawOval(100,150,400,300);
		//sideways
		g.drawOval(275,100,50,400);
		g.drawOval(200,100,200,400);
		g.drawOval(150,100,300,400);

	// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
		g.drawOval(1500,100,300,300);
		g.drawLine(1500,250,1650,400);
		double b = Math.sqrt(2);
		double sine = 150*(b/2);
		double cosine = 150*(b/2);
		double downShift = 150 - sine;
		int x = (int) (1650 + cosine);
		int y = (int) (100 + downShift);
		g.drawLine(1650,400,x,y);
		g.drawLine(1500,250,x,y);
		g.drawOval(1553,204,142,142);

		// DRAW APCS
		g.fillRect(100,750,30,100);
		g.fillRect(160,750,30,100);
		g.fillRect(100,750,90,30);
		g.fillRect(130,800,30,30);
		//letterP
		g.fillRect(250,750,30,100);
		g.fillRect(280,750,30,10);
		g.fillRect(310,750,10,30);
		g.fillRect(280,770,30,10);
		//LetterC
		g.fillRect(350,750,30,100);
		g.fillRect(380,750,50,20);
		g.fillRect(380,830,50,20);
		//LetterS
		g.fillRect(500,750,50,20);
		g.fillRect(470,750,30,50);
		g.fillRect(500,780,50,20);
		g.fillRect(520,800,30,50);
		g.fillRect(470,830,50,20);
		// DRAW PACMEN FLOWER
		g.fillArc(900,475,200,200,135,270);//fix
		g.fillArc(775,600,200,200,-135,270);
		g.fillArc(1025,600,200,200,45,270);
		g.fillArc(900,725,200,200,315,270);
	}

}
