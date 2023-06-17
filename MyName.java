
import java.awt.*;
import javax.swing.JFrame;

public class MyName extends Canvas {
	public void paint(Graphics g) {
		
		g.setColor(Color.green);
		
		// S 
		s(g, 110);
		
		// E
		e(g, 250);
				
		// A
		a(g, 375);
				
		// N
		n(g, 500);
		n(g, 650);
		
		// A
		a(g, 775);
		
	}
	
	public void s(Graphics g, int sX) {
		g.drawLine(sX, 100, sX + 100, 100);
		g.drawLine(sX, 100, sX, 200);
		g.drawLine(sX, 200, sX + 100, 200);
		g.drawLine(sX + 100, 200, sX + 100, 300);
		g.drawLine(sX + 100, 300, sX, 300);
	}
	
	public void e(Graphics g, int eX) {
		g.drawLine(eX, 100, eX, 300);
		g.drawLine(eX, 100, eX + 100, 100);
		g.drawLine(eX, 200, eX + 75, 200);
		g.drawLine(eX, 300, eX + 100, 300);
	}
	
	public void a(Graphics g, int aX) {
		g.drawLine(aX, 300, aX + 50, 100);
		g.drawLine(aX + 50, 100, aX + 100, 300);
		g.drawLine(aX + 25, 200, aX + 75, 200);
	}
	
	public void n(Graphics g, int nX) {
		g.drawLine(nX, 100, nX, 300);
		g.drawLine(nX, 100, nX + 100, 300);
		g.drawLine(nX + 100, 100, nX + 100, 300);
	}
	
	public static void main(String[] args) {
		JFrame window = new JFrame("MyName");
		window.setSize(1000, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyName canvas = new MyName();
		window.add(canvas);
		window.setVisible(true);
	}
}
