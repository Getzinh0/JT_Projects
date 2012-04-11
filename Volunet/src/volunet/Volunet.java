package volunet;

import volunet.users.*;

public class Volunet {
	
	
	// Parte Users
	User getUserById(String id) {
		Users useres = Users.getInstance();
		return useres.getUserById(id);
	}

	void addUser(String id, String name, String password) {
		Users useres = Users.getInstance();
		if (this.getUserById(id) != null)
			useres.addUser(new User(id, name, password));
	}

	void modifyUser(String id, String name, String password) {
		User u = this.getUserById(id);
		u.setName(name);
		u.setPassword(password);
	}

	void removeUser(String id, String name, String password) {
		Users useres = Users.getInstance();
		if (this.getUserById(id) != null)
			useres.removeUser(new User(id, name, password));
	}

	// Collection<User> gellAllUsers(){
	//
	// }

	// Colection<Message> getMessages(String){
	//
	// }

	// void clearMessages(String){
	//
	// }

}
