package volunet.users;

public class User {

	private String id;
	private String name;
	private String password;
	
	public User(String id, String name, String password){
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public void setID (String id){
		this.id = id;
	}
	
	public void setName (String name){
		this.name = name;
	}
	
	public void setPassword (String password){
		this.password = password;
	}
	
	public String getID(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPassword(){
		return password;
	}
	
	boolean isVolunteer(){
		return false;
	}
	
	boolean isInstitution(){
		return false;
	}
	
	boolean isAdmin(){
		return false;
	}
	
//	 getMessages(){
//		
//	}
//	
//	 clearMessages(){
//		
//	}
//	
	
}
