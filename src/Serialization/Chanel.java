package Serialization;

import java.util.ArrayList;
import java.util.Iterator;

public class Chanel implements Iterable<VideoClips>
{
	private ArrayList<VideoClips> aVideos = new ArrayList<>();
	
	public Chanel(){
		
	}
	
	public void addVideoClips(VideoClips v){
		aVideos.add(v);
	}

	public void setVideos(ArrayList<VideoClips> pVideos){
		aVideos = pVideos;
	}
	
	public ArrayList<VideoClips> getVideos(){
		return aVideos;
	}
	
	@Override
	public Iterator<VideoClips> iterator() {
		return aVideos.iterator();
	}
}
