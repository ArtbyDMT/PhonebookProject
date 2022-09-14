package makingAPhoneBook;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.time.LocalDate;

public class Directory {

	Person[] book = new Person[0];
	Scanner input = new Scanner(System.in);

	public Person[] addEntry(Person person) {
		Person[] temp = new Person[book.length + 1];
		for (int i = 0; i < book.length; i++) {
			temp[i] = book[i];
		}
		temp[temp.length - 1] = person;
		return book = temp;
	}

	public Person searchFirstName(String firstNameKey) {
		for (int i = 0; i <= book.length - 1; i++) {
			if (book[i].getFirstName().equalsIgnoreCase(firstNameKey)) {

				return book[i];
			}
		}
		return null;

	}

	public Person searchLastName(String lastNameKey) {
		for (int i = 0; i <= book.length - 1; i++) {
			if (book[i].getLastName().equalsIgnoreCase(lastNameKey)) {
				return book[i];
			}
		}
		return null;
	}

	public Person searchFullName(String fullNameKey) {
		for (int i = 0; i <= book.length - 1; i++) {
			if ((book[i].getFirstName() + " " + book[i].getLastName()).equalsIgnoreCase(fullNameKey)) {
				return book[i];
			}
		}
		return null;
	}

	public Person searchPhoneNum(long phoneNumberKey) {
		for (int i = 0; i <= book.length - 1; i++) {
			if (book[i].getPhoneNum() == phoneNumberKey) {
				return book[i];

			}
		}
		return null;
	}

	public Person searchByCity(String cityKey) {
		for (int i = 0; i <= book.length - 1; i++) {
			if (book[i].getAddress().getCity().equalsIgnoreCase(cityKey)) {
				return book[i];

			}
		}
		return null;
	}

	public Person searchByState(String stateKey) {
		for (int i = 0; i <= book.length - 1; i++) {
			if (book[i].getAddress().getState().equalsIgnoreCase(stateKey)) {
				return book[i];

			}
		}
		return null;
	}

