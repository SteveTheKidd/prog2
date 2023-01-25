package Sample_Package;

public class method_sample_gui {
	
	private String firstname, lastname;
	
	//Setter
	public void setfirstname (String firstname) {
		this.firstname = firstname;
	}
	
	//Getter
	public String getfirstname () {
		return firstname;
	}
	
	//Setter
	public void setlastname (String lastname){
		this.lastname = lastname;
	}
	
	//Getter
	public String getlastname () {
		return lastname;
	}
	
	
	//combine
	public String combine(String firstname, String lastname) {
		return firstname + " " + lastname;
	}
	

}
