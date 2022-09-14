package makingAPhoneBook;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private String fullName;
	private long phoneNum;
	private long cellNum;
	private long workNum;
	private long faxNum;
	private Address address;
	private long birthday;
	private long anniversary;
	private String email;

	Person() {

	}

	public Person(String firstName, String lastName, String fullName, long phoneNum, long cellNum, long workNum,
			long faxNum, long birthday, long anniversary, String email, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.phoneNum = phoneNum;
		this.cellNum = cellNum;
		this.workNum = workNum;
		this.faxNum = faxNum;
		this.address = address;
		this.birthday = birthday;
		this.anniversary = anniversary;
		this.email = email;
	}

	public long getBirthday() {
		return birthday;
	}

	public void setBirthday(long birthday) {
		this.birthday = birthday;
	}

	public long getAnniversary() {
		return anniversary;
	}

	public void setAnniversary(long anniversary) {
		this.anniversary = anniversary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getWorkNum() {
		return workNum;
	}

	public void setWorkNum(long workNum) {
		this.workNum = workNum;
	}

	public long getFaxNum() {
		return faxNum;
	}

	public void setFaxNum(long faxNum) {
		this.faxNum = faxNum;
	}

	public long getCellNum() {
		return cellNum;
	}

	public void setCellNum(long cellNum) {
		this.cellNum = cellNum;
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String toStringHomeNum(long phoneNum) {
		String pNum = (Long.toString(phoneNum)).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
		return pNum;
	}

	public String toStringCellNum(long cellNum) {
		String cNum = (Long.toString(cellNum)).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
		return cNum;
	}

	public String toStringWorkNum(long workNum) {
		String wNum = (Long.toString(workNum)).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
		return wNum;
	}

	public String toStringFaxNum(long faxNum) {
		String fNum = (Long.toString(faxNum)).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
		return fNum;

	}

	public String getAnniversaryDate(long anniversary) {
		Date date1 = new Date(anniversary);
		SimpleDateFormat formatanniversary = new SimpleDateFormat("MM/dd/yyyy");
		String annivDate = formatanniversary.format(date1);
		return annivDate;

	}

	public String getBirthdayDate(long birthday) {
		Date date = new Date(birthday);
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = formatter.format(date);
		return strDate;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + "\nHome: " + toStringHomeNum(phoneNum) + "\nCell: "
				+ toStringCellNum(cellNum) + "\nWork: " + toStringWorkNum(workNum) + "\nFax:  " + toStringFaxNum(faxNum)
				+ "\n" + address + "\nBirthday:    " + birthday + "\nAnniversary: " + anniversary + "\nEmail: " + email;
	}

}
