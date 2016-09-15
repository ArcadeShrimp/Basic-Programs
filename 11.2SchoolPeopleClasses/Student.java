
public class Student extends Person {
	private final String[] CLASS_STATUS = { "Freshman", "Sophomore", "Junior", "Senior" };
	private int status;

	Student() {
		this(0);
	}

	Student(int i) {
		this.status = i;
	}

	public String getClassStatus() {
		return CLASS_STATUS[status];
	}

	public void setClassStatus(int i) {
		this.status = i;
	}

	@Override
	public String toString() {
		return "Student\n\n"+super.toString() + "Class Status: "+getClassStatus() + "\n";
	}
}
