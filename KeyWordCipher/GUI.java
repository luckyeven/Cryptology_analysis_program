package KeyWordCipher;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame{

	public void createGUI(){
		JFrame frame = new JFrame(); // create JFrame object
		frame.setBounds(600,400,600,300); //set window size
		frame.setVisible(true);      // make JFrame visible
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //release source when fram is closed
		JLabel j1 = new JLabel("Keyword Cipher");

	}

}