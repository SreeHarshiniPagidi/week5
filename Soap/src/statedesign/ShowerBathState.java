package statedesign;

public class ShowerBathState implements State{

	@Override
	public void bath(SoapContext context) {
		System.out.println("not used in Free Standing Bath");
		context.setState(this);
	}

	@Override
	public void handBath(SoapContext context) {
		System.out.println("Not used in  hand bath");
		context.setState(this);
	}

	@Override
	public void showerBath(SoapContext context) {
		System.out.println("Soap used in ShowerBath");
		context.setState(this);
	}
	public String toString() {
		return "Shower Bath state";
	}
}
