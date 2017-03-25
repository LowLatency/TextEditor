package lowlatency;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sun.scenario.effect.Blend.Mode;

public class Controller implements ActionListener{
	
	private Model model;
	private View view;
		
	public Controller(){
		System.out.println("Controller()");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Controller: action command: " + e.getActionCommand() + " clicked at " + new java.util.Date(e.getWhen()));
		System.out.println("Controller: paramString: " + e.paramString());
		
		switch (e.getActionCommand()) {
		case "Clear":
			view.setTextBox(null);
			break;
			
		case "Save-1":
			model.setTextBox(view.getTextBox());
			model.setSave1();
			view.setTextBox("Saving 1");
			break;
			
		case "Save-2":
			model.setTextBox(view.getTextBox());
			model.setSave2();
			view.setTextBox("Saving 2");
			break;
		
		case "1":
			view.setTextBox(model.getSave1());
			break;
			
		case "2":
			view.setTextBox(model.getSave2());
			break;
			
		case "Clear Save":
			model.setClear();
			view.setTextBox("CLEARED");
			break;

		default:
			break;
		}
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
