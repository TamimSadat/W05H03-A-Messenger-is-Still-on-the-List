package pgdp.messenger;

public class UserArray {
	// TODO: Implementiere die fehlenden Attribute
	private User[] users;

	public UserArray(int initCapacity) {
		// TODO: Implementiere den Konstruktor
		if (initCapacity < 1) {

		}
		else {
			users = new User[initCapacity];
		}

	}

	/** Fügt den übergebenen Nutzer in das durch dieses Objekt dargestellte 'UserArray' ein
	 * @param user Eine beliebige User-Referenz (schließt 'null' mit ein)
	 */
	public void addUser(User user) {
		// TODO: Implementiere diese Methode!
		//User[] newUser = new User[use]
		if (user == null) {

		}
		else {
			int x = 0; //Fallunterscheidung, ob Array einen empty Spot hat oder nicht
			for (int i = 0; i < users.length; i++) {
				if (users[i] == null) {
					x--;
				}
				else {
					x++;
				}
			}

			if (x < users.length - 1) {//Array hat empty spot
				for (int i = 0; i < users.length; i++) {
					if (users[i] == null) {
						users[i] = user;
					}
				}
			}
			else {//Wenn Array voll, also x gleich Array length
				User[] newUser = new User[users.length * 2];
				/*for (int i = 0; i < users.length; i++) {
					newUser[i] = users[i];
				}
				//newUser[users.length] = user;*/
				this.users = newUser;
			}

		}


	}

	/** Entfernt den Nutzer mit der übergebenen ID aus dem Array und gibt diesen zurück.
	 *  Wenn kein solcher Nutzer existiert, wird 'null' zurückgegeben.
	 * @param id Ein beliebiger long
	 * @return Der eben aus dem UserArray entfernte Nutzer, wenn ein Nutzer mit der übergebenen id darin existiert, sonst 'null'
	 */
	public User deleteUser(long id) {
		// TODO: Implementiere diese Methode!
		int y = 0;
		for (int i = 0; i < users.length; i++) {
			if (users[i].equals(id)) {
				y--;
			}
			else {
				y++;
			}
		}

		if (y == users.length - 1) {
			return null;
		}
		else {
			User[] delUser = new User[users.length];
			int x = 0;
			for (int i = 0; i < users.length; i++) {
				if (users[i].equals(id)) {
					x = i;
				}
				else {
					delUser[i] = users[i];
				}
			}
			this.users = delUser;
			return users[x];
		}
	}
	public int size(User[] users) {
		int x = 0;
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
				x = x;
			}
			else {
				x++;
			}
		}
		return x;
	}


	// TODO: Implementiere die fehlenden Methoden!
	public void setUsers(User[] users) { this.users = users; }

	public User[] getUsers() { return users; }


}
