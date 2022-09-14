package makingAPhoneBook;

public class Address {
	private int houseNum;
	private String streetName;
	private String streetNameEnding;
	private String city;
	private String state;
	private int zipcode;

	public Address(int houseNum, String streetName, String streetNameEnding, String city, String state, int zipcode) {
		this.houseNum = houseNum;
		this.streetName = streetName;
		this.streetNameEnding = streetNameEnding;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public Address() {

	}

	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetNameEnding() {
		return streetNameEnding;
	}

	public void setStreetNameEnding(String streetNameEnding) {
		this.streetNameEnding = streetNameEnding;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return houseNum + " " + streetName + " " + streetNameEnding + "\n" + city + ", " + state + " " + zipcode;
	}

}
