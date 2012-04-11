package volunet.users;

import java.util.Collection;
import java.util.HashSet;

public class Users {

	private static Users users = null;
	//private Collection<User> allUsers;
	private HashSet<User> allUsers;
	
	private Users() {
		allUsers = new HashSet<User>();
	}

	public static Users getInstance() {
		if (users == null)
			return users = new Users();
		else
			return users;
	}

	public User getUserById(String id) {
		for (User user : allUsers) {
			if (user.getID() == id)
				return user;
		}
		return null;
	}

	Collection<User> getUsers() {
		return allUsers;
	}

	public void addUser(User u) {
		allUsers.add(u);
	}

	public void removeUser(User u) {
		for (User user : allUsers) {
			if (user.equals(u))
				allUsers.remove(u);
		}
	}
}
