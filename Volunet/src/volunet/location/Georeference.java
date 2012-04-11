package volunet.location;

import java.util.List;


//componente
public class Georeference {
	String id;
	String title;
	String description;
	boolean active;
	Georeference parent;
	
	Georeference(String id, String title, String description, boolean active, Georeference parent) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.active = active;
		this.parent = parent;
	}
	
	void setID(String id){
		this.id = id;
	}
	
	void setTitle(String title){
		this.title = title;
	}
	
	void setDescription(String description){
		this.description = description;
	}
	
	String getID(){
		return id;
	}
	
	String getTitle(){
		return title;
	}
	
	String getDescription(){
		return description;
	}
	
	boolean isSite(){
		return false;
	}
	
	boolean isArea(){
		return false;
	}
	
	List<Site> getActiveSites(){
		return null;
	}
	void collectActiveSites(List sites){
		
	}
}

