package domain;

/**
 *
 * @author alghu437
 */
public class Customer {
	private int personID;
	private String username;
	private String fullname;
	private String password;
	private String email;
	private String shippingaddress;

	public Customer(int personID, String username, String fullname, String password, String email, String shippingaddress) {
		this.personID = personID;
		this.username = username;
		this.fullname = fullname;
		this.password = password;
		this.email = email;
		this.shippingaddress = shippingaddress;
	}

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getShippingaddress() {
		return shippingaddress;
	}

	public void setShippingaddress(String shippingaddress) {
		this.shippingaddress = shippingaddress;
	}
	
	
}
