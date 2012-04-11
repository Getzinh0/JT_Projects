package volunet.location;
//cliente
import java.util.HashSet;

public class Root {
	
	private static Root root = null;
	private HashSet<Georeference> allGeoreference;
	private Root(){
		allGeoreference = new HashSet<Georeference>();
	}
	
	public Root getIntance(){
		if (root == null)
			return root = new Root();
		else
			return root;
	}
	
	public Georeference getGeoreferenceById(String id){
		for(Georeference georeference : allGeoreference){
			if(georeference.getID() == id)
				return georeference;
		}
		return null;
	}
	
	public void addGeoreference(Area area ,Georeference georeference){
		allGeoreference.add(georeference);
	}
	
	public void removeGeoreference(String id){
		for(Georeference georeference : allGeoreference){
			if(georeference.getID() == id)
				allGeoreference.remove(georeference);
		}
	}
}
