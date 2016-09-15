
public class Faculty extends Employee {
	private String officeHours;
	private String rank;

	Faculty() {
		this("No office hours", "Faculty");
	}

	Faculty(String officeHours, String rank) {
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public String getRank() {
		return rank;
	}
	@Override
	public String toString(){
		return "\nFaculty"+super.toString()+"Office Hours: "+getOfficeHours()+"\nRanks: "+getRank()+"\n";
	}
}
