package Serialization;

public class VideoClips 
{
	private String aName = null;
	
	public VideoClips(String pName){
		setName(pName);
	}
	
	public VideoClips(){
		
	}
	
	public String getName(){
		return aName;
	}
	
	public void setName(String pName){
		aName = pName;
	}
	
	public String toString()
	{
		return aName;
	}
}
