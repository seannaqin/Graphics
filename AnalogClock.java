
import java.awt.*;
import javax.swing.JFrame;

public class AnalogClock extends Canvas {
	public void paint (Graphics g) {
		g.setColor(Color.black);
		g.fillOval(190, 190, 220, 220);
		
		g.setColor(getBackground());
		g.fillOval(200, 200, 200, 200);
		
		g.setColor(Color.black);
		g.setFont(new Font("Serif", Font.BOLD, 20));
		g.drawString("12", 290, 220);
		g.drawString("3", 385, 305);
		g.drawString("6", 295, 395);
		g.drawString("9", 205, 305);
		
		g.setFont(new Font("Serif", Font.PLAIN, 15));
		g.drawString("1", 340, 235);
		g.drawString("2", 370, 265);
		g.drawString("4", 370, 345);
		g.drawString("5", 340, 380);
		g.drawString("7", 255, 380);
		g.drawString("8", 225, 345);
		g.drawString("10", 220, 265);
		g.drawString("11", 250, 235);
		
		g.fillOval(295, 295, 10, 10);
		g.drawLine(300, 300, 300, 210);
		g.drawLine(300, 300, 360, 270);
	}
	
	public static void main(String[] args) {
		JFrame window = new JFrame("Analog Clock");
		window.setSize(600,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AnalogClock canvas = new AnalogClock();
		window.add(canvas);
		window.setVisible(true);
	}
}
