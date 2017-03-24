package lowlatency;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	
	private Model model;
	private View view;
		
	public Controller(){
		System.out.println("Controller()");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Controller: " + e.getActionCommand() + " clicked at " + new java.util.Date(e.getWhen()));
		System.out.println("Controller: paramString: " + e.paramString());
	}
	
	public void addModel(Model m) {
		System.out.println("Controller: Adding model");
		this.model = m;
	}
	
	public void addView(View v) {
		System.out.println("Controller: Adding view");
		this.view = v;
	}
	
}
