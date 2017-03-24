package lowlatency;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class View{
	
	private JFrame frame;
	
	private JLabel label;
	private JTextArea textBox;
	private JScrollPane scrollPane;
	private JButton button;
	
	public View(String text){
		frame = new JFrame("Text Editor");
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		
		
		label = new JLabel();
		frame.getContentPane().add(label, BorderLayout.NORTH);
		
		textBox = new JTextArea("JTextArea");
//		scrollPane = new JScrollPane(textBox, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(textBox, BorderLayout.CENTER);
		
		
		button = new JButton("Button");
		frame.getContentPane().add(button, BorderLayout.SOUTH);
		
//		frame.add(textBox);
//		frame.add(scrollPane);
		frame.setVisible(true);
	}
	
	public JButton getButton(){
		return button;
	}
	
	public void setText(String text){
		label.setText(text);
	}
	
}
