
public class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;

	Person() {
		this("Mia Khalifa","420 JstBlyze Ave","(760) 420-1928", "gbush@pornhub.gov");
	}

	Person(String name, String address, String phoneNumber, String emailAddress) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString(){
		return "Name: " +getName()+"\nAddress: "+getAddress()+"\nPhone Number: "+getPhoneNumber()+"\nEmail Address: "+getEmailAddress()+"\n";
	}
}
