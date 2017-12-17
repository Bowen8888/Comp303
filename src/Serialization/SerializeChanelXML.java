package Serialization;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class SerializeChanelXML {

	protected static final String FILE_NAME = "corporation.xml";
	public static void main(String[] pArgs) throws IOException, ClassNotFoundException
	{
		Chanel chanel = new Chanel();
		VideoClips v1 = new VideoClips("v1");
		VideoClips v2 = new VideoClips("v2");
		chanel.addVideoClips(v1);
		chanel.addVideoClips(v2);
		
		XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(FILE_NAME)));
		encoder.writeObject(chanel);
		encoder.close();
		
		XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(FILE_NAME)));
		Chanel chanel2 = (Chanel) decoder.readObject();
		for(VideoClips v: chanel2){
			System.out.println(v);
		}
		decoder.close();
	}
}
