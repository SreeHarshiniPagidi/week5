package statedesign;

public class SoapContext 
{
	public State state;
	public SoapContext(){
		state = null;
	}
	
	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}
