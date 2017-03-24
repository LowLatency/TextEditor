package lowlatency;

import java.awt.event.ActionListener;

public class Controller {
	
	private Model model;
	private View view;
	
	private ActionListener actionListener;
	
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;
	}
	
}
