package Serialization;

import java.util.ArrayList;
import java.util.Iterator;

public class Chanel implements Iterable<VideoClips>
{
	private ArrayList<VideoClips> aVideos = new ArrayList<>();
	
	public Chanel(){
		
	}
	
	public void add(VideoClips v){
		aVideos.add(v);
	}

	public void set(ArrayList<VideoClips> pVideos){
		aVideos = pVideos;
	}
	
	public ArrayList<VideoClips> get(){
		return aVideos;
	}
	
	@Override
	public Iterator<VideoClips> iterator() {
		return aVideos.iterator();
	}
}
