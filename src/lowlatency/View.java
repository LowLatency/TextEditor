package lowlatency;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class View implements Observer{
	
	private JFrame frame;
	private JPanel buttonPanel;
	
	private JTextArea textBox;
	
	private JButton clearAll;
	private JButton save1;
	private JButton save2;
	private JButton recall1;
	private JButton recall2;
	private JButton clearTextBox;
	
	public View(){
		frame = new JFrame("Text Editor");
	
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 300);
		frame.setLocation(400, 400);
		
				
		textBox = new JTextArea("Enter your notes here!");
		buttonPanel = new JPanel();
		
		clearAll = new JButton("Clear All");
		save1 = new JButton("Save-1");
		save2 = new JButton("Save-2");
		recall1 = new JButton("1");
		recall2 = new JButton("2");
		clearTextBox = new JButton("Clear Field");
		
		buttonPanel.add(clearAll);
		buttonPanel.add(save1);
		buttonPanel.add(save2);
		buttonPanel.add(recall1);
		buttonPanel.add(recall2);
		buttonPanel.add(clearTextBox);
		
		frame.add("North", new JLabel("Notes"));
		frame.add("Center", textBox);
		frame.add("South", buttonPanel);
//		frame.getContentPane().add(textBox, BorderLayout.CENTER);
//		frame.getContentPane().add(button, BorderLayout.SOUTH);
//		frame.getContentPane().add(clear, BorderLayout.SOUTH);
		frame.setVisible(true);
	}
	
//	public JButton getButton(){
//		return button;
//	}
//	
//	public void setText(String text){
//		label.setText(text);
//	}

	@Override
	public void update(Observable obs, Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Things get updated.");
		System.out.println("View: Observable is " + obs.getClass());
		System.out.println("View: Object passed is " + obj.getClass());
	}
	
	public void addController(ActionListener controller) {
		System.out.println("View: Adding Controller");
		clearAll.addActionListener(controller);
		save1.addActionListener(controller);
		save2.addActionListener(controller);
		recall1.addActionListener(controller);
		recall2.addActionListener(controller);
		clearTextBox.addActionListener(controller);
	}
	
}
