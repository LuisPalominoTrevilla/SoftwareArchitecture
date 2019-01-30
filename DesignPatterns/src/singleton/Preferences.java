package singleton;

public class Preferences {
	private boolean shareInfo;
	
	public Preferences()
	{
		this.shareInfo = false;
	}
	
	public void setShareInfo(boolean value)
	{
		this.shareInfo = value;
	}
	
	public String toString()
	{
		return "Application Preferences:\nShare information: " + this.shareInfo; 
	}
}
