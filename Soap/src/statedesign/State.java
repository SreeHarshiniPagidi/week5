package statedesign;
public interface State 
{
	public abstract void bath(SoapContext context);
	public abstract void handBath(SoapContext context);
	public abstract void showerBath(SoapContext context);
}
