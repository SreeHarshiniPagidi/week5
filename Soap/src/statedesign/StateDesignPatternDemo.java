package statedesign;

public class StateDesignPatternDemo {

	public static void main(String[] args) {
		SoapContext c=new SoapContext();
		HandBathState hBath= new HandBathState();
		hBath.handBath(c);
		System.out.println(c.getState().toString());
		
		SoapBathState soap = new SoapBathState();
		soap.bath(c);
		System.out.println(c.getState().toString());
		
		ShowerBathState shower = new ShowerBathState();
		shower.showerBath(c);
		System.out.println(c.getState().toString());

	}

}
