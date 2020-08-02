package KeyWordCipher;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{

	public void createGUI(){
		JFrame frame = new JFrame("KeyWordCipher"); // create JFrame object
		frame.setLayout(null);
		frame.setBounds(600,400,500,250);
		//frame.setResizable(false); //set window size
		
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //release source when fram is closed
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null); // allow user to setup panel size
		panel1.setBounds(10,10,490,110);

		JPanel panel2 = new JPanel();
		
		panel2.setBorder(BorderFactory.createTitledBorder("Keyword Substitution"));
		

		panel2.setBounds(10,125,460,60);

		JLabel keyword = new JLabel();
		JLabel start = new JLabel();

		//***************************setup panel1**************
		JTextField keyText = new JTextField(20);
		JTextField startText = new JTextField(2);

		/*
		setup position 
		*/
		keyword.setBounds(30,30,120,25);
		keyword.setHorizontalAlignment(SwingConstants.RIGHT);
		keyText.setBounds(150,30,150,25);
		start.setBounds(30,60,120,25);
		start.setHorizontalAlignment(SwingConstants.RIGHT);
		startText.setBounds(150,60,25,25);

		keyword.setText("Enter the keyword: ");
		start.setText("Start at: ");

		/*
		add contents to panel1
		*/
		panel1.add(keyword);
		panel1.add(keyText);
		panel1.add(start);
		panel1.add(startText);


		//************************setup panel2 *******************
		String Str="";
		JLabel aToz = new JLabel();
		JLabel fixedAtoZ = new JLabel();
		
		for(char a='a';a<='z';a++){
			Str+= String.valueOf(a)+"   ";
		}
		aToz.setText(Str);
		fixedAtoZ.setText(Substitution(Str,key,a));
		/*
		position
		*/
		aToz.setBounds(12,130,440,30);

		panel2.add(aToz);
		/*
		add panels to frame
		*/
		frame.add(panel1);
		frame.add(panel2);


		


		frame.setVisible(true);      // make JFrame visible

	}
	public String Substitution(String str, String key, char start){//return Substituted string
		return str;
	}

}