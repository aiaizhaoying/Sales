import java.awt.*;
import javax.swing.JFrame;

public class Window3 {
	public Window3(String title,
			int w, int h, Color bg) {
		JFrame f = new JFrame(title);
//		f.setTitle(title);
		Container c = f.getContentPane();
		c.setBackground(bg);
		f.setSize(w, h);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String[]a ) {
		Window3 w1 = new Window3("test", 800,300, Color.BLACK);
		Window3 w2 = new Window3("Hello", 400,200, Color.RED);
	}
}






