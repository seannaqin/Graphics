
import java.awt.*;
import javax.swing.JFrame;

public class SmileyFace extends Canvas {
	public void paint (Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(200, 200, 200, 200);
		
		g.setColor(Color.blue);
		g.fillOval(250, 260, 25, 25);
		g.fillOval(325, 260, 25, 25);
		
		g.setColor(Color.red);
		g.drawArc(225, 250, 150, 100, 225, 90);
	}
	
	public static void main(String[] args) {
		JFrame window = new JFrame("Smiley");
		window.setSize(600,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SmileyFace canvas = new SmileyFace();
		window.add(canvas);
		window.setVisible(true);
	}
}
