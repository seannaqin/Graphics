
import java.awt.*;
import javax.swing.JFrame;

public class DrawHouse extends Canvas {
	public void paint(Graphics g) {
		g.setColor(Color.black);
		
		// roof
		int[] roofx = {200, 500, 800};
		int[] roofy = {300, 100, 300};
		g.drawPolygon(roofx, roofy, 3);
		
		// chimney
		int[] chimx = {550, 550, 550, 650, 650, 650};
		int[] chimy = {50, 220, 50, 50, 220, 50};
		g.drawPolygon(chimx, chimy, 6);
		
		// body
		int[] bodyx = {300, 300, 700, 700};
		int[] bodyy = {300, 600, 600, 300};
		g.drawPolygon(bodyx, bodyy, 4);
		
		// windows
		int[] leftwx = {350, 350, 450, 450};
		int[] leftwy = {350, 450, 450, 350};
		g.drawPolygon(leftwx, leftwy, 4);
		
		int[] rightwx = {550, 550, 650, 650};
		int[] rightwy = leftwy;
		g.drawPolygon(rightwx, rightwy, 4);
		
		// door
		int[] doorx = {455, 455, 545, 545};
		int[] doory = {600, 465, 465, 600};
		g.drawPolygon(doorx, doory, 4);
	}
	
	public static void main(String[] args) {
		JFrame win = new JFrame("Draw House");
		win.setSize(1000, 800);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(new DrawHouse());
		win.setVisible(true);
	}
}
