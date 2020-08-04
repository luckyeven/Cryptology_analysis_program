package KeyWordCipher;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;


/**
* <h1>GUI</h1>
* The GUI implements a graphical user interface
*
* @author shifeng song ssong094@uottawa.ca
* @version 1
* @since 2020-08-03
*/

public class GUI extends JPanel implements DocumentListener {
	JFrame frame = new JFrame("KeyWordCipher"); //         ***create JFrame object***	  ****
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel keyword = new JLabel();
	JTextField keyText = new JTextField(20);
	JTextField startText = new JTextField(2);
	JLabel aToz = new JLabel();
	JLabel fixedAtoZ = new JLabel();

	public GUI(){
		createGUI();
	}

	public void createGUI(){


		frame.setLayout(null);
		frame.setBounds(600,400,500,250);			//setup window position and size             *
		frame.setResizable(false);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);  //release source when frame is closed ***
		


		panel1.setLayout(null); 					//  allow user to setup panel size
		panel1.setBounds(10,10,490,110);


		panel2.setBorder(BorderFactory.createTitledBorder("Keyword Substitution"));
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER,1,1));
		panel2.setBounds(10,125,460,70);
		

		
		              //           ***setup panel1***          *****
		JLabel start = new JLabel();
		fixedAtoZ.setText("Yeah，I program in JAVA");
		keyText.getDocument().addDocumentListener(this);
		startText.getDocument().addDocumentListener(this);


		/*
		 component position
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


													//            ***setup panel2 ***        *****
		String Str="";


		/*
		position
		*/
		Text text = new Text();
		aToz.setText(text.getText());
	
		panel2.add(aToz);
		
		fixedAtoZ.setForeground(Color.GRAY);
		panel2.add(fixedAtoZ);

		/*
		add panels to frame
		*/
		frame.add(panel1);
		frame.add(panel2);

		frame.setVisible(true);      // make JFrame visible

	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		setupText();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		setupText();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		setupText();
	}

	public void setupText(){


		if(startText.getText().equals("")||keyText.getText().equals("")){
			if(startText.getText().equals("")){
				fixedAtoZ.setText("Oh,Where should we start at?");
			}
			if(keyText.getText().equals("")){
				fixedAtoZ.setText("Yeah, I program in JAVA.");
			}

		}else{
			String regex ="[a-zA-Z]*";
			if(!Pattern.matches(regex,keyText.getText())){
				fixedAtoZ.setText("Bad keyword. use [a-zA-Z]");
			}else{

				String regex2 ="[a-zA-Z]";
				if(Pattern.matches(regex,startText.getText())){
					char [] start = startText.getText().toCharArray();
					if(start.length>1){

						fixedAtoZ.setText("One starting point only at this time.");
					}else {

						Text myText =new Text(keyText.getText(),start[0]);
						fixedAtoZ.setText(myText.getText());
					}

				}else{
					fixedAtoZ.setText("Bad Starting point");
				}
			}



		}


	}
}