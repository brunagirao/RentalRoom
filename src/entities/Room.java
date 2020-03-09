package entities;

public class Room {
	
	private int id;
	private String owner;
	private String email;
	
	
	public Room(int id, String owner, String email) {
		this.id = id;
		this.owner = owner;
		this.email = email;
	}
	
	
	public int getId() {
		return id;
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Rental Room Data Id: #" + getId() + "\n" + "Owner: " + getOwner() + "\n" + "Email: " + getEmail();
	}

	
	
	
	
	
	
	

}
