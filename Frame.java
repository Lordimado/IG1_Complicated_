import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {
	
	public Frame(){
		
		JFrame f= new JFrame();
		
		f.setTitle("JAVA");
		f.setSize(400, 400);
		f.setContentPane(new Panel());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setResizable(true);
		f.setBackground(Color.black);
		f.setVisible(true);
	}

	
}
