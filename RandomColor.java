
import java.awt.*;
import javax.swing.JFrame;

public class RandomColor extends Canvas {
	public void paint (Graphics g) {
		Color newColor = new Color((int) (Math.random()*256), (int) (Math.random()*256), (int) (Math.random()*256));
		g.setColor(newColor);
		
		g.fillOval(300, 150, 200, 200);

	}
	
	public static void main(String[] args) {
		JFrame win = new JFrame("Random Color");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RandomColor canvas = new RandomColor();
		win.add(canvas);
		win.setVisible(true);
	}
}

/* 
 * 1. Color is the perceptual characteristic of light described by a color name,
 * or reflected light on a spectrum of wavelengths or frequencies
 * 2. The three ways color is described is through its name, how pure or desaturated it is, and its value or lightness
 * 3. Different colors are achieved through varying chroma, intensity, saturation, and luminance or value
 * 4. Printers are more limited than monitors because printers can't produce as many colors because it is limited to using the colors from the ink provided,
 * and is restricted to the CMYK spectrum
 * 5. Primary colors - colors that can't be created by mixing others
 * Secondary colors - colors that can be created by mixing two primary colors
 * Tertiary colors - colors that can be created by mixing primary and secondary hues
 * Complementary colors - colors directly opposite from each other on the color wheel
 * 6. An after image is an image formed by our eyes after looking at something for a prolonged period of time,
 * that tends to depict a fainter version of the image with inverted colors
 * 7. After images appear because staring at a color for an extended period of time fatigues our eye rods and cones,
 * causing the least depleted or fatigued cells to respond the strongest after the image is removed
 * 8. The different color relationships are important to creating pleasing color combinations in art and everyday items
 * 9. Simultaneous contrast is when opposing colors are close together and create a vibrating or shadow effect
 * 10. Johannes Itten is one of the first people to define and identify strategies for successful color combinations.
 * His work is important because it expanded people's knowledge on the usage and effects of different color combinations.
 */