import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MyCalc extends JFrame{

	public MyCalc (){
		final String[] labels = {
				"+", "-", "*", "/",
				"1","2","3","4",
				"5", "6","7","8",
				"9", "0","C","="
				
		};
		
		//JFrame f = new JFrame("yint");
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(4,4,5,5));
		for(int i = 0; i<labels.length; i++){
			JButton b = new JButton(labels[i] +"");
			c.add(b);
		}
		setSize(300,400);
		setVisible(true);
		
	}

	


public static void main(String[] args){
	new MyCalc();
}

}