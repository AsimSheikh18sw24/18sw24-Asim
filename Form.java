import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Form extends JFrame{
		static JFrame f;
		static JLabel l1,l2,l3,l4,l5;

		static Font font,font2;

		static JTextField f1,f2,f4;

		static JTextArea f3;

		static JPasswordField pass;

		static JRadioButton rb1,rb2;

		static ButtonGroup gen;

		static JButton b1,b2;

		static JPanel p1,p2;
	static Container c;
	static BoxLayout layoutpanels;
	static GridLayout layout1;
	
	public static void main(String[] args){
	

		layout1 = new GridLayout(6,2,0,5);
		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		l1 = new JLabel("Name");
		l2 = new JLabel("Father Name");

		font = new Font("Consolas",Font.BOLD,25);
		font2 = new Font("Arial",Font.ITALIC,12);

		f1 = new JTextField();
		f1.setBounds(10,50,50,40);
		f1.setFont(font);

		f2 = new JTextField();
		f2.setBounds(10,50,50,40);
		f2.setFont(font);

		l3 = new JLabel("Address");
		f3 = new JTextArea();
		f3.setBounds(10,50,50,40);
		f3.setFont(font2);

		l4 = new JLabel("Gmail id");
		f4 = new JTextField();
		f4.setBounds(10,50,50,40);
		f4.setFont(font);

		l5 = new JLabel("Passward");
		pass = new JPasswordField();
		pass.setBounds(10,50,50,40);
		//JCheckBox cb1 = new JCheckBox("Male");
		//cb1.setBounds(100,50,100,40);

		rb1 = new JRadioButton("Male");
		rb1.setBounds(100,50,100,40);
		//JCheckBox cb2 = new JCheckBox("Female");
		//cb2.setBounds(100,50,100,40);
		rb2 = new JRadioButton("Female");
		rb2.setBounds(100,50,100,40);

		gen = new ButtonGroup();
		gen.add(rb1);
		gen.add(rb2);
		
		f = new JFrame("Form");
		b1 = new JButton("     OK     ");
		b1.setSize(20,20);
		b2 = new JButton(" RESET ");
		b2.setSize(20,20);
		f.setSize(405,470);//set size of frame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				b1_action(event);
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				reset_action(event);
			}
		});

		f.setResizable(false);
		c = f.getContentPane();

		p1 = new JPanel();
		p1.setLayout(layout1);
		p1.setBackground(Color.WHITE);
		p1.setBounds(0,0,400,400);
		p1.add(l1);
		p1.add(f1);
		p1.add(l2);
		p1.add(f2);
		p1.add(l3);
		p1.add(f3);
		p1.add(l4);
		p1.add(f4);
		p1.add(l5);
		p1.add(pass);
		p1.add(rb1);
		p1.add(rb2);

		p2 = new JPanel();
		p2.setBackground(Color.PINK);
		p2.setBounds(0,400,400,50);
		p2.setLayout(grid);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		//gbc.ipady = 20;
		gbc.gridx = 0;
		gbc.gridy = 0;
		p2.add(b1,gbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		//gbc.ipady = 20;
		


		//b5649a6a
		gbc.gridx = 1;
		gbc.gridy = 0;
		p2.add(b2,gbc);
		
		layoutpanels = new BoxLayout(c, BoxLayout.PAGE_AXIS);
		
		c.setBackground(Color.YELLOW);
		c.setLayout(null);
		c.add(p1);
		c.add(p2);
		f.setVisible(true);
	}
public static void reset_action(ActionEvent event){
	f1.setText(null);
	f2.setText(null);
	f3.setText(null);
	f4.setText(null);
	pass.setText(null);

}
public static void b1_action(ActionEvent event){
	String f1_text = f1.getText();
	String f2_text = f2.getText();
	String f3_text = f3.getText();
	String f4_text = f4.getText();
	if(f1_text==null||f2_text==null||f3_text==null||f4_text==null){
		JOptionPane.showMessageDialog(null,"Please fill all the requred information");
	}
		else if(f1_text!=null||f2_text!=null||f3_text!=null||f4_text!=null){
	JFrame f2 = new JFrame("Inserted Data");
	f2.setSize(400,500);
	Container c2;
	c2 = f2.getContentPane();
	c2.setLayout(null);
	
	JTextArea f2_textArea = new JTextArea();
	f2_textArea.setBounds(0,0,400,450);
	f2_textArea.append("Name: " + f1_text + "\nFather Name: "+ f2_text +"\nAddress: "+ f3_text +"\nGmail ID: "+ f4_text);
	c2.add(f2_textArea);
	f2.setResizable(false);
	f2.setVisible(true);
}
}

}