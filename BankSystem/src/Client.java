
public class Client {

	private String firstName;
	private String lastName;
	private long phoneNum;
	private String email;
	
public Client (String firstName, String lastName, long phoneNum, String email) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.phoneNum = phoneNum;
	this.email = email;
}


public String getName() {
	return firstName+lastName;
	
}

public long getPhoneNum() {
	return phoneNum;
	
}

public String getEmail() {
	return email;
	
}

}
