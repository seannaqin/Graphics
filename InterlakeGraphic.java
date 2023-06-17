
import java.awt.*;
import javax.swing.JFrame;

public class InterlakeGraphic extends Canvas {
	public void paint (Graphics g) {
		// paw palm
		Color IHSBlue = new Color(50, 50, 250);
		g.setColor(IHSBlue);
		g.fillOval(240, 300, 120, 100);
		g.fillOval(200, 350, 120, 100);
		g.fillOval(280, 350, 120, 100);
		
		// paw pads
		g.fillOval(200, 150, 90, 140);
		g.fillOval(310, 150, 90, 140);
		g.fillOval(130, 275, 70, 85);
		g.fillOval(400, 275, 70, 85);
		
		// text
		g.setColor(Color.white);
		g.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 70));
		g.drawString("INTERLAKE", 110, 120);
		g.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 90));
		g.drawString("SAINTS", 140, 525);
		
	}
	
	public static void main (String[] args) {
		JFrame win = new JFrame("Interlake Symbol");
		win.setSize(600,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InterlakeGraphic canvas = new InterlakeGraphic();
		win.add(canvas);
		win.setVisible(true);
	}
}
