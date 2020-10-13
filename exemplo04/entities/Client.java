package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	private String name1;
	private String email;
	private Date birthDate;
	
	
public Client() {
	
}


public Client(String name1, String email, Date birthDate) {
	this.name1 = name1;
	this.email = email;
	this.birthDate = birthDate;
}


public String getName1() {
	return name1;
}


public void setName1(String name1) {
	this.name1 = name1;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public Date getBirthDate() {
	return birthDate;
}


public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}

@Override
public String toString() {
	return name1 + " (" + sdf.format(birthDate) + ") - " + email;
	}
	
}