	public void updateRecord(Person[] people, long phoneNumberToUpdatePerson) {
		updateLoop: for (int i = 0; i < book.length; i++) {

			if (book[i].getPhoneNum() == phoneNumberToUpdatePerson) {

				System.out.println("WHAT WOULD YOU LIKE TO UPDATE? " + "\n1. FIRST NAME " + "\n2. LAST NAME "
						+ "\n3. HOME PHONE NUMBER " + "\n4. CELL PHONE NUMBER" + "\n5. WORK PHONE NUMBER"
						+ "\n6. FAX PHONE NUMBER" + "\n7. HOUSE NUMBER " + "\n8. STREET NAME"
						+ "\n9. STREET ENDING ex. DR, AVE, CT "
						+ "\n10. CITY " + "\n11. STATE "
						+ "\n12. ZIPCODE" + "\n13. ANNIVERSARY" + "\n14. EMAIL" + "\n15. BACK TO MAIN MENU");
				System.out.println();
				int x = 0;

				do {
					try {

						x = input.nextInt();
						switch (x) {

						case 1:
							System.out.println("ENTER NEW FIRST NAME");
							String firstNameSet = input.next();
							book[i].setFirstName(firstNameSet);
							break;
						case 2:
							System.out.println("ENTER NEW LAST NAME");
							String lastNameSet = input.next();
							book[i].setLastName(lastNameSet);
							break;
						case 3:
							System.out.println("ENTER NEW PHONE NUMBER ex. 8345739623");
							long phoneNumberSet = input.nextLong();
							book[i].setPhoneNum(phoneNumberSet);
							break;
						case 4:
							System.out.println("ENTER NEW CELL PHONE NUMBER ex. 8345739623");
							long cellNumberSet = input.nextLong();
							book[i].setCellNum(cellNumberSet);
							break;
						case 5:
							System.out.println("ENTER NEW WORK PHONE NUMBER ex. 8345739623");
							long workNumberSet = input.nextLong();
							book[i].setWorkNum(workNumberSet);
							break;
						case 6:
							System.out.println("ENTER NEW FAX NUMBER ex. 8345739623");
							long faxNumberSet = input.nextLong();
							book[i].setFaxNum(faxNumberSet);
							break;
						case 7:
							System.out.println("ENTER NEW HOUSE NUMBER");
							int houseNumSet = input.nextInt();
							book[i].getAddress().setHouseNum(houseNumSet);
							break;
						case 8:
							System.out.println("ENTER NEW STREET NAME AS ONE WORD \nex. 'BRUCEBDOWNS' FOR 'BRUCE B DOWNS'");
							String streetNameSet = input.next();
							book[i].getAddress().setStreetName(streetNameSet);
							break;
						case 9:
							System.out.println("ENTER NEW STREET NAME ENDING ex. DR, AVE, CT");
							String streetNameEndingSet = input.next();
							book[i].getAddress().setStreetNameEnding(streetNameEndingSet);
							break;
						case 10:
							System.out.println("ENTER NEW CITY AS ONE WORD \nex. 'NEWYORKCITY' FOR 'NEW YORK CITY'");
							String citySet = input.next();
							book[i].getAddress().setCity(citySet);
							break;
						case 11:
							System.out.println("ENTER NEW STATE INITIALS");
							String stateSet = input.next();
							book[i].getAddress().setState(stateSet);
							break;
						case 12:
							System.out.println("ENTER NEW ZIPCODE");
							int zipCodeSet = input.nextInt();
							book[i].getAddress().setZipcode(zipCodeSet);
							break;
						case 13:
							System.out.println("ENTER NEW ANNIVERSARY DATE");
							long anniversaryDateSet = input.nextLong();
							book[i].setAnniversary(anniversaryDateSet);
							break;
						case 14:
							System.out.println("ENTER NEW EMAIL");
							String emailSet = input.next();
							book[i].setEmail(emailSet);
							break;
						case 15:
							break updateLoop;
						default:
							System.out.println("YOU DIDN'T ENTER A NUMBER FROM THE SELECTION");

						}
						System.out.println("WOULD YOU LIKE TO UPDATE ANYTHING ELSE FOR THIS CONTACT?"
								+ "\n1. FIRST NAME " + "\n2. LAST NAME " + "\n3. HOME PHONE NUMBER "
								+ "\n4. CELL PHONE NUMBER" + "\n5. WORK PHONE NUMBER" + "\n6. FAX PHONE NUMBER"
								+ "\n7. HOUSE NUMBER " + "\n8. STREET NAME " + "\n9. STREET ENDING ex. DR, AVE, CT "
								+ "\n10. CITY" + "\n11. STATE " + "\n12. ZIPCODE" + "\n13. ANNIVERSARY" + "\n14. EMAIL"
								+ "\n15. BACK TO MAIN MENU");

					} catch (InputMismatchException d) {

					} catch (NoSuchElementException e) {

					} catch (IllegalStateException f) {

					} catch (ArrayIndexOutOfBoundsException g) {
						
					}

				} while (x <= 15);
			}
		}
		return;
	}

	public void deleteRecord(long phoneNumberToDelete) {
		Person[] temp = new Person[book.length - 1];
		int x = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getPhoneNum() != phoneNumberToDelete) {
				temp[x] = book[i];
				x++;
			}
		}
		book = temp;
	}
	public Person[] getContacts(Person[] people) {
		
		
		return book;
	}

	public void printArray(Person[] personlist) {
		for (int i = 0; i < personlist.length; i++) {
			System.out.print(personlist[i] + "\n\n");
		}
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
		    String birthDate= formatter.format(date);  
			return birthDate;  
		}  
		

	public Person[] putInAscOrder(Person[] people) {
		return book;
		}

//		for(int i = 0; i < book.length - 1; ++i){
//	        for(int j = i + 1; j < book.length; ++j){
//	            if(book[i] > book[j]){
//	                Person temp = book[i];
//	                book[i] = book[j];
//	                book[j] = temp;
//	            }

	    
//	    
//	    return book;
	}
//	}
