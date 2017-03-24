package lowlatency;

public class BeginHere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeginHere run = new BeginHere();
		run.StartParty();
		
		
		
	}
	
	public void StartParty(){
		
		Model newModel = new Model();
		View newView = new View();
		Controller newController = new Controller();
		
		newModel.addObserver(newView);
		
		newController.addModel(newModel);
		newController.addView(newView);
		
		newView.addController(newController);
	}

}