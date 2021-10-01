package statedesign;

public class HandBathState implements State{

	@Override
	public void bath(SoapContext context) {
		System.out.println("not used in Free Standing Bath");
		context.setState(this);
	}

	@Override
	public void handBath(SoapContext context) {
		System.out.println("Soap used in Hand Bath");
		context.setState(this);
	}

	@Override
	public void showerBath(SoapContext context) {
		System.out.println("Not used in shower bath");
	}
	public String toString() {
		return "HandBath state";
	}
}
