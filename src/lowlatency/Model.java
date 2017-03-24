package lowlatency;

import java.util.Observable;

public class Model extends Observable{
	
	private String save1;
	private String save2;
	
	private String textBox;
	
	public Model() {
		System.out.println("Model()");
	}
	
	public void setSave1(){
		this.save1 = this.textBox;
		setChanged();
		notifyObservers(save1);
	}
	
	public void setSave2(){
		this.save2 = this.textBox;
		setChanged();
		notifyObservers(save1);
	}
	
	public String getSave1() {
		return this.save1;
	}
	
	public String getSave2() {
		return this.save2;
	}
	
	public void setClear() {
		this.save1 = null;
		this.save2 = null;
		setChanged();
		notifyObservers(save1);
		notifyObservers(save2);
	}
	
	
}
