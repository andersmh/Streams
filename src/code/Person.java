package code;

public class Person {

	String firstName;
	String lastName;
	String sex;
	Integer identificationNumber;

	public Person() {

	}

	public Person(String firstName, String lastName, String sex, Integer identificationNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.identificationNumber = identificationNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(Integer identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String toString() {
		return firstName + " " + lastName + "\t\t | " + sex + "\t\t | " + identificationNumber;
	}

}
